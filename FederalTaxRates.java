package ou.secs.tax;

/*Utility class storing federal tax rates*/

public class FederalTaxRates {
	private static double[] arrayFedRates = new double[7];

	public static double[] getFedRates() {

		arrayFedRates[0] = .10;
		arrayFedRates[1] = .15;
		arrayFedRates[2] = .25;
		arrayFedRates[3] = .28;
		arrayFedRates[4] = .33;
		arrayFedRates[5] = .35;
		arrayFedRates[6] = .3960;

		return arrayFedRates;
	}

}
