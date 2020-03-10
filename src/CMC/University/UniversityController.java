/**
 * 
 */

/**
 * @author nlarson002
 *
 */
package University;

import java.util.ArrayList;

import Search.DBController;
import User.Account;

public class UniversityController {
	
	private DBController dBController;
	private Account account;
	private ArrayList<University> blackList;
	

	public void addUniversity(String universityName)
	{
		this.dBController.getUniversity(universityName).setUniversityName(universityName);
		this.dBController.getUniversity(universityName).setState(universityName);
		this.dBController.getUniversity(universityName).setLocation(universityName);
		this.dBController.getUniversity(universityName).setNumStudents(null);
		this.dBController.getUniversity(universityName).setFemalePer(0);
		this.dBController.getUniversity(universityName).setVerSAT(0);
		this.dBController.getUniversity(universityName).setMathSAT(0);
		this.dBController.getUniversity(universityName).setTuition(0);
		this.dBController.getUniversity(universityName).setFinAid(0);
		this.dBController.getUniversity(universityName).setNumApplicants(0);
		this.dBController.getUniversity(universityName).setAdmitPer(0);
		this.dBController.getUniversity(universityName).getEnrolledPer();
		this.dBController.getUniversity(universityName).setAcademicScale(0);
		this.dBController.getUniversity(universityName).setSocialScale(0);
		this.dBController.getUniversity(universityName).setQoaScale(0);
		this.dBController.getUniversity(universityName).setEmphasis(null);
	}
	
	public void editUniversity(String universityName)
	{
		this.dBController.getUniversity(universityName).setState(universityName);
		this.dBController.getUniversity(universityName).setLocation(universityName);
		this.dBController.getUniversity(universityName).setNumStudents(null);
		this.dBController.getUniversity(universityName).setFemalePer(0);
		this.dBController.getUniversity(universityName).setVerSAT(0);
		this.dBController.getUniversity(universityName).setMathSAT(0);
		this.dBController.getUniversity(universityName).setTuition(0);
		this.dBController.getUniversity(universityName).setFinAid(0);
		this.dBController.getUniversity(universityName).setNumApplicants(0);
		this.dBController.getUniversity(universityName).setAdmitPer(0);
		this.dBController.getUniversity(universityName).getEnrolledPer();
		this.dBController.getUniversity(universityName).setAcademicScale(0);
		this.dBController.getUniversity(universityName).setSocialScale(0);
		this.dBController.getUniversity(universityName).getQoaScale();
		this.dBController.getUniversity(universityName).setEmphasis(null);
	}
	
	/*
	 * this method returns a list of university
	 *
	 */
	public void getAllUniversities()
	{

	}
	
	/*this method blacklists university
	 * 
	 * @param String universityName takes university object and puts in blacklist
	 */
	public void blackListUniversity(String universityName)
	{
		University blackListUniversity = dBController.getUniversity(universityName);
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
	 * Adds the university to the blacklist.
	 */
	public void blacklistUniversity() {
		// TODO
	}
	
}
