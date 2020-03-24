
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

	//DB Controller 
	//private static Account account;
	//private static ArrayList<University> blackList;
	

	
	/*
	 *  method returns a list of university
	 *
	 */
	public static void getAllUniversities()
	{
		DBController.getAllUniversities();
	}
	
	/* method blacklists university
	 * 
	 * @param String universityName takes university object and puts in blacklist
	 */
	//public static void blackListUniversity(String universityName)
	//{
		//University blackListUniversity = DBController.getUniversity(universityName);
		//blackList.add(blackListUniversity);
	//}
	
	/*
	 *  method gets the university object for the user
	 * 
	 * @param universityName university name to get the university object
	 */

	public static void getUniversity(String universityName) {
		University universityToDisplay = DBController.dbGetUniversity(universityName);
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
	public static void addUniversity(String universityName, String state, String location, String control, int numStudents, double femalePer, double verSAT,
			double mathSAT, double tuition, double finAid, int numApplicants, double admitPer, double enrolledPer,
			int academicScale, int socialScale, int qoaSCale) {
		DBController.addUniversity(universityName, state, location, control, numStudents, femalePer, verSAT,
				mathSAT, tuition, finAid, numApplicants, admitPer, enrolledPer, academicScale, socialScale,
				qoaSCale);
		
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
	 * Adds the university to the blacklist.
	 */
	public void blacklistUniversity() {
		// TODO
	}

	public static void editUniversityinfo(String universityName, String state, String location, String control, int numStudents,
			int femalePer, int verSAT, int mathSAT, double tuition, double finAid, double numApplicants, int admitPer,
			int enrolledPer, int academicScale, int socialScale, int qoaScale) {
		DBController.updateUniversityDB(universityName, state, location,  control,
				numStudents, femalePer, verSAT, mathSAT, tuition, 
				finAid, numApplicants, admitPer, enrolledPer, 
				academicScale, socialScale, qoaScale);
	}
	
}
