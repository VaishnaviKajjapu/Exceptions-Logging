package epam.com.loggers;

public class BudgetCalculation {
	
	
public double ConstructionCost(double area,int standard, int fullyAutomated){
		
		double costperSquarefeet;
		
		int prizeperSquarefeet;
		
		if( standard == 1){
			
			prizeperSquarefeet = 1200;
			
		} else if(standard == 2){
			
			prizeperSquarefeet = 1500;
			
		}else{
			
			if(fullyAutomated == 0){
				
				prizeperSquarefeet = 1800;
				
			}else{
				
				prizeperSquarefeet = 2500;
				
			}
			
		}
		
		costperSquarefeet = area*prizeperSquarefeet;
		
		return costperSquarefeet;
	}
	
}


