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

	public static ArrayList<String> searchUniversities(University uniCriteria) { // Should this method return a University object???
		return DBController.dbSearchUniversity(uniCriteria);
	}
}
