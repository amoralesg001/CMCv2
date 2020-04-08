package CMC.University;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

import CMC.Search.DBController;
import junit.framework.Assert;
import junit.framework.TestCase;

public class TestAddUniversity  {
	
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
		DBController.univDBlib.university_removeUniversityEmphasis("Test7", "COMPUTER SCIENCE");
		DBController.univDBlib.university_deleteUniversity("Test7");
	}

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
}
