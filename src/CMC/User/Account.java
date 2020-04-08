/**
 * Account is an instance of each account in the system
 * @author nlarson002
 *
 */
package CMC.User;

import java.util.ArrayList;
import CMC.University.*;
import CMC.Search.DBController;

public class Account {


	
	
	

	
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String userType;
	private String loginStatus;

	

	//sooner or later, we will need an ArrayList of Saved schools in the constructor
	public Account(String firstName, String lastName, String username, String password, String userType, String loginStatus) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userType = userType;
		this.loginStatus = loginStatus;
		
	}
	
	private ArrayList<University> universities = new ArrayList<University>();
	/**
	 * 
	 * @return
	 */

	public String getUsername() {
		return this.username; 
	}
	/**
	 * 
	 * @return
	 */
	public String getPassword() {
		return this.password;
	}
	/**
	 * 
	 * @return
	 */
	public String getFirstName() {
		return this.firstName;
	}
	/**
	 * 
	 * @return
	 */
	public String getLastName() {
		return this.lastName;
	}
	/**
	 * 
	 * @return
	 */
	public String getUserType() {
		return this.userType;
	}
	
	public String getLoginStatus() {
		return this.loginStatus;
	}
	
	public void login(String username, String password) {
		
	}
	public boolean verify(String username, String password,Account account) {

		if (this.getUsername() == username && this.getPassword() == password){
			return true;
		}
		else {
			return false;
		}
			 
	}
	
	
	public void updateAccountInfo(String userToUpdate, String password, String firstName, String lastName, String userType, String loginStatus) {
		this.username = userToUpdate;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userType = userType;
		this.loginStatus = loginStatus;
	}
	
	//CHANGED AND NO LONGER FOLLOWS COM DIAGRAM
	public Account getUserInfo(String username, String password){		// need to add this on class diagram. John had it on his communication diagram for U3 but not on class diagram
		Account account = DBController.getAccountDB(username, password);
		return account; 

	}
	
	public Account getUserInfo2(String username) {
		Account account = DBController.getAccountDB2(username);
		return account;
	}
	
	/**
	 * Removes the University from the Account Object
	 * 
	 * @param universityToRemove
	 */
	public static void removeUniversity(University universityToRemove) {
		ArrayList<University> universities = new ArrayList<University>();
		universities.remove(universityToRemove);
	}
	/**
	 * Adds university to saved schools list
	 * @author jengh001
	 * @param uni university to add to list
	 * @return Returns if university successfully added to saved list
	 */
	public boolean addUniversity(University uni) {
		boolean success = universities.add(uni);
		return success;
	}


	public ArrayList<String> getSavedUniversityList() {
		//ArrayList<String> universityNamesList; //im only doing this for u2. Sooner or later i will need an ArrayList to. Will need a constructure that holds the arrays of the universities
		ArrayList<String> universityNamesList = new ArrayList<String>();
		universityNamesList.add("Saint Johns"); //$NON-NLS-1$
		universityNamesList.add("Macalaster"); //$NON-NLS-1$
		universityNamesList.add("University of Minnesota"); //$NON-NLS-1$
		
		return universityNamesList;
	}
	public ArrayList<University> getSavedUniversity() {
		return universities;

	}
}
