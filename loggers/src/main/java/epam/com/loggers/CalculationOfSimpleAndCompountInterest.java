package epam.com.loggers;

public class CalculationOfSimpleAndCompountInterest {
	
double forSimpleInterest(double principal, double rate, double time){
		
		return (principal * rate * time) / 100;
		
	}
	
	double forCompoundInterest(double principal, double rate, double time){
		
		return principal * (Math.pow((1 + rate / 100), time)); 
		
	}
		

}
	
	
	

