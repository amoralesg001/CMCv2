/**
 * 
 */

/**
 * @author nlarson002
 *
 */
package CMC;
public class UserUI {
<<<<<<< HEAD
	String user;
	String pass;
=======

	private UniversityController universityController = new UniversityController();
>>>>>>> 7182e092936372e2e9fabea73c7edcb66d01f75a
	
	public void login(String username, String password) {
		System.out.println("Enter User");
		System.our.println("Enter Password");
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
		
	public void viewResults() {
		
	}
	
}








