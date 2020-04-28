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
			universityTest = new University("Alex University", "Alex State", "SC", "Public", "100", "50", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", null, true);
			
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
			Assert.assertEquals(true, universityTest.getNumStudents().equals("100"));
		}
		
		@Test
		public void testGetFemalePer() {
			Assert.assertEquals(true, universityTest.getFemalePer().equals("50"));
		}
		
		@Test
		public void testGetVerbSAT() {
			Assert.assertEquals(true, universityTest.getVerSAT().equals("101"));
		}
		
		@Test
		public void testGetMathSAT() {
			Assert.assertEquals(true, universityTest.getMathSAT().equals("102"));
		}
		
		@Test
		public void testGetTuition() {
			Assert.assertEquals(true, universityTest.getTuition().equals("103"));
		}
		
		@Test
		public void testGetFinAid() {
			Assert.assertEquals(true, universityTest.getFinAid().equals("104"));
		}
		
		@Test
		public void testGetNumApplicants() {
			Assert.assertEquals(true, universityTest.getNumApplicants().equals("105"));
		}
		
		@Test
		public void testGetAdmitPer() {
			Assert.assertEquals(true, universityTest.getAdmitPer().equals("106"));
		}
		
		@Test
		public void testGetEnrolledPer() {
			Assert.assertEquals(true, universityTest.getEnrolledPer().equals("107"));
		}
		
		@Test
		public void testGetAcademicScale() {
			Assert.assertEquals(true, universityTest.getAcademicScale().equals("108"));
		}
		
		@Test
		public void testGetSocialScale() {
			Assert.assertEquals(true, universityTest.getSocialScale().equals("109"));
		}
		
		@Test
		public void testQoaScale() {
			Assert.assertEquals(true, universityTest.getQoaScale().equals("110"));
		}
		
		@Test
		public void testGetEmphasis() {
			Assert.assertEquals(null, universityTest.getEmphasis());
		}
		
		@Test
		public void testSetBlackList() {
			universityTest.setBlacklist(true);
			Assert.assertTrue(universityTest.isBlacklisted() == "Yes");
		}
		
		@Test
		public void testSetBlackListFalse() {
			universityTest.setBlacklist(false);
			Assert.assertTrue(universityTest.isBlacklisted() == "No");
		}

}
