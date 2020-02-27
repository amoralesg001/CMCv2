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
		
	public boolean login(String username, String password) {
		boolean logged;
		if(username.equals("") && password.equals(""))
		{
			logged = true;
		}
		else {
		logged = false;
		}
	}
	
	public void logout() {
			return false;
	}
	
	public void goToLoginMenu() {
		int i = 0;
	}
	
	public void goToMenu() {
		int i = 0
	}
	
	
	public String displaySavedList() {
		return "";
	}
	
	public void removeSchool(String s) {
		
	}
	
	public void saveUserInfo(String username, String password, String firstName, String lastName) {
		//todo
	}
	
	public void getAllUsers() {
		
	}
	
	public void lookup(String accountName, String schoolName) {
		
	}
	
	public void reportError() {
		
	}
	
	public void addSchoolToList(School school) {
		
	}
	
	public void removeSchool(School school) {
		this.dBController.removeSchool(school);
		this.account.removeSchool(school);
	}

	public void getUsername(String u) {
		// TODO Auto-generated method stub
		
	}
	
}

















