package CMC;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import CMC.Search.DBController;
import CMC.University.UniversityController;
import CMC.User.Account;
import CMC.User.UserUI;
import junit.framework.Assert;

public class DriverTest {
	public Account fakeAccount;
	@Before
	public void setUp() throws Exception {
		//setup for u2: Alex
		fakeAccount= DBController.addUser("Alex", "Morales", "amoralesg001", "lakdjf", 'u');
		DBController.updateSavedUniversities(fakeAccount.getUsername(), "ADELPHI");
		DBController.updateSavedUniversities(fakeAccount.getUsername(), "UNIVERSITY OF MINNESOTA");
		
	}

	@After
	public void tearDown() throws Exception {
		DBController.removeUniversity(fakeAccount.getUsername(), "ADELPHI");
		DBController.removeUniversity(fakeAccount.getUsername(), "UNIVERSITY OF M4INNESOTA");
	}		

	@Test
	public void testu2() {
		ArrayList<String> savedUniversities = new ArrayList();
		savedUniversities.add("ADELPHI");
		savedUniversities.add("UNIVERSITY OF MINNESOTA");
		//existing user with saved schools under their account
		Assert.assertTrue("Users Saved Schools are", UserUI.getSavedUniversityList(fakeAccount.getUsername()).contains(savedUniversities.get(0)));
		Assert.assertTrue("Users Saved Schools are", UserUI.getSavedUniversityList(fakeAccount.getUsername()).contains(savedUniversities.get(1)));
		//deleting account to check other scenerios
		DBController.removeUniversity(fakeAccount.getUsername(), "ADELPHI");
		DBController.removeUniversity(fakeAccount.getUsername(), "UNIVERSITY OF MINNESOTA");
		//user that has no saved universitiies under their account
		Assert.assertTrue("User has no saved schools under account", UserUI.getSavedUniversityList(fakeAccount.getUsername()) == null);
		//user that does not exist
		String userName = "amoralesQ001";
		Assert.assertTrue("User has no saved schools or is not an existing member", UserUI.getSavedUniversityList(userName)== null);
			
	}
	
	
	@Test 
	public void u3() {
		Assert.assertTrue("Testing valid account", UserUI.getUserInfo("juser", "user"));
		Assert.assertFalse("Testing invalid account", UserUI.getUserInfo("luser", "user"));
		Assert.assertTrue("Testing valid admin account", UserUI.getUserInfo("nadmin", "admin"));
	}
	
	//test case u4: Alex
	@Test
	public void testu4() {
	ArrayList<String> universitySearch = new ArrayList();
	universitySearch.add("UNIVERSITY OF MINNESOTA");
	
	//scenerio 1: Search of university critera found
	Assert.assertTrue("universities with the following criteria:", UserUI.searchUniversity("UNIVERS", "MINN", "","STATE", "40000","45" ,"490", "557", "13772", "50", "8500", "80","60", "4", "3", "4", null).size()==1);
	
	//scenerio 2: Search of university criteria not found
	Assert.assertTrue("no universitties found with that criteria:", UserUI.searchUniversity("UNIVERSLKAJ", "MINN", "UR","STATE", "40000","45" ,"490", "557", "13772", "50", "850900", "1380","60", "4", "3", "4", null).size()==0);
	}
	
	
	@Test
	public void u6() {
		String username = "juser";
		String univName = "UNIVERSITY OF MINNESOTA";
		Assert.assertEquals("Testing remove University with no university", 0, 
				UniversityController.removeUniversity(username, univName));
		
		boolean add = UserUI.addSavedUniversities(username, univName);
		
		Assert.assertEquals("Testing remove University with the university saved in list", 1, 
				UniversityController.removeUniversity(username, univName));
		
		String invalidUsername = "asdf";
		
		Assert.assertEquals("Testing remove University with an invalid username", 2, 
				UniversityController.removeUniversity(invalidUsername, univName));		
	}
}


