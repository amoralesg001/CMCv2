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

	//DBController should be static delete variable
	private DBController dbController = new DBController();

	
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String userType;
	private boolean loginStatus;

	private ArrayList<String> universityNamesList; //im only doing this for no2. Sooner or later i will need an ArrayList to. Will need a constructure that holds the arrays of the universities
	

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
	public void login(String username, String password) {
		
	}
	public boolean verify(String username, String password,Account account) {

		if (account.getUsername() == username && account.getPassword() == password)

		if (this.getUsername() == username && this.getPassword() == password)

		{
		return true;
		}
		else {
		return false;
		}
			 
	}
	
	
	public void updateAccountInfo(String username, String password, String firstName, String lastName) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public ArrayList<String> getUserInfo(){		// need to add this on class diagram. John had it on his communication diagram for U3 but not on class diagram
		ArrayList<String> info = new ArrayList<String>(); 	//or should I just make getUser, getPassword, etc.?
		info.add(username);
		info.add(password);
		info.add(firstName);
		info.add(lastName);
		info.add(userType);
		return info; 

	}
	
	/**
	 * Removes the University from the Account Object
	 * 
	 * @param universityToRemove
	 */
	public static void removeUniversity(University universityToRemove) {
		ArrayList<University> universitys = new ArrayList<University>();
		universitys.remove(universityToRemove);
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
		
		universityNamesList.add("Saint Johns");
		universityNamesList.add("Macalaster");
		universityNamesList.add("University of Minnesota");
		
		return universityNamesList;

	public ArrayList<University> getSavedUniversity() {
		return universities;

	}
}
