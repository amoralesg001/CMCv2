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

	public static ArrayList<String> searchUniversities(String universityName, String state, String location, String control, String numStudents1, String numStudents2, String femalePer1, String femalePer2, String verbalSAT1, String verbalSAT2,
            String mathSAT1, String mathSAT2, String expenses1, String expenses2, String finAidPer1, String finAidPer2, String numApplicants1, String numApplicants2, String admitPer1, String admitPer2, String enrolledPer1, String enrolledPer2,
            String academicScale1, String academicScale2, String socialScale1, String socialScale2, String qoaScale1, String qoaScale2, String[] emphasis) { 
		return DBController.dbSearchUniversity(universityName, state, location, control, numStudents1, numStudents2, femalePer1, femalePer2, verbalSAT1, verbalSAT2,mathSAT1, mathSAT2,expenses1, expenses2, finAidPer1, finAidPer2,numApplicants1, numApplicants2,admitPer1, admitPer2,enrolledPer1, enrolledPer2,academicScale1, academicScale2,socialScale1, socialScale2,qoaScale1, qoaScale2, emphasis);
	}
}
