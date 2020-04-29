

<%@page language="java" import="CMC.User.*" import="CMC.Search.*"%>

<%  String username = (String)session.getAttribute("loggedInUsername");
	String school = request.getParameter("school");
	if (username != null) {
	UserUI.addSavedUniversities(username, school);
	response.sendRedirect("CMCSearchSchoolResults.jsp?status=" + "1");
	}
	else {
		System.out.println("Failed to save school: user not logged in");
	}
%>