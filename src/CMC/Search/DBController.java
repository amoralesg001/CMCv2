
package CMC.Search;

import java.util.ArrayList;
import CMC.DBLibraryDriver;

import CMC.User.*;
import CMC.University.*;

public class DBController {
		private static Account account = new Account("amoralesg001", "thumb thumb", null, null, null); 

		private static User userArray[]; //should we do an array or list?  

		private static University university = new University("Saint John's Univeristy", "Minnesota", "United States", (int) 2500, 0, 0, 0, 40000, 0, 0, 0,  0, 0, 0, 0, new ArrayList<String>());
		private static University universityArray[];
		public static ArrayList<University> uArray = new ArrayList<University>();
		
		public static Account getAccountDB(String name, String password) {
			return account; 
		}
		/**
		 * 
		 * @param universityName
		 */
		//this.numStudents = (long) numStudents2;
		//this.femalePer = femalePer;
		//this.verSAT = verSAT;
		//this.mathSAT = mathSAT;
		//this.tuition = tuition;
		//this.finAid = finAid;
		////this.numApplicants = numApplicants;
		//this.admitPer = admitPer;
		//this.enrolledPer = enrolledPer;
		////this.academicScale = academicScale;
		//this.socialScale = socialScale;
		//this.qoaScale = qoaScale;
		//this.emphasis = emphasis;
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
	
