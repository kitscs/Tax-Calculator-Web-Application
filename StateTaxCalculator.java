package ou.secs.tax;

import java.util.Arrays;
import java.util.HashMap;

public class StateTaxCalculator {
	public static double getCalculatedStateTaxAmount(double income, String stateCode) {
		State state = null;
		double calculatedStateTaxAmt = 0; // Final state tax after calculation

		HashMap<String, Limits> stateAndLimitsMap = StateAndLimits.getStateAndLimitMap();

		Limits rateAndBracketLimitsForState = stateAndLimitsMap.get(stateCode);

		int noOfBrackets = rateAndBracketLimitsForState.getNoOfbrackets();

		int startingTaxArrayIndex = rateAndBracketLimitsForState.getStartingTaxRate();
		int endingTaxArrayIndex = startingTaxArrayIndex + noOfBrackets + 1;

		int startingUpperBracketIndex = rateAndBracketLimitsForState.getStartingUpperBracket();
		int endingUpperBracketIndex = startingUpperBracketIndex + noOfBrackets;

		if (noOfBrackets < 0) {
			// to handle states with standard tax rate with no brackets
			HashMap<String, Double> standardStateAndLimitsMap = StateAndLimits.getStandardStateAndRateMap();

			// Straight calculation
			calculatedStateTaxAmt = standardStateAndLimitsMap.get(stateCode) * income;

		} else if (noOfBrackets > 0) {
			// Calculate state tax only for states with at least one tax rate

			double[] stateTaxRates = Arrays.copyOfRange(StateTaxRates.getTaxRates(), startingTaxArrayIndex,
					endingTaxArrayIndex);

			double[] stateTaxBrackets = Arrays.copyOfRange(StateTaxBrackets.getTaxBrackets(), startingUpperBracketIndex,
					endingUpperBracketIndex);

			// For each state, look at range of tax rates and range of tax
			// brackets
			state = new State(stateTaxRates, stateTaxBrackets);
			calculatedStateTaxAmt = state.calculateStateTax(income, state);
		}

		return calculatedStateTaxAmt;
	}
}
