package ass_8;

/**
* This file contains the InsufficientFundException class
*/

/**
 * @Description This exception class is thrown if the account has
 * insufficient balance in the account for the transaction
 * @author Karthik
 */
public class InsufficientFundException extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * <h3>Description :</h3>The no-args constructor for the class
     */
    public InsufficientFundException(String msg) {
        // calling the parent constructor
        super(msg);
    }
}