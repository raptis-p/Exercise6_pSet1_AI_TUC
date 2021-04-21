package mainPackage;


import cspModeling.Assignment;
import cspModeling.CSP;
import cspModeling.CSP_crypto_1;
import cspModeling.CSP_crypto_2;
import cspModeling.CSP_crypto_3;
import cspSolving.BacktrackingStrategy;
import cspSolving.CSPStateListener;

public class Main {

	public static void main(String[] args) {
		
		double start;
		double end;
		Assignment sol;
		
		
		BacktrackingStrategy bts = new BacktrackingStrategy();
		bts.addCSPStateListener(new CSPStateListener() {
		    @Override
		    public void stateChanged(Assignment assignment, CSP csp) {
		        System.out.println("Assignment evolved : " + assignment);
		    }

		    @Override
		    public void stateChanged(CSP csp) {
		        System.out.println("CSP evolved : " + csp);
		    }
		});
		
		if (args[0].equals("-s")) {
			switch(args[1]) {
			
				case "1" : 
					CSP_crypto_1 crypto1 = new CSP_crypto_1();
					start = System.currentTimeMillis();
					sol = bts.solve(crypto1);
					end = System.currentTimeMillis();
					System.out.println(sol);
					System.out.println("Time to solve = " + (end - start));
					break;
				case "2" : 
					
					CSP_crypto_2 crypto2 = new CSP_crypto_2();
					start = System.currentTimeMillis();
					sol = bts.solve(crypto2);
					end = System.currentTimeMillis();
					System.out.println(sol);
					System.out.println("Time to solve = " + (end - start));
					break;
				case "3" :
					CSP_crypto_3 crypto3 = new CSP_crypto_3();
					start = System.currentTimeMillis();
					sol = bts.solve(crypto3);
					end = System.currentTimeMillis();
					System.out.println(sol);
					System.out.println("Time to solve = " + (end - start));
					break;
				default: 
					break;
			}
		} 
		else if (args[0].equals("-d")) {
			//Describe what goes on in code
			System.out.println("-------------------------------Brief Description of Program--------------------------------");
			System.out.println("------------------------1.Classes Taken From Online Sources Listed-------------------------");
			System.out.println("----------------------------a) From cspModeling package : ---------------------------------");
			System.out.println("------------------------Array Iterator,Assignment(with minor changes)----------------------");
			System.out.println("-----------------------Constraint,CSP,Domain,NotEqualConstraint,Variable-------------------");
			System.out.println("----------------------------b) From cspSolving package : -----------------------------------");
			System.out.println("-----------------BacktrackingStrategy,SolutionStrategy,DomainRestoreInfo-------------------");
			System.out.println("------------------------------------CSPSTateListener---------------------------------------");
			System.out.println("---------------All other Classes and Logic Implemented by author Raptis Panagiotis---------");
		}
		
	
		
		
				
		
		

		
		
		
		

		
		

	}

}
