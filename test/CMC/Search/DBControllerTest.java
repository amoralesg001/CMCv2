package CMC.Search;


import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import CMC.User.Account;
import junit.framework.Assert;

public class DBControllerTest {
    Account fakeAccount;//instance for Alex in tear down
	@Before
	public void setUp() throws Exception {
		
	//setup for U2: Alex 
	fakeAccount= DBController.addUser("Alex", "Morales", "amoralesg001", "lakdjf", 'u');
	DBController.updateSavedUniversities(fakeAccount.getUsername(), "ADELPHI");
	
	}

	@After
	public void tearDown() throws Exception {
		
	//tearDown for u2: Alex
	DBController.removeUniversity(fakeAccount.getUsername(), "ADELPHI");
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void testdbGetSavedUniversityList() {
	ArrayList<String> sizeA = new ArrayList<String>();
	sizeA.add("");
	
	Assert.assertEquals(sizeA.size()==1, DBController.dbGetSavedUniversityList("amoralesg001"));
	//Assert.assertEquals("userIsFound",PUT WHAT I EXPECT TO RETURN HERE, DBController)
		
	}
	
	@Test
	public void testDbSearchUniversity() {

	}

	@Test
	public void testGetAllUsers() {
		ArrayList<Account> users = new ArrayList<Account>();
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
