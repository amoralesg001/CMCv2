package CMC.University;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import CMC.Search.DBController;
import CMC.User.Account;
import CMC.User.UserUI;
import junit.framework.Assert;

public class UniversityControllerTest {

	 ArrayList<String> emp = new ArrayList<String>();
	 ArrayList<String> emptyEmp = new ArrayList<String>();
	 ArrayList<String> invalidEmp = new ArrayList<String>();
	 
	 @Before 
	 public void setUp() throws Exception{
	  emp.add("COMPUTER SCIENCE");
	  emptyEmp.add("");
	  invalidEmp.add(" COMPUTER SCIENCE");
	 }
	 
	 @After
	 public void tearDown() throws Exception{
		DBController.univDBlib.university_deleteUniversity("Test");	
		DBController.univDBlib.university_removeUniversityEmphasis("Test7", "COMPUTER SCIENCE");
	  	DBController.univDBlib.university_deleteUniversity("Test7");
	 }
	 
//RemoveUniversityTest
	@Test
	public void testRemoveUniversity() {
		String username = "juser";
		String univName = "ADELPHI";
		Assert.assertEquals("Testing remove University with no university", false, 
				UniversityController.removeUniversity(username, univName));
		
		boolean add = UserUI.addSavedUniversities(username, univName);
		
		Assert.assertEquals("Testing remove University with the university saved in list", true, 
				UniversityController.removeUniversity(username, univName));
	}
	
//AddUniversityTest
	   @Test (expected=UnsupportedOperationException.class)
	   public void testNoLengthUniversityName(){
	    UniversityController.addUniversity("", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testSpaceInBeginningUniversityName(){
	    UniversityController.addUniversity(" Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testNoLengthState(){
	    UniversityController.addUniversity("Test", "", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testSpaceInBeginningState(){
	    UniversityController.addUniversity("Test", " MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testNoLengthLocation(){
	    UniversityController.addUniversity("Test", "MN", "", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testSpaceInBeginningLocation(){
	    UniversityController.addUniversity(" Test", "MN", " Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testNoLengthControl(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testSpaceInBeginningControl(){
	    UniversityController.addUniversity("Test", "MN", "Urban", " private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testNegativeNumStudents(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", -1, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testnegativePercentFemalesl(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", 100, -1, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testOver100PercentFemalesl(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", 100, 101, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testVerSATLessThan200(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", 100, 10, 199, 200, 200, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testVerSATGreaterThan800(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", 100, 10, 801, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testMathSATLessThan200(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", 100, 10, 200, 199, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testMathSATGreaterThan800(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", 100, 10, 200, 801, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testTuitionCostNegative(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", 100, 10, 200, 200, -1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testNegativeFinancialAid(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", 100, 10, 200, 800, 1, -1, 1, 0, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testNegativeNumApplicants(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, -1, 0, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testNegativeAdmitPer(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, -1, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testOver100AdmitPer(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 101, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testNegativeEnrolledPer(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, -1, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testOver100EnrolledPer(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 101, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testAcadmicScaleLessThan1(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 0, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testAcadmicScaleGreaterThan5(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 6, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testSocialScaleLessThan1(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 1, 0, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testSocialScaleGreaterThan5(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 1, 6, 1, emp, true);
	   }
	   
	   public void testQOAScaleLessThan1(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 1, 1, 0, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testQOAScaleGreaterThan5(){
	    UniversityController.addUniversity("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 1, 1, 6, emp, true);
	   }
	   
	   @Test (expected = UnsupportedOperationException.class)
	   public void testEmptyStringEmphasis() {
	    UniversityController.addUniversity("STANFORD", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 1, 1, 1, emptyEmp, true);
	   }
	   
	   @Test (expected = UnsupportedOperationException.class)
	   public void testEmptyCharEmphasis() {
	    UniversityController.addUniversity("STANFORD", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 1, 1, 1, invalidEmp, true);
	   }
	   
	   @Test
	   public void testValidParametersForUniversity(){
	  //University Already Exists with same name, University is not added
	     Assert.assertFalse("ValidParameters, but University already Exists",UniversityController.addUniversity("Test5", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true));
	     //For the test below, the universityName must be changed
	     Assert.assertTrue("ValidParameters, but University already Exists",UniversityController.addUniversity("Test7", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true));

	     
	   }
	   
//EditUniversityTest
	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditNoLengthUniversityName(){
	    UniversityController.editUniversityinfo("", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditSpaceInBeginningUniversityName(){
	    UniversityController.editUniversityinfo(" Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditNoLengthState(){
	    UniversityController.editUniversityinfo("Test", "", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditSpaceInBeginningState(){
	    UniversityController.editUniversityinfo("Test", " MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditNoLengthLocation(){
	    UniversityController.editUniversityinfo("Test", "MN", "", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditSpaceInBeginningLocation(){
	    UniversityController.editUniversityinfo(" Test", "MN", " Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditNoLengthControl(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditSpaceInBeginningControl(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", " private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditNegativeNumStudents(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", -1, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditnegativePercentFemalesl(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, -1, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditOver100PercentFemalesl(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 101, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditVerSATLessThan200(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 199, 200, 200, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditVerSATGreaterThan800(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 801, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditMathSATLessThan200(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 199, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditMathSATGreaterThan800(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 801, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditTuitionCostNegative(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, -1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditNegativeFinancialAid(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 800, 1, -1, 1, 0, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditNegativeNumApplicants(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, -1, 0, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditNegativeAdmitPer(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, -1, 0, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditOver100AdmitPer(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 101, 0, 1, 1, 1, emp, true);
	   }

	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditNegativeEnrolledPer(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, -1, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditOver100EnrolledPer(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 101, 1, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditAcadmicScaleLessThan1(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 0, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditAcadmicScaleGreaterThan5(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 6, 1, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditSocialScaleLessThan1(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 1, 0, 1, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditSocialScaleGreaterThan5(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 1, 6, 1, emp, true);
	   }
	   
	   public void testEditQOAScaleLessThan1(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 1, 1, 0, emp, true);
	   }
	   
	   @Test (expected=UnsupportedOperationException.class)
	   public void testEditQOAScaleGreaterThan5(){
	    UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 1, 1, 6, emp, true);
	   }
	   
	   @Test (expected = UnsupportedOperationException.class)
	   public void testEditEmptyStringEmphasis() {
	    UniversityController.editUniversityinfo("STANFORD", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 1, 1, 1, emptyEmp, true);
	   }
	   
	   @Test (expected = UnsupportedOperationException.class)
	   public void testEditEmptyCharEmphasis() {
	    UniversityController.editUniversityinfo("STANFORD", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 1, 1, 1, invalidEmp, true);
	   }
	   
	   @Test
	   public void testUniversityNameWithEmphasis() {
	    String universityName = "ADELPHI";
	    System.out.println(universityName + " emphases are:");
	   for (int i = 0; i < DBController.univDBlib.university_getNamesWithEmphases().length; i ++)
	   {
	    if (DBController.univDBlib.university_getNamesWithEmphases()[i][0].equals(universityName))
	    {
	     System.out.println(DBController.univDBlib.university_getNamesWithEmphases()[i][1]);
	     
	    }
	   }
	   }

	   @Test (expected = NullPointerException.class)
	   public void testValidParametersForNoUniversity(){
	     Assert.assertFalse("ValidParameters, but University does NOT Exists",UniversityController.editUniversityinfo("TestFail", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true));

	     
	   }
	   
	   @Test
	   public void testEditValidParametersForUniversity(){
	     Assert.assertTrue("ValidParameters",UniversityController.editUniversityinfo("Test5", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true)); 
	   }

}
