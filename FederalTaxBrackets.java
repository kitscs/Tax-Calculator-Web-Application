package ou.secs.tax;

/*Upper limits of all the brackets for federal tax*/

public class FederalTaxBrackets {

	private static double[] arrayFedUpperBracket = new double[6];

	public static double[] getFedUpperBracket() {

		arrayFedUpperBracket[0] = 9325;
		arrayFedUpperBracket[1] = 37950;
		arrayFedUpperBracket[2] = 91900;
		arrayFedUpperBracket[3] = 191650;
		arrayFedUpperBracket[4] = 416700;
		arrayFedUpperBracket[5] = 418400;

		return arrayFedUpperBracket;
	}

}
