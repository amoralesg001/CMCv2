/**
 * 
 */

/**
 * @author nlarson002, Jengh001
 *
 */
package CMC.Search;

import CMC.University.University;

public class SearchController {

	public static University searchUniversities(String universityName) { // Should this method return a University object???
		University university = DBController.searchUniversity(universityName);
		return university;
	}
}
