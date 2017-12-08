package ou.secs.tax;

public class Limits {
	private int startingUpperBracket;
	private int startingTaxRate;
	private int noOfbrackets;
	
	
	public Limits(int startingUpperBracket, int startingTaxRate, int noOfbrackets) {
		super();
		this.startingUpperBracket = startingUpperBracket;
		this.startingTaxRate = startingTaxRate;
		this.noOfbrackets = noOfbrackets;
	}
	
	public int getStartingUpperBracket() {
		return startingUpperBracket;
	}
	public void setStartingUpperBracket(int startingUpperBracket) {
		this.startingUpperBracket = startingUpperBracket;
	}
	public int getStartingTaxRate() {
		return startingTaxRate;
	}
	public void setStartingTaxRate(int startingTaxRate) {
		this.startingTaxRate = startingTaxRate;
	}
	public int getNoOfbrackets() {
		return noOfbrackets;
	}
	public void setNoOfbrackets(int noOfbrackets) {
		this.noOfbrackets = noOfbrackets;
	}
	
}
