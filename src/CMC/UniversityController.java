/**
 * 
 */

/**
 * @author nlarson002
 *
 */
package CMC;

import java.util.ArrayList;

public class UniversityController {
	
	private DBController dBController;
	private Account account;
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
<<<<<<< HEAD
	
>>>>>>> b7262778c18955aacfd9c10b95e6ce4164f38c19
=======
	public School getUniversity(String schoolName) {
		return this.dbController.getSchool(schoolName);
		
>>>>>>> 1bb4d336c72c6989d642e5f426aeec19d6b83d98
	}
	
	/**
	 * Creates a new school and adds it to the database.
	 * @param schoolName
	 * @param state
	 * @param location
	 * @param numStudents
	 * @param femalePer
	 * @param verSAT
	 * @param mathSAT
	 * @param tuition
	 * @param finAid
	 * @param numApplicants
	 * @param admitPer
	 * @param enrolledPer
	 * @param academicScale
	 * @param socialScale
	 * @param qoaSCale
	 * @param emphasis
	 */
	public void addSchool(String schoolName, String state, String location, Long numStudents, int femalePer, int verSAT,
			int mathSAT, double tuition, double finAid, double numApplicants, int admitPer, int enrolledPer,
			int academicScale, int socialScale, int qoaSCale, ArrayList<String> emphasis) {
		// TODO
	}
	
	/**
	 * Removes a school from the database by name.
	 * @param schoolName
	 */
	public void removeSchool(String school) {
		School schoolToRemove = this.dBController.getSchool(school);
		this.dBController.removeSchool(schoolToRemove);
		this.account.removeSchool(schoolToRemove);
	}
	
	/**
	 * Edits the university information. 
	 */
	public void editUniversityInfo() {
		// TODO
	}
	
	/**
	 * Gets a list of all the universities.
	 */
	public void getAllUniversities() {
		// TODO
	}
	
	/**
	 * Adds the university to the blacklist.
	 */
	public void blacklistUniversity() {
		// TODO
	}
	
}
