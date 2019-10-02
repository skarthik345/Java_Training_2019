package ass_6;

/**
* This file contains the UnAuthorizedWithdrawTransactionException
*/

/**
 * <h3>Description :</h3> This exception is thrown when the unauthorized
 * transaction is done.
 * 
 * @author Karthik.
 */
public class UnAuthorizedWithdrawTransactionException extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * <h3>Description:
     * <h3>This the no-arg constructor for the
     * UnAuthorizedWithdrawTransactionException class.
     */
    public UnAuthorizedWithdrawTransactionException() {
        // calling the super class constructor
        super("The user is unauthorized for the withdrawal");
    }
}