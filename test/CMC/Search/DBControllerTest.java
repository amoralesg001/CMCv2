package CMC.Search;
import CMC.University.University;
import CMC.University.UniversityController;
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

	public Account fakeAccount2;
	public University fakeUniv;
	ArrayList<String> emptyEmp = new ArrayList<String>();
	ArrayList<String> emp = new ArrayList<String>();
	ArrayList<String> invalidEmp = new ArrayList<String>();
	ArrayList<String> halfValid = new ArrayList<String>();

	
	@Before
	public void setUp() throws Exception {
		
		/**
		 * setup for u2: Alex
		 */
		fakeAccount= DBController.addUser("Alex", "Morales", "amoralesg001", "lakdjf", 'u');
		DBController.updateSavedUniversities(fakeAccount.getUsername(), "ADELPHI");

		fakeAccount2 = DBController.dbGetUser("juser");
		fakeUniv = DBController.dbGetUniversity("ADELPHI");
		
		invalidEmp.add("Art");
		invalidEmp.add("PHSYCHOLOGY");
		halfValid.add("Computer Science");
		halfValid.add("Art");
		emp.add("Computer Science");
		emp.add("Math");
		DBController.addUniversity("TestAddEmp", "MN", "Urban", "private", "100", "10", "200", "200", "1", "1", "1", "0", "0", "1", "1", "1", emptyEmp);
		DBController.addUniversity("TestRemove", "MN", "Urban", "private", "100", "10", "200", "200", "1", "1", "1", "0", "0", "1", "1", "1", emp);
		DBController.addUniversity("TestRemove2", "MN", "Urban", "private", "100", "10", "200", "200", "1", "1", "1", "0", "0", "1", "1", "1", emp);
		DBController.addUniversity("TestRemove3", "MN", "Urban", "private", "100", "10", "200", "200", "1", "1", "1", "0", "0", "1", "1", "1", emp);

	}

	@After
	public void tearDown() throws Exception {
		//tearDown for u2: Alex
		DBController.removeUniversity(fakeAccount.getUsername(), "ADELPHI");
		fakeAccount2 = null;
		fakeUniv = null;
		for(String s: emp)
		{
			DBController.univDBlib.university_removeUniversityEmphasis("TestRemove2", s);
			DBController.univDBlib.university_removeUniversityEmphasis("TestRemove3", s);
			DBController.univDBlib.university_removeUniversityEmphasis("TestAddEmp", s);
		}
		DBController.univDBlib.university_deleteUniversity("TestRemove");
		DBController.univDBlib.university_deleteUniversity("TestRemove2");
		DBController.univDBlib.university_deleteUniversity("TestRemove3");
		DBController.univDBlib.university_deleteUniversity("TestAddEmp");
	}
	
	@Test
	public void testDBGetUniversity() {
		String univName = "ADELPHI";
		String fakeUnivName = "asdf";
		
		Assert.assertEquals("Testing dbGetUniversity with valid university name", true, 
				(DBController.dbGetUniversity(univName) != null));
		
		Assert.assertEquals("Testing dbGetUniversity with valid university name", false, 
				(DBController.dbGetUniversity(fakeUnivName) != null));
	}
	
	@Test
	public void testDBGetUser() {
		String username = "juser";
		String invalidUsername = "asdf";
		
		Assert.assertEquals("Testing dbGetUser with valid username", true, 
				DBController.dbGetUser(username).equals(fakeAccount2));
		
		Assert.assertEquals("Testing dbGetUser with invalid username", null,
				DBController.dbGetUser(invalidUsername));
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




	/**
	 * author: alex morales
	 * white box testing for the method dbGetSavedUniversity that i use on my u2 use case:
	 * searches for saved uviversities from speciic users
	 */
	@Test
	public void testdbGetSavedUniversityList() {
	ArrayList<String> sizeA = new ArrayList<String>();
	sizeA.add("ADELPHI");

	Assert.assertTrue("users Saved universities are: ", DBController.dbGetSavedUniversityList("amoralesg001").contains(sizeA.get(0)));

	}
	
	/**
	 * author morales
	 * white box testing for the method dbsearchUniversity that i use on my u4 use case:
	 * user searches university from different criterias and the method will return the universities that match the given criterias. 
	 */
	@Test
	public void testDbSearchUniversity() {
	
	String universityName =("UNIVERSITY OF MINNESOTA");//check if it contains this


	Assert.assertTrue(DBController.dbSearchUniversity("UNIVERS", "MINN", "UR","STATE", "40000","45" ,"490", "557", "13772", "50", "8500", "80","60", "4", "3", "4", null).contains(universityName));
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
	
	@Test
	public void testRemoveEmphases() {
		ArrayList<String> dbEmp = new ArrayList<String>();
		for(String s: emp) {
			System.out.println("Valid Emphasis: " + s);
			DBController.univDBlib.university_removeUniversityEmphasis("TestRemove", s);
		}
		for (int i = 0; i < DBController.univDBlib.university_getNamesWithEmphases().length; i ++)
		{
			if (DBController.univDBlib.university_getNamesWithEmphases()[i][0].equals("TestRemove"))
			{
				System.out.println("Still in DB: " + DBController.univDBlib.university_getNamesWithEmphases()[i][1]);
				dbEmp.add(DBController.univDBlib.university_getNamesWithEmphases()[i][1]);
				
			}
		}
		Assert.assertTrue(dbEmp.size() == 0);
	}
	
	@Test
	public void testRemoveInvalidEmphases() {
		ArrayList<String> dbEmp = new ArrayList<String>();
		for(String s: invalidEmp) {
			System.out.println("Invalid Emphasis: " + s);
			DBController.univDBlib.university_removeUniversityEmphasis("TestRemove2", s);
		}
		for (int i = 0; i < DBController.univDBlib.university_getNamesWithEmphases().length; i ++)
		{
			if (DBController.univDBlib.university_getNamesWithEmphases()[i][0].equals("TestRemove2"))
			{
				System.out.println("Still in DB: " + DBController.univDBlib.university_getNamesWithEmphases()[i][1]);
				dbEmp.add(DBController.univDBlib.university_getNamesWithEmphases()[i][1]);
				
			}
		}
		Assert.assertTrue(dbEmp.size() == 2);
	}
	
	@Test
	public void testRemoveHalfValidEmphases() {
		ArrayList<String> dbEmp = new ArrayList<String>();
		for(String s: halfValid) {
			System.out.println("Half valid: " + s);
			DBController.univDBlib.university_removeUniversityEmphasis("TestRemove3", s);
		}
		for (int i = 0; i < DBController.univDBlib.university_getNamesWithEmphases().length; i ++)
		{
			if (DBController.univDBlib.university_getNamesWithEmphases()[i][0].equals("TestRemove3"))
			{
				System.out.println("Still in DB: " + DBController.univDBlib.university_getNamesWithEmphases()[i][1]);
				dbEmp.add(DBController.univDBlib.university_getNamesWithEmphases()[i][1]);
				
			}
		}
		Assert.assertTrue(dbEmp.size() == 1);
	}
	
	@Test
	public void testRemoveEmphasesInvalidUniversity() {
		ArrayList<String> dbEmp = new ArrayList<String>();
		for(String s: emp) {
			System.out.println("Valid Emphasis: " + s);
			DBController.univDBlib.university_removeUniversityEmphasis("InvalidUniversity", s);
		}
		for (int i = 0; i < DBController.univDBlib.university_getNamesWithEmphases().length; i ++)
		{
			if (DBController.univDBlib.university_getNamesWithEmphases()[i][0].equals("InvalidUniversity"))
			{
				System.out.println("Still in DB: " + DBController.univDBlib.university_getNamesWithEmphases()[i][1]);
				dbEmp.add(DBController.univDBlib.university_getNamesWithEmphases()[i][1]);
				
			}
		}
		Assert.assertTrue(dbEmp.size() == 0);
	}
	
	@Test
	public void testAddUniversityEmphasis() {
		ArrayList<String> testEmp = new ArrayList<String>();
		for(String s: emp) {
			DBController.univDBlib.university_addUniversityEmphasis("TestAddEmp", s);
		}
		for (int i = 0; i < DBController.univDBlib.university_getNamesWithEmphases().length; i ++)
		{
			if (DBController.univDBlib.university_getNamesWithEmphases()[i][0].equals("TestAddEmp"))
			{
				System.out.println("in DB: " + DBController.univDBlib.university_getNamesWithEmphases()[i][1]);
				testEmp.add(DBController.univDBlib.university_getNamesWithEmphases()[i][1]);
				
			}
		}
		Assert.assertEquals(emp, testEmp);
	}
	
	@Test
	public void testInvalidAddUniversityEmphasis() {
		ArrayList<String> testEmp = new ArrayList<String>();
		for(String s: emp) {
			DBController.univDBlib.university_addUniversityEmphasis("InvalidUniversity", s);
		}
		for (int i = 0; i < DBController.univDBlib.university_getNamesWithEmphases().length; i ++)
		{
			if (DBController.univDBlib.university_getNamesWithEmphases()[i][0].equals("TestAddEmp"))
			{
				System.out.println("in DB: " + DBController.univDBlib.university_getNamesWithEmphases()[i][1]);
				testEmp.add(DBController.univDBlib.university_getNamesWithEmphases()[i][1]);
				
			}
		}
		Assert.assertFalse(emp == testEmp);
	}
}
	


