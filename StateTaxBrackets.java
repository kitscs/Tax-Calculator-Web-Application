package ou.secs.tax;

// Utility class storing tax brackets for all states
public class StateTaxBrackets {

	private static double[] arrayBracketHigh = new double[164];

	public static double[] getTaxBrackets() {

		/*
		 * An array of the upper end of every state's tax brackets. States are
		 * in alphabetical order
		 */
		// Alabama
		arrayBracketHigh[0] = 500;
		arrayBracketHigh[1] = 3000;
		// Alaska - no tax and no brackets
		// Arizona
		arrayBracketHigh[2] = 10179;
		arrayBracketHigh[3] = 25445;
		arrayBracketHigh[4] = 50890;
		arrayBracketHigh[5] = 152668;
		// Arkansas
		arrayBracketHigh[6] = 4299;
		arrayBracketHigh[7] = 8500;
		arrayBracketHigh[8] = 12699;
		arrayBracketHigh[9] = 21199;
		arrayBracketHigh[10] = 35100;
		// California
		arrayBracketHigh[11] = 8015;
		arrayBracketHigh[12] = 19001;
		arrayBracketHigh[13] = 29989;
		arrayBracketHigh[14] = 41629;
		arrayBracketHigh[15] = 52612;
		arrayBracketHigh[16] = 268750;
		arrayBracketHigh[17] = 322499;
		arrayBracketHigh[18] = 537498;
		arrayBracketHigh[19] = 1000000;
		// Colorado - no brackets
		// Connecticut
		arrayBracketHigh[20] = 10000;
		arrayBracketHigh[21] = 50000;
		arrayBracketHigh[22] = 100000;
		arrayBracketHigh[23] = 200000;
		arrayBracketHigh[24] = 250000;
		arrayBracketHigh[25] = 500000;
		// Delaware - NO TAX FOR $0
		// FIRST BRACKET 2000-5000
		arrayBracketHigh[26] = 2000;
		arrayBracketHigh[27] = 5000;
		arrayBracketHigh[28] = 10000;
		arrayBracketHigh[29] = 20000;
		arrayBracketHigh[30] = 25000;
		arrayBracketHigh[31] = 60000;
		// Florida - no tax and no brackets
		// Georgia
		arrayBracketHigh[32] = 750;
		arrayBracketHigh[33] = 2250;
		arrayBracketHigh[34] = 3750;
		arrayBracketHigh[35] = 5250;
		arrayBracketHigh[36] = 7000;
		// Hawaii
		arrayBracketHigh[37] = 24000;
		arrayBracketHigh[38] = 4800;
		arrayBracketHigh[39] = 9600;
		arrayBracketHigh[40] = 14400;
		arrayBracketHigh[41] = 19200;
		arrayBracketHigh[42] = 24000;
		arrayBracketHigh[43] = 36000;
		arrayBracketHigh[44] = 48000;
		// Idaho
		arrayBracketHigh[45] = 1454;
		arrayBracketHigh[46] = 2908;
		arrayBracketHigh[47] = 4362;
		arrayBracketHigh[48] = 5816;
		arrayBracketHigh[49] = 7270;
		arrayBracketHigh[50] = 10905;
		// Illinois - no brackets
		// Indiana - no brackets
		// Iowa
		arrayBracketHigh[51] = 1573;
		arrayBracketHigh[52] = 3146;
		arrayBracketHigh[53] = 6292;
		arrayBracketHigh[54] = 14157;
		arrayBracketHigh[55] = 23595;
		arrayBracketHigh[56] = 31460;
		arrayBracketHigh[57] = 47460;
		arrayBracketHigh[58] = 70785;
		// Kansas
		arrayBracketHigh[59] = 15000;
		arrayBracketHigh[60] = 30000;
		// Kentucky
		arrayBracketHigh[61] = 3000;
		arrayBracketHigh[62] = 4000;
		arrayBracketHigh[63] = 5000;
		arrayBracketHigh[64] = 9000;
		arrayBracketHigh[65] = 75000;
		// Louisiana
		arrayBracketHigh[66] = 12500;
		arrayBracketHigh[67] = 50000;
		// Maine
		arrayBracketHigh[68] = 21050;
		arrayBracketHigh[69] = 50000;
		// Maryland
		arrayBracketHigh[70] = 1000;
		arrayBracketHigh[71] = 2000;
		arrayBracketHigh[72] = 3000;
		arrayBracketHigh[73] = 100000;
		arrayBracketHigh[74] = 125000;
		arrayBracketHigh[75] = 150000;
		arrayBracketHigh[76] = 250000;
		// Massachusetts - no brackets
		// Michigan - no brackets
		// Minnesota
		arrayBracketHigh[77] = 25390;
		arrayBracketHigh[78] = 83400;
		arrayBracketHigh[79] = 156911;
		// Mississippi
		arrayBracketHigh[80] = 5000;
		arrayBracketHigh[81] = 10000;
		// Missouri
		arrayBracketHigh[82] = 1008;
		arrayBracketHigh[83] = 2016;
		arrayBracketHigh[84] = 3024;
		arrayBracketHigh[85] = 4032;
		arrayBracketHigh[86] = 5040;
		arrayBracketHigh[87] = 6048;
		arrayBracketHigh[88] = 7056;
		arrayBracketHigh[89] = 8064;
		arrayBracketHigh[90] = 9072;
		// Montana
		arrayBracketHigh[91] = 2900;
		arrayBracketHigh[92] = 5200;
		arrayBracketHigh[93] = 7900;
		arrayBracketHigh[94] = 10600;
		arrayBracketHigh[95] = 13600;
		arrayBracketHigh[96] = 17600;
		// Nebraska
		arrayBracketHigh[97] = 3090;
		arrayBracketHigh[98] = 18510;
		arrayBracketHigh[99] = 29830;
		// Nevada - no tax and no brackets
		// New Hampshire - no brackets
		// New Jersey
		arrayBracketHigh[100] = 20000;
		arrayBracketHigh[101] = 35000;
		arrayBracketHigh[102] = 40000;
		arrayBracketHigh[103] = 75000;
		arrayBracketHigh[104] = 500000;
		// New Mexico
		arrayBracketHigh[105] = 5500;
		arrayBracketHigh[106] = 11000;
		arrayBracketHigh[107] = 16000;
		// New York
		arrayBracketHigh[108] = 8500;
		arrayBracketHigh[109] = 11700;
		arrayBracketHigh[110] = 13900;
		arrayBracketHigh[111] = 21400;
		arrayBracketHigh[112] = 80650;
		arrayBracketHigh[113] = 215400;
		arrayBracketHigh[114] = 1077550;
		// North Carolina - no brackets
		// North Dakota
		arrayBracketHigh[115] = 37950;
		arrayBracketHigh[116] = 91900;
		arrayBracketHigh[117] = 191650;
		arrayBracketHigh[118] = 416700;
		// Ohio
		arrayBracketHigh[119] = 5250;
		arrayBracketHigh[120] = 10500;
		arrayBracketHigh[121] = 15800;
		arrayBracketHigh[122] = 21100;
		arrayBracketHigh[123] = 42100;
		arrayBracketHigh[124] = 84200;
		arrayBracketHigh[125] = 105300;
		arrayBracketHigh[126] = 210600;
		// Oklahoma
		arrayBracketHigh[127] = 1000;
		arrayBracketHigh[128] = 2500;
		arrayBracketHigh[129] = 3750;
		arrayBracketHigh[130] = 4900;
		arrayBracketHigh[131] = 7200;
		// Oregon
		arrayBracketHigh[132] = 3350;
		arrayBracketHigh[133] = 8450;
		arrayBracketHigh[134] = 125000;
		// Pennsylvania - no brackets
		// Rhode Island
		arrayBracketHigh[135] = 61300;
		arrayBracketHigh[136] = 139400;
		// South Carolina
		arrayBracketHigh[137] = 2930;
		arrayBracketHigh[138] = 5860;
		arrayBracketHigh[139] = 8790;
		arrayBracketHigh[140] = 11720;
		arrayBracketHigh[141] = 14650;
		// South Dakota - no tax and no brackets
		// Tennessee - no brackets
		// Texas - no tax and no brackets
		// Utah - no brackets
		// Vermont
		arrayBracketHigh[142] = 37950;
		arrayBracketHigh[143] = 91900;
		arrayBracketHigh[144] = 191650;
		arrayBracketHigh[145] = 416700;
		// Virginia
		arrayBracketHigh[146] = 3000;
		arrayBracketHigh[147] = 5000;
		arrayBracketHigh[148] = 17000;
		// Washington - no tax and no brackets
		// West Virginia
		arrayBracketHigh[149] = 10000;
		arrayBracketHigh[150] = 25000;
		arrayBracketHigh[151] = 40000;
		arrayBracketHigh[152] = 60000;
		// Wisconsin
		arrayBracketHigh[153] = 11230;
		arrayBracketHigh[154] = 22470;
		arrayBracketHigh[155] = 247350;
		// Wyoming - no tax and no brackets
		// Washington D.C.
		arrayBracketHigh[156] = 10000;
		arrayBracketHigh[157] = 40000;
		arrayBracketHigh[158] = 60000;
		arrayBracketHigh[159] = 350000;
		arrayBracketHigh[160] = 1000000;

		return arrayBracketHigh;
	}

}