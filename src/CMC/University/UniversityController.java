
/**
 * University controller manages all universities in the system
 * @author nlarson002
 *
 */
package CMC.University;

import java.util.ArrayList;

import CMC.Search.DBController;
import CMC.User.*;

public class UniversityController {
<<<<<<< HEAD
	

=======
	//DB Controller 
	private static DBController dBController;
>>>>>>> 19d96e3d8b6c9df77e6acdc0587a37595b98a055
	private static Account account;
	private static ArrayList<University> blackList;
	

	public static void addUniversity(String universityName)
	{
		DBController.getUniversity(universityName).setUniversityName(universityName);
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
		dBController.getAllUniversitys()
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

	public static void getUniversity(String universityName) {
		University universityToDisplay = DBController.getUniversity(universityName);
		UserUI.displayUniversityInfo(universityToDisplay);
		

	}
	
	/**
	 * Creates a new university and adds it to the database.
	 * 
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
	public static void addUniversity(String universityName, String state, String location, int numStudents, int femalePer, int verSAT,
			int mathSAT, double tuition, double finAid, double numApplicants, int admitPer, int enrolledPer,
			int academicScale, int socialScale, int qoaSCale, ArrayList<String> emphasis) {
		University newUniversity = new University(universityName, state, location, numStudents, femalePer, verSAT,
				mathSAT, tuition, finAid, numApplicants, admitPer, enrolledPer, academicScale, socialScale,
				qoaSCale, emphasis);
		dBController.addUniversity(newUniversity);
				}
	
	/**
	 * Removes a university from the database by name.
	 * 
	 * @param String name of university
	 */
	public static void removeUniversity(String university) {
		University universityToRemove = DBController.getUniversity(university);
		DBController.removeUniversity(universityToRemove);
		Account.removeUniversity(universityToRemove);
		
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
