package cspSolving;

import cspModeling.Domain;
import cspModeling.Variable;

public class Pair {
    Variable var;
    Domain d;
    
    Pair ( ) {
        var = null;
        d = null;
    }
    
    Pair ( Variable fi, Domain se ) {
        var = fi;
        d = se;
    }

	public Variable getVar() {
		return var;
	}

	public void setVar(Variable var) {
		this.var = var;
	}

	public Domain getDomain() {
		return d;
	}

	public void setDomain(Domain d) {
		this.d = d;
	}
}