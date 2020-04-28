<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="CMC.User.*" import="CMC.Search.*"%>

<% 
UserController uc = (UserController)session.getAttribute("UserController");
    String username = (String)session.getAttribute("loggedInUsername"); 
	String password = (String)session.getAttribute("loggedInPassword");
   if (username == null) {
		response.sendRedirect("CMCindex.jsp");
		} 
   Account user = uc.getUserInfo(username, password);
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<% if ((user.getUserType().equals("a")) || (user.getUserType().equals("A"))) {
	%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu</title>
</head>
<body>
<h1> Welcome User : <%= username %></h1>
<br>
<h2>
<A HREF="CMCManageMyProfile.jsp">Manage My Profile</A>
</h2>
<br>
<h2>
<A HREF="CMCViewUsers.jsp">Manage Users</A>
</h2>
<br>
<h2>
<A HREF="CMCManageSchools.jsp">Manage Schools</A>
</h2>
<br>
</body>
<% }
else {
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu</title>
</head>
<body>
<h1> Welcome User : <%= username %></h1>
<br>
<h2>
<A HREF="CMCManageMyProfile.jsp">Manage My Profile</A>
</h2>
<br>
<h2>
<A HREF="CMCManageMySavedSchools.jsp">Manage My Saved Schools</A>
</h2>
<br>
<h2>
<A HREF="CMCSearchForSchools.jsp">Search for Schools</A>
</h2>
<br>
<% } %>
</html>