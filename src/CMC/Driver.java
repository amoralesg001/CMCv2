
/**
 * 
 */
package CMC;

/**
 * @author jengh001
 *
 */
public class Driver {
	
	private UserController userControl = new UserController();
	private UserUI userUI = new UserUI();
<<<<<<< HEAD
	private DBController dbController = new DBController();
=======
	private SearchController searchController = new SearchController();
	
>>>>>>> c5e0b90c053a4fa69303c4dcf277cb0ba1b0b1a0
	/**
	 * U1: LogIn
	 */
	public static void main(String[] args) {
		System.out.println("test");

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
<<<<<<< HEAD
	public void u3() {
		private string userName= "peter";
		userUI.goToPage(); 
		userController.getUserInfo(userName);
		Account account =DBController.getAccountDB(username);
		userUI.displayUserInfo(account); 
	}
=======
	public void u3() {}
	
>>>>>>> c5e0b90c053a4fa69303c4dcf277cb0ba1b0b1a0
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
	public void u6() {}
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
