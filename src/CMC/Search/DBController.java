
package CMC.Search;

import java.util.ArrayList;

import CMC.User.*;
import CMC.University.*;

public class DBController {
		private static Account account = new Account(); 
<<<<<<< HEAD
		private static University university = new University("Saint John's University", "Minnesota", "United States", (long) 2500, 0, 0, 0, 40000, 0, 0, 0, 0, 0, 0, 0, new ArrayList<String>()); 
		private User userArray[]; //should we do an array or list?  
=======
		private University university = new University("Saint John's University", "Minnesota", "United States", (long) 2500, 0, 0, 0, 40000, 0, 0, 0, 0, 0, 0, 0, new ArrayList<String>()); 
		private static User userArray[]; //should we do an array or list?  
>>>>>>> 4ace9004f43502b1f85fb5ace27b5ed6a777c09f
		private University universityArray[];
		
		public static Account getAccountDB(String name, String password ) {
		return account; 
		}
		public University getUniversityDB(String name) {
			return university; 
		}
		public void updateUniversityDB(University universityName) {
			
			
		}
		public void updateBlackListDB(University universityName) {
			
		}
		public static University searchUniversity(String schooName) {	// should return a university i assume but diagram doesnt
			return university; 
		}
		public University addUniversity(String universityName) {//is this adding all information of a university or just on the saved list? 
			 return university; 
		}
		public void updateSavedUniversitys() {
		
		}
		public University[] getAllUniversitys() {	//how to return an array 
			return universityArray; 
		}
		public static User[] getAllUsers() {		//how to return an array 
			return userArray; 
		}
		public static Account getUserInfo(String username) {
			return account;
		}
		
		public void updateAccountDB(Account user) {	//would updating return an array ? 
			
		}
		
		public Account login(String username, String password) {
			return account;
		}
		
		public static void removeUniversity(University universityName) {
			
		}
		
		public University lookUpUniversity(String universityName) {
			return university ;
		}
		public static Account lookUpAccount(String accountName) {
			return account; 
		}
		public void updateProfile() {
			
		}
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
	
