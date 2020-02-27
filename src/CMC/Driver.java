
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * U1: LogIn
	 */

	public void main(String[] args) {
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
		userUI.login(u, pw);

		userUI.logIn(String x, String y);
		userControl.verify();
		userControl.getAccount();

	}
	
	/**
	 * U2: List Saved Schools
	 */
	public void u2() {
		private String u = "test";
		ArrayList<School> = userController.getUsername(u);
		
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
