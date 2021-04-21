package cspSolving;

import cspModeling.Assignment;
import cspModeling.CSP;

public interface CSPStateListener {
	/** Informs about changed assignments. */
	void stateChanged(Assignment assignment, CSP csp);

	/** Informs about changed domains (inferences). */
	void stateChanged(CSP csp);
}