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
		
	public String login(String username, String password) {
		String logged = "failed to log in";
		if(username.equals("") && password.equals(""))
		{
			return logged = "Logged in";
		}
		return logged;
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

	public void getUsername(String u) {
		// TODO Auto-generated method stub
		
	}
	public Account getUserInfo(String username)
	{
	account = dBController.getAccountDB(username);
	return account; 
	}
}

















