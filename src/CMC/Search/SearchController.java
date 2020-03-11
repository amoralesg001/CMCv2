/**
 * 
 */

/**
 * @author nlarson002, Jengh001
 *
 */
package Search;

import University.University;

public class SearchController {
	
	private DBController dbController = new DBController();

	public static University searchUniversitys(String universityName) { // Should this method return a University object???
		University university = this.dbController.searchUniversity(universityName);
		return university;
	}
}
