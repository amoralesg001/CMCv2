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

	public School searchSchools(String schooName) { // Should this method return a School object???
		private School school = this.dbController.searchSchool(schoolName);
	}
}
