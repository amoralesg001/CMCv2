/**
 * 
 */

/**
 * @author nlarson002
 *
 */
package CMC;
public class Account {
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
	public void login() {
		
	}
	public boolean verify(String username, String password) {
		return false;
	}
	public void updateAccountInfo(String userName, String password, String fName, String lName) {
		
	}
}
