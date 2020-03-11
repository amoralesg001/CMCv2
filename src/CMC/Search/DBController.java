
package CMC.Search;

import java.util.ArrayList;

import CMC.User.*;
import CMC.University.*;

public class DBController {
		private static Account account = new Account(); 
<<<<<<< HEAD
<<<<<<< HEAD
		private static University university = new University("Saint John's University", "Minnesota", "United States", (long) 2500, 0, 0, 0, 40000, 0, 0, 0, 0, 0, 0, 0, new ArrayList<String>()); 
		private User userArray[]; //should we do an array or list?  
=======
		private University university = new University("Saint John's University", "Minnesota", "United States", (long) 2500, 0, 0, 0, 40000, 0, 0, 0, 0, 0, 0, 0, new ArrayList<String>()); 
=======
		private static University university = new University("Saint John's University", "Minnesota", "United States", (long) 2500, 0, 0, 0, 40000, 0, 0, 0, 0, 0, 0, 0, new ArrayList<String>()); 
>>>>>>> 19d96e3d8b6c9df77e6acdc0587a37595b98a055
		private static User userArray[]; //should we do an array or list?  
>>>>>>> 4ace9004f43502b1f85fb5ace27b5ed6a777c09f
		private University universityArray[];
		
		public static Account getAccountDB(String name, String password ) {
			return account; 
		}
		/**
		 * 
		 * @param name
		 * @return
		 */
		public University getUniversityDB(String name) {
			return university; 
		}
		/**
		 * 
		 * @param universityName
		 */
		public void updateUniversityDB(University universityName) {
			
			
		}
		/**
		 * 
		 * @param universityName
		 */
		public void updateBlackListDB(University universityName) {
			
		}
		/**
		 * 
		 * @param schooName
		 * @return
		 */
		public static University searchUniversity(String schooName) {	// should return a university i assume but diagram doesnt
			return university; 
		}
		/**
		 * 
		 * @param universityName
		 * @return
		 */
		public University addUniversity(University universityName) {//is this adding all information of a university or just on the saved list? 
			 return university; 
		}
		/**
		 * 
		 */
		public void updateSavedUniversitys() {
		
		}
		/**
		 * 
		 * @return
		 */
		public University[] getAllUniversitys() {	//how to return an array 
			return universityArray; 
		}
		/**
		 * 
		 * @return
		 */
		public static User[] getAllUsers() {		//how to return an array 
			return userArray; 
		}
		/**
		 * 
		 * @param username
		 * @return
		 */
		public static Account getUserInfo(String username) {
			return account;
		}

		/**
		 * Updates the account in the database.
		 * @param user
		 */
		public static void updateAccountDB(Account user) {	//would updating return an array ? 
			//TODO @Jack once we have the actual database
		}
		/**
		 * 
		 * @param username
		 * @param password
		 * @return
		 */
		public Account login(String username, String password) {
			return account;
		}

		/**
		 * 
		 * @param universityName
		 */
		public static void removeUniversity(University universityName) {
			
		}
		/**
		 * 
		 * @param universityName
		 * @return
		 */
		public University lookUpUniversity(String universityName) {
			return university ;
		}
		/**
		 * 
		 * @param accountName
		 * @return
		 */
		public static Account lookUpAccount(String accountName) {
			return account; 
		}
		/**
		 * 
		 */
		public void updateProfile() {
			
		}
		/**
		 * 
		 * @param universityName
		 * @return
		 */
		public static University getUniversity(String universityName) {
			return university;
		}
		/**
		 * this method returns an account to be used in UserController
		 * @param username
		 * @return account of the username
		 */
		public static Account getSavedUniversityList(String username) {
			return account;
		}
		
	}
	
