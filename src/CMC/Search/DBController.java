
package CMC.Search;

import java.util.ArrayList;
//import CMC.DBLibraryDriver;

import CMC.User.*;
import dblibrary.project.csci230.UniversityDBLibrary;
import CMC.University.*;

public class DBController {
		//private static Account account = new Account("amoralesg001", "thumb thumb", null, null, null); 

		private static User userArray[]; //should we do an array or list?  
		

		private static University university = new University("Saint John's Univeristy", "Minnesota", "United States", (int) 2500, 0, 0, 0, 40000, 0, 0, 0,  0, 0, 0, 0, new ArrayList<String>());
		private static University universityArray[];
		public static ArrayList<University> uArray = new ArrayList<University>();
		static String dbUsername = "thumbthumbs";
		static String dbPassword = "csci230";
		static UniversityDBLibrary univDBlib = new UniversityDBLibrary(dbUsername,dbPassword);
		
		public static Account getAccountDB(String username, String password) {
			
			Account user = dbGetUser(username);
			
			String tempU = user.getUsername();
			String tempP = user.getPassword();
			String tempS = user.getLoginStatus();
			
			if (tempU.equals(username) && tempP.equals(password) && tempS.equals("Y")){
				
				return user;
				
			}
			else {
				Account tempA = new Account(null, null, null, null, null, null);
				return tempA;
			}
			
		}
		public static Account dbGetUser(String username){	
			String[][] ar = univDBlib.user_getUsers();
			
			//String [] user = new String[6];
			//user[2] = "";
			//user[3] = "";
			for(int i = 0; i < ar.length; i++) {
				if (ar[i][2].equals(username)) {
					
					//First Name
					String fName = ar[i][0]; 
					//System.out.println(user[0])
					
					//Last Name
					String lName= ar[i][1];
					//System.out.println(user[1]);
					
					//Username
					String uName = ar[i][2];
					//System.out.println(user[2]);
					
					//Password
					String password = ar[i][3];
					//System.out.println(user[3]);
					
					//User Type
					String uType = ar[i][4];
					//System.out.println(user[4]);
					
					//Status
					String status = ar[i][5];
					//System.out.println(user[5]);
					
					Account account =  new Account(fName, lName, uName, password, uType, status);
					return account;
				}
			}
			return null;	
		}		  
			/**
			 * 
		 * @param universityName
		 */
		public static void updateUniversityDB(University universityName) {
			for (University u: uArray)
			{
				if( u.getuniversityName().equals(universityName.getuniversityName()))
				{
					u.setUniversityName(universityName.getuniversityName());
					u.setState(universityName.getState());
					u.setLocation(universityName.getLocation());
					u.setNumStudents(universityName.getNumStudents());
					u.setFemalePer(universityName.getFemalePer());
					u.setVerSAT(universityName.getVerSAT());
					u.setMathSAT(universityName.getMathSAT());
					u.setTuition(universityName.getTuition());
					u.setFinAid(universityName.getFinAid());
					u.setNumApplicants(universityName.getNumApplicants());
					u.setAdmitPer(universityName.getAdmitPer());
					u.setEnrolledPer(universityName.getEnrolledPer());
					u.setAcademicScale(universityName.getAcademicScale());
					u.setSocialScale(universityName.getSocialScale());
					u.setQoaScale(universityName.getQoaScale());
					u.setEmphasis(universityName.getEmphasis());
				}
			}
			
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
		public static ArrayList<String> searchUniversity(String schoolName) {	// should return a university i assume but diagram doesnt
			String[][] univ = univDBlib.university_getUniversities();
			ArrayList<String> univList = new ArrayList<>();
			for (int row =0; row< univ.length;row++) {
			if (univ[row][0].equals(schoolName)){
			String univName = univ[row][0];
			univList.add(univ[row][0]);
			String State = univ[row][1];
			univList.add(univ[row][1]);
			String Location = univ[row][2];
			univList.add(univ[row][2]);
			String Control = univ[row][3];
			String NumOfStud = univ[row][4];
			String PercFem = univ[row][5];
			String SATVerb = univ[row][6];
			String SATmath = univ[row][7];
			String Expense = univ[row][8];
			String PercFinancAid = univ[row][9];
			String NumAppl = univ[row][10];
			String PercAdmit = univ[row][11];
			String PercEnroll = univ[row][12];
			String acadScale = univ[row][13];
			String socialScale = univ[row][14];
			String qualOfLifeScale = univ[row][15];
			}
			return univList;
			}
			//for (int i = 0; i < universityArray.length; i++)
				//if (universityArray[i].getuniversityName() == schoolName) {
					//return universityArray[i];
				//}	
			return null;
		}
		/**
		 * 
		 * @param universityName
		 * @return
		 */
		public static void addUniversity(University universityName) {//is this adding all information of a university or just on the saved list? 		
			uArray.add(universityName); 
			
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
			return null;
			//return account;
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
			
			return null;
		}
		public static ArrayList<String> dbGetSavedUniversityList(String username){	
			String[][] ar = univDBlib.user_getUsernamesWithSavedSchools();
			ArrayList<String> userSchool = new ArrayList<String>();
			for(int row = 0; row<ar.length; row++) {
			if (ar[row][0].equals(username)){
				userSchool.add(ar[row][0]);
				//System.out.println(ar[row][0]);
				userSchool.add(ar[row][1]);
				userSchool.add(ar[row][2]);
				return userSchool;
			}
		}	
			return null;	
	}
		
}
	
