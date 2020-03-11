/**
 * 
 */

/**
 * @author nlarson002
 *
 */
package User;

import  CMC.University.*;
import University.University;

import java.util.ArrayList;

import CMC.Search.*;

public class UserController {
	
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
		
	public static boolean login(String username, String password) {
		Account account = DBController.getAccountDB(username, password);
		boolean verify = account.verify(username,password,account);	//not sure how to verify.
		if (verify == true)
		{
		UserUI.gotToLoginPage();
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
	
	public void saveUserInfo(String username, String password, String firstName, String lastName) {
		//todo
	}
	
	public void getAllUsers() {
		
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
	public static void getUserInfo(String username)
	{
	DBController.getUserInfo(username);
	}
	/**
	 * This method goes to DBController to retrieve an account
	 * then uses the UserUI to display the SavedUniversityList
	 * of the account retrieved.
	 * @param username
	 */
	public static ArrayList<String> getSavedUniversity(String username) {
	Account account = DBController.getSavedUniversityList(username);	
	return account.getSavedUniversity();
	}
}

















