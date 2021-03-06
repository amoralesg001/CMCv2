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
		
		u3("juser", "user");
		String univTest = "SAINT JOHN'S";
		String SName = "ADELPHI";
		String AName = "juser";
		String universityTest = "blahblah1";
		//University university = DBController.dbGetUniversity(universityTest);
		//System.out.println(university.toString());
		System.out.println("u1 starting");
		u1();
		System.out.println("u1 done");

		//System.out.println("Output should be: logged in");

		System.out.println("\nu2 ALTERNATE Scenerio: the user has no saved universities under their account");
		u2("juser");
		System.out.println("u2 done");
		System.out.println("The Output should be: No universities saved under this user");

		System.out.println("u3 starting");
		System.out.println("Displaying Information for John:");	
		u3("juser", "user");
		System.out.println("\n");
		System.out.println("Attempt to display information for Lynn:");
		u3("luser", "user");
		System.out.println("\n");
		System.out.println("Displaying Information for Noreen:");
		u3("nadmin", "admin");
		System.out.println("\n");
		System.out.println("u3 done");
		
		System.out.println("u4 scenerio: all three criterias are correct");
		u4("UNIVERSITY OF MINN", "MINN", "URBAN","STATE","30000","41000","40","50","450","500","500","600","13770","13773","40","60", "8400","8600" ,"70", "100", "50", "70", "2", "5","2", "4", "1", "5","AGRICULTURE","MATH","COMPUTER SCIENCE","","");
		System.out.println("u4 done");		
		System.out.println("output should be: university with the follwoing criterias found: \n BENNINGTON");
		System.out.println("\nu4 ALTERNATE Scenerio: all three criterias are incorrect: ");
		//u4("", "MINN", "", "STATE", "4000", "", "", "", "", "", "", "","","","","","","","","","");
		System.out.println("u4 done");
		System.out.println("output should be: No Universities Found with that criteria \n ");
	
		String username = "juser";	
		String universityname = "waer2";

		int i = DBController.removeUniversity(username, universityname);
		
		System.out.println("\nU5 Starting\n");
		u5("UNIVERSITY OF MINNESOTA");
		System.out.println("\nU5 Done: Should dislpay the information of Adelphi. \n");		
		//u6(universityToRemove);
		//u7(universityToRemove, universityToRemove, universityToRemove, universityToRemove);
	

		System.out.println("u6 starting");
		u6(AName, SName);
		System.out.println("u6 done");
		System.out.println("u9 starting");
		u9(AName, SName);
		System.out.println("u9 done");
		
		System.out.println("/nu Scenerio: A user has saved universities under their account");
		u2("juser");
		System.out.println("u2 done");
		System.out.println("The Output should be: JUSER \n ADELPHI \n DATE ADDED\n");
		
		System.out.println("u6 starting");
		u6(AName, SName);
		System.out.println("u6 done");
		
		String invalidUser = "asdf";
		
		System.out.println("u6 starting");
		u6(invalidUser, SName);
		System.out.println("u6 done");
		
		System.out.println("\nu ALTERNATE Scenerio: the user has no saved universities under their account");
		u2("juser");
		System.out.println("u2 done");
		System.out.println("The Output should be: No universities saved under this user");
		
		// Edit User Information (U7) Test @author: Jack
		System.out.println("\nu7 (Edit User Info) starting...");
		System.out.println("\nTesting user 'John' (in database / should not be null)");
		u7("juser", "user", "John", "User");
		System.out.println("\nTesting 'Jack' (NOT in database / should be null)");
		u7("jyoung001", "jackpassword", "Jack", "Young");
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
		System.out.println("\nchangeStatus (activate/deactivate) starting...");
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
		System.out.println("Output should be: Logged in");
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
	 * @param username
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
	 * U3: Display User Information
	 * @author nlarson002
	 * Displays the users Information given their username and password
	 * 
	 * @param username The users username
	 * @param password The users password
	 */
	public static void u3(String username, String password) {
		System.out.println("\n");
		boolean b = UserUI.getUserInfo(username, password);
	}
	
	
