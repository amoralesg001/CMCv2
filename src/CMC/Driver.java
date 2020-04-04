/**
 * 
 */
package CMC;
import java.util.ArrayList;
import CMC.Search.*;
import CMC.University.University;
import CMC.User.*;

/**
 * @author Thumb Thumbs
 *
 */
public class Driver {

	//private University university = new University(null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null);

	public static void main(String[] args) {
		String SName = "ADELPHI";
		String AName = "juser";
		String universityTest = "blahblah1";
		University university = DBController.dbGetUniversity(universityTest);
		System.out.println(university.toString());
		System.out.println("u1 starting");
		u1();
		System.out.println("u1 done");
		System.out.println("Output should be: logged in");
		System.out.println("u2 starting");
		u2("juser");
		System.out.println("u2 done");
		System.out.println("u3 starting");
		u3("juser", "user");
		u3("luser", "user");
		u3("nadmin", "admin");
		System.out.println("u3 done");
		
		System.out.println("\nu7 (Edit User Info) starting...");
		System.out.println("\nTesting user 'John' (in database)");
		u7("juser", "user", "NewJohn", "NewLastName");
		System.out.println("\nTesting 'Jack' (NOT in database)");
		//u7("jyoung001", "jackpassword", "Jack", "Young");
		System.out.println("\nu7 done\n");
		
		System.out.println("u4 starting");
		u4("ADELPHI", "", "", "", 0, 0, 0, 0, 0, 0, 0, 0,0, 0, 0, 0, null);
		System.out.println("u4 done");
		System.out.println("output should be: ADELPHI IS FOUND\n");
		System.out.println("u4 ALTERNATE starting");
		u4("", "MN", "", "", 0, 0, 0, 0, 0, 0, 0, 0,0,
		           0, 0, 0, null);
		System.out.println("u4 done");
		System.out.println("output should be: no University found ");
		
		String username = "juser";
		String universityname = "STANFORD";
		int i = DBController.removeUniversity(username, universityname);
		
		System.out.println("\nU5 Starting\n");
		u5(universityTest);
		System.out.println("\nU5 Done: Should dislpay the information of Stanford. \n");		
		//u6(universityToRemove);
		//u7(universityToRemove, universityToRemove, universityToRemove, universityToRemove);
	

		System.out.println("u6 starting");
		u6(AName, SName);
		System.out.println("u6 done");
		System.out.println("u9 starting");
		u9(AName, SName);
		System.out.println("u9 done");
		
		System.out.println("u2 starting");
		u2("juser");
		System.out.println("u2 done");
		
		System.out.println("u6 starting");
		u6(AName, SName);
		System.out.println("u6 done");
	
		// Edit User Information (U7) Test @author: Jack
		System.out.println("\nu7 starting");
		System.out.println("\nTesting user 'John' (in database)");
		u7("juser", "user", "UpdatedJohn", "UpdatedLastName");
		System.out.println("\nTesting 'Jack' (NOT in database)");
		//u7("jyoung001", "jackpassword", "Jack", "Young");
		System.out.println("\nu7 done\n");
		
		System.out.println("u8 starting");
		//u8();
		System.out.println("u8 done");
		//System.out.println("u9 starting");
		//u9(AName, SName);
		//System.out.println("u9 done");
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
		
		// Activate/Deactivate (for Phase 3) Test @author: Jack
		System.out.println("\nchangeStatus (activate/deactivate) starting");
		System.out.println("-----Testing user 'Lynn'-----");
		System.out.println("Changing to 'n'");
		changeStatus("luser", "n");
		System.out.println("Changing to 'Y'");
		changeStatus("luser", "Y");
		System.out.println("Changing back to 'N'");
		changeStatus("luser", "N");
		System.out.println("-----Testing user 'John'-----");
		System.out.println("Changing to 'Y'");
		changeStatus("juser", "Y");
		System.out.println("Changing to 'y'");
		changeStatus("juser", "y");
		System.out.println("Changing to 'n'");
		changeStatus("juser", "n");
		System.out.println("Changing back to 'y'");
		changeStatus("juser", "y");
		System.out.println("changeStatus done\n");
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
		
		ArrayList<String> savedUniversities = UserUI.getSavedUniversityList(username);
		
		if(savedUniversities==null) {
		System.out.println("No universities saved under this user");	
		}	
		else {
			for(int i = 0; i<savedUniversities.size();i++) {
				System.out.println(savedUniversities.get(i));
			}
		
		}
	}
	
	
	
	/**
	 * U2: Display User Information
	 * @author nlarson002
	 * Displays the users Information given their username and password
	 * 
	 * @param username The users username
	 * @param password The users password
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
	 * This allows the user to search for a school given any of the criterias in a universitiy 
	 */

