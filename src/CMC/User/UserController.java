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
	 * @author jengh001
	 * @param SName Name of University as string 
	 * @param AName Username of account as string
	 */
	public void addSavedSchools(String SName, String AName) {
		University uni = DBController.searchUniversity(SName);
		Account acc = DBController.getUserInfo(AName);
		acc.addUniversity(uni);
	}
		
	public static boolean login(String username, String password) {
		Account account = DBController.getAccountDB(username, password);
		boolean verify = account.verify(username,password,account);	//not sure how to verify.
		if (verify == true)
		{
			UserUI.goToLoginPage();
			return true; 
		}
		else
		{
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
	public static Account saveUserInfo(String username, String password, String firstName, String lastName, String userType) {
		Account user = DBController.getAccountDB(username, password);
		DBController.updateAccountDB(user);
		if (user != null) {
			account.updateAccountInfo(username, password, firstName, lastName, userType);
			UserUI.displayAccountInfo(user);
		}
		return user;
	}
	
	public static User[] getAllUsers() {
		return DBController.getAllUsers();
	}
	
	public void lookup(String accountName, String schoolName) {
		
	}
	
	public void reportError() {
		
	}
	
	public void addSchoolToList(University school) {
		
	}

	public void getUsername(String u) {
		// TODO Auto-generated method stub
		
	}
	public static Account getUserInfo(String username)
	{
		Account temp = DBController.getUserInfo(username);
		return temp;
	}
	/**
	 * This method goes to DBController to retrieve an account
	 * then uses the UserUI to display the SavedUniversityList
	 * of the account retrieved.
	 * @param username
	 */

	public static ArrayList<String> getSavedUniversityList(String username) {
		Account account = DBController.getSavedUniversityList(username);	
		return account.getSavedUniversityList();
	}
	public static void getSavedUniversity(String username) {
		Account account = DBController.getSavedUniversityList(username);
	
		ArrayList<String> saveUnivList = account.getSavedUniversityList();
		UserUI.displaySavedUniversity(account);

	}
}

















