package cspModeling;

public class CSP_crypto_2 extends CSP{

	
	
	
	
	
	public static final Variable T = new Variable("T");
    public static final Variable F = new Variable("F");
    public static final Variable O = new Variable("O");
    public static final Variable R = new Variable("R");
    public static final Variable X_1 = new Variable("X_1");
    public static final Variable X_2 = new Variable("X_2");
    public static final Variable X_3 = new Variable("X_3");
    
    
    
    public CSP_crypto_2() {

    	
    	addVariable(R);
        addVariable(O);
        addVariable(F);
        addVariable(T);
        addVariable(X_1);
        addVariable(X_2);
        addVariable(X_3);
    	
    	
    	
    	
    	
    Domain numbers = new Domain(new Object[]{0,1,2,3,4,5});

    for (Variable var : getVariables())
        setDomain(var, numbers);

//    addConstraint(new NotEqualConstraint(T, O));
    addConstraint(new NotEqualConstraint(T, F));
    addConstraint(new NotEqualConstraint(T, R));
    addConstraint(new NotEqualConstraint(O, F));
    addConstraint(new NotEqualConstraint(O, R));
    addConstraint(new NotEqualConstraint(F, R));
    
    
    
    addConstraint(new HexArithmeticConstraint(O,O,R,X_1,0));
    addConstraint(new HexArithmeticConstraint(O,O,X_1,O,X_2,1));
    addConstraint(new HexArithmeticConstraint(T,T,X_2,F,X_3,1));
//    addConstraint(new EqualConstraint(X_3,F));
    }
}
