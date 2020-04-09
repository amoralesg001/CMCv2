package CMC.University;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import CMC.Search.DBController;
import CMC.User.Account;
import junit.framework.Assert;

public class UniversityTest {
	
		public University universityTest;
		@Before
		public void setUp() throws Exception {
			//testing university methods: Alex
			universityTest = new University("Alex University", "Alex State", "SC", "Public", 100, 50, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, null, true);
			
		}

		@After
		public void tearDown() throws Exception {
			
			
		}
		
		@Test
		public void testGetUniversityName() {
			Assert.assertEquals("Alex University", universityTest.getuniversityName());
		}
		
		@Test
		public void testGetState() {
			Assert.assertEquals("Alex State", universityTest.getState());
		}
		
		@Test
		public void testGetLocation() {
			Assert.assertEquals("SC", universityTest.getLocation());
		}
		
		@Test
		public void testGetControl() {
			Assert.assertEquals("Public", universityTest.getControl());
		}
		
		@Test
		public void testGetNumStudents() {
			Assert.assertEquals(100, universityTest.getNumStudents());
		}
		
		@Test
		public void testGetFemalePer() {
			Assert.assertEquals(50.0, universityTest.getFemalePer());
		}
		
		@Test
		public void testGetVerbSAT() {
			Assert.assertEquals(101.0, universityTest.getVerSAT());
		}
		
		@Test
		public void testGetMathSAT() {
			Assert.assertEquals(102.0, universityTest.getMathSAT());
		}
		
		@Test
		public void testGetTuition() {
			Assert.assertEquals(103.0, universityTest.getTuition());
		}
		
		@Test
		public void testGetFinAid() {
			Assert.assertEquals(104.0, universityTest.getFinAid());
		}
		
		@Test
		public void testGetNumApplicants() {
			Assert.assertEquals(105.0, universityTest.getNumApplicants());
		}
		
		@Test
		public void testGetAdmitPer() {
			Assert.assertEquals(106.0, universityTest.getAdmitPer());
		}
		
		@Test
		public void testGetEnrolledPer() {
			Assert.assertEquals(107.0, universityTest.getEnrolledPer());
		}
		
		@Test
		public void testGetAcademicScale() {
			Assert.assertEquals(108, universityTest.getAcademicScale());
		}
		
		@Test
		public void testGetSocialScale() {
			Assert.assertEquals(109, universityTest.getSocialScale());
		}
		
		@Test
		public void testQoaScale() {
			Assert.assertEquals(110, universityTest.getQoaScale());
		}
		
		@Test
		public void testGetEmphasis() {
			Assert.assertEquals(null, universityTest.getEmphasis());
		}
		
		

}
