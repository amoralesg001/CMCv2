
package CMC.Search;

import java.util.ArrayList;

import CMC.User.*;
import CMC.University.*;

public class DBController {
		private static Account account = new Account(); 

		private static User userArray[]; //should we do an array or list?  

		private static University university;
		private static University universityArray[];

		
		public static Account getAccountDB(String name, String password ) {
			return account; 
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
		public static University searchUniversity(String schoolName) {	// should return a university i assume but diagram doesnt
			for (int i = 0; i < universityArray.length; i++)
				if (universityArray[i].getuniversityName() == schoolName) {
					return universityArray[i];
				}	
			return null;
		}
		/**
		 * 
		 * @param universityName
		 * @return
		 */
		public static University addUniversity(University universityName) {//is this adding all information of a university or just on the saved list? 
			 return null; 
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
		public static University[] getAllUniversities() {	//how to return an array 
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
			return university;
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
	
