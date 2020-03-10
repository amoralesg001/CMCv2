/**
 * 
 */

/**
 * @author nlarson002

 *
 */
package CMC.User;

import java.util.ArrayList;

import CMC.University.*;

public class UserUI {

	String user;
	String pass;
	UniversityController universityController;
	UserController userController;
	
	public static void login(String username, String password) {
		
	UserController.login(username, password);
	}
	
	public void goToPage() {
		String schoolName = " ";
		this.universityController.getUniversity(schoolName);
	}
	//instead of using the goToPage method for my use case, I changed the method to this. Its more specific
	public static void getUserInfo(String username) { 
		UserController.getUserInfo(username);
	}
	
	public void saveUserInfo(String username, String password, String firstName, String lastName) {
		
	}
	
	public void editSchool() {
		
	}
	
	public void manageSchool() {
		
	}
	
	/**
	 * 
	 * @param school School you want to display information about
	 */
	public void displaySchoolInfo(University school) {
		System.out.println("School Name:"  + school.getuniversityName());
		System.out.println("School State Location: " + school.getState());
		System.out.println("School Location: " + school.getLocation());
		System.out.println("Number of Students: " + school.getNumStudents());
		System.out.println("Percentage of Females: " + school.getFemalePer());
		System.out.println("Average Ver. SAT score: " + school.getVerSAT());
		System.out.println("Average Math SAT score: " + school.getMathSAT());
		System.out.println("Tuition Costs: " + school.getTuition());
		System.out.println("Average Financial Aid: " + school.getFinAid());
		System.out.println("Number of Applicants: " + school.getNumApplicants());
		System.out.println("Percentage of Admitted Applicants: " + school.getAdmitPer());
		System.out.println("Percentange of Enrolled: " + school.getEnrolledPer());
		System.out.println("Academic Scale: " + school.getAcademicScale());
		System.out.println("Social Scale: " + school.getSocialScale());
		System.out.println("QOA Scale: " + school.getQoaScale());
		System.out.println("Emphasis:");
		ArrayList<String> array = school.getEmphasis();
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
	
	public void getSavedList(Account account) {
		
	}
	
	public void displaySavedSchool(Account account) {
		
	}
	
	public void blacklistSchool(University school) {
		
	}
	
	public void saveUniversityInfo(University school) {
		
	}
	
	public void addSchool(University school) {
		
	}
	
	public void logOut() {
		
	}
	
	public void lookup(Account account) {
		
	}
		
	public void viewResults() {
		
	}
	public void displayUserInfo(University school) {		//need to add to class diagram
		
	}

	public void displaySavedList() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * This method goes to the UserController
	 * @param username the username of Account
	 */
	public static void getSavedUniversity(String username) {
		UserController.getSavedUniversity(username);
	}
	/**
	 * this method displays the saved universities from the specific account
	 * @param account
	 */
	public static void displaySavedUniversity(Account account) {
		System.out.println("Here are the schools");
	}
	public static void goToLoginPage() {
		System.out.println("logged in");
	}

	public static void removeUniversity(String university) {
		UniversityController.removeUniversity(university);
		
	}

}








