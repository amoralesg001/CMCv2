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
	private ArrayList<School> blackList;
	
	public void addSchool()
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
					System.out.println(school.getSchoolName());
				}
	}
	
	public void blackListUniversity()
	{
		School blackListSchool = dbController.getSchool(schoolName);
		blackList.add(blackListSchool);
	}
	
	public School getUniversity(String schoolName) {
		return this.dbController.getSchool(schoolName);
		
	}
}
