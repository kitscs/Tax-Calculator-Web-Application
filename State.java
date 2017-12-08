/**
 * 
 */
package ou.secs.tax;

/**
 * @author Nikita
 * 
 */
public class State {
	static double[] arrayRates;
	static double[] arrayBracketHigh;
	static double ratesNum;

	public State() {
		// TODO Auto-generated constructor stub
	}

	public State(double[] arrayRates, double[] arrayBracketHigh) {
		State.arrayRates = arrayRates;
		State.arrayBracketHigh = arrayBracketHigh;
	}

	public double calculateStateTax(double income, State state) {
		double stateTax = 0;
		for (int i = 0; i < arrayBracketHigh.length; i++) {
			if (income <= arrayBracketHigh[0]) {
				stateTax = income * arrayRates[0];
			} else if (i > 0 && income <= arrayBracketHigh[i] && income > arrayBracketHigh[i - 1]) {
				stateTax = income * arrayRates[i];
			} else if (income > arrayBracketHigh[arrayBracketHigh.length - 1]) {
				stateTax = income * arrayRates[arrayRates.length - 1];
			}
		}
		return stateTax;
	}

}
