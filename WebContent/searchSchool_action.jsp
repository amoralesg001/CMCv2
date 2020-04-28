<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="CMC.User.*" import="CMC.Search.*" import="java.util.*"%>

<%
	UserUI ui = new UserUI();
	session.setAttribute("UserUI", ui);
   String schoolName = request.getParameter("SchoolName");
   String location = request.getParameter("location");
   
   ArrayList<String> universitiesFound = ui.searchUniversity(schoolName, location,"","","","","","","","","","","","","","", "","" ,"", "", "", "", "", "","", "", "", "",null);
  if(universitiesFound.size()==0 || universitiesFound == null){
	 response.sendRedirect("CMCSearchForSchools.jsp?status=" + "0");
  }
  else {
	  response.sendRedirect("CMCSearchSchoolResults.jsp");
  }
   
   %>
