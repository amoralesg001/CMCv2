
package CMC.Search;

import java.util.ArrayList;
//import CMC.DBLibraryDriver;
import java.util.List;

import CMC.User.*;
import dblibrary.project.csci230.UniversityDBLibrary;
import CMC.University.*;

public class DBController {
		//private static Account account = new Account("amoralesg001", "thumb thumb", null, null, null); 

		//private static User userArray[]; //should we do an array or list?  
		
		//public static ArrayList<University> uArray = new ArrayList<University>();
		static String dbUsername = "thumbthumbs";
		static String dbPassword = "csci230";
		public static UniversityDBLibrary univDBlib = new UniversityDBLibrary(dbUsername,dbPassword);
		
		public static Account getAccountDB(String username, String password) {
			
			Account user = dbGetUser(username);
			//System.out.println(user.getPassword());
			//System.out.println(user.getLoginStatus());
			String tempU = user.getUsername();
			String tempP = user.getPassword();
			String tempS = user.getLoginStatus();
			
			if (tempU.equals(username) && tempP.equals(password) && (tempS.equals("Y") || tempS.equals("y"))){
				//System.out.println("pass");
				return user;
				
			}
			else {
				Account tempA = new Account(null, null, null, null, null, null);
				//System.out.println("fail");
				return tempA;
			}
			
		}
		
