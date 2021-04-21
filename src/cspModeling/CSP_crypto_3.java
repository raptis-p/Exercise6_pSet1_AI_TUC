package cspModeling;

import cspSolving.EqualConstraint;

public class CSP_crypto_3 extends CSP {

	
	public static final Variable T = new Variable("T");
    public static final Variable W = new Variable("W");
    public static final Variable O = new Variable("O");
    public static final Variable N = new Variable("N");
    public static final Variable X_1 = new Variable("X_1");
    public static final Variable X_2 = new Variable("X_2");
    public static final Variable X_3 = new Variable("X_3");
	
	
    
    
    
    
public CSP_crypto_3() {
	
	
	
		addVariable(N);
		addVariable(O);
		addVariable(W);
		addVariable(T);
    	
        
        
        
        addVariable(X_1);
        addVariable(X_2);
        addVariable(X_3);
    	
    	
    	
    	
    	
    Domain numbers = new Domain(new Object[]{0,1,2,3,4,5,6,7,8,9});

    for (Variable var : getVariables())
        setDomain(var, numbers);

//    addConstraint(new NotEqualConstraint(T, O));
    addConstraint(new NotEqualConstraint(T, W));
    addConstraint(new NotEqualConstraint(T, N));
    addConstraint(new NotEqualConstraint(O, W));
    addConstraint(new NotEqualConstraint(O, N));
    addConstraint(new NotEqualConstraint(W, N));
    
    
    
    addConstraint(new DecArithmeticConstraint(N,N,O,X_1,0));
    addConstraint(new DecArithmeticConstraint(O,O,X_1,O,X_2,1));
    addConstraint(new DecArithmeticConstraint(W,W,X_2,T,X_3,1));
//    addConstraint(new EqualConstraint(X_2,O));
//    addConstraint(new EqualConstraintToHalf(W,T));
    }
    
    
    
    
    
    
    
    
    
    
}
