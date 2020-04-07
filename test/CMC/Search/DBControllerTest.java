package CMC.Search;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class DBControllerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testDbGetSavedUniversityList() {
		String userName = "juser";
		ArrayList<String> size = new ArrayList<String>();
		size.add("ad");
		
		Assert.assertEquals("userIsFound", size.size(),DBController.dbGetSavedUniversityList(userName));
		//Assert.assertEquals("userIsFound",PUT WHAT I EXPECT TO RETURN HERE, DBController)
	}

	@Test
	public void testGetAllUsers() {
		ArraryList<Account> users = new ArrayList<Account>();
		users.add(Account("John", "User", "juser", "user", 'u', 'y'));
		users.add(Account("Lynn", "User", "luser", "user", 'u', 'N'));
		users.add(Account("Noreen", "Admin", "nadmin", "admin", 'a', 'y'));
		Assert.assertEquals("Got all users", users, DBController.getAllUsers());
	}

	@Test
	public void testUpdateSavedUniversities() {
		String username = "juser";
		String uniName = "AUGSBURG";
		Assert.assertTrue("Saved university to list", updateSavedUniversities(username, uniName))
	}

}