/**	 * U4: Search For Schools
 * @author nlarson002	 * 
 *  @param universityName
 * @param state
 * @param location
 * @param control
 * @param numStudents
 * @param femalePer
 * @param verbalSAT
 * @param mathSAT
 * @param expenses
 * @param finAidPer
 * @param numApplicants
 * @param admitPer
 * @param enrolledPer
 * @param academicScale
 * @param socialScale
 * @param qoaScale
 * @param emphasis0
 * @param emphasis1
 * @param emphasis2
 * @param emphasis3
 * @param emphasis4
	 * This allows the user to search for a school given any of the criterias in a universitiy 
	 */
	public static void u4(String universityName, String state, String location, String control, String numStudents1, String numStudents2, String femalePer1, String femalePer2, String verbalSAT1, String verbalSAT2,
            String mathSAT1, String mathSAT2, String expenses1, String expenses2, String finAidPer1, String finAidPer2, String numApplicants1, String numApplicants2, String admitPer1, String admitPer2, String enrolledPer1, String enrolledPer2,
            String academicScale1, String academicScale2, String socialScale1, String socialScale2, String qoaScale1, String qoaScale2, String emphasis0, String emphasis1, String emphasis2, String emphasis3, String emphasis4) {
        String emphasis[] = new String[5];
        emphasis[0] = emphasis0;
        emphasis[1] = emphasis1;
        emphasis[2] = emphasis2;
        emphasis[3] = emphasis3;
        emphasis[4] = emphasis4;
        
        
        ArrayList<String> uniSearch = UserUI.searchUniversity(universityName, state, location, control, numStudents1, numStudents2, femalePer1, femalePer2, verbalSAT1, verbalSAT2,mathSAT1, mathSAT2,expenses1, expenses2, finAidPer1, finAidPer2,numApplicants1, numApplicants2,admitPer1, admitPer2,enrolledPer1, enrolledPer2,academicScale1, academicScale2,socialScale1, socialScale2,qoaScale1, qoaScale2, emphasis);
        
        if (uniSearch.size() == 0 || uniSearch == null) {
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
	 * @author Carter
	 * U5: View Individual University
	 * Calls UserUI with a university name not returning
	 * anything back to the Driver.
	 * @param universityName university name
	 */
	public static void u5(String universityName) {
		UserUI.getUniversity(universityName);
		
	}
	/**
	 * @author Carter
	 * u6: Remove School From List
	 * Calls UserUI to remove a university from the list
	 * returning a boolean true if the university is in the list
	 * and returning a boolean false if the university is not in the list.
	 * @param university name of university
	 */
	public static void u6(String username, String universityname) {
		int remove = UserUI.removeUniversity(username, universityname);
		if (remove == 1) {
			System.out.println(universityname + " was removed from the list");
		}
		if (remove == 0) {
			System.out.println(universityname + " was not in the saved schools list.");
		}
		if (remove == 2) {
			System.out.println("User " + username + " is an invalid user");
		}
		if (remove == 3) {
			System.out.println("University name " + universityname + " is an unvalid University");
		}
		else {
			System.out.println("Something went wrong.");
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
	public static void u7(String userToEdit, String password, String firstName, String lastName) {
		Account user = UserUI.saveUserInfo(userToEdit, password, firstName, lastName);
		System.out.println("***Edited User Info***");
		System.out.println("Username: " + user.getUsername());
		System.out.println("Password: " + user.getPassword());
		System.out.println("First Name: " + user.getFirstName());
		System.out.println("Last Name: " + user.getLastName());
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
	//public static void u11() {
		//UserUI.manageSchool();
	//}
	/**
	 * U12 add school
	 * USED BY READYSON
	 */
	public static void u12() {
		String universityName = "TestX2";
		String state = "MN";
		String location = "SC";
		String control = "Private";
		String numStudents = "2";
		String femalePer = "0";
		String verSAT = "300";
		String mathSAT = "300";
		String tuition = "60000";
		String finAid = "20000";
		String numApplicants = "4000";
		String admitPer = "20";
		String enrolledPer = "80";
		String academicScale = "5";
		String socialScale = "5";
		String qoaScale = "5";
		boolean blacklist = true;
		ArrayList<String> emphasis = new ArrayList<String>();
		emphasis.add("Accounting");
		
	
		if(UserUI.addSchool(universityName, state, location, control, numStudents, femalePer, verSAT, mathSAT,
				tuition, finAid, numApplicants, admitPer, enrolledPer, academicScale, socialScale, qoaScale,
				emphasis, blacklist))
		{
			System.out.println("University has been added");

		}	
		else
		{
			System.out.println("University not added");
		}
		//u5(universityName);
		
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
		String universityName = "blahblah13";
		String state = "MN";
		String location = "SC";
		String control = "Private";
		String numStudents = "2";
		String femalePer = "0";
		String verSAT = "300";
		String mathSAT = "300";
		String tuition = "60000";
		String finAid = "20000";
		String numApplicants = "4000";
		String admitPer = "20";
		String enrolledPer = "80";
		String academicScale = "5";
		String socialScale = "5";
		String qoaScale = "5";
		boolean blacklist = true;
		ArrayList<String> emphasis = new ArrayList<String>();
		
		

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
		DBController.univDBlib.university_deleteUniversity(universityName);
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
