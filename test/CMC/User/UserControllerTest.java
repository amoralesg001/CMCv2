package CMC.User;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class UserControllerTest {
	public Account validAccount;
	public String validUsername;
	public String password;
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
	}

	@After
	public void tearDown() throws Exception {
		validAccount = null;
	}

	// Testing U7: Save User Info
	// Jack
	@Test
	public void testSaveUserInfo() {
		fail("Not yet implemented");
	}
	
	@Test 
	public void testGetUserInfo() {
		Assert.assertTrue("Testing valid account", validAccount.getUserInfo(validUsername, password) != null);
		
	}

}