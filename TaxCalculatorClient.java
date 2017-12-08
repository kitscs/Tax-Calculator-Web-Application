package ou.secs.tax;

/* Class to test the calculator */

public class TaxCalculatorClient {

	public static void main(String[] args) {

		double income = 96637.26;
		String state = "AK";
		double stateTaxAmount = StateTaxCalculator.getCalculatedStateTaxAmount(income, state);
		System.out.println("Your state tax for an income of $" + income + " is $" + stateTaxAmount);
		double calculatedFedTaxAmt = FederalTaxCalculator.calculateFedTax(income);
		System.out.println("Your federal tax for an income of $" + income + " is $" + calculatedFedTaxAmt);
		double calculatedFICAAmt = FederalTaxCalculator.calculateFICA(income);
		System.out.println("Your FICA tax for an income of $" + income + " is $" + calculatedFICAAmt);
	}

}
