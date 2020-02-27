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
	
	private DBController dbController;
	private School school;
	
	/**
	 * Gets the university by name from the database.
	 * @param schoolName
	 */
	public void getUniversity(String schoolName) {
		this.dbController.getSchool(schoolName);
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
	public void removeSchool(String schoolName) {
		this.dbController.removeSchool(schoolName);
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
