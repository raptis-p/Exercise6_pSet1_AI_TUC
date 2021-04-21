package cspModeling;

import java.util.ArrayList;
import java.util.List;

public class EqualConstraintToHalf implements Constraint{

	
	

    private Variable var1;
    private Variable var2;
    private List<Variable> scope;

    public EqualConstraintToHalf(Variable var1, Variable var2) {
        this.var1 = var1;
        this.var2 = var2;
        scope = new ArrayList<Variable>(2);
        scope.add(var1);
        scope.add(var2);
    }

    @Override
    public List<Variable> getScope() {
        return scope;
    }

    @Override
    public boolean isSatisfiedWith(Assignment assignment) {
        Object value1 = assignment.getAssignment(var1);
        return assignment.getAssignment(var2) == null || value1==null || ((int) value1)== (int) assignment.getAssignment(var2) /2;
    }

	
	
}
