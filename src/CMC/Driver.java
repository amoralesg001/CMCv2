<<<<<<< HEAD

/**
 * 
 */
package CMC;

=======
>>>>>>> 19d96e3d8b6c9df77e6acdc0587a37595b98a055
import java.util.ArrayList;

import CMC.Search.*;
import CMC.User.*;
import CMC.University.*;


/**
 * @author Thumb Thumbs
 *
 */
public class Driver {

	public void main(String[] args) {
		String universityToRemove = "";
		u1();
		u2();
		u6(universityToRemove);
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
	 * U2: List Saved Universitys
	 * @author amoralesg001
	 * This use case displays the saved Unversities from the Account.
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
	public void u3() {
		String userName= "peter";
		UserUI.getUserInfo(userName); 
		
		ArrayList<String> accountArray = this.account.getUserInfo();
		for (int i=0; i<accountArray.size();i++) {
			System.out.println(accountArray.get(i));
		}
			
	}
	/**
	 * 
	 */

	public void u4() {
		private String universityName = "Saint John's University";
		University university = this.searchController.searchUniversitys(universityName);
		System.out.println("University: " + this.university.getUniversityName());
	}

	/**
	 * U5: View Individual University
	 * 
	 * @param String university name
	 */
	public void u5(String universityName) {
		UserUI.getUniversity(universityName);
	}
	/**
	 * u6: Remove School From List
	 * 
	 * @param String name of university
	 */
	public void u6(String university) {
		UserUI.removeUniversity(university);
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
	 * 
	 */
	public void u9() {}
	/**
	 * 
	 */
	public void u10() {}
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
