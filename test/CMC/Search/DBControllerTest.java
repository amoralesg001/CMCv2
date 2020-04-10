package CMC.Search;
import CMC.University.University;
import CMC.User.*;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import CMC.User.UserUI;
import junit.framework.Assert;

public class DBControllerTest {
	public Account fakeAccount;
	@Before
	public void setUp() throws Exception {
		
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
	public void testRemoveUniversity() {
		String username = "juser";
		String univName = "ADELPHI";
		Assert.assertEquals("Testing remove University with no university", 0, 
				DBController.removeUniversity(username, univName));
		
		boolean add = UserUI.addSavedUniversities(username, univName);
		
		Assert.assertEquals("Testing remove University with the university saved in list", 1, 
				DBController.removeUniversity(username, univName));
	}


	//Testing U1: Login
	//Nick
	@Test
	public void testGetAccountDB() {
		String username = "juser";
		String password = "user";

		String wrongUsername = "juserr";
		String wrongPassword = "userr";

		Account testAccount  = DBController.getAccountDB(username, password);
		//Account testWrongUsername = DBController.getAccountDB(wrongUsername, password);
		//Account testWrongPassword = DBController.getAccountDB(username, wrongPassword);
		Assert.assertTrue((testAccount.getUsername().equals(username)) && testAccount.getPassword().equals(password));
		//Assert.assertTrue(DBController.getAccountDB(wrongUsername, password).equals(null));
		//Assert.assertTrue(testWrongPassword.getPassword() == null
	}




	//testing for my u2: Alex
	@Test
	
	public void testdbGetSavedUniversityList() {
	ArrayList<String> sizeA = new ArrayList<String>();
	sizeA.add("ADELPHI");

	Assert.assertTrue("users Saved universities are: ", DBController.dbGetSavedUniversityList("amoralesg001").contains(sizeA.get(0)));

	}
	
	@Test
	public void testDbSearchUniversity() {
	
	String universityName =("UNIVERSITY OF MINNESOTA");//check if it contains this


	Assert.assertTrue(DBController.dbSearchUniversity("UNIVERSITY OF MINNESOTA", "", "", "", "40000", "45", "", "", "", "", "", "", "", "", "", "", null).contains(universityName));
	}
	
	// Testing U7: Edit User Info && Activate/Deactivate: changeStatus
	// Jack
	@Test
	public void testGetAccountDB2() {
		// Setup: corrrect and incorrect username variables for the test
		String correctUsername = "luser";
		String incorrectUsername = "lynnuser";
		// Setup: Account objects for the test
		Account testCorrectUsername = DBController.getAccountDB2(correctUsername);
		Account testIncorrectUsername = DBController.getAccountDB2(incorrectUsername);
		// Test: correctUsername should return the correct user object
		Assert.assertFalse(testCorrectUsername.getUsername() == correctUsername); // should be true
		Assert.assertFalse(testCorrectUsername.getFirstName() == "Lynn"); // should be true
		Assert.assertFalse(testCorrectUsername.getLoginStatus() == "N"); // should be true
		// Test: incorrectUsername should return an account object with all 'null' information
		Assert.assertTrue(testIncorrectUsername.getUsername() == null);
		Assert.assertTrue(testIncorrectUsername.getFirstName() == null);
		Assert.assertFalse(testIncorrectUsername.getLoginStatus() == "N");
	}
	// Testing U9: get all users

	@Test
	public void testGetAllUsers() {
		ArrayList<Account> users = new ArrayList<Account>();
		Account juser = new Account("John", "User", "juser", "user", "u", "y");
		users.add(juser);
		Account luser = new Account("Lynn", "User", "luser", "user", "u", "N");
		users.add(luser);
		Account nadmin = new Account("Noreen", "Admin", "nadmin", "admin", "a", "y");
		users.add(nadmin);
		Assert.assertEquals("Got all users", users, DBController.getAllUsers());
	}
	// testing u10: save university

	@Test
	public void testUpdateSavedUniversities() {
		String username = "juser";
		String uniName = "ADELPHI";
		Assert.assertTrue("Saved university to list", DBController.updateSavedUniversities(username, uniName));
	}
}
	