	public static void u4(String universityName, String state, String location, String control, int numStudents, double femalePer, double verbalSAT,
            double mathSAT, double expenses, double finAidPer, int numApplicants, double admitPer, double enrolledPer,
            int academicScale, int socialScale, int qoaScale, ArrayList<String> emphasis) {
        
        University uniCriteria = new University(universityName, state, location, control, numStudents, femalePer, verbalSAT,mathSAT,expenses, finAidPer,numApplicants,admitPer,enrolledPer,academicScale,socialScale,qoaScale,emphasis, false);
        
        ArrayList<String> uniSearch = UserUI.searchUniversity(uniCriteria);
        
        if (uniSearch == null) {
            System.out.println("no Universities found with that criteria");
        }
        else {
            System.out.println("Universities found with following criteria: ");
            for(int i=0; i< uniSearch.size();i++) {
            System.out.println(uniSearch.get(i));
            }

        }
	}

	/**
	 * U5: View Individual University
	 * 
	 * @param universityName university name
	 */
	public static void u5(String universityName) {
		UserUI.getUniversity(universityName);
		
	}
	/**
	 * u6: Remove School From List
	 * 
	 * @param university name of university
	 */
	public static void u6(String username, String universityname) {
		boolean remove = UserUI.removeUniversity(username, universityname);
		if (remove) {
			System.out.println(universityname + " was removed from the list");
		}
		else {
			System.out.println(universityname + " was not in the saved schools list.");
		}
	}
	
	/**
	 * U7: Edit User Information
	 * 
	 * @param username the user's username
	 * @param password the user's password
	 * @param firstName the new firstName
	 * @param lastName the new lastName
	 * 
	 * @author jyoung001
	 */
	public static void u7(String username, String password, String firstName, String lastName) {
		Account user = UserUI.saveUserInfo(username, password, firstName, lastName);
		System.out.println("***Edited User Info***");
		System.out.println("Username: " + user.getUsername());
		System.out.println("First Name: " + user.getFirstName());
		System.out.println("Last Name: " + user.getLastName());
		System.out.println("User Type: " + user.getUserType());
	}
	
	/**
	 * View Search Results // NOT DOING ANYMORE
	 */
//	public static void u8() {
//		String results = UserUI.viewResults();
//		System.out.println(results);
//	}
	
	/**
	 * U9: Save School to list 
	 * @author jengh001
	 */

	public static void u9(String AName, String SName) {
		boolean success = UserUI.addSavedUniversities(AName, SName);
		if (success==true) {
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
		ArrayList<Account> users = UserUI.manageUsers();
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
	 * USED BY READYSON
	 */
	public static void u12() {
		String universityName = "blahblah14";
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
		boolean blacklist = true;
		ArrayList<String> emphasis = new ArrayList<String>();
		emphasis.add("Accounting");
		
		if (DBController.dbGetUniversity(universityName) != null)
		{
			System.out.println("University with same name exists");
		}
		else
		{
			System.out.println("University does not exist");
		UserUI.addSchool(universityName, state, location, control, numStudents, femalePer, verSAT, mathSAT,
				tuition, finAid, numApplicants, admitPer, enrolledPer, academicScale, socialScale, qoaScale,
				emphasis, blacklist);
			for(String s: emphasis)
			{
				DBController.univDBlib.university_addUniversityEmphasis(universityName, s);
			}
		//u5(universityName);
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
	 * USED BY READYSON
	 */
	public static void u16() {
		String universityName = "blahblah8";
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
		boolean blacklist = false;
		ArrayList<String> emphasis = new ArrayList<String>();
		emphasis.add("COMPSCI");
		emphasis.add("PSYCH");
		
		

		if (DBController.dbGetUniversity(universityName) == null)
		{
			System.out.println("School: " + universityName + " does not exist.");
		}
		else
		{
			UserUI.saveSchoolInfo(universityName, state, location, control, numStudents, femalePer,
					verSAT, mathSAT, tuition, finAid, numApplicants, admitPer, enrolledPer, academicScale,
					socialScale, qoaScale, emphasis, blacklist);
			u5(universityName);
		}
		
		System.out.println("Finished u16");
	}
	/**
	 * 
	 */
	public void u17() {}
	/**
	 * 
	 */
	public void u18() {}
	
	/**
	 * Activate/Deactivate
	 * 
	 * @author jyoung001
	 */
	public static void changeStatus(String username, String status) {
		Account user = new Account(null, null, null, null, null, null);
		user = user.getUserInfo2(username);
		String currentStatus = user.getLoginStatus();
		if (status == "Y" || status == "y") {
			if (currentStatus == "Y" || currentStatus == "y") {
				System.out.println(user.getUsername() + " is already activated.");
			}
			else {
				DBController.updateAccountDB(username, user.getPassword(), user.getFirstName(), user.getLastName(), user.getUserType(), status);
				user = user.getUserInfo2(username);
			}
		}
		else if (status == "N" || status == "n") {
			if (currentStatus == "N" || currentStatus == "n") {
				System.out.println(user.getUsername() + " is already deactivated.");
			}
			else {
				DBController.updateAccountDB(username, user.getPassword(), user.getFirstName(), user.getLastName(), user.getUserType(), status);
				user = user.getUserInfo2(username);
			}
		}
		else {
			System.out.println("ERROR: Status must be either 'Y'/'y' or 'N'/'n'");
		}
		System.out.println("***Change Complete***");
		System.out.println("User Status should be: " + user.getLoginStatus() + "\nUser Status is: " + status + "\n");
	}

}
