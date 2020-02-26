package epam.com.loggers;
import java.util.Scanner;
import org.apache.logging.log4j.*;
	
public class TestBudget {
	 
	private static Logger LOGGER = LogManager.getLogger(TestBudget.class);

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BudgetCalculation budget = new BudgetCalculation();





LOGGER.info("Enter Standard of house");
LOGGER.info("Enter 1 -> normal , 2 -> medium ,3 -> high");
int standard = sc.nextInt();
int fullyAutomated;
if( standard == 3){
	LOGGER.info("Enter 1 --> automated house if not  enter 0");
	fullyAutomated = sc.nextInt();
}else{
	fullyAutomated = 0;
	
}
LOGGER.info("enter area: ");
double area = sc.nextDouble();
LOGGER.info("Budget calculated is " + budget.ConstructionCost(area, standard, fullyAutomated));




}

}
