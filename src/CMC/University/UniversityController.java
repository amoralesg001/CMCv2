
/**
 * University controller manages all universities in the system
 * @author nlarson002
 *
 */
package CMC.University;

import java.util.ArrayList;

import CMC.Search.DBController;
import CMC.User.*;

public class UniversityController {

	//DB Controller 
	//private static Account account;
	//private static ArrayList<University> blackList;
	

	
	/*
	 *  method returns a list of university
	 *
	 */
	//public static void getAllUniversities()
	//{
	//	DBController.getAllUniversities();
	//}
	
	/* method blacklists university
	 * 
	 * @param String universityName takes university object and puts in blacklist
	 */
	//public static void blackListUniversity(String universityName)
	//{
		//University blackListUniversity = DBController.getUniversity(universityName);
		//blackList.add(blackListUniversity);
	//}
	
	/*
	 *  method gets the university object for the user
	 * 
	 * @param universityName university name to get the university object
	 */

	public static void getUniversity(String universityName) {
		University universityToDisplay = DBController.dbGetUniversity(universityName);
		UserUI.displayUniversityInfo(universityToDisplay);
		

	}
	
	/**
	 * This method is used to add University to database
	 * 
	 * @param universityName is university object name
	 * @param state is university object state
	 * @param location is university object location
	 * @param numStudents number of students in the university
	 * @param femalePer percent of female students going to university
	 * @param verSAT average Verbal SAT score for university
	 * @param mathSAT average Math SAT score for university
	 * @param tuition tuition cost for the university
	 * @param finAid financial aid for university
	 * @param numApplicants number of applicants for the university
	 * @param admitPer Percentage of applicants admitted
	 * @param enrolledPer percent of enrolled 
	 * @param academicScale the University's academic scale
	 * @param socialScale the University's Social scale
	 * @param qoaScale the University's qoa scale
	 * @param emphasis the University's emphasis on Majors
	 * @param blacklist if the school is blacklisted
	 * 
	 * @return boolean value if the school has been added
	 */
	public static boolean addUniversity(String universityName, String state, String location,
			String control, int numStudents, double femalePer, double verSAT, double mathSAT,
			double tuition, double finAid, int numApplicants, double admitPer, double enrolledPer,
			int academicScale, int socialScale, int qoaSCale, ArrayList<String> emphasis,
			boolean blacklist) {
		University u = new University(universityName, state, location, control, numStudents, femalePer, verSAT,
				mathSAT, tuition, finAid, numApplicants, admitPer, enrolledPer, academicScale, socialScale,
				qoaSCale, emphasis, blacklist);
		if (!emphasis.isEmpty())
		{
			for(String s: emphasis)
			{
				DBController.univDBlib.university_addUniversityEmphasis(universityName, s);
			}
		}
		
		//UnsupportedOperationException
		boolean valid = true;
		if (u.getuniversityName().length() <= 0 || u.getuniversityName().charAt(0) == ' ')
		{
			valid = false;
			throw new UnsupportedOperationException("Must have name");
		}
		if(u.getState().length() <= 0 || u.getState().charAt(0) == ' ')
		{
			valid = false;
			throw new UnsupportedOperationException("Must enter State");
		}
		if(u.getLocation().length() <= 0 || u.getLocation().charAt(0) == ' ')
		{
			valid = false;
			throw new UnsupportedOperationException("Must enter location");
		}
		if(u.getControl().length() <= 0 || u.getControl().charAt(0) == ' ')
		{
			valid = false;
			throw new UnsupportedOperationException("Must enter Control");
		}
		if(u.getNumStudents() < 0)
		{
			valid = false;
			throw new UnsupportedOperationException("Number of students must be greater than 0");
		}
		if(u.getFemalePer() < 0 || u.getFemalePer() > 100)
		{
			valid = false;
			throw new UnsupportedOperationException("Female Percent must be between 0 - 100");
		}
		if(u.getVerSAT() < 200 || u.getVerSAT() > 800)
		{
			valid = false;
			throw new UnsupportedOperationException("Verbal SAT must be between 200 - 800");
		}
		if(u.getMathSAT() < 200 || u.getMathSAT() > 800)
		{
			valid = false;
			throw new UnsupportedOperationException("Math SAT must be between 200 - 800");
		}
		if(u.getTuition() < 0)
		{
			valid = false;
			throw new UnsupportedOperationException("Tuition must not be negative");
		}
		if(u.getFinAid() < 0)
		{
			valid = false;
			throw new UnsupportedOperationException("Financial Aid Must cannot be negative");
		}
		if(u.getNumApplicants() < 0)
		{
			valid = false;
			throw new UnsupportedOperationException("Number of applicants must not be negative");
		}
		if(u.getAdmitPer() < 0 || u.getAdmitPer() > 100)
		{
			valid = false;
			throw new UnsupportedOperationException("Admit percent must be from 0 - 100");
		}
		if(u.getEnrolledPer() < 0 || u.getEnrolledPer() > 100)
		{
			valid = false;
			throw new UnsupportedOperationException("Enrolled Percent must be from 0 - 100");
		}
		if(u.getAcademicScale() < 1 || u.getAcademicScale() > 5)
		{
			valid = false;
			throw new UnsupportedOperationException("Academic Scale must be from 1 - 5");
		}
		if(u.getSocialScale() < 1 || u.getSocialScale() > 5)
		{
			valid = false;
			throw new UnsupportedOperationException("Social Scale must be from 1 - 5");
		}
		if(u.getQoaScale() < 1 || u.getQoaScale() > 5)
		{
			valid = false;
			throw new UnsupportedOperationException("Academic Scale must be from 1 - 5");
		}
		
		UserUI.displayUniversityInfo(u);
		//DBController.addUniversity(newUniversity);
		if(valid)
		{
			System.out.println("all parameters meet requirements.");
			return DBController.addUniversity(universityName, state, location, control, numStudents, femalePer, verSAT,
					mathSAT, tuition, finAid, numApplicants, admitPer, enrolledPer, academicScale, socialScale,
					qoaSCale, emphasis);
		}
		else
		{
			System.out.println("Invalid University parameters or University Already exists");
			return false;
		}
	}
	
