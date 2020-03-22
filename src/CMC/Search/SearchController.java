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

	public static ArrayList<String> searchUniversities(String universityName) { // Should this method return a University object???
		return DBController.searchUniversity(universityName);
	}
}
