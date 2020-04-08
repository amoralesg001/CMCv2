package CMC.Search;


import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import CMC.University.University;
import CMC.User.Account;
import junit.framework.Assert;

public class DBControllerTest {
    Account fakeAccount;//instance for Alex in tear down
	@Before
	public void setUp() throws Exception {
		
	//setup for U2: Alex 
	fakeAccount= DBController.addUser("Alex", "Morales", "amoralesg001", "lakdjf", 'u');
	DBController.updateSavedUniversities(fakeAccount.getUsername(), "ADELPHI");
	//setup for u4: Alex
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
	
	//testing for my u2: Alex
	@Test
	public void testdbGetSavedUniversityList() {
	ArrayList<String> sizeA = new ArrayList<String>();
	sizeA.add("ADELPHI");
	Assert.assertTrue(DBController.dbGetSavedUniversityList("amoralesg001").contains(sizeA.get(0)));
	//Assert.assertEquals(sizeA.size()==1, DBController.dbGetSavedUniversityList("amoralesg001"));
	//Assert.assertEquals("userIsFound",PUT WHAT I EXPECT TO RETURN HERE, DBController)
		
	}
	
	//testing my u4: Alex
	@Test
	public void testDbSearchUniversity() {
	ArrayList<String> searchesFound = new ArrayList<String>();
	searchesFound.add("UNIVERSITY OF MINNESOTA");//check if it contains this
	
	University uniTest1= new University("UNIVERSITY OF MINNESOTA", "", "", "", 40000, 45, -1, -1, -1, -1, -1, -1, -1, -1, 3, 4, null, false);
	
	//Assert.assertEquals(DBController.dbSearchUniversity(uniTest1).contains(uniTest1.getuniversityName()),DBController.dbSearchUniversity(uniTest1));
	Assert.assertTrue(DBController.dbSearchUniversity(uniTest1).contains(uniTest1.getuniversityName()));
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

	
	
	
	
	//Testing U1: Login
	//Nick
	@Test
	public void testGetAccountDB() {
		String username = "juser";
		String password = "user";
		
		String wrongUsername = "juserr"
		String wrongPassword = "userr"
		
		Account testAccount  = DBController.getAccountDB(username, password);
		Account testWrongUsername = DBController.getAccountDB(wrongUsername, password);
		Account testWrongPassword = DBController.getAccountDB(username, wrongPassword);
		
		Assert.assertTrue((testAccount.getUsername() == juser) && testAccount.getPassword() == password);
		Assert.assertTrue(testWrongUsername.getUsername() == null);
		Assert.assertTrue(testWrongPassword.getPassword() == null);
	}
}
