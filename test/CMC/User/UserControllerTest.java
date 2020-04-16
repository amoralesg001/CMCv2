package CMC.User;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import CMC.Search.DBController;
import junit.framework.Assert;

public class UserControllerTest {

	public Account validAccount;
	public String validUsername;
	public String password;
	public Account testAccount;
	
	@Before
	public void setUp() throws Exception {
		String validUsername = "username";
		String password = "password";
		String firstName = "First Name";
		String lastName = "Last Name";
		String userType = "User Type";
		String loginStatus = "Login Status";
		//String invalidUsername = null;
		Account validAccount = new Account(validUsername, password, firstName, lastName, userType, loginStatus);
		Account invalidAccount = new Account(null, null, null, null, null, null);
		testAccount = DBController.addUser("Jack", "Young", "jyoung001", "abcd1234", 'u');
	}

	@After
	public void tearDown() throws Exception {
		validAccount = null;
		UserController.saveUserInfo("jyoung001", "abcd1234", "Jack", "Young");

	}

	// Testing U7: Save User Info
	// Jack
	@Test
	public void testSaveUserInfo() {
		Account savedAccount = UserController.saveUserInfo("jyoung001", "newPassword", "newFirstName", "Young");
		Assert.assertFalse(savedAccount.getPassword().equals(this.testAccount.getPassword()));
		Assert.assertTrue(!this.testAccount.getFirstName().equals(savedAccount.getFirstName()));
		Assert.assertTrue(this.testAccount.getLastName().equals(savedAccount.getLastName()));
	}
	
	@Test 
	public void testGetUserInfo() {
		//Assert.assertTrue("Testing valid account", UserUI.getUserInfo("juser", "user"));
		
	}

}