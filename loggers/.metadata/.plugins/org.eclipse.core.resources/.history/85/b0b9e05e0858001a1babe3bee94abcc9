package epam.com.loggers;
import java.util.Scanner;
import org.apache.logging.log4j.*;

import org.apache.logging.log4j.LogManager;

public  class TestForCalculationOfIntrests {
	 
	private static Logger LOGGER = LogManager.getLogger(TestForCalculationOfIntrests.class);

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CalculationOfSimpleAndCompountInterest calculate = new CalculationOfSimpleAndCompountInterest();
		
		
		LOGGER.info("Enter 1  or 2");
		int num = sc.nextInt();
		LOGGER.info("You entered option" + " " + num);
		LOGGER.info("Enter principal , rate , time values");
		double principal = sc.nextDouble();
		double rate = sc.nextDouble();
		double time = sc.nextDouble();
		switch(num){
		case 1:
			LOGGER.info("SimpleIntrest - " + calculate.forSimpleInterest(principal, rate, time));
			break;
		case 2:
			LOGGER.info("CompoundIntrest - " + calculate.forCompoundInterest(principal, rate, time));
			break;
		default:
			LOGGER.info("Invalid num is entered");
		}
		
		
		
	}

}