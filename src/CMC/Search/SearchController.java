/**
 * 
 */

/**
 * @author nlarson002, Jengh001
 *
 */
package CMC.Search;

import java.util.ArrayList;

import CMC.University.University;

public class SearchController {

	public static ArrayList<String> searchUniversities(String universityName, String state, String location, String control, String numStudents, String femalePer, String verbalSAT,
            String mathSAT, String expenses, String finAidPer, String numApplicants, String admitPer, String enrolledPer,
            String academicScale, String socialScale, String qoaScale, String[] emphasis) { // Should this method return a University object???
		return DBController.dbSearchUniversity(universityName, state, location, control, numStudents, femalePer, verbalSAT,mathSAT,expenses, finAidPer,numApplicants,admitPer,enrolledPer,academicScale,socialScale,qoaScale, emphasis);
	}
}
