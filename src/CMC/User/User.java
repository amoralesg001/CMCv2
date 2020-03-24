/**
 * 
 */

/**
 * @author nlarson002
 *
 */
package CMC.User;
public class User extends Account{
	
	private Account account = new Account();

	public User(String username, String password, String firstName, String lastName, String status) {
		super(username, password, firstName, lastName, "u", status);
	}
	
	public void setUserName(String name) {
		this.account.updateAccountInfo(name, this.account.getPassword(), this.account.getFirstName(), this.account.getLastName(), this.account.getUserType(), this.account.getLoginStatus());
	}
	
	public void setUserPassword(String password) {
		this.account.updateAccountInfo(this.account.getUsername(), password, this.account.getFirstName(), this.account.getLastName());
	}
	
	public void setUserFirstName(String firstName) {
		this.account.updateAccountInfo(this.account.getUsername(), this.account.getPassword(), firstName, this.account.getLastName());
	}
	
	public void setUserLastName(String lastName) {
		this.account.updateAccountInfo(this.account.getUsername(), this.account.getPassword(), this.account.getFirstName(), lastName);
	}
}
