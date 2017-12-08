package ou.secs.tax;

import java.util.HashMap;

public class StateAndLimits {

	public static HashMap<String, Limits> getStateAndLimitMap() {

		HashMap<String, Limits> stateLimitMap = new HashMap<String, Limits>();
		stateLimitMap.put("AL", new Limits(0, 0, 2));
		stateLimitMap.put("AK", new Limits(-1, -1, -1)); // no tax - look below
		stateLimitMap.put("AZ", new Limits(2, 3, 4));
		stateLimitMap.put("AR", new Limits(6, 8, 5));
		stateLimitMap.put("CA", new Limits(11, 14, 9));
		stateLimitMap.put("CO", new Limits(-1, -1, -1)); // -1
		stateLimitMap.put("CT", new Limits(20, 24, 6));
		stateLimitMap.put("DE", new Limits(26, 31, 6));
		stateLimitMap.put("FL", new Limits(-1, -1, -1)); // no tax - look below
		stateLimitMap.put("GA", new Limits(32, 36, 5));
		stateLimitMap.put("HI", new Limits(37, 41, 8));
		stateLimitMap.put("ID", new Limits(45, 50, 6));
		stateLimitMap.put("IL", new Limits(-1, -1, -1)); // -1
		stateLimitMap.put("IN", new Limits(-1, -1, -1)); // -1
		stateLimitMap.put("IA", new Limits(51, 57, 8));
		stateLimitMap.put("KS", new Limits(60, 66, 2));
		stateLimitMap.put("KY", new Limits(62, 69, 5));
		stateLimitMap.put("LA", new Limits(67, 75, 2));
		stateLimitMap.put("ME", new Limits(69, 78, 2));
		stateLimitMap.put("MD", new Limits(71, 81, 7));
		stateLimitMap.put("MA", new Limits(-1, -1, -1)); // -1
		stateLimitMap.put("MI", new Limits(-1, -1, -1));// -1 for all states
														// with fixed state tax
														// rate
		stateLimitMap.put("MN", new Limits(77, 89, 3));
		stateLimitMap.put("MS", new Limits(80, 93, 2));
		stateLimitMap.put("MO", new Limits(82, 96, 9));
		stateLimitMap.put("MT", new Limits(91, 106, 6));
		stateLimitMap.put("NE", new Limits(97, 113, 3));
		stateLimitMap.put("NV", new Limits(-1, -1, -1)); // no tax - look below
		stateLimitMap.put("NH", new Limits(-1, -1, -1)); // -1
		stateLimitMap.put("NJ", new Limits(100, 117, 5));
		stateLimitMap.put("NM", new Limits(105, 123, 3));
		stateLimitMap.put("NY", new Limits(108, 127, 7));
		stateLimitMap.put("NC", new Limits(-1, -1, -1)); // -1
		stateLimitMap.put("ND", new Limits(115, 135, 4));
		stateLimitMap.put("OH", new Limits(119, 140, 8));
		stateLimitMap.put("OK", new Limits(127, 149, 5));

		stateLimitMap.put("OR", new Limits(132, 155, 3));
		stateLimitMap.put("PA", new Limits(-1, -1, -1)); // -1
		stateLimitMap.put("RI", new Limits(135, 159, 2));
		stateLimitMap.put("SC", new Limits(137, 162, 5)); // NOT ONE LESS THAN
															// BRACKETS - THEY
															// ARE EQUAL
		stateLimitMap.put("SD", new Limits(-1, -1, -1)); // no tax - look below
		stateLimitMap.put("TN", new Limits(-1, -1, -1)); // -1
		stateLimitMap.put("TX", new Limits(-1, -1, -1)); // no tax - look below
		stateLimitMap.put("UT", new Limits(-1, -1, -1)); // -1
		stateLimitMap.put("VT", new Limits(142, 167, 4));// NOT ONE LESS THAN
															// BRACKETS - THEY
															// ARE EQUAL
		stateLimitMap.put("VA", new Limits(146, 172, 3));
		stateLimitMap.put("WA", new Limits(-1, -1, -1)); // no tax - look below
		stateLimitMap.put("WV", new Limits(149, 176, 4));
		stateLimitMap.put("WI", new Limits(153, 181, 3));
		stateLimitMap.put("WY", new Limits(-1, -1, -1)); // no tax - look below
		stateLimitMap.put("DC", new Limits(156, 185, 5));

		return stateLimitMap;
	}

	public static HashMap<String, Double> getStandardStateAndRateMap() {

		HashMap<String, Double> standardStateAndRateMap = new HashMap<String, Double>();

		standardStateAndRateMap.put("AK", 0.0);
		standardStateAndRateMap.put("CO", 0.0463);
		standardStateAndRateMap.put("FL", 0.0);
		standardStateAndRateMap.put("IL", 0.0495);
		standardStateAndRateMap.put("IN", 0.0323);
		standardStateAndRateMap.put("MA", 0.0510);
		standardStateAndRateMap.put("MI", 0.0425);
		standardStateAndRateMap.put("NH", 0.05);
		standardStateAndRateMap.put("NC", 0.05499);
		standardStateAndRateMap.put("NV", 0.0);
		standardStateAndRateMap.put("PA", 0.0307);
		standardStateAndRateMap.put("SD", 0.0);
		standardStateAndRateMap.put("TN", 0.05);
		standardStateAndRateMap.put("TX", 0.0);
		standardStateAndRateMap.put("UT", 0.05);
		standardStateAndRateMap.put("WA", 0.0);
		standardStateAndRateMap.put("WY", 0.0);

		return standardStateAndRateMap;
	}
}
