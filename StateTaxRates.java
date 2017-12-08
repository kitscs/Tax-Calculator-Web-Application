package ou.secs.tax;

/*Utility class storing tax percentages for all states */
public class StateTaxRates {

	private static double[] allStateTaxRates = new double[202];

	public static double[] getTaxRates() {

		/*
		 * An array of all the states' tax rates in all brackets. States are in
		 * alphabetical order
		 */
		// Alabama
		allStateTaxRates[0] = 0.02;
		allStateTaxRates[1] = 0.04;
		allStateTaxRates[2] = 0.05;
		// Alaska - no tax
		// Arizona
		allStateTaxRates[3] = 0.0259;
		allStateTaxRates[4] = 0.0288;
		allStateTaxRates[5] = 0.0336;
		allStateTaxRates[6] = 0.0424;
		allStateTaxRates[7] = 0.0454;
		// Arkansas
		allStateTaxRates[8] = 0.090;
		allStateTaxRates[9] = 0.0250;
		allStateTaxRates[10] = 0.0350;
		allStateTaxRates[11] = 0.0450;
		allStateTaxRates[12] = 0.0600;
		allStateTaxRates[13] = 0.0690;
		// California
		allStateTaxRates[14] = 0.01;
		allStateTaxRates[15] = 0.02;
		allStateTaxRates[16] = 0.04;
		allStateTaxRates[17] = 0.06;
		allStateTaxRates[18] = 0.08;
		allStateTaxRates[19] = 0.0930;
		allStateTaxRates[20] = 0.1030;
		allStateTaxRates[21] = 0.1130;
		allStateTaxRates[22] = 0.1230;
		allStateTaxRates[23] = 0.1330;

		// allStateTaxRates = 0.0463; Colorado
		// Connecticut
		allStateTaxRates[24] = 0.030;
		allStateTaxRates[25] = 0.050;
		allStateTaxRates[26] = 0.0550;
		allStateTaxRates[27] = 0.060;
		allStateTaxRates[28] = 0.0650;
		allStateTaxRates[29] = 0.0690;
		allStateTaxRates[30] = 0.0699;
		// Delaware
		allStateTaxRates[31] = 0.0220;
		allStateTaxRates[32] = 0.0390;
		allStateTaxRates[33] = 0.0480;
		allStateTaxRates[34] = 0.0520;
		allStateTaxRates[35] = 0.0660;
		// Florida - no tax
		// Georgia
		allStateTaxRates[36] = 0.01;
		allStateTaxRates[37] = 0.02;
		allStateTaxRates[38] = 0.03;
		allStateTaxRates[39] = 0.05;
		allStateTaxRates[40] = 0.06;
		// Hawaii
		allStateTaxRates[41] = 0.0140;
		allStateTaxRates[42] = 0.0320;
		allStateTaxRates[43] = 0.0550;
		allStateTaxRates[44] = 0.0640;
		allStateTaxRates[45] = 0.0680;
		allStateTaxRates[46] = 0.0720;
		allStateTaxRates[47] = 0.0760;
		allStateTaxRates[48] = 0.0790;
		allStateTaxRates[49] = 0.0825;
		// Idaho
		allStateTaxRates[50] = 0.0160;
		allStateTaxRates[51] = 0.0360;
		allStateTaxRates[52] = 0.0410;
		allStateTaxRates[53] = 0.0510;
		allStateTaxRates[54] = 0.0610;
		allStateTaxRates[55] = 0.0710;
		allStateTaxRates[56] = 0.0740;
		// allStateTaxRates = 0.0495; Illinois
		// allStateTaxRates = 0.0323; Indiana
		// Iowa
		allStateTaxRates[57] = 0.0036;
		allStateTaxRates[58] = 0.0072;
		allStateTaxRates[59] = 0.0243;
		allStateTaxRates[60] = 0.0450;
		allStateTaxRates[61] = 0.0612;
		allStateTaxRates[62] = 0.0648;
		allStateTaxRates[63] = 0.0680;
		allStateTaxRates[64] = 0.0792;
		allStateTaxRates[65] = 0.0898;
		// Kansas
		allStateTaxRates[66] = 0.0290;
		allStateTaxRates[67] = 0.0490;
		allStateTaxRates[68] = 0.0520;
		// Kentucky
		allStateTaxRates[69] = 0.02;
		allStateTaxRates[70] = 0.03;
		allStateTaxRates[71] = 0.04;
		allStateTaxRates[72] = 0.05;
		allStateTaxRates[73] = 0.0580;
		allStateTaxRates[74] = 0.06;
		// Louisina
		allStateTaxRates[75] = 0.02;
		allStateTaxRates[76] = 0.04;
		allStateTaxRates[77] = 0.06;
		// Maine
		allStateTaxRates[78] = 0.0580;
		allStateTaxRates[79] = 0.0675;
		allStateTaxRates[80] = 0.0715;
		// Maryland
		allStateTaxRates[81] = 0.02;
		allStateTaxRates[82] = 0.03;
		allStateTaxRates[83] = 0.04;
		allStateTaxRates[84] = 0.0475;
		allStateTaxRates[85] = 0.05;
		allStateTaxRates[86] = 0.0525;
		allStateTaxRates[87] = 0.0550;
		allStateTaxRates[88] = 0.0575;
		// allStateTaxRates[92] = 0.0510; Mass
		// allStateTaxRates[93] = 0.0425; Mich
		// Minnesota
		allStateTaxRates[89] = 0.0535;
		allStateTaxRates[90] = 0.0705;
		allStateTaxRates[91] = 0.0785;
		allStateTaxRates[92] = 0.0985;
		// Mississippi
		allStateTaxRates[93] = 0.03;
		allStateTaxRates[94] = 0.04;
		allStateTaxRates[95] = 0.05;
		// Missouri
		allStateTaxRates[96] = 0.015;
		allStateTaxRates[97] = 0.02;
		allStateTaxRates[98] = 0.0250;
		allStateTaxRates[99] = 0.03;
		allStateTaxRates[100] = 0.0350;
		allStateTaxRates[101] = 0.04;
		allStateTaxRates[102] = 0.0450;
		allStateTaxRates[103] = 0.05;
		allStateTaxRates[104] = 0.0550;
		allStateTaxRates[105] = 0.06;
		// Montana
		allStateTaxRates[106] = 0.01;
		allStateTaxRates[107] = 0.02;
		allStateTaxRates[108] = 0.03;
		allStateTaxRates[109] = 0.04;
		allStateTaxRates[110] = 0.05;
		allStateTaxRates[111] = 0.06;
		allStateTaxRates[112] = 0.069;
		// Nebraska
		allStateTaxRates[113] = 0.0246;
		allStateTaxRates[114] = 0.0351;
		allStateTaxRates[115] = 0.0501;
		allStateTaxRates[116] = 0.0684;
		// Nevada - no tax
		// NH allStateTaxRates = 0.05;
		// New Jersey
		allStateTaxRates[117] = 0.0140;
		allStateTaxRates[118] = 0.0175;
		allStateTaxRates[119] = 0.0350;
		allStateTaxRates[120] = 0.05525;
		allStateTaxRates[121] = 0.0637;
		allStateTaxRates[122] = 0.0897;
		// New Mexico
		allStateTaxRates[123] = 0.0170;
		allStateTaxRates[124] = 0.032;
		allStateTaxRates[125] = 0.047;
		allStateTaxRates[126] = 0.049;
		// New York
		allStateTaxRates[127] = 0.04;
		allStateTaxRates[128] = 0.045;
		allStateTaxRates[129] = 0.0525;
		allStateTaxRates[130] = 0.059;
		allStateTaxRates[131] = 0.0645;
		allStateTaxRates[132] = 0.0665;
		allStateTaxRates[133] = 0.0685;
		allStateTaxRates[134] = 0.0882;
		// North Carolina allStateTaxRates = 0.05499;
		// North Dakota
		allStateTaxRates[135] = 0.010;
		allStateTaxRates[136] = 0.0204;
		allStateTaxRates[137] = 0.0227;
		allStateTaxRates[138] = 0.0264;
		allStateTaxRates[139] = 0.029;
		// Ohio
		allStateTaxRates[140] = 0.00495;
		allStateTaxRates[141] = 0.00990;
		allStateTaxRates[142] = 0.01980;
		allStateTaxRates[143] = 0.02476;
		allStateTaxRates[144] = 0.02969;
		allStateTaxRates[145] = 0.03465;
		allStateTaxRates[146] = 0.03960;
		allStateTaxRates[147] = 0.04597;
		allStateTaxRates[148] = 0.04997;
		// Oklahoma
		allStateTaxRates[149] = 0.005;
		allStateTaxRates[150] = 0.01;
		allStateTaxRates[151] = 0.02;
		allStateTaxRates[152] = 0.03;
		allStateTaxRates[153] = 0.04;
		allStateTaxRates[154] = 0.05;
		// Oregon
		allStateTaxRates[155] = 0.05;
		allStateTaxRates[156] = 0.07;
		allStateTaxRates[157] = 0.09;
		allStateTaxRates[158] = 0.0990;
		// Pennsylvania allStateTaxRates = 0.0307;
		// Rhode Island
		allStateTaxRates[159] = 0.0375;
		allStateTaxRates[160] = 0.0475;
		allStateTaxRates[161] = 0.0599;
		// South Carolina
		allStateTaxRates[162] = 0.03;
		allStateTaxRates[163] = 0.04;
		allStateTaxRates[164] = 0.05;
		allStateTaxRates[165] = 0.06;
		allStateTaxRates[166] = 0.07;
		// South Dakota - no tax
		// TN allStateTaxRates = 0.05;
		// Texas - no tax
		// Utah allStateTaxRates = 0.05;
		// Vermont
		allStateTaxRates[167] = 0.0355;
		allStateTaxRates[168] = 0.0680;
		allStateTaxRates[169] = 0.0780;
		allStateTaxRates[170] = 0.0880;
		allStateTaxRates[171] = 0.0895;
		// Virginia
		allStateTaxRates[172] = 0.02;
		allStateTaxRates[173] = 0.03;
		allStateTaxRates[174] = 0.05;
		allStateTaxRates[175] = 0.0575;
		// Washington - no tax
		// West Virginia
		allStateTaxRates[176] = 0.03;
		allStateTaxRates[177] = 0.04;
		allStateTaxRates[178] = 0.0450;
		allStateTaxRates[179] = 0.06;
		allStateTaxRates[180] = 0.0650;
		// Wisconsin
		allStateTaxRates[181] = 0.04;
		allStateTaxRates[182] = 0.0584;
		allStateTaxRates[183] = 0.0627;
		allStateTaxRates[184] = 0.0765;
		// Wyoming - no tax
		// Washington D.C.
		allStateTaxRates[185] = 0.04;
		allStateTaxRates[186] = 0.06;
		allStateTaxRates[187] = 0.0650;
		allStateTaxRates[188] = 0.0850;
		allStateTaxRates[189] = 0.0875;
		allStateTaxRates[190] = 0.0895;

		return allStateTaxRates;
	}
}
