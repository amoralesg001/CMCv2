/**
 * 
 */
package CMC;
import java.util.ArrayList;
import CMC.Search.*;
import CMC.User.*;
import CMC.University.*;

/**
 * @author Thumb Thumbs
 *
 */
public class Driver {

	private University university = new University(null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);

	public static void main(String[] args) {
		String universityToRemove = "";
		System.out.println("u1 starting");
		u1();
		System.out.println("u1 done");
		System.out.println("Output should be: logged in");
		//u2();
		System.out.println("u2 done");
		System.out.println("u3 starting");
		u3("amoralesg001");
		System.out.println("u3 done");
		System.out.println("u4 starting");
		u4();
		System.out.println("u4 done");
		//u5(universityToRemove);
		//u6(universityToRemove);
		//u7(universityToRemove, universityToRemove, universityToRemove, universityToRemove);
		//System.out.println("u7 done");
		System.out.println("u8 starting");
		u8();
		
		System.out.println("u8 done");
		System.out.println("u9 starting");
		u9();
		System.out.println("u9 done");
		System.out.println("u10 starting");
		u10();
		System.out.println("u10 done");
		System.out.println("u11 starting");
		u11();
		System.out.println("u11 done");
		System.out.println("u12 starting");
		u12();
		System.out.println("u12 done");
		

		System.out.println("Testing...");
		//u3();
	}
	/**
	 * u1: login
	 *@author amoralesg001
	 *this use case logins the user from their username 
	 *and password they entered
	 */
	public static void u1() {
		String username = "amoralesg001";
		String password = "thumb thumb";
		boolean verify = UserUI.login(username, password);
		if (verify == true) {
			System.out.println("logged in");	
		}
		else {
			System.out.println("Invalid credentials");	
		}	
	}
	
	/**
	 * U2: List Saved Universities
	 * @author amoralesg001
	 * This use case displays the saved Universities from the Account.
	 */
	public static void u2() {

		String username = "amoralesg001";
		ArrayList<String> savedUniversities = UserUI.getSavedUniversityList(username);
		for(int i = 0; i<savedUniversities.size();i++) {
			System.out.println(savedUniversities.get(i));
		}
	}
	/**
	 * 
	 */
	public static void u3(String username) {

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

	public static void u4() {

		String universityName = "Saint John's University";
		String uni = SearchController.searchUniversities(universityName);
		if (uni == universityName) {
			System.out.println(uni);
		}
		else {
			System.out.println("School not found");
		}
	}

	/**
	 * U5: View Individual University
	 * 
	 * @param String university name
	 */
	public static void u5(String universityName) {
		UserUI.getUniversity(universityName);
	}
	/**
	 * u6: Remove School From List
	 * 
	 * @param String name of university
	 */
	public static void u6(String university) {
		UserUI.removeUniversity(university);
	}
	/**
	 * Edit User Information
	 */
	public static void u7(String username, String password, String firstName, String lastName, String userType) {
		Account user = UserUI.saveUserInfo(username, password, firstName, lastName, userType);
		System.out.println(user.getUsername());
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
	}
	
	/**
	 * View Search Results
	 */
	public static void u8() {
		String results = UserUI.viewResults();
		System.out.println(results);
	}
	
	/**
	 * U9: Save School to list 
	 * @author jengh001
	 */

	public static void u9() {
		String SName = "Saint John's University";
		String AName = "jengh001";
		boolean success = UserUI.addSavedUniversties(SName, AName);
		if (success) {
		   System.out.println("Saved Successfully");
		}
		else {
			System.out.println("Saved Unsuccessfully");
		}
	}

	/**
	 * U10: Manage Users
	 * @author jengh001
	 */
	public static void u10() {
		User[] users = UserUI.manageUsers();
		System.out.println(users);
	}
	/**
	 * 
	 */
	public static void u11() {
		UserUI.manageSchool();
	}
	/**
	 * 
	 */
	public static void u12() {
		String universityName = "SJU";
		String state = "MN";
		String location = "SC";
		int numStudents = 2000;
		int femalePer = 0;
		int verSAT = 1200;
		int mathSAT = 1200;
		double tuition = 60000;
		double finAid = 20000;
		double numApplicants = 4000;
		int admitPer = 20;
		int enrolledPer = 80;
		int academicScale = 5;
		int socialScale = 5;
		int qoaScale = 5;
		boolean blacklist = false;
		ArrayList<String> emphasis = new ArrayList<String>();
		
		UserUI.addSchool(universityName, state, location, numStudents, femalePer, verSAT, mathSAT,
				tuition, finAid, numApplicants, admitPer, enrolledPer, academicScale, socialScale, qoaScale,
				blacklist, emphasis);
	}
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
