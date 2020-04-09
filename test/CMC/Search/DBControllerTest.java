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
<<<<<<< HEAD
	
	
	//Testing U1: Login
	//Nick
	@Test
	public void testGetAccountDB() {
		String username = "juser";
		String password = "user";

		String wrongUsername = "juserr";
		String wrongPassword = "userr";

		Account testAccount  = DBController.getAccountDB(username, password);
		Account testWrongUsername = DBController.getAccountDB(wrongUsername, password);
		Account testWrongPassword = DBController.getAccountDB(username, wrongPassword);

		Assert.assertTrue((testAccount.getUsername() == "juser") && testAccount.getPassword() == password);
		Assert.assertTrue(testWrongUsername.getUsername() == null);
		Assert.assertTrue(testWrongPassword.getPassword() == null);
	}
 
}
=======

	//testing for my u2: Alex
	@Test
	
	public void testdbGetSavedUniversityList() {
	ArrayList<String> sizeA = new ArrayList<String>();
	

	sizeA.add("ADELPHI");

	Assert.assertTrue(DBController.dbGetSavedUniversityList("amoralesg001").contains(sizeA.get(0)));

	}
	
	@Test
	public void testDbSearchUniversity() {
	ArrayList<String> searchesFound = new ArrayList<String>();
	
	searchesFound.add("UNIVERSITY OF MINNESOTA");//check if it contains this

	University uniTest1= new University("UNIVERSITY OF MINNESOTA", "", "", "", 40000, 45, -1, -1, -1, -1, -1, -1, -1, -1, 3, 4, null, false);





	Assert.assertTrue(DBController.dbSearchUniversity(uniTest1).contains(uniTest1.getuniversityName()));
	}
	
	}
	


>>>>>>> 20886e53e221351877e21861eba1e67a4687f47a
