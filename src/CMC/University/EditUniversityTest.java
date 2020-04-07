package CMC.University;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class EditUniversityTest{
	
	ArrayList<String> emp = new ArrayList<String>();

	  @Test (expected=UnsupportedOperationException.class)
	  public void testNoLengthUniversityName(){
		  UniversityController.editUniversityinfo("", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	  }

	  @Test (expected=UnsupportedOperationException.class)
	  public void testSpaceInBeginningUniversityName(){
		  UniversityController.editUniversityinfo(" Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	  }
	  
	  @Test (expected=UnsupportedOperationException.class)
	  public void testNoLengthState(){
		  UniversityController.editUniversityinfo("Test", "", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	  }

	  @Test (expected=UnsupportedOperationException.class)
	  public void testSpaceInBeginningState(){
		  UniversityController.editUniversityinfo("Test", " MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	  }
	  
	  @Test (expected=UnsupportedOperationException.class)
	  public void testNoLengthLocation(){
		  UniversityController.editUniversityinfo("Test", "MN", "", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	  }

	  @Test (expected=UnsupportedOperationException.class)
	  public void testSpaceInBeginningLocation(){
		  UniversityController.editUniversityinfo(" Test", "MN", " Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	  }
	  
	  @Test (expected=UnsupportedOperationException.class)
	  public void testNoLengthControl(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	  }

	  @Test (expected=UnsupportedOperationException.class)
	  public void testSpaceInBeginningControl(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", " private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	  }
	  
	  @Test (expected=UnsupportedOperationException.class)
	  public void testNegativeNumStudents(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", -1, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	  }

	  @Test (expected=UnsupportedOperationException.class)
	  public void testnegativePercentFemalesl(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, -1, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	  }
	  
	  @Test (expected=UnsupportedOperationException.class)
	  public void testOver100PercentFemalesl(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 101, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	  }
	  
	  @Test (expected=UnsupportedOperationException.class)
	  public void testVerSATLessThan200(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 199, 200, 200, 1, 1, 0, 0, 1, 1, 1, emp, true);
	  }

	  @Test (expected=UnsupportedOperationException.class)
	  public void testVerSATGreaterThan800(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 801, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	  }
	  
	  @Test (expected=UnsupportedOperationException.class)
	  public void testMathSATLessThan200(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 199, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	  }

	  @Test (expected=UnsupportedOperationException.class)
	  public void testMathSATGreaterThan800(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 801, 1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	  }
	  
	  @Test (expected=UnsupportedOperationException.class)
	  public void testTuitionCostNegative(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, -1, 1, 1, 0, 0, 1, 1, 1, emp, true);
	  }

	  @Test (expected=UnsupportedOperationException.class)
	  public void testNegativeFinancialAid(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 800, 1, -1, 1, 0, 0, 1, 1, 1, emp, true);
	  }

	  @Test (expected=UnsupportedOperationException.class)
	  public void testNegativeNumApplicants(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, -1, 0, 0, 1, 1, 1, emp, true);
	  }
	  
	  @Test (expected=UnsupportedOperationException.class)
	  public void testNegativeAdmitPer(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, -1, 0, 1, 1, 1, emp, true);
	  }
	  
	  @Test (expected=UnsupportedOperationException.class)
	  public void testOver100AdmitPer(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 101, 0, 1, 1, 1, emp, true);
	  }

	  @Test (expected=UnsupportedOperationException.class)
	  public void testNegativeEnrolledPer(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, -1, 1, 1, 1, emp, true);
	  }
	  
	  @Test (expected=UnsupportedOperationException.class)
	  public void testOver100EnrolledPer(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 101, 1, 1, 1, emp, true);
	  }
	  
	  @Test (expected=UnsupportedOperationException.class)
	  public void testAcadmicScaleLessThan1(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 0, 1, 1, emp, true);
	  }
	  
	  @Test (expected=UnsupportedOperationException.class)
	  public void testAcadmicScaleGreaterThan5(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 6, 1, 1, emp, true);
	  }
	  
	  @Test (expected=UnsupportedOperationException.class)
	  public void testSocialScaleLessThan1(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 1, 0, 1, emp, true);
	  }
	  
	  @Test (expected=UnsupportedOperationException.class)
	  public void testSocialScaleGreaterThan5(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 1, 6, 1, emp, true);
	  }
	  
	  public void testQOAScaleLessThan1(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 1, 1, 0, emp, true);
	  }
	  
	  @Test (expected=UnsupportedOperationException.class)
	  public void testQOAScaleGreaterThan5(){
		  UniversityController.editUniversityinfo("Test", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 1, 1, 1, 6, emp, true);
	  }

	  @Test (expected = NullPointerException.class)
	  public void testValidParametersForNoUniversity(){
	    Assert.assertFalse("ValidParameters, but University already Exists",UniversityController.editUniversityinfo("TestFail", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true));

	    
	  }
	  
	  @Test
	  public void testValidParametersForUniversity(){
	    Assert.assertTrue("ValidParameters, but University already Exists",UniversityController.editUniversityinfo("blahblah13", "MN", "Urban", "private", 100, 10, 200, 200, 1, 1, 1, 0, 0, 1, 1, 1, emp, true));

	    
	  }
}