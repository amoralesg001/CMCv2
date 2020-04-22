

<%@page language="java" import="CMC.User.*" import="CMC.Search.*"%>

<%  String username = request.getParameter("Username");
	String password = request.getParameter("Password");
	UserController uc = new UserController();
	session.setAttribute("UserController", uc);
	
	boolean status = uc.login(username, password);
	if (status) {
	response.sendRedirect("CMCMenu.jsp?username="+request.getParameter("Username")+
			"&password="+request.getParameter("Password"));
	session.setAttribute("LoggedInUser", username);
	//session.setAttribute("SpecificUser", user);
	}
	else {
	response.sendRedirect("CMCindex.jsp?status=" + "0");
	}
	
