/**
 * 
 */

/**
 * @author nlarson002
 *
 */
package CMC;
public class UniversityController {
	
	private DBController dbController;
	private School school;
	private ArrayList<School> blackList;
	
	public void addSchool(String schoolName)
	{
		this.dbController.getSchool(schoolName).setSchoolName();
		this.dbController.getSchool(schoolName).setState();
		this.dbController.getSchool(schoolName).setLocation();
		this.dbController.getSchool(schoolName).setNumStudents();
		this.dbController.getSchool(schoolName).setFemalePer();
		this.dbController.getSchool(schoolName).setVerSAT();
		this.dbController.getSchool(schoolName).setMathSAT();
		this.dbController.getSchool(schoolName).setTuition();
		this.dbController.getSchool(schoolName).setFinAid();
		this.dbController.getSchool(schoolName).setNumApplicants();
		this.dbController.getSchool(schoolName).setAdmitPer();
		this.dbController.getSchool(schoolName).ssetEnrolledPer();
		this.dbController.getSchool(schoolName).setAcademicScale();
		this.dbController.getSchool(schoolName).setSocialScale();
		this.dbController.getSchool(schoolName).setQoaSCale();
		this.dbController.getSchool(schoolName).setEmphasis();
	}
	
	public void editSchool(String schoolName)
	{
		this.dbController.getSchool(schoolName).setState();
		this.dbController.getSchool(schoolName).setLocation();
		this.dbController.getSchool(schoolName).setNumStudents();
		this.dbController.getSchool(schoolName).setFemalePer();
		this.dbController.getSchool(schoolName).setVerSAT();
		this.dbController.getSchool(schoolName).setMathSAT();
		this.dbController.getSchool(schoolName).setTuition();
		this.dbController.getSchool(schoolName).setFinAid();
		this.dbController.getSchool(schoolName).setNumApplicants();
		this.dbController.getSchool(schoolName).setAdmitPer();
		this.dbController.getSchool(schoolName).ssetEnrolledPer();
		this.dbController.getSchool(schoolName).setAcademicScale();
		this.dbController.getSchool(schoolName).setSocialScale();
		this.dbController.getSchool(schoolName).setQoaSCale();
		this.dbController.getSchool(schoolName).setEmphasis();
	}
	
	/* this method removes a school from the system.
	 * 
	 * @param Strring schoolName school name for getting school object
	 * 
	 */
	public void removeSchool(String schoolName)
	{
		this.dbController.getSchool(schoolName);
	}
	
	/*
	 * this method returns a list of school
	 *
	 */
	public void getAllUniversities()
	{
				for(School school: dbController)
				{
					System.out.println(school.getSchoolName());
				}
	}
	
	/*this method blacklists schools
	 * 
	 * @param String schoolName takes school object and puts in blacklist
	 */
	public void blackListUniversity(String schoolName)
	{
		School blackListSchool = dbController.getSchool(schoolName);
		blackList.add(blackListSchool);
	}
	
	/*
	 * this method gets the school object for the user
	 * 
	 * @param schoolName school name to get the school object
	 */
	public School getUniversity(String schoolName) {
		return this.dbController.getSchool(schoolName);
		
	}
}
