
/**
 * 
 */
package CMC;


import java.util.Scanner;

import java.util.ArrayList;

/**
 * @author jengh001
 *
 */
public class Driver {
	private UserController userController = new UserController();
	private UserUI userUI = new UserUI();
	private DBController dbController = new DBController();
	private Account account = new Account();
	private SearchController searchController = new SearchController();

	/**
	 * U1: LogIn
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System. in);
		System.out.println("test");
		System.out.println("Enter a school you want to remove");
		String schoolToRemove = input.nextLine();
		u6(schoolToRemove);
		
		u3();
	}

	public void u1() {


		private String u = "";
		private String pw = "";
		

		userUI.logIn(String x, String y);
		userControl.verify();
		userControl.getAccount();


		String u = "";
		String pw = "";
		userUI.login(u, pw);

>>>>>>> b4bff4fba58a603e5ec4e364a303316826da29a7
	}
	
	/**
	 * U2: List Saved Schools
	 */
	public void u2() {
		private String u = "test";
		Account user = userController.getUsername(u);
		ArrayList<School> schools = user.getSavedSchool();
		
	}
	/**
	 * 
	 */
	public void u3() {
		String userName= "peter";
		userUI.goToPage(); 
		
		account = userController.getUserInfo(userName);
		
		ArrayList<String> accountArray = this.account.getUserInfo();
		for (int i=0; i<accountArray.size();i++) {
			System.out.println(accountArray.get(i));
		}
			
	}
	/**
	 * 
	 */

	public void u4() {
		String schoolName = "Saint John's University";
		School school = this.searchController.searchSchools(schoolName);
		System.out.println("School: " + school.getSchoolName());
	}

	/**
	 * U5: View Individual School
	 * 
	 */
	public void u5() {
		this.userUI.goToPage();
		this.userUI.displaySchoolInfo(School school);
	}
	/**
	 * 
	 */
	public void u6(String school) {
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
