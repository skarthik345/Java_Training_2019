package assesment_3;

public class WithdrawException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public WithdrawException() {
        // calling the parent constructor
        super("Insuffient Balance in the account");
    }
}
