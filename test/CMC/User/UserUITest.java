package CMC.User;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import CMC.Search.DBController;
import CMC.University.University;
import junit.framework.Assert;

public class UserUITest {
	public University fakeUniv;
	@Before
	public void setUp() throws Exception {
		fakeUniv = DBController.dbGetUniversity("UNIVERSITY OF MINNESOTA");
	}

	@After
	public void tearDown() throws Exception {
		fakeUniv = null;
	}

	@Test
	public void testDisplayUniversityInfo() {
		String fakeUnivName = "asdf";
		University fakeUniversity = DBController.dbGetUniversity(fakeUnivName);
		Assert.assertEquals("Testing displayUniversityInfo with valid university", true, 
				(UserUI.displayUniversityInfo(fakeUniv)));
		
		Assert.assertEquals("Testing displayUniversityInfo with invalid university", false, 
				(UserUI.displayUniversityInfo(fakeUniversity)));
	}
	
	@Test
	public void testLogin() {
		//Test for regular user
		Assert.assertTrue(UserUI.login("juser", "user"));
		//Test for admin
		Assert.assertTrue(UserUI.login("nadmin", "admin"));
		//Test for blocked user
		Assert.assertFalse(UserUI.login("luser", "user"));
	}
	
	@Test
	public void testGetUserInfo() {
		//Test for regular user
		Assert.assertTrue(UserUI.getUserInfo("juser", "user"));
		//Test for admin		
		Assert.assertTrue(UserUI.getUserInfo("nadmin", "admin"));
		//Test for regular user
		Assert.assertFalse(UserUI.getUserInfo("luser", "user"));
		
	}
}
