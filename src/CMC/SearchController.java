/**
 * 
 */

/**
 * @author nlarson002, Jengh001
 *
 */
package CMC;
public class SearchController {
	
	private DBController dbController = new DBController();

	public University searchUniversitys(String schooName) { // Should this method return a University object???
		private University university = this.dbController.searchUniversity(universityName);
	}
}
