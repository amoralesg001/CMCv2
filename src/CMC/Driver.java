
/**
 * 
 */
package CMC;

import java.util.ArrayList;

/**
 * @author jengh001
 *
 */
public class Driver {
	private UserController userControl = new UserController();
	private UserUI userUI = new UserUI();
	private DBController dbController = new DBController();
	/**
	 * U1: LogIn
	 */
	public void u1() {
		userUI.logIn(String x, String y);
		userControl.verify();
		userControl.getAccount();
\

	public void main(String[] args) {
		String schoolToRemove = "";
		u1();
		u6(schoolToRemove);
		System.out.println("Testing...");
		//u3();
	}

	public void u1() {


<<<<<<< HEAD
		private String u = "";
		private String pw = "";
<<<<<<< HEAD
		userUI.logIn(u, pw);
=======


		private String u = "";
		private String pw = "";
=======
>>>>>>> 59bda25e1343fa9c6fe96d926eba2ac7ad41b9d1
		

		userUI.logIn(String x, String y);
		userControl.verify();
		userControl.getAccount();


=======
>>>>>>> 92c3e460c943bc77554d2be6e753bc9aa56a4019
		String u = "";
		String pw = "";
		userUI.login(u, pw);

<<<<<<< HEAD
>>>>>>> b4bff4fba58a603e5ec4e364a303316826da29a7
<<<<<<< HEAD
>>>>>>> 59bda25e1343fa9c6fe96d926eba2ac7ad41b9d1
=======
>>>>>>> 59bda25e1343fa9c6fe96d926eba2ac7ad41b9d1
=======
>>>>>>> 92c3e460c943bc77554d2be6e753bc9aa56a4019
	}
	
	/**
	 * U2: List Saved Schools
	 */
	public void u2() {

		private String u = "";
		userControl.getUsername(u);
		userUI.displaySavedList();

		String user = userController.getUsername(account);
		ArrayList<School> schools = account.getSavedSchool();

		
	}
	/**
	 * 
	 */
	public void u3() {
		String userName= "peter";
		userUI.getUserInfo(userName); 
		
		ArrayList<String> accountArray = this.account.getUserInfo();
		for (int i=0; i<accountArray.size();i++) {
			System.out.println(accountArray.get(i));
		}
			
	}
	/**
	 * 
	 */

	public void u4() {
		private String schoolName = "Saint John's University";
		School school = this.searchController.searchSchools(schoolName);
		System.out.println("School: " + this.school.getSchoolName());
	}

	/**
	 * U5: View Individual School
	 * 
	 */
	public void u5() {
		this.userUI.goToPage();
		School school = null;
		this.userUI.displaySchoolInfo(school);
	}
	/**
	 * 
	 */
	public void u6(School school) {
		this.userUI.removeSchool(school);
	}
	/**
	 * 
	 */
	public void u7() {}
	/**
	 * 
	 */
	public void u8() {}
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
