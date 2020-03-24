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

	public static University searchUniversities(String universityName) { // Should this method return a University object???
		return DBController.dbGetUniversity(universityName);
	}
}
