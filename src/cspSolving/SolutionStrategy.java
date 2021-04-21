package cspSolving;

import java.util.ArrayList;
import java.util.List;

import cspModeling.Assignment;
import cspModeling.CSP;

public abstract class SolutionStrategy {
    List<CSPStateListener> listeners = new ArrayList<CSPStateListener>();

    public void addCSPStateListener(CSPStateListener listener) {
        listeners.add(listener);
    }

    public void removeCSPStateListener(CSPStateListener listener) {
        listeners.remove(listener);
    }

    protected void fireStateChanged(CSP csp) {
        for (CSPStateListener listener : listeners)
            listener.stateChanged(csp.copyDomains());
    }

    protected void fireStateChanged(Assignment assignment, CSP csp) {
        for (CSPStateListener listener : listeners)
            listener.stateChanged(assignment.copy(), csp.copyDomains());
    }

    public abstract Assignment solve(CSP csp);
}