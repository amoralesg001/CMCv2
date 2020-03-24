/**
 * 
 */
package CMC;
import java.util.ArrayList;
import CMC.Search.*;
import CMC.User.*;
import dblibrary.project.csci230.UniversityDBLibrary;
import CMC.University.*;

/**
 * @author Thumb Thumbs
 *
 */
public class Driver {

	//private University university = new University(null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);

	public static void main(String[] args) {
		String universityTest = "STANFORD";
		//University university = DBController.dbGetUniversity(universityTest);
		//System.out.println(university.toString());
		System.out.println("u1 starting");
		u1();
		System.out.println("u1 done");
		System.out.println("Output should be: logged in");
		System.out.println("u2 starting");
		//u2("juser"); 
		System.out.println("u2 done");
		System.out.println("u3 starting");
		u3("juser", "user");
		u3("luser", "user");
		u3("nadmin", "admin");
		System.out.println("u3 done");
		System.out.println("u4 starting");
		u4();
		System.out.println("u4 done");
		System.out.println("Testing Emphasis");
		
		System.out.println("\nU5 Starting\n");
		u5(universityTest);
		System.out.println("\nU5 Done: Should dislpay the information of Stanford. \n");
		
		//u6(universityToRemove);
		//u7(universityToRemove, universityToRemove, universityToRemove, universityToRemove);
		System.out.println("u7 done");
		System.out.println("u8 starting");
		//u8();
		
		System.out.println("u8 done");
		System.out.println("u9 starting");
		//u9();
		System.out.println("u9 done");
		System.out.println("u10 starting");
		//u10();
		System.out.println("u10 done");
		System.out.println("u11 starting");
		//u11();
		System.out.println("u11 done");
		System.out.println("u12 should rb");
		u12();
		System.out.println("u12 done");
		
		System.out.println("u16 start");
		u16();
	
	}
	/**
	 * u1: login
	 *@author amoralesg001
	 *this use case logins the user from their username 
	 *and password they entered
	 */
	public static void u1() {
		System.out.println("\n");
		String username = "juser";
		String password = "user";
		System.out.println("Testing for user John");
		System.out.println("Expected output: Logged in");
		boolean verify = UserUI.login(username, password);
		if (verify == true) {
			System.out.println("Logged in");	
		}
		else {
			System.out.println("Unable to log in");	
		}
		System.out.println("\n");
		///
		username = "luser";
		password = "user";
		System.out.println("Testing for user Lynn");
		System.out.println("Expected output: Unable to log in");
		verify = UserUI.login(username, password);
		if (verify == true) {
			System.out.println("Logged in");	
		}
		else {
			System.out.println("Unable to log in");	
		}
		///
		System.out.println("\n");
		username = "nadmin";
		password = "admin";
		System.out.println("Testing for user Noreen");
		verify = UserUI.login(username, password);
		if (verify == true) {
			System.out.println("Logged in");	
		}
		else {
			System.out.println("Unable to log in");	
		}
		System.out.println("\n");
		//
		
		
		
		
	}
	
	/**
	 * U2: List Saved Universities
	 * @author amoralesg001
	 * This use case displays the saved Universities from the Account.
	 */
	public static void u2(String username) {
		
		//ArrayList<String> savedUniversities = UserUI.getSavedUniversityList(username);
		//for(int i = 0; i<savedUniversities.size();i++) {
			//System.out.println(savedUniversities.get(i));
		ArrayList<String> savedUniversities=UserUI.getSavedUniversityList(username);
		if(savedUniversities==null) {
		System.out.println("nothing");	
		}	
		else {
		for(int i = 0; i<savedUniversities.size();i++) {
			System.out.println(savedUniversities.get(i));
		}
		
		}
	}
	/**
	 * 
	 */
	public static void u3(String username, String password) {
		System.out.println("\n");
		Account account = UserUI.getUserInfo(username, password);
		String usernameTest = account.getUsername();
		String passwordTest = account.getPassword();
		String firstName = account.getFirstName();
		String lastName = account.getLastName();
		String status = account.getLoginStatus();

		if (usernameTest == null) {
			System.out.println("User is blocked or does not exist");
			
		}
		else {
			System.out.println("Displaying user information for " + firstName);
			System.out.println("Username: " + usernameTest);
			System.out.println("Password: " + passwordTest);
			System.out.println("First Name: " + firstName);
			System.out.println("Last Name: "  + lastName);
			System.out.println("Status: " + status);
			System.out.println("\n");
		}
	
	}
	
	
	/**
	 * U4: Search For Schools
	 * @author nlarson002
	 * This allows the user to search for a school
	 */

	public static void u4() {

		String universityName = "Macalester";
		ArrayList<String> uni = SearchController.searchUniversities(universityName);
		System.out.println(uni);
		if (uni == null) {
			System.out.println("no school found");
		}
		else {
			//String uniName = uni.get(0);
			//System.out.println(uniName);
			System.out.println(uni);
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
	 * U12 add  school
	 */
	public static void u12() {
		String universityName = "blahblah1";
		String state = "MN";
		String location = "SC";
		String control = "Private";
		int numStudents = 2000;
		int femalePer = 0;
		int verSAT = 1200;
		int mathSAT = 1200;
		double tuition = 60000;
		double finAid = 20000;
		int numApplicants = 4000;
		int admitPer = 20;
		int enrolledPer = 80;
		int academicScale = 5;
		int socialScale = 5;
		int qoaScale = 5;
		//boolean blacklist = false;
		//ArrayList<String> emphasis = new ArrayList<String>();
		
		if (DBController.dbGetUniversity(universityName) != null)
		{
			System.out.println("University with same name exists");
		}
		else
		{
			System.out.println("University does not exist");
		UserUI.addSchool(universityName, state, location, control, numStudents, femalePer, verSAT, mathSAT,
				tuition, finAid, numApplicants, admitPer, enrolledPer, academicScale, socialScale, qoaScale);
		u5(universityName);
		}
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
	 * u16 is editing a school's information
	 */
	public static void u16() {
		String universityName = "blahblah1";
		String state = "o";
		String location = "o";
		String control = "public";
		int numStudents = 0;
		int femalePer = 8;
		int verSAT = 0;
		int mathSAT = 0;
		double tuition = 0;
		double finAid = 0;
		double numApplicants = 0;
		int admitPer = 0;
		int enrolledPer = 0;
		int academicScale = 0;
		int socialScale = 0;
		int qoaScale = 0;
		//boolean blacklist = true;
		//ArrayList<String> emphasis = new ArrayList<String>();

		if (DBController.dbGetUniversity(universityName) == null)
		{
			System.out.println("School: " + universityName + " does not exist.");
		}
		else
		{
			UserUI.saveScoolInfo(universityName, state, location, control, numStudents, femalePer,
					verSAT, mathSAT, tuition, finAid, numApplicants, admitPer, enrolledPer, academicScale,
					socialScale, qoaScale);
			u5(universityName);
		}
	}
	/**
	 * 
	 */
	public void u17() {}
	/**
	 * 
	 */
	public void u18() {}

}
