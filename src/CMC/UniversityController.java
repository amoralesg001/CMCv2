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
	private University university;
	private ArrayList<University> blackList;
	

	public void addUniversity(String universityName)
	{
		this.dbController.getUniversity(universityName).setUniversityName();
		this.dbController.getUniversity(universityName).setState();
		this.dbController.getUniversity(universityName).setLocation();
		this.dbController.getUniversity(universityName).setNumStudents();
		this.dbController.getUniversity(universityName).setFemalePer();
		this.dbController.getUniversity(universityName).setVerSAT();
		this.dbController.getUniversity(universityName).setMathSAT();
		this.dbController.getUniversity(universityName).setTuition();
		this.dbController.getUniversity(universityName).setFinAid();
		this.dbController.getUniversity(universityName).setNumApplicants();
		this.dbController.getUniversity(universityName).setAdmitPer();
		this.dbController.getUniversity(universityName).ssetEnrolledPer();
		this.dbController.getUniversity(universityName).setAcademicScale();
		this.dbController.getUniversity(universityName).setSocialScale();
		this.dbController.getUniversity(universityName).setQoaSCale();
		this.dbController.getUniversity(universityName).setEmphasis();
	}
	
	public void editUniversity(String universityName)
	{
		this.dbController.getUniversity(universityName).setState();
		this.dbController.getUniversity(universityName).setLocation();
		this.dbController.getUniversity(universityName).setNumStudents();
		this.dbController.getUniversity(universityName).setFemalePer();
		this.dbController.getUniversity(universityName).setVerSAT();
		this.dbController.getUniversity(universityName).setMathSAT();
		this.dbController.getUniversity(universityName).setTuition();
		this.dbController.getUniversity(universityName).setFinAid();
		this.dbController.getUniversity(universityName).setNumApplicants();
		this.dbController.getUniversity(universityName).setAdmitPer();
		this.dbController.getUniversity(universityName).ssetEnrolledPer();
		this.dbController.getUniversity(universityName).setAcademicScale();
		this.dbController.getUniversity(universityName).setSocialScale();
		this.dbController.getUniversity(universityName).setQoaSCale();
		this.dbController.getUniversity(universityName).setEmphasis();
	}
	
	/*
	 * this method returns a list of university
	 *
	 */
	public void getAllUniversities()
	{
				for(University university: dbController)
				{
					System.out.println(university.getUniversityName());
				}
	}
	
	/*this method blacklists universitys
	 * 
	 * @param String universityName takes university object and puts in blacklist
	 */
	public void blackListUniversity(String universityName)
	{
		University blackListUniversity = dbController.getUniversity(universityName);
		blackList.add(blackListUniversity);
	}
	
	/*
	 * this method gets the university object for the user
	 * 
	 * @param universityName university name to get the university object
	 */

	public University getUniversity(String universityName) {
		return this.dBController.getUniversity(universityName);
		

	}
	
	/**
	 * Creates a new university and adds it to the database.
	 * @param universityName
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
	public void addUniversity(String universityName, String state, String location, Long numStudents, int femalePer, int verSAT,
			int mathSAT, double tuition, double finAid, double numApplicants, int admitPer, int enrolledPer,
			int academicScale, int socialScale, int qoaSCale, ArrayList<String> emphasis) {
		// TODO
	}
	
	/**
	 * Removes a university from the database by name.
	 * @param universityName
	 */
	public void removeUniversity(String university) {
		University universityToRemove = this.dBController.getUniversity(university);
		this.dBController.removeUniversity(universityToRemove);
		this.account.removeUniversity(universityToRemove);
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
