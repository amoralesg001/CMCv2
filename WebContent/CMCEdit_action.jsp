

<%@page language="java" import="CMC.User.*" import="CMC.Search.*"%>

<%  String username = request.getParameter("Username");
	String password = request.getParameter("Password");
	String firstName = request.getParameter("FirstName");
	String lastName = request.getParameter("LastName");
	
	if (firstName == null || firstName == "" || lastName == null || lastName == "" || password == null || password == "") {
		response.sendRedirect("CMCEdit.jsp?editStatus=" + "1");
	}
	else {
		Account user = UserUI.saveUserInfo(username, password, firstName, lastName);
		if (user.getFirstName() != null || user.getLastName() != null || user.getPassword() != null) {
			session.setAttribute("loggedInPassword", password);
			response.sendRedirect("CMCManageMyProfile.jsp");
		}
		else {
			response.sendRedirect("CMCEdit.jsp?editStatus=" + "0");
		}
	}
	%>

