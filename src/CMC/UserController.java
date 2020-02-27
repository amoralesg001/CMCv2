/**
 * 
 */

/**
 * @author nlarson002
 *
 */
package CMC;
public class UserController {
	
	private DBController dBController;
	private Account account;
	
	public String getUsername(Account account) {
		return account.getUserName();
	}
	
	public String getPassowrd(Account account) {
		return account.getPassword();	
	}	
		
	public String getFirstName(Account account) {
		return account.getFirstName();
	}
	
	public String getLastName(Account account) {
		return account.getLastName();
	}
	
	public String getAccountType() {
		return account.getUserType();
	}
	
	public void addSavedSchools(School schoolName) {
		
	}
		
	public void login(String username, String password) {
		if(username.equals("") && password.equals(""))
		{
			System.out.println("logged");
		}
	}
	
	public void logout() {
		
	}
	
	public void goToLoginMenu() {
		
	}
	
	public void goToMenu() {
		
	}
	
	public String returnUserInfo() {
		
	}
	
	public String displaySavedList() {
		
	}
	
	public void saveUserInfo(String username, String password, String firstName, String lastName) {
		
	}
	
	public void getAllUsers() {
		
	}
	
	public void lookup(String accountName, String schoolName) {
		
	}
	
	public void reportError() {
		
	}
	
	public void addSchoolToList(School school) {
		
	}
	
	public void removeSchool(String school) {
		this
		this.dBController.removeSchool(school);
		this.account.removeSchool(school);
	}

	public void getUsername(String u) {
		// TODO Auto-generated method stub
		
	}
	
}

















