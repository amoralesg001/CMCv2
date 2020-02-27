
/**
 * 
 */
package CMC;

<<<<<<< HEAD
import java.util.Scanner;
=======
import java.util.ArrayList;
>>>>>>> 1bb4d336c72c6989d642e5f426aeec19d6b83d98

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
<<<<<<< HEAD
	public void main(String[] args) {
		Scanner input = new Scanner(System. in);
		System.out.println("test");
		System.out.println("Enter a school you want to remove");
		String schoolToRemove = input.nextLine();
		u6(schoolToRemove);
	}
=======
>>>>>>> 1bb4d336c72c6989d642e5f426aeec19d6b83d98
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
		String userName= "peter";
		userUI.goToPage(); 
		Account account = userController.getUserInfo(userName);
		
		ArrayList<String> accountArray = this.account.getUserInfo();
		for (int i=0; i<accountArray.size();i++) {
			System.out.println(accountArray.get(i));
		}
			
	}
	/**
	 * 
	 */
<<<<<<< HEAD
	public void u4() {}
=======
	public void u4() {
		private String schoolName = "Saint John's University";
		School school = this.searchController.searchSchools(schoolName);
		System.out.println("School: " + this.school.getSchoolName());
	}
>>>>>>> b9a52f4a2381a26f76f95032649b8eb1883c8dfd
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
