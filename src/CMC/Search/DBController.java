
package CMC.Search;

import java.util.ArrayList;
//import CMC.DBLibraryDriver;
import java.util.List;

import CMC.User.*;
import dblibrary.project.csci230.UniversityDBLibrary;
import CMC.University.*;

public class DBController {
		//private static Account account = new Account("amoralesg001", "thumb thumb", null, null, null); 

		private static User userArray[]; //should we do an array or list?  
		

		private static University university = new University("Saint John's Univeristy", "Minnesota", "United States", "PRIVATE", 2500, 0, 0, 0, 40000, 0, 0, 0,  0, 0, 0, 0);
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
		public static University dbGetUniversity(String university){	
			String[][] un = univDBlib.university_getUniversities();
			
			for(int i = 0; i < un.length; i++) {
				if (un[i][0].equals(university)) {
					
					//University Name
					String universityName = un[i][0]; 
					//System.out.println(user[0])
					
					//State
					String state = un[i][1];
					//System.out.println(user[1]);
					
					//Location
					String location = un[i][2];
					//System.out.println(user[2]);
					
					//Control
					String control = un[i][3];
					//System.out.println(user[3]);
					
					//Number of Students
					int numStudents = Integer.parseInt(un[i][4]);
					//System.out.println(user[4]);
					
					//Percent Female
					double femalePer = Double.parseDouble(un[i][5]);
					//System.out.println(user[5]);
					
					//SAT Verbal
					double verbalSAT = Double.parseDouble(un[i][6]);
					
					//SAT Math
					double mathSAT = Double.parseDouble(un[i][7]);
					
					//Expenses
					double expenses = Double.parseDouble(un[i][8]);
					
					//Financial Aid Percent
					double finAidPer = Double.parseDouble(un[i][9]);
					
					//Number of Applicants
					int numApplicants = Integer.parseInt(un[i][10]);
					
					//Admitted percent
					double admittedPer = Double.parseDouble(un[i][11]);
					
					//Enrolled percent
					double enrolledPer = Double.parseDouble(un[i][12]);
					
					//Academic Scale
					int academicsScale = Integer.parseInt(un[i][13]);
					
					//Social Scale
					int socialScale = Integer.parseInt(un[i][14]);
					
					//Quality of Life Scale
					int qualityScale = Integer.parseInt(un[i][15]);
					
					University universityRet =  new University(universityName, state, location, control, numStudents, femalePer, verbalSAT, 
							mathSAT, expenses, finAidPer, numApplicants, admittedPer, enrolledPer, academicsScale, socialScale, qualityScale);
					
					return universityRet;
				}
			}
			return null;	
		}		  
			/**
			 * 
		 * @param universityName
		 */
		public static void updateUniversityDB(String universityName, String state, String location, String control, int numStudents,
				int femalePer, int verSAT, int mathSAT, double tuition, double finAid, double numApplicants, int admitPer,
				int enrolledPer, int academicScale, int socialScale, int qoaScale) {
			//String[][] un = univDBlib.university_getUniversities();
			University u = dbGetUniversity(universityName);
			{
				if( u.getuniversityName().equals(universityName))
				{
					univDBlib.university_editUniversity(u.getuniversityName(), state, location, control, numStudents, femalePer, verSAT, mathSAT, tuition, finAid, (int) numApplicants, admitPer, enrolledPer, academicScale, socialScale, qoaScale);
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
		public static String searchUniversity(String schoolName) {	// should return a university i assume but diagram doesnt
			//for (int i = 0; i < universityArray.length; i++)
				//if (universityArray[i].getuniversityName() == schoolName) {
					//return universityArray[i];
				//}	
			//return null;
			return university.getuniversityName();
		}
		/**
		 * 
		 * @param universityName
		 * @return
		 */
		public static void addUniversity(String universityName, String state, String location, String control, int numStudents, double femalePer, double verSAT,
				double mathSAT, double tuition, double finAid, int numApplicants, double admitPer, double enrolledPer,
				int academicScale, int socialScale, int qoaSCale)  {//is this adding all information of a university or just on the saved list? 		
			univDBlib.university_addUniversity(universityName, state, location, control, numStudents, femalePer, verSAT, mathSAT, tuition, finAid, numApplicants, admitPer, enrolledPer, academicScale, socialScale, qoaSCale);
			
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
			return null; 
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
				//userSchool.add("lajkdf");
				//userSchool.add("adfadf");
				return userSchool;
			}
		}	
			return null;	
	}
		
}
	
