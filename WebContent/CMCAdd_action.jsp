

<%@page language="java" import="CMC.User.*" import="CMC.Search.*" import="java.util.ArrayList"%>
<%
	String username = request.getParameter("Username");
	String password = request.getParameter("Password");
	String firstName = request.getParameter("FirstName");
	String lastName = request.getParameter("LastName");
	String userType = request.getParameter("Type");
	String loginStatus = request.getParameter("Status");
	
	if (firstName == null || firstName == "" || lastName == null || lastName == "" || username == null || username == "" || password == null || password == "" || userType == null || userType == "" || loginStatus == null || loginStatus == "") {
		response.sendRedirect("CMCAdd.jsp?addStatus=" + "2");
	}
	else {
		ArrayList<Account> allUsers = DBController.getAllUsers();
		for (Account user : allUsers) {
			if (user.getUsername().equals(username)) {
				response.sendRedirect("CMCAdd.jsp?addStatus=" + "1");
			}
		}
		DBController.addUser(firstName, lastName, username, password, userType.charAt(0));
		response.sendRedirect("CMCViewUsers.jsp");
	}
%>