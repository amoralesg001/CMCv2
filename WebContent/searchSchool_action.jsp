<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="CMC.User.*" import="CMC.Search.*" import="java.util.*"%>

<%
	UserUI ui = new UserUI();
	DBController dbCont = new DBController();
   String schoolName = request.getParameter("SchoolName");
   String state = request.getParameter("state");
   
   ArrayList<String> universitiesFound = dbCont.dbSearchUniversity(schoolName, state,"","","","","","","","","","","","","","", "","" ,"", "", "", "", "", "","", "", "", "",null);
  if(universitiesFound.size()==0 || universitiesFound == null){
	 response.sendRedirect("CMCSearchForSchools.jsp?stat=" + "0");
  }
  else {
	  response.sendRedirect("CMCSearchSchoolResults.jsp");
  }
   
   %>
