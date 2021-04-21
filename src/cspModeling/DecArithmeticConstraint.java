package cspModeling;
import java.util.ArrayList;
import java.util.List;



public class DecArithmeticConstraint implements Constraint {
	
	

		
		private Variable var1;
	    private Variable var2;
	    private List<Variable> scope;
	    private Variable var3;
	    private Variable var4;
	    private Variable var5;
		private int deg;
	    
	    
	    public DecArithmeticConstraint(Variable var1, Variable var2,Variable var3,Variable var4,int deg) {
	        this.var1 = var1;
	        this.var2 = var2;
	        this.var3 = var3;
	        this.var4 = var4;
	        this.var5 = null;
	        scope = new ArrayList<Variable>();
	        scope.add(var1);
	        scope.add(var2);
	        scope.add(var3);
	        scope.add(var4);
	        this.deg = deg;
	    }
	    
	    
	    public DecArithmeticConstraint(Variable var1, Variable var2,Variable var3,Variable var4,Variable var5,int deg) {
	        this.var1 = var1;
	        this.var2 = var2;
	        this.var3 = var3;
	        this.var4 = var4;
	        this.var5 = var5;
	        scope = new ArrayList<Variable>();
	        scope.add(var1);
	        scope.add(var2);
	        scope.add(var3);
	        scope.add(var4);
	        scope.add(var5);
	        this.deg = deg;
	    }
	    
	    public DecArithmeticConstraint(Variable var1, Variable var2,int deg) {
	        this.var1 = var1;
	        this.var2 = var2;
	      
	        scope = new ArrayList<Variable>();
	        scope.add(var1);
	        scope.add(var2);
	      
	        this.deg = deg;
	    }
	    
	    @Override
	    public List<Variable> getScope() {
	        return scope;
	    }

	    @Override
	    public boolean isSatisfiedWith(Assignment assignment) {
	    	
	    	
	   
	    	
//			System.out.println(assignment.toString());

	    	if (this.deg == 0) {
	    
//	    		System.out.println(value1);
//	    		System.out.println(value2);
//	    		System.out.println(value3);
//	    		System.out.println(value4);
	    		
	    		  return (assignment.getAssignment(var1) == null || 
	    				  assignment.getAssignment(var2) == null || 
	    				  assignment.getAssignment(var3) == null || 
	    				  assignment.getAssignment(var4) == null || 
	    								  (int)assignment.getAssignment(var1) +(int)assignment.getAssignment(var2) == (int)assignment.getAssignment(var3) + 10*(int)assignment.getAssignment(var4));
	    			
	    	}
	    	
	    	if (this.deg ==1) {
	    		
	    		return (assignment.getAssignment(var1) == null || 
	  			    assignment.getAssignment(var2) == null || 
	  				assignment.getAssignment(var3) == null || 
	  				assignment.getAssignment(var4) == null || 
	  				assignment.getAssignment(var5) == null ||  
	  				(int)assignment.getAssignment(var1) +  (int)assignment.getAssignment(var2) +  (int)assignment.getAssignment(var3) ==  (int)assignment.getAssignment(var4) + 10*  (int)assignment.getAssignment(var5));
	    	}
	    	
	    	
	    	
			return false;
	    
	    	
	       // Object value1 = assignment.getAssignment(var1);
	        //return value1 == null || !value1.equals(assignment.getAssignment(var2));
	    }
		
		
	
}
