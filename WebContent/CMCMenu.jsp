<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="CMC.User.*" import="CMC.Search.*"%>

<% String username = (String)session.getAttribute("loggedInUsername"); 
   if (username == null) {
		response.sendRedirect("CMCindex.jsp");
		} %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu</title>
</head>
<body>
<h1> Welcome User : <%= username %></h1>
<br>
<h2>
Manage My Profile
</h2>
<br>
<h2>
Manage My Saved Schools
</h2>
<br>
<h2>
Search for Schools
</h2>
<br>
<h2>
<A HREF="CMCViewUsers.jsp">View Users</A>
</h2>
</body>
</html>