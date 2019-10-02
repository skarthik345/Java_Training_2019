package ass_6;

/**
* This file contains the Insufficient balance exception class
*/

/**
 * @Description This exception class is thrown if the account has
 * insufficient balance in the account for the transaction
 * @author Karthik
 */
public class InsufficientBalanceException extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * <h3>Description :</h3>The no-args constructor for the class
     */
    public InsufficientBalanceException() {
        // calling the parent constructor
        super("Insuffient Balance in the account");
    }
}