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
		
	//setup for U2: Alex 
	boolean set1 = DBController.updateSavedUniversities("juser","blahblah");
	boolean set2 = DBController.updateSavedUniversities("juser","blahblah13");
	boolean set3 = DBController.updateSavedUniversities("juser","waer2");
	
	}

	@After
	public void tearDown() throws Exception {
		
	//tearDown for u2: Alex
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
<<<<<<< HEAD
	public void testdbGetSavedUniversityList() {
	ArrayList<String> sizeA = new ArrayList<String>();
	sizeA.add("");
	sizeA.add("");
	sizeA.add("");
	sizeA.add("");
	Assert.assertEquals(sizeA.size()==3, DBController.dbGetSavedUniversityList("juser"));
	//Assert.assertEquals("userIsFound",PUT WHAT I EXPECT TO RETURN HERE, DBController)
=======
	public void testDbGetSavedUniversityList() {
		String userName = "juser";
		ArrayList<String> size = new ArrayList<String>();
		size.add("ad");
>>>>>>> e6741b02f6e8b4a7f207de0e577316c6b66b0ba7
		
	}
	
	@Test
	public void testDbSearchUniversity() {

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
