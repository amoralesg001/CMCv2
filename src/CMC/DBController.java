
	package CMC;

import java.util.ArrayList;

public class DBController {
		private Account account = new Account(); 
		private School university = new School("Saint John's University", "Minnesota", "United States", (long) 2500, 0, 0, 0, 40000, 0, 0, 0, 0, 0, 0, 0, new ArrayList<String>()); 
		private User userArray[]; //should we do an array or list?  
		private School schoolArray[];
		private String userName;
		
		public Account getAccountDB(String name, String password ) {
			if (account.equals("") && password.equals("")) {
				return account;
			}
			else {

				return null;
			}
			 
		}
		public School getUniversityDB(String name) {
			return university; 
		}
		public void updateUniversityDB(School schoolName) {
			
			
		}
		public void updateBlackListDB(School schoolName) {
			
		}
		public School searchSchool(String schooName) {	// should return a school i assume but diagram doesnt
			return university; 
		}
		public School addSchool(String schoolName) {//is this adding all information of a school or just on the saved list? 
		return university; 
		}
		public void updateSavedSchools() {
		
		}
		public School[] getAllSchools() {	//how to return an array 
			return schoolArray; 
		}
		public User[] getAllUsers() {		//how to return an array 
			return userArray; 
		}
		
		public void updateAccountDB(Account user) {	//would updating return an array ? 
			
		}
		
		public Account login(String username, String password) {
			return account;
		}
		
		public void removeSchool(School schoolName) {
			
		}
		
		public School lookUpSchool(String schoolName) {
			return university ;
		}
		public Account lookUpAccount(String accountName) {
			return account; 
		}
		public void updateProfile() {
			
		}
		public School getSchool(String schoolName) {
			return university;
		}
		
	}
	
