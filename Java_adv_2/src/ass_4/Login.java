package ass_4;

/**
 * This file contains the methods related to authentication
 */

import java.util.LinkedHashMap;
import java.util.Map;
/**
 * <h3>Description :</h3> This class is used for authentication
 * @author Karthik
 *
 */
public class Login {
	/*
	 * A map containing the customer id and its corresponding
	 * password
	 */
	private Map<Integer, String> loginMap=new
			LinkedHashMap<Integer, String>();
	/**
	 * <h3>Description :</h3> This method adds customer id and
	 * password pair into the map for the customers availing the
	 * online service.
	 * @param customerId the customer id
	 * @param password the password corresponding to the password
	 * */
	public void addLogin(int customerId,String password){
		//adding the input to the map
		loginMap.put(customerId, password);
	}
}