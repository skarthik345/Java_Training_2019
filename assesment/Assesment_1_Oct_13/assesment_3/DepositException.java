package assesment_3;

public class DepositException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DepositException() {
        // calling the parent constructor
        super("Balance cannot be negative");
    }
}
