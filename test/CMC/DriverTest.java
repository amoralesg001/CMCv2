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
		//tear down for u2: alex
		DBController.removeUniversity(fakeAccount.getUsername(), "ADELPHI");
		DBController.removeUniversity(fakeAccount.getUsername(), "UNIVERSITY OF M4INNESOTA");
	}	
	
	/**
	 * @alex morales
	 * black box testing for use case 2: displaying the saved universities of a specific user. 
	 * 
	 * in the code: i show the different scenerios and their outputs with comments alongside them
	 */
	@Test
	public void testu2() {
		ArrayList<String> savedUniversities = new ArrayList();
		savedUniversities.add("ADELPHI");
		savedUniversities.add("UNIVERSITY OF MINNESOTA");
		//existing user with saved schools under their account. I checked if both were there. 
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

	/**
	 * @author alex morales
	 * black box testing for my use case method u4: 
	 * User inputs multiple criterias to search from that match universities in the database
	 * 
	 * I describe the different scenerios// inputs below. 
	 * I also talked to peter, realizing that it would be ALOT of testing if I showed all the scerios of the universitySearch and he said i dont need to go one by one.
	 * Instead, I just need to show a scenerio of all the criterias being correct, and all the criterias being incorrect.
	 * . If the user has just one of their muliple criterias incorrect in their input, the university will not be found.
	 * ex. if the user puts in the name, location, control, but does input state corrects, the university will not be found. 
	 */

	@Test
	public void testu4() {
	ArrayList<String> universitySearch = new ArrayList();
	universitySearch.add("UNIVERSITY OF MINNESOTA");
	
	//scenerio 1: Search of university critera found. what should be returned is university of minnesota AND only that. So i checked if size was 1
	Assert.assertTrue("universities with the following criteria:", UserUI.searchUniversity("", "NEW YORK", "","","8000","","50","","600","650","600","","30000","","50","70", "3000","5000" ,"50", "61", "10", "30", "3", "5","2", "5", "3", "5", null).contains(universitySearch.get(0)));
	Assert.assertTrue("universities with the following criteria:", UserUI.searchUniversity("", "NEW YORK", "","","8000","","50","","600","650","600","","30000","","50","70", "3000","5000" ,"50", "61", "10", "30", "3", "5","2", "5", "3", "5", null).size()==1);
	
	//scenerio 2: Search of university criteria not found
	Assert.assertTrue("no universitties found with that criteria:", UserUI.searchUniversity("", "NEW YORK", "","","8000","","50","","600","650","600","","30000","","50","70", "3000","5000" ,"50", "61", "10", "30", "3", "5","2", "5", "3", "5",null).size()==0);
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


