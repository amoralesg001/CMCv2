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
	
	private static DBController dBController;
	private static Account account;
	private static ArrayList<University> blackList;
	

	public static void addUniversity(String universityName)
	{
		dBController.getUniversity(universityName).setUniversityName(universityName);
		dBController.getUniversity(universityName).setState(universityName);
		dBController.getUniversity(universityName).setLocation(universityName);
		dBController.getUniversity(universityName).setNumStudents(null);
		dBController.getUniversity(universityName).setFemalePer(0);
		dBController.getUniversity(universityName).setVerSAT(0);
		dBController.getUniversity(universityName).setMathSAT(0);
		dBController.getUniversity(universityName).setTuition(0);
		dBController.getUniversity(universityName).setFinAid(0);
		dBController.getUniversity(universityName).setNumApplicants(0);
		dBController.getUniversity(universityName).setAdmitPer(0);
		dBController.getUniversity(universityName).getEnrolledPer();
		dBController.getUniversity(universityName).setAcademicScale(0);
		dBController.getUniversity(universityName).setSocialScale(0);
		dBController.getUniversity(universityName).setQoaScale(0);
		dBController.getUniversity(universityName).setEmphasis(null);
	}
	
	public static void editUniversity(String universityName)
	{
		dBController.getUniversity(universityName).setState(universityName);
		dBController.getUniversity(universityName).setLocation(universityName);
		dBController.getUniversity(universityName).setNumStudents(null);
		dBController.getUniversity(universityName).setFemalePer(0);
		dBController.getUniversity(universityName).setVerSAT(0);
		dBController.getUniversity(universityName).setMathSAT(0);
		dBController.getUniversity(universityName).setTuition(0);
		dBController.getUniversity(universityName).setFinAid(0);
		dBController.getUniversity(universityName).setNumApplicants(0);
		dBController.getUniversity(universityName).setAdmitPer(0);
		dBController.getUniversity(universityName).getEnrolledPer();
		dBController.getUniversity(universityName).setAcademicScale(0);
		dBController.getUniversity(universityName).setSocialScale(0);
		dBController.getUniversity(universityName).getQoaScale();
		dBController.getUniversity(universityName).setEmphasis(null);
	}
	
	/*
	 *  method returns a list of university
	 *
	 */
	public static void getAllUniversities()
	{

	}
	
	/* method blacklists university
	 * 
	 * @param String universityName takes university object and puts in blacklist
	 */
	public static void blackListUniversity(String universityName)
	{
		University blackListUniversity = dBController.getUniversity(universityName);
		blackList.add(blackListUniversity);
	}
	
	/*
	 *  method gets the university object for the user
	 * 
	 * @param universityName university name to get the university object
	 */

	public University getUniversity(String universityName) {
		return dBController.getUniversity(universityName);
		

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
	public static void addUniversity(String universityName, String state, String location, Long numStudents, int femalePer, int verSAT,
			int mathSAT, double tuition, double finAid, double numApplicants, int admitPer, int enrolledPer,
			int academicScale, int socialScale, int qoaSCale, ArrayList<String> emphasis) {
		// TODO
	}
	
	/**
	 * Removes a university from the database by name.
	 * @param universityName
	 */
	public static void removeUniversity(String university) {
		University universityToRemove = dBController.getUniversity(university);
		dBController.removeUniversity(universityToRemove);
		account.removeUniversity(universityToRemove);
	}
	
	/**
	 * Edits the university information. 
	 */
	public static void editUniversityInfo() {
		// TODO
	}
	


	
	/**
	 * Adds the university to the blacklist.
	 */
	public void blacklistUniversity() {
		// TODO
	}
	
}
