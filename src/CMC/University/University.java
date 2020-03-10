package University;
import java.util.ArrayList;

public class University {
	
	private String universityName;
	private String state;
	private String location;
	private Long numStudents;
	private int femalePer;
	private int verSAT;
	private int mathSAT;
	private double tuition;
	private double finAid;
	private double numApplicants;
	private int admitPer;
	private int enrolledPer;
	private int academicScale;
	private int socialScale;
	private int qoaScale;
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
	 * @param numStudents
	 * @param femalePer
	 * @param verSAT
	 * @param mathSAT
	 * @param tuition
	 * @param finAid
	 * @param numApplicants
	 * @param admitPer
	 * @param enrolledPer
	 * @param academicScale
	 * @param socialScale
	 * @param qoaSCale
	 * @param emphasis
	 */
	public University(String universityName, String state, String location, Long numStudents, int femalePer, int verSAT,
		int mathSAT, double tuition, double finAid, double numApplicants, int admitPer, int enrolledPer,
		int academicScale, int socialScale, int qoaScale, ArrayList<String> emphasis) {
		this.universityName = universityName;
		this.state = state;
		this.location = location;
		this.numStudents = numStudents;
		this.femalePer = femalePer;
		this.verSAT = verSAT;
		this.mathSAT = mathSAT;
		this.tuition = tuition;
		this.finAid = finAid;
		this.numApplicants = numApplicants;
		this.admitPer = admitPer;
		this.enrolledPer = enrolledPer;
		this.academicScale = academicScale;
		this.socialScale = socialScale;
		this.qoaScale = qoaScale;
		this.emphasis = emphasis;
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
	/**
	 * @return the numStudents
	 */
	public Long getNumStudents() {
		return numStudents;
	}
	/**
	 * @param numStudents the numStudents to set
	 */
	public void setNumStudents(Long numStudents) {
		this.numStudents = numStudents;
	}
	/**
	 * @return the femalePer
	 */
	public int getFemalePer() {
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
	public int getVerSAT() {
		return verSAT;
	}
	/**
	 * @param verSAT the verSAT to set
	 */
	public void setVerSAT(int verSAT) {
		this.verSAT = verSAT;
	}
	/**
	 * @return the mathSAT
	 */
	public int getMathSAT() {
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
		return tuition;
	}
	/**
	 * @param tuition the tuition to set
	 */
	public void setTuition(double tuition) {
		this.tuition = tuition;
	}
	/**
	 * @return the finAid
	 */
	public double getFinAid() {
		return finAid;
	}
	/**
	 * @param finAid the finAid to set
	 */
	public void setFinAid(double finAid) {
		this.finAid = finAid;
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
	public void setNumApplicants(double numApplicants) {
		this.numApplicants = numApplicants;
	}
	/**
	 * @return the admitPer
	 */
	public int getAdmitPer() {
		return admitPer;
	}
	/**
	 * @param admitPer the admitPer to set
	 */
	public void setAdmitPer(int admitPer) {
		this.admitPer = admitPer;
	}
	/**
	 * @return the enrolledPer
	 */
	public int getEnrolledPer() {
		return enrolledPer;
	}
	/**
	 * @param enrolledPer the enrolledPer to set
	 */
	public void setEnrolledPer(int enrolledPer) {
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
	public boolean isBlacklisted() {
		return blacklist;
	}
	/**
	 * @param blacklist change whether or not the university is blacklisted
	 */
	public void setBlacklist(boolean blacklist) {
		this.blacklist = blacklist;
	}
	
}
