/**
 * 
 */

/**
 * @author nlarson002
 *
 */
package CMC;
public class UniversityController {
	
	private DBController dbController;
	private School school;
	
	public void getUniversity(String schoolName) {
		this.dbController.getSchool(schoolName);
		
	}
}
