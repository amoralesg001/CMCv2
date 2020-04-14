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
}
