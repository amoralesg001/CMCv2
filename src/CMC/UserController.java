/**
 * 
 */

/**
 * @author nlarson002
 *
 */
package CMC;
public class UserController {
	
	private DBController dBController = new DBController();
	private Account account;
	
	public String getUsername(Account account) {
		return account.getUserName();
	}
	
	public String getPassword(Account account) {
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
		//boolean logged;
		//if(username.equals("") && password.equals(""))
		//{
		//	logged = true;
		//}
		//else {
		//logged = false;
		//}
		if (dBController.getAccountDB(username, password) == null) {
			System.out.println("Username or password is invalid");
			return false;
		}
		else {
			
			return true;
			
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
	public static void getUserInfo(String username)
	{
	DBController.getUserInfo(username);
	}
}

















