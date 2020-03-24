package CMC.University;
import java.util.ArrayList;

public class University {
	
	private String universityName;
	private String state;
	private String location;
	private String control;
	private int numStudents;
	private double femalePer;
	private double verbalSAT;
	private double mathSAT;
	private double expenses;
	private double finAidPer;
	private int numApplicants;
	private double admitPer;
	private double enrolledPer;
	private int academicScale;
	private int socialScale;
	private int qoaScale;
	//private boolean blacklist;
	//private ArrayList<String> emphasis;
	/**
	 * @return the universityName
	 */
	public String getuniversityName() {
		return universityName;
	}
	/**
	 * @param universityName
	 * @param state
	 * @param location
	 * @param control
	 * @param numStudents2
	 * @param femalePer
	 * @param verSAT
	 * @param mathSAT
	 * @param tuition
	 * @param finAidPer
	 * @param numApplicants
	 * @param admitPer
	 * @param enrolledPer
	 * @param academicScale
	 * @param socialScale
	 * @param qoaSCale
	 * @param emphasis
	 */
	public University(String universityName, String state, String location, String control, int numStudents, double femalePer, double verbalSAT,
		double mathSAT, double expenses, double finAidPer, int numApplicants, double admitPer, double enrolledPer,
		int academicScale, int socialScale, int qoaScale) {
		this.universityName = universityName;
		this.state = state;
		this.location = location;
		this.control = control;
		this.numStudents = numStudents;
		this.femalePer = femalePer;
		this.verbalSAT = verbalSAT;
		this.mathSAT = mathSAT;
		this.expenses = expenses;
		this.finAidPer = finAidPer;
		this.numApplicants = numApplicants;
		this.admitPer = admitPer;
		this.enrolledPer = enrolledPer;
		this.academicScale = academicScale;
		this.socialScale = socialScale;
		this.qoaScale = qoaScale;
		//this.emphasis = emphasis;
	}
	/**
	 * @param universityName the universityName to set
	 */
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	public String getControl() {
		return control;
	}
	/**
	 * @param location the location to set
	 */
	public void setControl(String control) {
		this.control = control;
	}
	/**
	 * @return the numStudents
	 */
	public long getNumStudents() {
		return (long) numStudents;
	}
	/**
	 * @param numStudents the numStudents to set
	 */
	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}
	/**
	 * @return the femalePer
	 */
	public double getFemalePer() {
		return femalePer;
	}
	/**
	 * @param femalePer the femalePer to set
	 */
	public void setFemalePer(int femalePer) {
		this.femalePer = femalePer;
	}
	/**
	 * @return the verSAT
	 */
	public double getVerSAT() {
		return verbalSAT;
	}
	/**
	 * @param verSAT the verSAT to set
	 */
	public void setVerSAT(double verSAT) {
		this.verbalSAT = verSAT;
	}
	/**
	 * @return the mathSAT
	 */
	public double getMathSAT() {
		return mathSAT;
	}
	/**
	 * @param mathSAT the mathSAT to set
	 */
	public void setMathSAT(int mathSAT) {
		this.mathSAT = mathSAT;
	}
	/**
	 * @return the tuition
	 */
	public double getTuition() {
		return expenses;
	}
	/**
	 * @param tuition the tuition to set
	 */
	public void setTuition(double expenses) {
		this.expenses = expenses;
	}
	/**
	 * @return the finAid
	 */
	public double getFinAid() {
		return finAidPer;
	}
	/**
	 * @param finAid the finAid to set
	 */
	public void setFinAid(double finAidPer) {
		this.finAidPer = finAidPer;
	}
	/**
	 * @return the numApplicants
	 */
	public double getNumApplicants() {
		return numApplicants;
	}
	/**
	 * @param numApplicants the numApplicants to set
	 */
	public void setNumApplicants(int numApplicants) {
		this.numApplicants = numApplicants;
	}
	/**
	 * @return the admitPer
	 */
	public double getAdmitPer() {
		return admitPer;
	}
	/**
	 * @param admitPer the admitPer to set
	 */
	public void setAdmitPer(double admitPer) {
		this.admitPer = admitPer;
	}
	/**
	 * @return the enrolledPer
	 */
	public double getEnrolledPer() {
		return enrolledPer;
	}
	/**
	 * @param enrolledPer the enrolledPer to set
	 */
	public void setEnrolledPer(double enrolledPer) {
		this.enrolledPer = enrolledPer;
	}
	/**
	 * @return the academicScale
	 */
	public int getAcademicScale() {
		return academicScale;
	}
	/**
	 * @param academicScale the academicScale to set
	 */
	public void setAcademicScale(int academicScale) {
		this.academicScale = academicScale;
	}
	/**
	 * @return the socialScale
	 */
	public int getSocialScale() {
		return socialScale;
	}
	/**
	 * @param socialScale the socialScale to set
	 */
	public void setSocialScale(int socialScale) {
		this.socialScale = socialScale;
	}
	/**
	 * @return the qoaScale
	 */
	public int getQoaScale() {
		return qoaScale;
	}
	/**
	 * @param qoaScale the qoaSCale to set
	 */
	public void setQoaScale(int qoaScale) {
		this.qoaScale = qoaScale;
	}
	/**
	 * @return the emphasis
	 */
	//public ArrayList<String> getEmphasis() {
		//return emphasis;
	//}
	/**
	 * @param emphasis the emphasis to set
	 */
	//public void setEmphasis(ArrayList<String> emphasis) {
		//this.emphasis = emphasis;
	//}
	/**
	 * @return whether or not the university is blacklisted
	 */
	//public boolean isBlacklisted() {
		//return blacklist;
	//}
	/**
	 * @param blacklist change whether or not the university is blacklisted
	 */
//	public void setBlacklist(boolean blacklist) {
	//	this.blacklist = blacklist;
	//}
	
	//public void emphasisToString(ArrayList<String> emphasis)
	//{
		//for (String s: emphasis)
		//{
			//System.out.println(s);
		//}
	//}
	

	public String toString()
	{
		return  "School: " + this.universityName + "\nState: " + this.state + "\nLocation: " + location + "\nControl: " + this.control + "\nnumStudents: " + this.numStudents + 
				"\nFemalePer: " + this.femalePer + "\nVerSAT: " + this.verbalSAT + "\nMathSAT: " + this.mathSAT + 
				"\nTuition: " + this.expenses + "\nFinAid: " + this.finAidPer + "\nNumApplicants: " + this.numApplicants  + 
				"\nAdmitPer: " + this.admitPer +  "\nEnrolledPer: " + this.enrolledPer + 
				"\nAcademicScale: " + this.academicScale + "\nSocialScale: "  + this.socialScale + "\nQoaScale: " + this.qoaScale + 
				"\nBlackListed: Not complete" ;
	}
	
	
}
