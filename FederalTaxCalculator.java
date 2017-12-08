package ou.secs.tax;

/*Calculates federal tax using the brackets and rates. Also calculates FICA, which includes Social Security and Medicare*/

public class FederalTaxCalculator {

	private static final int MEDICARE_SURTAX_THRESHOLD_INCOME = 200000;
	private static final double MEDICARE_SURTAX_PERCENT = 0.009;
	private static final double SOCIAL_SECURITY_TAX_PERCENT = .062;
	private static final double MEDICARE_TAX_PERCENT = 0.0145;
	private static final int FICA_INCOME_CAP = 127200;

	public static double calculateFedTax(double income) {
		double[] upperFedTaxBracketArray = FederalTaxBrackets.getFedUpperBracket();
		double[] fedTaxRateArray = FederalTaxRates.getFedRates();
		double fedTax = 0;
		double baseFedTax = 0;
		int totalNumOfBrackets = upperFedTaxBracketArray.length;
		int totalNumOfRates = fedTaxRateArray.length;
		for (int i = 0; i < upperFedTaxBracketArray.length; i++) {
			if (income <= upperFedTaxBracketArray[0]) {
				fedTax = income * fedTaxRateArray[0];
			} else if (i > 0 && income <= upperFedTaxBracketArray[i] && income > upperFedTaxBracketArray[i - 1]) {
				fedTax = (income - upperFedTaxBracketArray[i - 1]) * fedTaxRateArray[i];
				baseFedTax = calculateCumulativeBaseTax(upperFedTaxBracketArray, fedTaxRateArray, baseFedTax, i);
				fedTax = baseFedTax + fedTax;
			} else if (i == (totalNumOfBrackets - 1) && income > upperFedTaxBracketArray[totalNumOfBrackets - 1]) {
				fedTax = (income - upperFedTaxBracketArray[totalNumOfBrackets - 1])
						* fedTaxRateArray[totalNumOfRates - 1];
				baseFedTax = calculateCumulativeBaseTax(upperFedTaxBracketArray, fedTaxRateArray, baseFedTax,
						totalNumOfBrackets);
				fedTax = baseFedTax + fedTax;
			}

		}

		return fedTax;
	}

	private static double calculateCumulativeBaseTax(double[] upperFedTaxBracketArray, double[] fedTaxRateArray,
			double baseFedTax, int totalNumOfBrackets) {
		for (int j = 0; j <= totalNumOfBrackets; j++) {

			if (j == 1) {

				baseFedTax += upperFedTaxBracketArray[0] * fedTaxRateArray[0];
			}
			if (j >= 2) {
				baseFedTax += (upperFedTaxBracketArray[j - 1] - upperFedTaxBracketArray[j - 2])
						* fedTaxRateArray[j - 1];
			}
		}
		return baseFedTax;
	}

	public static double calculateFICA(double income) {
		double fica = 0.0;
		double medicare = 0.0;
		double socsec = 0.0;

		if (income >= FICA_INCOME_CAP) {
			medicare = FICA_INCOME_CAP * MEDICARE_TAX_PERCENT;
			socsec = FICA_INCOME_CAP * SOCIAL_SECURITY_TAX_PERCENT;

		} else {
			medicare = income * MEDICARE_TAX_PERCENT;
			socsec = income * SOCIAL_SECURITY_TAX_PERCENT;
		}
		fica = medicare + socsec;
		if (income > MEDICARE_SURTAX_THRESHOLD_INCOME) {
			fica += (income - MEDICARE_SURTAX_THRESHOLD_INCOME) * MEDICARE_SURTAX_PERCENT;
		}

		return fica;
	}
}
