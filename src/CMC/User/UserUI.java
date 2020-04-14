/**
 * 
 */

/**
 * @author nlarson002

 *
 */
package CMC.User;

import java.util.ArrayList;

import CMC.Search.SearchController;
import CMC.University.*;

public class UserUI {

	String user;
	String pass;
	UniversityController universityController;
	UserController userController;
	/**
	 * 
	 * @param username
	 * @param password
	 */
	public static boolean login(String username, String password) {
		
		return UserController.login(username, password);
	}
	
	//instead of using the goToPage method for my use case, I changed the method to this. Its more specific
	public static boolean getUserInfo(String username, String password) { 
		Account account = UserController.getUserInfo(username, password);
		String usernameTest = account.getUsername();
		String passwordTest = account.getPassword();
		String firstName = account.getFirstName();
		String lastName = account.getLastName();
		String status = account.getLoginStatus();

		if (usernameTest == null) {
			System.out.println("User is blocked or does not exist");
			return false;
		}
		else {
			System.out.println("Displaying user information for " + firstName);
			System.out.println("Username: " + usernameTest);
			System.out.println("Password: " + passwordTest);
			System.out.println("First Name: " + firstName);
			System.out.println("Last Name: "  + lastName);
			System.out.println("Status: " + status);
			System.out.println("\n");
			return true;
		}
	} 
	
	/**
	 * Saves the user information to the database.
	 * @param username
	 * @param password
	 * @param firstName
	 * @param lastName
	 */
	public static Account saveUserInfo(String userToSaveInfo, String password, String firstName, String lastName) {
		Account user = UserController.saveUserInfo(userToSaveInfo, password, firstName, lastName);
		return user;
	}
	/**
	 * 
	 */
	//public static void manageSchool() {
		//UniversityController.getAllUniversities();
	//}
	
	/**
	 *
	 * @param university School you want to display information about
	 */
	public static boolean displayUniversityInfo(University university) {
		if (university != null) {
		System.out.println("School Name: "  + university.getuniversityName());
		System.out.println("School State Location: " + university.getState());
		System.out.println("School Location: " + university.getLocation());
		System.out.println("School Control: " + university.getControl());
		System.out.println("Number of Students: " + university.getNumStudents());
		System.out.println("Percentage of Females: " + university.getFemalePer());
		System.out.println("Average Ver. SAT score: " + university.getVerSAT());
		System.out.println("Average Math SAT score: " + university.getMathSAT());
		System.out.println("Tuition Costs: " + university.getTuition());
		System.out.println("Average Financial Aid: " + university.getFinAid());
		System.out.println("Number of Applicants: " + university.getNumApplicants());
		System.out.println("Percentage of Admitted Applicants: " + university.getAdmitPer());
		System.out.println("Percentange of Enrolled: " + university.getEnrolledPer());
		System.out.println("Academic Scale: " + university.getAcademicScale());
		System.out.println("Social Scale: " + university.getSocialScale());
		System.out.println("QOA Scale: " + university.getQoaScale());
		System.out.println("Emphasis: ");
		if(!university.getEmphasis().isEmpty())
		{
			if (university.getEmphasis().get(0).equals("No Emphases")) {
				System.out.println("No Emphases");
			}
			else {
				int i = 1;
				for (String s: university.getEmphasis()) {
						System.out.println(i +". " + s);
						i++;
				}
			}
		}
		System.out.println("BlackListed: " + university.isBlacklisted());
		return true;
		}
		else {
			System.out.println("The University you wanted to display is not valid");
			return false;
		}
		
	}
	/**
	 * Adds a specified school to users saved school list
	 * In use by John
	 * @Author John Engh
	 * @param SName Name of university as string
	 * @param AName Account username as string
	 * @return boolean if successful or not
	 */
	public static boolean addSavedUniversities(String AName, String SName) {
		return UserController.addSavedUniversities(AName, SName);
	}

