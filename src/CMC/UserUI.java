/**
 * 
 */

/**
 * @author nlarson002

 *
 */
package CMC;

<<<<<<< HEAD
=======
import java.util.ArrayList;

>>>>>>> 693ed6df07cf70833e6cf0323d7246987964b565
public class UserUI {

	String user;
	String pass;

	private UniversityController universityController = new UniversityController();

	
	public void login(String username, String password) {
		System.out.println("Enter User");
		System.out.println("Enter Password");

	}
	
	public void goToPage() {
		String schoolName = " ";
		this.universityController.getUniversity(schoolName);
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
		
	public void viewResults() {
		
	}
	public void displayUserInfo() {		//need to add to class diagram
		
	}
	
	public void removeSchool(School school) {
		this.UserController.removeSchool(school);
	}

	public void displaySavedList() {
		// TODO Auto-generated method stub
		
	}
	
}








