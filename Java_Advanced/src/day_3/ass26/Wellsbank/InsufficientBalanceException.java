package day_3.ass26.Wellsbank;

public class InsufficientBalanceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(){
		super("Sufficient Balance not available");
	}
}