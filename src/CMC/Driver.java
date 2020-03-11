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
<<<<<<< HEAD
import CMC.University.*;
=======
import CMC.University.University;

import Search.DBController;
import User.UserUI;
=======
import CMC.Search.DBController;
import CMC.User.UserUI;
>>>>>>> 72ba97d3e81a8d077642695849c429ca067257f9


/**
 * @author Thumb Thumbs
 *
 */
public class Driver {

<<<<<<< HEAD
=======

	private University university = new University();

	private UserController userControl = new UserController();
	private UserUI userUI = new UserUI();
	private DBController dbController = new DBController();
	private University university = new University(null, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null)



>>>>>>> 72ba97d3e81a8d077642695849c429ca067257f9
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
		boolean verify = UserUI.login(username, password);
		if (verify == true) {
		System.out.println("logged in");	
		}
		else {
		System.out.println("Invalid credentials");	
		}	
	}
	
	/**
	 * U2: List Saved Universitys
	 * @author amoralesg001
	 * This use case displays the saved Unversities from the Account.
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