	/**
	 * Removes a university from the database by name.
	 * 
	 * @param String name of university
	 */
//	public static boolean removeUniversity(String username, String universityname) {
	//University universityToRemove = DBController.getUniversity(universityname);
		//Account.removeUniversity(universityToRemove);
////		int i = DBController.removeUniversity(username, universityname);
//		if (i == 1) {
//			return true;
	//	}
	///	else {
//			return false;
	//	}
//	}
	

	
	/**
	 * Adds the university to the blacklist.
	 */
	//public void blacklistUniversity() {
		// TODO
	//}

	/**
	 * This method is used to edit all of the information inside of a University object
	 * 
	 * @param universityName is university object name
	 * @param state is university object state
	 * @param location is university object location
	 * @param numStudents number of students in the university
	 * @param femalePer percent of female students going to university
	 * @param verSAT average Verbal SAT score for university
	 * @param mathSAT average Math SAT score for university
	 * @param tuition tuition cost for the university
	 * @param finAid financial aid for university
	 * @param numApplicants number of applicants for the university
	 * @param admitPer Percentage of applicants admitted
	 * @param enrolledPer percent of enrolled 
	 * @param academicScale the University's academic scale
	 * @param socialScale the University's Social scale
	 * @param qoaScale the University's qoa scale
	 * @param emphasis the University's emphasis on Majors
	 * @param blacklist if the school is blacklisted
	 * 
	 * @return boolean value if the school has been edited
	 */
	public static boolean editUniversityinfo(String universityName, String state, String location, String control, int numStudents,
			int femalePer, int verSAT, int mathSAT, double tuition, double finAid, double numApplicants, int admitPer,
			int enrolledPer, int academicScale, int socialScale, int qoaScale, ArrayList<String> emphasis, boolean blacklist) {
		
		University u = new University(universityName, state, location, control, numStudents, femalePer, verSAT,
				mathSAT, tuition, finAid, (int) numApplicants, admitPer, enrolledPer, academicScale, socialScale,
				qoaScale, emphasis, blacklist);
		
		boolean valid = true;
		if (u.getuniversityName().length() <= 0 || u.getuniversityName().charAt(0) == ' ')
		{
			valid = false;
			throw new UnsupportedOperationException("Must have name");
		}
		if(u.getState().length() <= 0 || u.getState().charAt(0) == ' ')
		{
			valid = false;
			throw new UnsupportedOperationException("Must enter State");
		}
		if(u.getLocation().length() <= 0 || u.getLocation().charAt(0) == ' ')
		{
			valid = false;
			throw new UnsupportedOperationException("Must enter location");
		}
		if(u.getControl().length() <= 0 || u.getControl().charAt(0) == ' ')
		{
			valid = false;
			throw new UnsupportedOperationException("Must enter Control");
		}
		if(u.getNumStudents() < 0)
		{
			valid = false;
			throw new UnsupportedOperationException("Number of students must be greater than 0");
		}
		if(u.getFemalePer() < 0 || u.getFemalePer() > 100)
		{
			valid = false;
			throw new UnsupportedOperationException("Female Percent must be between 0 - 100");
		}
		if(u.getVerSAT() < 200 || u.getVerSAT() > 800)
		{
			valid = false;
			throw new UnsupportedOperationException("Verbal SAT must be between 200 - 800");
		}
		if(u.getMathSAT() < 200 || u.getMathSAT() > 800)
		{
			valid = false;
			throw new UnsupportedOperationException("Math SAT must be between 200 - 800");
		}
		if(u.getTuition() < 0)
		{
			valid = false;
			throw new UnsupportedOperationException("Tuition must not be negative");
		}
		if(u.getFinAid() < 0)
		{
			valid = false;
			throw new UnsupportedOperationException("Financial Aid Must cannot be negative");
		}
		if(u.getNumApplicants() < 0)
		{
			valid = false;
			throw new UnsupportedOperationException("Number of applicants must not be negative");
		}
		if(u.getAdmitPer() < 0 || u.getAdmitPer() > 100)
		{
			valid = false;
			throw new UnsupportedOperationException("Admit percent must be from 0 - 100");
		}
		if(u.getEnrolledPer() < 0 || u.getEnrolledPer() > 100)
		{
			valid = false;
			throw new UnsupportedOperationException("Enrolled Percent must be from 0 - 100");
		}
		if(u.getAcademicScale() < 1 || u.getAcademicScale() > 5)
		{
			valid = false;
			throw new UnsupportedOperationException("Academic Scale must be from 1 - 5");
		}
		if(u.getSocialScale() < 1 || u.getSocialScale() > 5)
		{
			valid = false;
			throw new UnsupportedOperationException("Social Scale must be from 1 - 5");
		}
		if(u.getQoaScale() < 1 || u.getQoaScale() > 5)
		{
			valid = false;
			throw new UnsupportedOperationException("Academic Scale must be from 1 - 5");
		}
		
		UserUI.displayUniversityInfo(u);
		//DBController.addUniversity(newUniversity);
		if(valid)
		{
			System.out.println("all parameters meet requirements.");
			return DBController.updateUniversityDB(universityName, state, location, control, numStudents, femalePer, verSAT,
					mathSAT, tuition, finAid, numApplicants, admitPer, enrolledPer, academicScale, socialScale,
					qoaScale, emphasis, blacklist);
		}
		else
		{
			System.out.println("Invalid University parameters");
			return false;
		}
	}
	
}
