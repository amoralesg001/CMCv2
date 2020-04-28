

<%@page language="java" import="CMC.User.*" import="CMC.Search.*"%>

<%  String username = (String)session.getAttribute("loggedInUsername");
	String school = request.getParameter("school");
	
	UserUI.addSavedUniversities(username, school);
%>