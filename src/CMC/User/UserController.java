/**
 * User controller manages all user accounts in the system
 * @author nlarson002
 *
 */
package CMC.User;

import CMC.University.*;
import CMC.Search.*;
import java.util.ArrayList;

public class UserController {


	//DBController should be static so delete variable
	private DBController dBController = new DBController();
	private static Account account;

	public String getUsername(Account account) {
		return account.getUsername();
	}
	
	public String getPassword(Account account) {
		return account.getPassword();	
	}	
		
	public String getFirstName(Account account) {
		return account.getFirstName();
	}
	
	public String getLastName(Account account) {
		return account.getLastName();
	}
	
	public String getAccountType() {
		return account.getUserType();
	}
	/**
	 * In use by John
	 * @author jengh001
	 * @param SName Name of University as string 
	 * @param AName Username of account as string
	 * @return boolean if successful or not
	 */
	public static boolean addSavedUniversities(String AName, String SName) {
		//University uni = DBController.dbGetUniversity(SName);
		//Account acc = DBController.getUserInfo(AName);
		//acc.addUniversity(uni);
		return DBController.updateSavedUniversities(AName, SName);
	}
		
	public static boolean login(String username, String password) {
		//Account account = DBController.getAccountDB(username, password);
		//boolean verify = account.verify(username,password,account);	//not sure how to verify.
		Account account = DBController.getAccountDB(username, password);
		String tempU = "";
		String tempP = "";
		String tempS = "";
		if (account.getUsername() == null)
		{
			return false;
		}
		else {
			tempU = account.getUsername();
			tempP = account.getPassword();
			tempS = account.getLoginStatus();
		}
		
		if (tempU.equals(username) && tempP.equals(password) && (tempS.equals("Y") || tempS.equals("y"))){
			
			return true;
			
		}
		else {
			return false;
		}

	}
	
	public void logout() {
			return;
	}
	
	public void goToLoginMenu() {
		int i = 0;
	}
	
	public void goToMenu() {
		int i = 0;
	}
	
	
	public String displaySavedList() {
		return "";
	}
	
	/**
	 * Saves the user information in the database, then updates the Account class and displays the 
	 * information to the UserUI if the Account object is not null.
	 * @param username
	 * @param password
	 * @param firstName
	 * @param lastName
	 */
	public static Account saveUserInfo(String userToSaveInfo, String password, String firstName, String lastName) {
		Account user = DBController.getAccountDB2(userToSaveInfo);
		if (user.getUsername() != null) {
			DBController.updateAccountDB(userToSaveInfo, password, firstName, lastName, user.getUserType(), user.getLoginStatus());
			user.updateAccountInfo(userToSaveInfo, password, firstName, lastName, user.getUserType(), user.getLoginStatus());
			user = DBController.getAccountDB2(userToSaveInfo);
			return user;
		}
		else {
			return user;
		}
	}

	/**
	 * In use by John
	 * @return Arraylist of all users in database
	 */
	public static ArrayList<Account> getAllUsers() {
		return DBController.getAllUsers();
	}
	
	public void lookup(String accountName, String universityName) {
		
	}
	
	public void reportError() {
		
	}
	
	public void addUniversityToList(University school) {
		
	}

	public void getUsername(String u) {
		// TODO Auto-generated method stub
		
	}
	public static Account getUserInfo(String username, String password)
	{
		return DBController.getAccountDB(username, password);
	}
	/**
	 * This method goes to DBController to retrieve an account
	 * then uses the UserUI to display the SavedUniversityList
	 * of the account retrieved.
	 * @param username
	 */

	public static ArrayList<String> getSavedUniversityList(String username) {
		//Account account = DBController.getSavedUniversityList(username);	
		//return account.getSavedUniversityList();
		
		return DBController.dbGetSavedUniversityList(username);
	}
	
}

















