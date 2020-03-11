import java.util.ArrayList;
import CMC.User.*;
import CMC.University.University;

import Search.DBController;
import User.UserUI;
=======
import CMC.Search.DBController;
import CMC.Search.SearchController;


/**
 * Driver tests each use case of the CMC Program
 * @author Thumb Thumbs
 *
 */
public class Driver {


	private University university = new University();

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
	public void u2() {

		String username = "amoralesg001";
		ArrayList<String> savedUniversities = UserUI.getSavedUniversityList(username);
		for(int i = 0; i<savedUniversities.size();i++) {
		System.out.println(savedUniversities.get(i));
		}
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
	public void u11() {
		this.userUI.manageSchool();
	}
	/**
	 * 
	 */
	public void u12() {
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
		
		this.userUI.addSchool(universityName, state, location, numStudents, femalePer, verSAT, mathSAT,
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
