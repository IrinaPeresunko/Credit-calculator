
public class CreditCalculator {

	public static void main(String[] args) {
		double amountOfCredit = Double.parseDouble(args[0]);
		float percentageRatePerYear = Float.parseFloat(args[1])/100;
		int creditTermInMonths = Integer.parseInt(args[2]);
		
		percentageRatePerYear = percentageRatePerYear/12;
		double monthlyPayment = (amountOfCredit*percentageRatePerYear)/
				(1-Math.pow((1+percentageRatePerYear),-creditTermInMonths));
		
		System.out.println("Amount of credit="+amountOfCredit+" ");
		System.out.println("Percentage rate="+percentageRatePerYear+"% ");
		System.out.println("Credit term="+creditTermInMonths+" months");
		System.out.println("Monthly payment is "+monthlyPayment);

	}

}
