
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
					if (universityName.equals("-1")) {
						universityName = "N/A";
					}
					
					//State
					String state = un[i][1];
					if (state.equals("-1")) {
						state = "N/A";
					}
					
					//Location
					String location = un[i][2];
					if (location.equals("-1")) {
						location = "N/A";
					}
					
					//Control
					String control = un[i][3];
					if (control.equals("-1")) {
						control = "N/A";
					}
					
					//Number of Students
					int numStudents = Integer.parseInt(un[i][4]);
					if (numStudents == -1) {
						numStudents = 0;
					}
					
					//Percent Female
					double femalePer = Double.parseDouble(un[i][5]);
					if (femalePer == -1) {
						femalePer = 0;
					}
					
					//SAT Verbal
					double verbalSAT = Double.parseDouble(un[i][6]);
					if (verbalSAT == -1) {
						verbalSAT = 0;
					}
					
					//SAT Math
					double mathSAT = Double.parseDouble(un[i][7]);
					if (mathSAT == -1) {
						mathSAT = 0;
					}
					//Expenses
					double expenses = Double.parseDouble(un[i][8]);
					if (expenses == -1) {
						expenses = 0;
					}
					//Financial Aid Percent
					double finAidPer = Double.parseDouble(un[i][9]);
					if (finAidPer == -1) {
						finAidPer = 0;
					}	
					
					//Number of Applicants
					int numApplicants = Integer.parseInt(un[i][10]);
					if (numApplicants == -1) {
						numApplicants = 0;
					}
					
					//Admitted percent
					double admittedPer = Double.parseDouble(un[i][11]);
					if (admittedPer == -1) {
						admittedPer = 0;
					}
					
					//Enrolled percent
					double enrolledPer = Double.parseDouble(un[i][12]);
					if (enrolledPer == -1) {
						enrolledPer = 0;
					}
					
					//Academic Scale
					int academicsScale = Integer.parseInt(un[i][13]);
					if (academicsScale == -1) {
						academicsScale = 0;
					}
					
					//Social Scale
					int socialScale = Integer.parseInt(un[i][14]);
					if (socialScale == -1) {
						socialScale = 0;
					}
					
					//Quality of Life Scale
					int qualityScale = Integer.parseInt(un[i][15]);
					if (qualityScale == -1) {
						qualityScale = 0;
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
		public static boolean updateUniversityDB(String universityName, String state, String location, String control, int numStudents,
				int femalePer, int verSAT, int mathSAT, double tuition, double finAid, double numApplicants, int admitPer,
				int enrolledPer, int academicScale, int socialScale, int qoaScale, ArrayList<String> emphasis, boolean blacklist) {
			//String[][] un = univDBlib.university_getUniversities();
			
			boolean edited = false;
			if (dbGetUniversity(universityName) != null)
			{
				University u = dbGetUniversity(universityName);
				if( u.getuniversityName().equals(universityName))
				{
					univDBlib.university_editUniversity(u.getuniversityName(), state, location, control, numStudents, femalePer,
							verSAT, mathSAT, tuition, finAid, (int) numApplicants, admitPer, enrolledPer, academicScale,
							socialScale, qoaScale);
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
			
			else
			{
				throw new NullPointerException("No such University as: " + universityName);
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
		public static boolean addUniversity(String universityName, String state, String location, String control, int numStudents, double femalePer, double verSAT,
				double mathSAT, double tuition, double finAid, int numApplicants, double admitPer, double enrolledPer,
				int academicScale, int socialScale, int qoaSCale, ArrayList<String> emphasis)  {//is this adding all information of a university or just on the saved list? 		
			boolean added = false;
			univDBlib.university_deleteUniversity("");
			
			if (dbGetUniversity(universityName) == null)
			{
				univDBlib.university_addUniversity(universityName, state, location, control, numStudents, femalePer, verSAT, mathSAT, tuition, finAid, numApplicants, admitPer, enrolledPer, academicScale, socialScale, qoaSCale);
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
		public static int removeUniversity(String username, String universityname) {
			int i = univDBlib.user_removeSchool(username, universityname);
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
		/** this method returns an account to be used in UserController
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
				}
			}
			if(userSchool.size()<1) {
				return null;
			}
			else {
				return userSchool;
			}
			}
		

		public static ArrayList<String> dbSearchUniversity(University uniCriteria) {    
            String[][] un = univDBlib.university_getUniversities();
            ArrayList<String> uniSearchFound = new ArrayList<>();
            boolean searchCondition=true; 
            
            for(int i = 0; i < un.length; i++) {
            	searchCondition = true; 
            	
            	if((!uniCriteria.getuniversityName().equals("")) && (!un[i][0].contains(uniCriteria.getuniversityName()))){
            		searchCondition = false; 
            	}
            	
            	if((!uniCriteria.getState().equals("")) && (!un[i][1].contains(uniCriteria.getState()))){
            		searchCondition = false; 
        	    }  

            	if((!uniCriteria.getLocation().equals("")) && (!un[i][2].contains(uniCriteria.getLocation()))){	//still isnt working for some reason but the rest do!
            		searchCondition = false; 
        	    } 
            	if((!uniCriteria.getControl().equals("")) && (!un[i][3].contains(uniCriteria.getLocation()))) {
            		searchCondition = false; 
            	}
            	if((uniCriteria.getNumStudents()!=-1) && (Integer.parseInt(un[i][4])!=uniCriteria.intGetNumStudents())){
            		searchCondition = false; 
        	    } 
            	if (searchCondition!=false) {
                	String uniName = un[i][0];
            		uniSearchFound.add(uniName);
                  }

//                    if (un[i][4].equals(uniCriteria.getControl())) {
//                        String uniName = un[i][0];
//                        uniSearchFound.add(uniName);
//                        }
//                    if (un[i][5].equals(uniCriteria.getNumStudents())) {
//                        String uniName = un[i][0];
//                        uniSearchFound.add(uniName);
//                        }
//                    if (un[i][6].equals(uniCriteria.getFemalePer())) {
//                        String uniName = un[i][0];
//                        uniSearchFound.add(uniName);
//                        }
//                    if (un[i][7].equals(uniCriteria.getVerSAT())) {
//                        String uniName = un[i][0];
//                        uniSearchFound.add(uniName);
//                        }
//                    if (un[i][8].equals(uniCriteria.getMathSAT())) {
//                        String uniName = un[i][0];
//                        uniSearchFound.add(uniName);
//                        }
//                    if (un[i][9].equals(uniCriteria.getTuition())) {
//                        String uniName = un[i][0];
//                        uniSearchFound.add(uniName);
//                        }
//                    if (un[i][10].equals(uniCriteria.getFinAid())) {
//                        String uniName = un[i][0];
//                        uniSearchFound.add(uniName);
//                        }
//                    if (un[i][10].equals(uniCriteria.getNumApplicants())) {
//                        String uniName = un[i][0];
//                        uniSearchFound.add(uniName);
//                        }
//                    if (un[i][11].equals(uniCriteria.getAdmitPer())) {
//                        String uniName = un[i][0];
//                        uniSearchFound.add(uniName);
//                        }
//                    if (un[i][12].equals(uniCriteria.getEnrolledPer())) {
//                        String uniName = un[i][0];
//                        uniSearchFound.add(uniName);
//                        }
//                    if (un[i][13].equals(uniCriteria.getAcademicScale())) {
//                        String uniName = un[i][0];
//                        uniSearchFound.add(uniName);
//                        }
//                    if (un[i][14].equals(uniCriteria.getSocialScale())) {
//                        String uniName = un[i][0];
//                        uniSearchFound.add(uniName);
//                        }
//                    if (un[i][15].equals(uniCriteria.getQoaScale())) {
//                        String uniName = un[i][0];
//                        uniSearchFound.add(uniName);
//                    }
//                
//                

                
                
            }
                    
                
                    //need to get another loop that gets emphasis
                    //Emphasis
                    //String[][] em = univDBlib.university_getNamesWithEmphases();

                   // for(int j = 0; j < em.length; j++) {
                       // if (em[j][1].equals(uniCriteria.getEmphasis()) {//not sure about this
                       // String uniName =em[j][1];
                       // uniSearchFound.add(uniName);
                        //}
                    ///}
            
            	
                    return uniSearchFound;
            	
                }
		
            
		}
	

			

		

	
