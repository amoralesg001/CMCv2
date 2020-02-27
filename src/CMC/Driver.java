
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
	private DBController dbController = new DBController();
	/**
	 * U1: LogIn
	 */
	public void u1() {
		userUI.logIn(String x, String y);
		userControl.verify();
		userControl.getAccount();
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
	public void u3() {
		private string userName= "peter";
		userUI.goToPage(); 
		Account account = userController.getUserInfo(userName);
		
		ArrayList<String> accountInfo = this.account.getUSerInfo();
		for (int i=0; account.getUserInfo.length();i++) {
			System.out.println(accountInfo[i]);
		}
			
	}
	/**
	 * 
	 */
	public void u4() {}
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
