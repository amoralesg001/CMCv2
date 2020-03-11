import java.util.ArrayList;
import CMC.User.*;
import CMC.University.University;
import CMC.Search.DBController;
import CMC.Search.SearchController;


/**
 * Driver tests each use case of the CMC Program
 * @author Thumb Thumbs
 *
 */
public class Driver {

	private UserController userControl = new UserController();
	private UserUI userUI = new UserUI();
	private DBController dbController = new DBController();
	private University university = new University(null, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);


	public void main(String[] args) {
		String universityToRemove = "";
		//u1();
		//u2();
		//u6(universityToRemove);
		System.out.println("Testing...");
		//u3();
	}
	/**
	 * u1: login
	 *@author amoralesg001
	 *this use case logins the user from their username 
	 *and password they entered
	 */
	public void u1() {
		String username = "amoralesg001";
		String password = "thumb thumb";
		UserUI.login(username, password);

	}
	
	/**
	 * U2: List Saved Universities
	 * @author amoralesg001
	 * This use case displays the saved Universities from the Account.
	 */
	public void u2() {

		//private String u = "";
		//userControl.getUsername(u);
		//UserUI.displaySavedList();

		//String user = userController.getUsername(account);
		//ArrayList<University> universitys = account.getSavedUniversity();
		String username = "amoralesg001";
		UserUI.getSavedUniversity(username);
		
	}
	/**
	 * 
	 */
	public void u3(String username) {

		Account account = UserUI.getUserInfo(username);
		String usernameTest = account.getUsername();	
		System.out.println(usernameTest);
		System.out.println("Output should have been: " + username);	
	}
	
	
	/**
	 * U4: Search For Schools
	 * @author nlarson002
	 * This allows the user to search for a school
	 */

	public void u4() {
		String universityName = "Saint John's University";
		University uni = SearchController.searchUniversities(universityName);
		if (uni.getuniversityName() == universityName) {
			System.out.println(uni.getuniversityName());
		}
		else {
			System.out.println("School not found");
		}
	}

	/**
	 * U5: View Individual University
	 * 
	 */
	public void u5() {
		this.userUI.goToPage();
		University university = null;
		this.userUI.displaySchoolInfo(university);
	}
	/**
	 * 
	 */
	public void u6(University university) {
		userUI.removeUniversity(university);
	}
	/**
	 * Edit User Information
	 */
	public void u7(String username, String password, String firstName, String lastName) {
		UserUI.saveUserInfo(username, password, firstName, lastName);
	}
	
	/**
	 * View Search Results
	 */
	public void u8() {
		UserUI.viewResults();
	}
	
	/**
	 * Save Schools to list
	 * @author Jengh001
	 */
	public void u9() {
		String SName = "";
		String AName = "";
		UserUI.addSavedSchool(SName, AName);
		
		
	}
	/**
	 * Manage Users
	 * @author jengh001
	 */
	public void u10() {
		UserUI.manageUsers();
	
	}
	/**
	 * 
	 */
	public void u11() {}
	/**
	 * 
	 */
	public void u12() {}
	/**
	 * 
	 */
	public void u13() {}
	/**
	 * 
	 */
	public void u14() {}
	/**
	 * 
	 */
	public void u15() {}
	/**
	 * 
	 */
	public void u16() {}
	/**
	 * 
	 */
	public void u17() {}
	/**
	 * 
	 */
	public void u18() {}

}
