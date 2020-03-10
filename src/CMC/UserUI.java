/**
 * 
 */

/**
 * @author nlarson002

 *
 */
package CMC;

public class UserUI {


import java.util.ArrayList;

public class UserUI {

	private UniversityController universityController = new UniversityController();

	private UniversityController universityController = new UniversityController();

	
	public void login(String username, String password) {
		

	String user;
	String pass;
	UniversityController universityController;
	UserController userController;
	
	public void login(String username, String password) {
		
		boolean loggedIn = userController.login(username, password);
		if (loggedIn == true) {
			goToPage();
		}
		else {
			return;
		}

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
	public void displaySchoolInfo(School school) {
		System.out.println("School Name:"  + school.getSchoolName());
		System.out.println("School State Location: " + school.getState());
		System.out.println("School Location: " + school.getLocation());
		System.out.println("Number of Students: " + school.getNumStudents());
		System.out.println("Percentage of Females: " + school.getFemalePer());
		System.out.println("Average Ver. SAT score: " + school.getVerSAT());
		System.out.println("Average Math SAT score: " + school.getMathSAT());
		System.out.println("Tuition Costs: " + school.getTuition());
		System.out.println("Average Financial Aid: " + school.getFinancialAid());
		System.out.println("Number of Applicants: " + getNumApplicants());
		System.out.println("Percentage of Admitted Applicants: " + getAdmitPer());
		System.out.println("Percentange of Enrolled: " + getEnrolledPer());
		System.out.println("Academic Scale: " + getAcademicScale());
		System.out.println("Social Scale: " + getSocialScale());
		System.out.println("QOA Scale: " + getQoaScale());
		System.out.println("Emphasis:");
		for (int i = 0; i < emphasis.length; i++) {
			System.out.println(emphasis[i]);
		}
	}
	
	public void getSavedList(Account account) {
		
	}
	
	public void displaySavedSchool(Account account) {
		
	}
	
	public void blacklistSchool(School school) {
		
	}
	
	public void saveUniversityInfo(School school) {
		
	}
	
	public void addSchool(School school) {
		
	}
	
	public void logOut() {
		
	}
	
	public void lookup(Account account) {
		
	}
		
	/**
	 * Displays the search results for the user.
	 */
	public void viewResults() {
		// TODO @Jack
	}

	public void displayUserInfo(School school) {		//need to add to class diagram
		
	}
	
	public void removeSchool(School school) {
		this.UserController.removeSchool(school);
	}

	public void displaySavedList() {
		// TODO Auto-generated method stub
		
	}
	
}








