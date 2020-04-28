

<%@page language="java" import="CMC.User.*" import="CMC.Search.*"%>

<%  String username = (String)session.getAttribute("loggedInUsername");
	String school = request.getParameter("school");
	if (username != null) {
	UserUI.addSavedUniversities(username, school);
	}
	else {
		System.out.println("Failed to save school: user not logged in");
	}
%>