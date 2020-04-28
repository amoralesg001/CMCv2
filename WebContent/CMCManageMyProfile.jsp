<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="CMC.User.*" import="CMC.Search.*" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<% String username = (String)session.getAttribute("loggedInUsername");
	if (username == null) {
		response.sendRedirect("CMCindex.jsp");
		}
	String password = (String)session.getAttribute("loggedInPassword");
	UserController uc = (UserController)session.getAttribute("UserController");
	ArrayList<Account> users = uc.getAllUsers();
	%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>