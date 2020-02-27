/**
 * 
 */

/**
 * @author nlarson002
 *
 */
package CMC;

import java.util.ArrayList;

public class Account {
	private DBController dbController = new DBController();
	
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String userType;
	private boolean loginStatus;// would we need this?
	
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
	public void login() {
		
	}
	public boolean verify(String username, String password) {
		if (this.username == username && this.password == password)
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
}
