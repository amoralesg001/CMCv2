package CMC.University;
import java.util.ArrayList;

public class University {
	
	private String universityName;
	private String state;
	private String location;
	private String control;
	private String numStudents;
	private String femalePer;
	private String verbalSAT;
	private String mathSAT;
	private String expenses;
	private String finAidPer;
	private String numApplicants;
	private String admitPer;
	private String enrolledPer;
	private String academicScale;
	private String socialScale;
	private String qoaScale;
	private boolean blacklist;
	private ArrayList<String> emphasis;
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
	 * @param blackList
	 */
	public University(String universityName, String state, String location, String control, String numStudents, String femalePer, String verbalSAT,
			String mathSAT, String expenses, String finAidPer, String numApplicants, String admitPer, String enrolledPer,
			String academicScale, String socialScale, String qoaScale, ArrayList<String> emphasis, boolean blacklist) {
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
		this.emphasis = emphasis;
		this.blacklist = blacklist;
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
	public String getNumStudents() {
		return  numStudents;
	}
	public String intGetNumStudents() {
		return numStudents;
	}
	/**
	 * @param numStudents the numStudents to set
	 */
	public void setNumStudents(String numStudents) {
		this.numStudents = numStudents;
	}
	/**
	 * @return the femalePer
	 */
	public String getFemalePer() {
		return femalePer;
	}
	/**
	 * @param femalePer the femalePer to set
	 */
	public void setFemalePer(String femalePer) {
		this.femalePer = femalePer;
	}
	/**
	 * @return the verSAT
	 */
	public String getVerSAT() {
		return verbalSAT;
	}
	/**
	 * @param verSAT the verSAT to set
	 */
	public void setVerSAT(String verSAT) {
		this.verbalSAT = verSAT;
	}
	/**
	 * @return the mathSAT
	 */
	public String getMathSAT() {
		return mathSAT;
	}
	/**
	 * @param mathSAT the mathSAT to set
	 */
	public void setMathSAT(String mathSAT) {
		this.mathSAT = mathSAT;
	}
	/**
	 * @return the tuition
	 */
	public String getTuition() {
		return expenses;
	}
	/**
	 * @param tuition the tuition to set
	 */
	public void setTuition(String expenses) {
		this.expenses = expenses;
	}
	/**
	 * @return the finAid
	 */
	public String getFinAid() {
		return finAidPer;
	}
	/**
	 * @param finAid the finAid to set
	 */
	public void setFinAid(String finAidPer) {
		this.finAidPer = finAidPer;
	}
	/**
	 * @return the numApplicants
	 */
	public String getNumApplicants() {
		return numApplicants;
	}
	/**
	 * @param numApplicants the numApplicants to set
	 */
	public void setNumApplicants(String numApplicants) {
		this.numApplicants = numApplicants;
	}
	/**
	 * @return the admitPer
	 */
	public String getAdmitPer() {
		return admitPer;
	}
	/**
	 * @param admitPer the admitPer to set
	 */
	public void setAdmitPer(String admitPer) {
		this.admitPer = admitPer;
	}
	/**
	 * @return the enrolledPer
	 */
	public String getEnrolledPer() {
		return enrolledPer;
	}
	/**
	 * @param enrolledPer the enrolledPer to set
	 */
	public void setEnrolledPer(String enrolledPer) {
		this.enrolledPer = enrolledPer;
	}
	/**
	 * @return the academicScale
	 */
	public String getAcademicScale() {
		return academicScale;
	}
	/**
	 * @param academicScale the academicScale to set
	 */
	public void setAcademicScale(String academicScale) {
		this.academicScale = academicScale;
	}
	/**
	 * @return the socialScale
	 */
	public String getSocialScale() {
		return socialScale;
	}
	/**
	 * @param socialScale the socialScale to set
	 */
	public void setSocialScale(String socialScale) {
		this.socialScale = socialScale;
	}
	/**
	 * @return the qoaScale
	 */
	public String getQoaScale() {
		return qoaScale;
	}
	/**
	 * @param qoaScale the qoaSCale to set
	 */
	public void setQoaScale(String qoaScale) {
		this.qoaScale = qoaScale;
	}
	/**
	 * @return the emphasis
	 */
	public ArrayList<String> getEmphasis() {
		return emphasis;
	}
	/**
	 * @param emphasis the emphasis to set
	 */
	public void setEmphasis(ArrayList<String> emphasis) {
		this.emphasis = emphasis;
	}
	/**
	 * @return whether or not the university is blacklisted
	 */
	public String isBlacklisted() {
		if (blacklist == true)
		{
			return "Yes";
		}
		else
		{
			return "No";
		}
	}
	/**
	 * @param blacklist change whether or not the university is blacklisted
	 */
	public void setBlacklist(boolean blacklist) {
		this.blacklist = blacklist;
	}
	
	
	
}
