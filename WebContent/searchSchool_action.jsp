<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="CMC.User.*" import="CMC.Search.*" import="java.util.*"%>

<%
	String schoolName, state, control, location, numStudents1, numStudents2, 
	perFemale1, perFemale2, satVerbal1, satVerbal2, satMath1, satMath2, 
	expenses1, expenses2, perFinAid1, perFinAid2, numApplicants1, numApplicants2, 
	perAdmitted1, perAdmitted2, perEnrolled1, perEnrolled2, acaScale1, acaScale2, 
	socScale1, socScale2, quaScale1, quaScale2, emphases1, emphases2, emphases3, emphases4, emphases5;

	String[] emphasesList = {"", "", "", "", ""};
	DBController dbcont = new DBController();
	UserUI ui = new UserUI();
	
	//School Name
	if (request.getParameter("schoolName") == null) {
		schoolName = "";
	}
	else {
		schoolName = request.getParameter("schoolName");
	}
	//State
	if (request.getParameter("state") == null) {
		state = "";
	}
	else {
		state = request.getParameter("state");
	}
	//Control
	if (request.getParameter("control") == null) {
		control = "";
	}
	else {
		control = request.getParameter("control");
	}
	//Location
	if (request.getParameter("location") == null) {
		location = "";
	}
	else {
		location = request.getParameter("location");
	}
	//Number of Students 1
	if (request.getParameter("numStudents1") == null) {
		numStudents1 = "";
	}
	else {
		numStudents1 = request.getParameter("numStudents1");
	}
	//Number of Students 2
	if (request.getParameter("numStudents2") == null) {
		numStudents2 = "";
	}
	else {
		numStudents2 = request.getParameter("numStudents2");
	}
	//Percent Female 1
	if (request.getParameter("perFemale1") == null) {
		perFemale1 = "";
	}
	else {
		perFemale1 = request.getParameter("perFemale1");
	}
	//Percent Female 2
	if (request.getParameter("perFemale2") == null) {
		perFemale2 = "";
	}
	else {
		perFemale2 = request.getParameter("perFemale2");
	}
	//SAT Verbal 1
	if (request.getParameter("satVerbal1") == null) {
		satVerbal1 = "";
	}
	else {
		satVerbal1 = request.getParameter("satVerbal1");
	}
	//SAT Verbal 2
	if (request.getParameter("satVerbal2") == null) {
		satVerbal2 = "";
	}
	else {
		satVerbal2 = request.getParameter("satVerbal2");
	}
	//SAT Math 1
	if (request.getParameter("satMath1") == null) {
		satMath1 = "";
	}
	else {
		satMath1 = request.getParameter("satMath1");
	}
	//SAT Math 2
	if (request.getParameter("satMath2") == null) {
		satMath2 = "";
	}
	else {
		satMath2 = request.getParameter("satMath2");
	}
	//Expenses 1
	if (request.getParameter("expenses1") == null) {
		expenses1 = "";
	}
	else {
		expenses1 = request.getParameter("expenses1");
	}
	//Expenses 2
	if (request.getParameter("expenses2") == null) {
		expenses2 = "";
	}
	else {
		expenses2 = request.getParameter("expenses2");
	}
	//Percent Financial Aid 1
	if (request.getParameter("perFinAid1") == null) {
		perFinAid1 = "";
	}
	else {
		perFinAid1 = request.getParameter("perFinAid1");
	}
	//Percent Financial Aid 2
	if (request.getParameter("perFinAid2") == null) {
		perFinAid2 = "";
	}
	else {
		perFinAid2 = request.getParameter("perFinAid2");
	}
	//Number of Applicants 1
	if (request.getParameter("numApplicants1") == null) {
		numApplicants1 = "";
	}
	else {
		numApplicants1 = request.getParameter("numApplicants1");
	}
	//Number of Applicants 2
	if (request.getParameter("numApplicants2") == null) {
		numApplicants2 = "";
	}
	else {
		numApplicants2 = request.getParameter("numApplicants2");
	}
	//Percent Admitted 1
	if (request.getParameter("perAdmitted1") == null) {
		perAdmitted1 = "";
	}
	else {
		perAdmitted1 = request.getParameter("perAdmitted1");
	}
	//Percent Admitted 2
	if (request.getParameter("perAdmitted2") == null) {
		perAdmitted2 = "";
	}
	else {
		perAdmitted2 = request.getParameter("perAdmitted2");
	}
	//Percent Enrolled 1
	if (request.getParameter("perEnrolled1") == null) {
		perEnrolled1 = "";
	}
	else {
		perEnrolled1 = request.getParameter("perEnrolled1");
	}
	//Percent Enrolled 2
	if (request.getParameter("perEnrolled2") == null) {
		perEnrolled2 = "";
	}
	else {
		perEnrolled2 = request.getParameter("perEnrolled2");
	}
	//Academic Scale 1
	if (request.getParameter("acaScale1") == null) {
		acaScale1 = "";
	}
	else {
		acaScale1 = request.getParameter("acaScale1");
	}
	//Academic Scale 2
	if (request.getParameter("acaScale2") == null) {
		acaScale2 = "";
	}
	else {
		acaScale2 = request.getParameter("acaScale2");
	}
	//Social Scale 1
	if (request.getParameter("socScale1") == null) {
		socScale1 = "";
	}
	else {
		socScale1 = request.getParameter("socScale1");
	}
	//Social Scale 2
	if (request.getParameter("socScale2") == null) {
		socScale2 = "";
	}
	else {
		socScale2 = request.getParameter("socScale2");
	}
	//Quality of Life Scale 1
	if (request.getParameter("quaScale1") == null) {
		quaScale1 = "";
	}
	else {
		quaScale1 = request.getParameter("quaScale1");
	}
	//Quality of Life Scale 2
	if (request.getParameter("quaScale2") == null) {
		quaScale2 = "";
	}
	else {
		quaScale2 = request.getParameter("quaScale2");
	}
	//Emphases 1
	if (request.getParameter("emphases1") == null) {
		emphases1 = "";
	}
	else {
		emphases1 = request.getParameter("emphases1");
	}
	//Emphases 2
	if (request.getParameter("emphases2") == null) {
		emphases2 = "";
	}
	else {
		emphases2 = request.getParameter("emphases2");
	}
	//Emphases 3
	if (request.getParameter("emphases3") == null) {
		emphases3 = "";
	}
	else {
		emphases3 = request.getParameter("emphases3");
	}
	//Emphases 4
	if (request.getParameter("emphases4") == null) {
		emphases4 = "";
	}
	else {
		emphases4 = request.getParameter("emphases4");
	}
	//Emphases 5
	if (request.getParameter("emphases5") == null) {
		emphases5 = "";
	}
	else {
		emphases5 = request.getParameter("emphases5");
	}
   	//Emphases List
   		emphasesList[0] = emphases1;
   		emphasesList[1] = emphases2;
   		emphasesList[2] = emphases3;
   		emphasesList[3] = emphases4;
   		emphasesList[4] = emphases5;
    ArrayList<String> universitiesFound = dbcont.dbSearchUniversity(schoolName, state, location, control
		   , numStudents1, numStudents2, perFemale1, perFemale2, satVerbal1, satVerbal2, satMath1, satMath2, expenses1
		   , expenses2, perFinAid1, perFinAid2, numApplicants1, numApplicants2, perAdmitted1, perAdmitted2
		   , perEnrolled1, perEnrolled2, acaScale1, acaScale2, socScale1, socScale2, quaScale1, quaScale2, emphasesList);
  if(universitiesFound.size()==0 || universitiesFound == null){
	 response.sendRedirect("CMCSearchForSchools.jsp?stat=" + "0");
  }
  else {
	  response.sendRedirect("CMCSearchSchoolResults.jsp");
	  session.setAttribute("UniversitiesFound", universitiesFound);
  }
   
   %>
