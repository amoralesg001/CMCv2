/**
 * 
 */

/**
 * @author nlarson002
 *
 */
package CMC.User;
public class User extends Account{

	public User(String username, String password, String firstName, String lastName, String status) {
		super(username, password, firstName, lastName, "u", status);
	}
	
	public void setUserName(String name) {
		super.updateAccountInfo(name, super.getPassword(), super.getFirstName(), super.getLastName(), super.getUserType());
	}
	
	public void setUserPassword(String password) {
		super.updateAccountInfo(super.getUsername(), password, super.getFirstName(), super.getLastName(), super.getUserType());
	}
	
	public void setUserFirstName(String firstName) {
		super.updateAccountInfo(super.getUsername(), super.getPassword(), firstName, super.getLastName(), super.getUserType());
	}
	
	public void setUserLastName(String lastName) {
		super.updateAccountInfo(super.getUsername(), super.getPassword(), super.getFirstName(), lastName, super.getUserType());
	}
}