	/**
	 * This method is used to edit all of the information inside of a University object
	 * 
	 * @param universityName is university object name
	 * @param state is university object state
	 * @param location is university object location
	 * @param numStudents number of students in the university
	 * @param femalePer percent of female students going to university
	 * @param verSAT average Verbal SAT score for university
	 * @param mathSAT average Math SAT score for university
	 * @param tuition tuition cost for the university
	 * @param finAid financial aid for university
	 * @param numApplicants number of applicants for the university
	 * @param admitPer Percentage of applicants admitted
	 * @param enrolledPer percent of enrolled 
	 * @param academicScale the University's academic scale
	 * @param socialScale the University's Social scale
	 * @param qoaScale the University's qoa scale
	 * @param emphasis the University's emphasis on Majors
	 * @param blacklist if the school is blacklisted
	 * 
	 * @return boolean value if the school has been edited
	 */
	public static boolean saveSchoolInfo(String universityName, String state, String location, String control, String numStudents, String femalePer,
			String verSAT, String mathSAT, String tuition, String finAid, String numApplicants, String admitPer, String enrolledPer,
			String academicScale, String socialScale, String qoaScale, ArrayList<String> emphasis, boolean blacklist) {
		// TODO Auto-generated method stub
		return UniversityController.editUniversityinfo(universityName, state, location, control, numStudents, femalePer,
				verSAT, mathSAT, tuition, finAid, numApplicants, admitPer, enrolledPer, academicScale, socialScale,
				qoaScale, emphasis, blacklist);
	}
		
	/**
	 * Displays the search results to the user.
	 */
	public static String viewResults() {
		String results = "Temporary search results";
		return results;
	}
	

	/**
	 * 
	 * @param school
	 */
	//public void removeSchool(String school) {
		//UniversityController.removeUniversity(school);
	//}
	
	/**
	 * USED BY ALEX
	 * This method goes to the UserController
	 * @param username the username of Account
	 */
	public static ArrayList<String> getSavedUniversityList(String username) {
		
		return UserController.getSavedUniversityList(username);
	}
	
	/**

	 * Calls UniversityController to pass on to DBController and Account
	 * 
	 * @param universityname
	 */
	public static int removeUniversity(String username, String universityname) {
		int remove = UniversityController.removeUniversity(username, universityname);
		return remove;
	}
	/**
	 * in use by John
	 */
	public static ArrayList<Account> manageUsers() {
		return UserController.getAllUsers();
		
	}
	
	/**
	 * This method is used to edit all of the information inside of a University object
	 * 
	 * @param universityName is university object name
	 * @param state is university object state
	 * @param location is university object location
	 * @param numStudents number of students in the university
	 * @param femalePer percent of female students going to university
	 * @param verSAT average Verbal SAT score for university
	 * @param mathSAT average Math SAT score for university
	 * @param tuition tuition cost for the university
	 * @param finAid financial aid for university
	 * @param numApplicants number of applicants for the university
	 * @param admitPer Percentage of applicants admitted
	 * @param enrolledPer percent of enrolled 
	 * @param academicScale the University's academic scale
	 * @param socialScale the University's Social scale
	 * @param qoaScale the University's qoa scale
	 * @param emphasis the University's emphasis on Majors
	 * @param blacklist if the school is blacklisted
	 * 
	 * @return boolean value if the school has been added to the database
	 */
	public static boolean addSchool(String universityName, String state, String location, String control, String numStudents, String femalePer,
			String verSAT, String mathSAT, String tuition, String finAid, String numApplicants, String admitPer, String enrolledPer,
			String academicScale, String socialScale, String qoaScale, ArrayList<String> emphasis, boolean blacklist) {
		// TODO Auto-generated method stub
		 return UniversityController.addUniversity(universityName, state, location, control, numStudents, femalePer, verSAT, mathSAT, tuition, finAid, numApplicants, admitPer, enrolledPer, academicScale, socialScale, qoaScale, emphasis, blacklist);
	}

	public static void getUniversity(String university) {
		UniversityController.getUniversity(university);
	}
	
	/**
	 * USED BY ALEX
	 * @param uniCriteria
	 * @return arrayList of a string of school names
	 */
	public static ArrayList<String> searchUniversity(String universityName, String state, String location, String control, String numStudents, String femalePer, String verbalSAT,
            String mathSAT, String expenses, String finAidPer, String numApplicants, String admitPer, String enrolledPer,
            String academicScale, String socialScale, String qoaScale, ArrayList<String> emphasis) {
        return SearchController.searchUniversities(universityName, state, location, control, numStudents, femalePer, verbalSAT,mathSAT,expenses, finAidPer,numApplicants,admitPer,enrolledPer,academicScale,socialScale,qoaScale,emphasis);
    }

}








