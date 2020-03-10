
package Search;

import java.util.ArrayList;

import User.User;
import User.Account;
import University.University;


public class DBController {
		private static Account account = new Account(); 
		private University university = new University("Saint John's University", "Minnesota", "United States", (long) 2500, 0, 0, 0, 40000, 0, 0, 0, 0, 0, 0, 0, new ArrayList<String>()); 
		private User userArray[]; //should we do an array or list?  
		private University universityArray[];
		public Account getAccountDB(String name, String password ) {
			if (account.equals("") && password.equals("")) {
				return account;
			}
			else {

				return null;
			}
			 
		}
		public University getUniversityDB(String name) {
			return university; 
		}
		public void updateUniversityDB(University universityName) {
			
			
		}
		public void updateBlackListDB(University universityName) {
			
		}
		public University searchUniversity(String schooName) {	// should return a university i assume but diagram doesnt
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
		public User[] getAllUsers() {		//how to return an array 
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
		
		public void removeUniversity(University universityName) {
			
		}
		
		public University lookUpUniversity(String universityName) {
			return university ;
		}
		public Account lookUpAccount(String accountName) {
			return account; 
		}
		public void updateProfile() {
			
		}
		public University getUniversity(String universityName) {
			return university;
		}
		
	}
	
