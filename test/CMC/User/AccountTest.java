package CMC.User;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import CMC.Search.DBController;
import junit.framework.Assert;

public class AccountTest {
	
	public Account testAccount;

	@Before
	public void setUp() throws Exception {
		testAccount = DBController.getAccountDB2("jyoung001");
	}

	@After
	public void tearDown() throws Exception {
		UserController.saveUserInfo("jyoung001", "abcd1234", "Jack", "Young");
	}
	
	@Test
	public void testGetUsername() {
		String username = "jyoung001";
		Assert.assertTrue(testAccount.getUsername().equals(username));
	}
	
	@Test
	public void testGetPassword() {
		String password = "abcd1234";
		Assert.assertTrue(testAccount.getPassword().equals(password));
	}
	
	@Test
	public void testGetFirstName() {
		String firstName = "Jack";
		Assert.assertTrue(testAccount.getFirstName().equals(firstName));
	}
	
	@Test
	public void testGetLastName() {
		String lastName = "Young";
		Assert.assertTrue(testAccount.getLastName().equals(lastName));
	}
	
	@Test
	public void testGetUserType() {
		String userType = "u";
		Assert.assertTrue(testAccount.getUserType().equals(userType));
	}
	
	@Test
	public void testGetLoginStatus() {
		String loginStatus = "Y";
		Assert.assertTrue(testAccount.getLoginStatus().equals(loginStatus));
	}
	
	@Test
	public void testUpdateAccountInfo() {
		String originalUsername = "jyoung001";
		String originalPassword = "abcd1234";
		String originalFirstName = "Jack";
		String originalLastName = "Young";
		testAccount.updateAccountInfo("jyoung001", "newPassword", "newFirstName", "Young", "u", "Y");
		Assert.assertFalse(testAccount.getPassword().equals(originalPassword));
		Assert.assertFalse(testAccount.getFirstName().equals(originalFirstName));
		Assert.assertTrue(testAccount.getLastName().equals(originalLastName));
	}

	@Test
	public void testGetUserInfo() {
		Account userInfo = testAccount.getUserInfo("jyoung001", "abcd1234");
		Assert.assertTrue(userInfo.getFirstName().equals(testAccount.getFirstName()));
		Assert.assertFalse(!userInfo.getLastName().equals(testAccount.getLastName()));
		Assert.assertTrue(userInfo.getUserType().equals(testAccount.getUserType()));
	}
	
	@Test
	public void testGetUserInfo2() {
		Account userInfo = testAccount.getUserInfo2("jyoung001");
		Assert.assertTrue(userInfo.getFirstName().equals(testAccount.getFirstName()));
		Assert.assertFalse(!userInfo.getLastName().equals(testAccount.getLastName()));
		Assert.assertTrue(userInfo.getUserType().equals(testAccount.getUserType()));
	}

}
