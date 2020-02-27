
/**
 * 
 */
package CMC;

import java.util.Scanner;

/**
 * @author jengh001
 *
 */
public class Driver {
	
	private UserController userControl = new UserController();
	private UserUI userUI = new UserUI();
	private SearchController searchController = new SearchController();
	
	/**
	 * U1: LogIn
	 */
	public void main(String[] args) {
		Scanner input = new Scanner(System. in);
		System.out.println("test");
		System.out.println("Enter a school you want to remove");
		String schoolToRemove = input.nextLine();
		u6(schoolToRemove);
	}
	public void u1() {
		private String u = "";
		private String pw = "";
		userUI.logIn(u, pw);
	}
	
	/**
	 * U2: List Saved Schools
	 */
	public void u2() {
		private String u = "";
		userControl.getUsername(u);
		userUI.displaySavedList();
	}
	/**
	 * 
	 */
	public void u3() {}
	
	/**
	 * U4: Search for Schools
	 */
	public void u4() {
		private String schoolName = "Saint John's University";
		School school = this.searchController.searchSchools(schoolName);
		System.out.println(school.getSchoolName());
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
