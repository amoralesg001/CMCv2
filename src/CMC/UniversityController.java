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
	
	public void addUniversity()
	{
		
	}
	
	public void removeSchool(String schoolName)
	{
		this.dbController.getSchool(schoolName);
	}
	
	public void getAllUniversities()
	{
				for(School school: dbController)
				{
					System.out.println(school);
				}
	}
	
	public void blackListUniversity()
	{
		
	}
	
	public void getUniversity(String schoolName) {
		this.dbController.getSchool(schoolName);
		
	}
}
