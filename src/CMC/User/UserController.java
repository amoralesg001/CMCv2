/**
 * 
 */

/**
 * @author nlarson002
 *
 */
package User;

import University.*;
import Search.*;
import java.util.ArrayList;

import Search.*;

public class UserController {
	
	private DBController dBController = new DBController();
	private Account account;
	
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
	
	public void addSavedSchools(University schoolName) {
		
	}
		
	public static void login(String username, String password) {
		Account account = DBController.getAccountDB(username, password);
		Boolean verify = account.verifyAccount(username,password,account);	//not sure how to verify.
		if (verify == true)
		{
		UserUI.gotToLoginPage();
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
	
	public void saveUserInfo(String username, String password, String firstName, String lastName) {
		//todo
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
	public static void getSavedUniversity(String username) {
	Account account = DBController.getSavedUniversityList(username);
	
	ArrayList <String> saveUnivList = account.getSavedUniversity();
	UserUI.displaySavedUniversity(account);
	}
}

