		public static Account getAccountDB2(String username) {
			
			Account user = dbGetUser(username);
			
			String tempU;
			if (user != null) {
				tempU = user.getUsername();
			}
			else {
				tempU = null;
			}
			
			if (tempU == null){
				Account tempA = new Account(null, null, null, null, null, null);
				return tempA;
			}
			else {
				return user;
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
		//USED BY READYSON
		public static University dbGetUniversity(String university) {	
			String[][] un = univDBlib.university_getUniversities();
			ArrayList<String> emphasis = new ArrayList<String>();
			for(int i = 0; i < un.length; i++) {
				if (un[i][0].equals(university)) {
					
					//University Name
					String universityName = un[i][0];
					if (universityName.equals("o")) {
						universityName = "N/A";
					}
					
					//State
					String state = un[i][1];
					if (state.equals("o")) {
						state = "N/A";
					}
					
					//Location
					String location = un[i][2];
					if (location.equals("o")) {
						location = "N/A";
					}
					
					//Control
					String control = un[i][3];
					if (control.equals("o")) {
						control = "N/A";
					}
					
					//Number of Students
					String numStudents = un[i][4];
					if (numStudents.equals("-1")) {
						numStudents = "N/A";
					}
					
					//Percent Female
					String femalePer = un[i][5];
					if (femalePer.equals("-1")) {
						femalePer = "N/A";
					}
					
					//SAT Verbal
					String verbalSAT = un[i][6];
					if (verbalSAT.equals("-1")) {
						verbalSAT = "N/A";
					}
					
					//SAT Math
					String mathSAT = un[i][7];
					if (mathSAT.equals("-1")) {
						mathSAT = "N/A";
					}
					//Expenses
					String expenses = un[i][8];
					if (expenses.equals("-1")) {
						expenses = "N/A";
					}
					//Financial Aid Percent
					String finAidPer = un[i][9];
					if (finAidPer.equals("-1")) {
						finAidPer = "N/A";
					}	
					
					//Number of Applicants
					String numApplicants = un[i][10];
					if (numApplicants.equals("-1")) {
						numApplicants = "N/A";
					}
					
					//Admitted percent
					String admittedPer = un[i][11];
					if (admittedPer.equals("-1")) {
						admittedPer = "N/A";
					}
					
					//Enrolled percent
					String enrolledPer = un[i][12];
					if (enrolledPer.equals("-1")) {
						enrolledPer = "N/A";
					}
					
					//Academic Scale
					String academicsScale = un[i][13];
					if (academicsScale.equals("-1")) {
						academicsScale = "N/A";
					}
					
					//Social Scale
					String socialScale = un[i][14];
					if (socialScale.equals("-1")) {
						socialScale = "N/A";
					}
					
					//Quality of Life Scale
					String qualityScale = un[i][15];
					if (qualityScale.equals("-1")) {
						qualityScale = "N/A";
					}
					
					//Emphasis
					String[][] em = univDBlib.university_getNamesWithEmphases();
					for(int j = 0; j < em.length; j++) {
						if (em[j][0].equals(university)) {
							if (emphasis.contains(em[j][1])) {
								
							}
							else {
								emphasis.add(em[j][1]);
							}
						}
					}
						if (emphasis.size() == 0) {
						emphasis.add("No Emphases");
					}
				
					
					//Blacklist
					boolean blacklist = false;
							
					University universityRet =  new University(universityName, state, location, control, numStudents, femalePer, verbalSAT, 
							mathSAT, expenses, finAidPer, numApplicants, admittedPer, enrolledPer, academicsScale, socialScale, qualityScale, emphasis, blacklist);
					
					return universityRet;
				}
			}
			return null;
			
			
		}
		
		/**
		 * This method is used to edit all of the information inside of a University object
		 * 
		 * @param universityName is university object name
		 * @param state is university object state
		 * @param location is university object location
		 * @param numStudents number of students in the university
		 * @param femalePer percent of female students going to university
		 * @param verSAT average Verbal SAT score for university
		 * @param mathSAT average Math SAT score for university
		 * @param tuition tuition cost for the university
		 * @param finAid financial aid for university
		 * @param numApplicants number of applicants for the university
		 * @param admitPer Percentage of applicants admitted
		 * @param enrolledPer percent of enrolled 
		 * @param academicScale the University's academic scale
		 * @param socialScale the University's Social scale
		 * @param qoaScale the University's qoa scale
		 * @param emphasis the University's emphasis on Majors
		 * @param blacklist if the school is blacklisted
		 * 
		 * @return boolean value if the school has been edited
		 */
		public static boolean updateUniversityDB(String universityName, String state, String location, String control, String numStudents,
				String femalePer, String verSAT, String mathSAT, String tuition, String finAid, String numApplicants, String admitPer,
				String enrolledPer, String academicScale, String socialScale, String qoaScale, ArrayList<String> emphasis, boolean blacklist) {
			//String[][] un = univDBlib.university_getUniversities();
			
			boolean edited = false;
			if (dbGetUniversity(universityName) == null)
			{
				System.out.println("No such university as: " + universityName);
				throw new NullPointerException("No such University");
			}
			
			else
			{
				University u = dbGetUniversity(universityName);
				if( u.getuniversityName().equals(universityName))
				{
					univDBlib.university_editUniversity(u.getuniversityName(), state, location, control, Integer.parseInt(numStudents), Double.parseDouble(femalePer),
							Double.parseDouble(verSAT), Double.parseDouble(mathSAT), Double.parseDouble(tuition), Double.parseDouble(finAid), Integer.parseInt(numApplicants), Double.parseDouble(admitPer), 
							Double.parseDouble(enrolledPer), Integer.parseInt(academicScale), Integer.parseInt(socialScale), Integer.parseInt(qoaScale));
					System.out.println("University: " + u.getuniversityName() + " has been found and has been editted.");
					edited = true;
					u.setBlacklist(blacklist);
					ArrayList<String> oldEmphases = new ArrayList<String>();
					for (int i = 0; i < univDBlib.university_getNamesWithEmphases().length; i ++)
					{
						if (univDBlib.university_getNamesWithEmphases()[i][0].equals(universityName))
						{
							oldEmphases.add(univDBlib.university_getNamesWithEmphases()[i][1]);
						}
					}
					
					for(String s: oldEmphases)
					{
						
						if(oldEmphases.contains(s))
						{
							univDBlib.university_removeUniversityEmphasis(universityName, s);
							
						}
					}
					for(String s: emphasis) {
						univDBlib.university_addUniversityEmphasis(universityName, s);
					}
					
					
				}
			}

			return edited;
			
		}


		/**
		 * This method is used to add a University Object to the database
		 * 
		 * @param universityName is university object name
		 * @param state is university object state
		 * @param location is university object location
		 * @param numStudents number of students in the university
		 * @param femalePer percent of female students going to university
		 * @param verSAT average Verbal SAT score for university
		 * @param mathSAT average Math SAT score for university
		 * @param tuition tuition cost for the university
		 * @param finAid financial aid for university
		 * @param numApplicants number of applicants for the university
		 * @param admitPer Percentage of applicants admitted
		 * @param enrolledPer percent of enrolled 
		 * @param academicScale the University's academic scale
		 * @param socialScale the University's Social scale
		 * @param qoaScale the University's qoa scale
		 * 
		 * @return boolean value if the school has been added
		 */
		public static boolean addUniversity(String universityName, String state, String location, String control, String numStudents, String femalePer, String verSAT,
				String mathSAT, String tuition, String finAid, String numApplicants, String admitPer, String enrolledPer,
				String academicScale, String socialScale, String qoaScale, ArrayList<String> emphasis)  {//is this adding all information of a university or just on the saved list? 		
			boolean added = false;
	
			
			if (dbGetUniversity(universityName) == null)
			{
				univDBlib.university_addUniversity(universityName, state, location, control, Integer.parseInt(numStudents), Double.parseDouble(femalePer),
						Double.parseDouble(verSAT), Double.parseDouble(mathSAT), Double.parseDouble(tuition), Double.parseDouble(finAid), Integer.parseInt(numApplicants), Double.parseDouble(admitPer), 
						Double.parseDouble(enrolledPer), Integer.parseInt(academicScale), Integer.parseInt(socialScale), Integer.parseInt(qoaScale));
				for (String s: emphasis)
				{
					univDBlib.university_addUniversityEmphasis(universityName, s);
				}
				added = true;
				System.out.println("Univerity: " + universityName + " not in database... It will be added.");
			}
			else
			{
		
				added = false;
			}
				
			return added;
		}
		/**
		 * In use by John
		 * @param username username of account to update
		 * @param uniName name of university to add to list
		 * @return boolean if successful or not
		 */
		public static boolean updateSavedUniversities(String username, String uniName) {
			int output = univDBlib.user_saveSchool(username, uniName);
			
			return output == 1;
		

		}
		/**
		 * In use by John
		 * @return Arraylist of all users in database
		 */
		public static ArrayList<Account> getAllUsers() {		//how to return an array
			String[][] userlist = univDBlib.user_getUsers();
			ArrayList<Account> users = new ArrayList<>();
			for (int row = 0; row < userlist.length; row++) {
				String firstName = userlist[row][0];
				String lastName = userlist[row][1];
				String username = userlist[row][2];
				String password = userlist[row][3];
				String type = userlist[row][4];
				String active = userlist[row][5];
				Account acc = new Account(firstName, lastName, username, password, type, active);
				users.add(acc);
			}
			return users;
		}
		/**
		 * In use by John
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
		public static void updateAccountDB(String userToUpdate, String password, String firstName, String lastName, String userType, String loginStatus) {
			char uType = userType.charAt(0);
			char logStatus = loginStatus.charAt(0);
			univDBlib.user_editUser(userToUpdate, firstName, lastName, password, uType, logStatus);
		}


		/**
		 *
		 * @param username Username as string
		 * @param universityname name of university as string to remove
		 */
		public static int removeUniversity(String username, String universityName) {
			University universityToRemove = DBController.dbGetUniversity(universityName);
			if (universityToRemove == null) {
				return 3;
			}
			int i = univDBlib.user_removeSchool(username, universityName);
			return i;
		}
		/**
		 * 
		 * @param universityName
		 * @return
		 */
		public University lookUpUniversity(String universityName) {
			return null;
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
			//return university;
			return null;
		}
	
		public static ArrayList<String> dbGetSavedUniversityList(String username){	
			String[][] ar = univDBlib.user_getUsernamesWithSavedSchools();
		
			ArrayList<String> userSchool = new ArrayList<String>();
			for(int row = 0; row<ar.length; row++) {
			boolean userFound=false;
			if (ar[row][0].equals(username)){
				userFound=true;
				userSchool.add(ar[row][0]);
				userSchool.add(ar[row][1]);
				userSchool.add(ar[row][2]);
				}
			}
			if(userSchool.size()<1) {
				return null;
			}
			else {
				return userSchool;
			}
			
			}
		
		/**
		 * In use by alex morales
		 * 
		 * This method searches universities from the criterias given beloow. 
		 * @param universityName
		 * @param state
		 * @param location
		 * @param control
		 * @param numStudents
		 * @param femalePer
		 * @param verbalSAT
		 * @param mathSAT
		 * @param expenses
		 * @param finAidPer
		 * @param numApplicants
		 * @param admitPer
		 * @param enrolledPer
		 * @param academicScale
		 * @param socialScale
		 * @param qoaScale
		 * @param emphasis
		 * @return ArrayList of a string that has the universities that match those criterias
		 */
		public static ArrayList<String> dbSearchUniversity(String universityName, String state, String location, String control, String numStudents, String femalePer, String verbalSAT,
	            String mathSAT, String expenses, String finAidPer, String numApplicants, String admitPer, String enrolledPer,
	            String academicScale, String socialScale, String qoaScale, String[] emphasis) {    
            String[][] un = univDBlib.university_getUniversities();
            ArrayList<String> uniSearchFound = new ArrayList<>();
            boolean searchCondition=true; 
          
            for(int i = 0; i < un.length; i++) {
            	searchCondition = true; 
            	
            	if((!universityName.equals("")) && (!un[i][0].contains(universityName))){
            		searchCondition = false; 
            	}
            	
            	if((!state.equals("")) && (!un[i][1].contains(state))){
            		searchCondition = false; 
        	    }  

            	if((!location.equals("")) && (!un[i][2].contains(location))){	//still isnt working for some reason but the rest do!
            		searchCondition = false; 
        	    } 
            	if((!control.equals("")) && (!un[i][3].contains(control))) {
            		searchCondition = false; 
            	}
            	if((!numStudents.equals("")) && (!un[i][4].contains(numStudents))){
            		searchCondition = false; 
            		
        	    } 
            	
            	if((!femalePer.equals("")) && (!un[i][5].contains(femalePer))){
            		searchCondition = false; 
        	    } 
            	
            	if((!verbalSAT.equals("")) && (!un[i][6].contains(verbalSAT))){
            		searchCondition = false; 
        	    }           	
    
            	if((!mathSAT.equals("")) && (!un[i][7].contains(mathSAT))){
            		searchCondition = false; 
        	    } 
            	
            	if((!expenses.equals("")) && (!un[i][8].contains(expenses))){
            		searchCondition = false; 
        	    } 
            	
            	if((!finAidPer.equals("")) && (!un[i][9].contains(finAidPer))){
            		searchCondition = false; 
        	    } 
            	
            	if((!numApplicants.equals("")) && (!un[i][10].contains(numApplicants))){
            		searchCondition = false; 
        	    } 
            	
            	if((!admitPer.equals("")) && (!un[i][11].contains(admitPer))){
            		searchCondition = false; 
        	    } 
            	
            	if((!enrolledPer.equals("")) && (!un[i][12].contains(enrolledPer))){
            		searchCondition = false; 
        	    } 
            	
            	if((!academicScale.equals("")) && (!un[i][13].contains(academicScale))){
            		searchCondition = false; 
        	    } 
            	
            	if((!socialScale.equals("")) && (!un[i][14].contains(socialScale))){
            		searchCondition = false; 
        	    } 
            	
            	if((!qoaScale.equals("")) && (!un[i][15].contains(qoaScale))){
            		searchCondition = false; 
        	    } 
            	
            	if (searchCondition!=false) {
                	String uniName = un[i][0];
            		uniSearchFound.add(uniName);
            	}   
            }
                    

//                    //need to get another loop that gets emphasis
//                    //Emphasis
//                    String[][] em = univDBlib.university_getNamesWithEmphases();
//                   boolean emphasisMatches;
//                   ArrayList<String> emphasisFound = null;
//                   for (int i=0; i<em.length;i++) {
//                	   emphasisMatches = false;
//                	   for(int j=0; j<em[i].length;j++) {	  
//                		  if(em[i][j].contains(emphasis[0]) && emphasis[0]!="") {
//                			  emphasisMatches=true;
//                		  }
//                		  if(em[i][j].contains(emphasis[1]) && emphasis[1]!="") {
//                			  emphasisMatches=true;
//                		  }
//                		  if(em[i][j].contains(emphasis[2]) && emphasis[2]!="") {
//                			  emphasisMatches=true;
//                		  }
//                		  if(em[i][j].contains(emphasis[3]) && emphasis[3]!="") {
//                			  emphasisMatches=true;
//                		  }
//                		  if(em[i][j].contains(emphasis[4]) && emphasis[4]!="") {
//                			  emphasisMatches=true;
//                		  }
//                	   }
//                	   if (emphasisMatches!=false) {
//                		   emphasisFound.add(em[i][0]);
//                	   }
//                	
//                   }
                   return uniSearchFound;
		}
        
		 /**
		  * @author alex morales
		  * this method is simply used for my testing JUNIT. I do not use this apart from that 
		  * @param firstName
		  * @param lastName
		  * @param userName
		  * @param password
		  * @param userType
		  * @return
		  */
            public static Account addUser(String firstName, String lastName, String userName, String password, char userType) {
            	String userTypeString = Character.toString(userType);
            	Account user = new Account(firstName,lastName, userName, password, userTypeString,"Y");
            	
            	int userUpdate = univDBlib.user_addUser(firstName, lastName, userName, password, userType);
            	
            	return user;
            }
		}
	

			

		

	
