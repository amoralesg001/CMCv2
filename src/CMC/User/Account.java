/**
 * 
 */

/**
 * @author nlarson002
 *
 */
package CMC.User;

import java.util.ArrayList;
import CMC.University.*;

import Search.DBController;
import University.University;

public class Account {
	private DBController dbController = new DBController();
	
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String userType;
	private boolean loginStatus;
	
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
	/**
	 * Adds university to saved schools list
	 * @author jengh001
	 * @param uni university to add to list
	 * @return Returns if university successfully added to saved list
	 */
	public boolean addUniversity(University uni) {
		
	}

	public ArrayList<University> getSavedUniversity() {
		ArrayList<University> universitys = new ArrayList<University>();
		University university = new University(firstName, firstName, firstName, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);
		universitys.add(university);
		return universitys;
		
	}
}
