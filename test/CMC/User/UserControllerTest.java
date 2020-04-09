package CMC.User;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class UserControllerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	// Testing U7: Save User Info
	// Jack
	@Test
	public void testSaveUserInfo() {
		fail("Not yet implemented");
	}
	
	@Test 
	public void testGetUserInfo() {
		String validUsername = "username";
		String password = "password";
		String firstName = "First Name";
		String lastName = "Last Name";
		String userType = "User Type";
		String loginStatus = "Login Status";
		//String invalidUsername = null;
		Account validAccount = new Account(validUsername, password, firstName, lastName, userType, loginStatus);
		Account invalidAccount = new Account(null, null, null, null, null, null);
		
		Assert.assertTrue("Testing valid account", validAccount.getUserInfo(validUsername, password) != null);
		
	}

}