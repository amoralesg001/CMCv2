/**
 * 
 */

/**
 * @author nlarson002
 *
 */
package CMC;
public class User {
	
	private Account account = new Account();
	
	public void setUserName(String name) {
		this.account.updateAccountInfo(name, this.account.getPassword(), this.account.getFirstName(), this.account.getLastName());
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
