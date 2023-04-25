
public class InterestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double annualInterestRate = 10.0;
		double principal = 500.0;		
		int frequency = 4;
		double interestRatePerTerm = annualInterestRate/frequency;
		int totalYears = 3;
		
		for (int i = 0; i < totalYears; i++) {
			System.out.println("Year " + (i+1) + ":");
			System.out.println("Began with $" + principal);
			double newBalance = principal * Math.pow((1+interestRatePerTerm/100),frequency);
			double annualInterestEarned = newBalance - principal;
			System.out.println("Earned $" + annualInterestEarned);			
			principal = newBalance; 
			System.out.println("Ended with $" + principal);
		}
		
	}

}
