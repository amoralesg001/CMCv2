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
	private ArrayList<University> universities = new ArrayList<University>();
	
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
		if (this.account.getUsername() == username && this.account.getPassword() == password)
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
	
	public void removeUniversity(University universityName) {
		
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

	public ArrayList<University> getSavedUniversity() {
		
		University university = new University(firstName, firstName, firstName, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);
		universitys.add(university);
		return universitys;
		
	}
}
