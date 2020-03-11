/**
 * 
 */

/**
 * @author nlarson002
 *
 */
package User;

import java.util.ArrayList;
import CMC.University.*;

import Search.DBController;
import University.University;

public class Account {
	
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String userType;
	private boolean loginStatus;
	private ArrayList<String> universityNamesList; //im only doing this for not. Sooner or later i will need an ArrayList to. Will need a constructure that holds the arrays of the universities
	
	public String getUsername() {
		return this.username; 
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getUserType() {
		return this.userType;
	}
	public void login(String username, String password) {
		
	}
	public boolean verify(String username, String password,Account account) {
		if (account.getUsername() == username && account.getPassword() == password)
		{
		return true;
		}
		else {
		return false;
		}
			 
	}
	
	
	public void updateAccountInfo(String userName, String password, String fName, String lName) {
		
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
	
	public void removeUniversity(University universityName) {
		
	}

	public ArrayList<String> getSavedUniversity() {
		
		universityNamesList.add("Saint Johns");
		universityNamesList.add("Macalaster");
		universityNamesList.add("University of Minnesota");
		
		return universityNamesList;
		
	}
}
