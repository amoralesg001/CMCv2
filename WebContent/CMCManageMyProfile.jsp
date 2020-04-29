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
	%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My Profile</title>
</head>
<body>
<%Account user = uc.getUserInfo(username, password);
	if (user.getUsername() != null) { 
	 if (user.getUserType().equals("u") || user.getUserType().equals("U")) { %>
		Hello User <%= user.getUsername() %>
<%   }
	 else { %>
	 	Hello Admin <%= user.getUsername() %>
<%   } %>
<br><br>
<table style="text-align: left; width: 100%;" border="1" cellpadding="2"
cellspacing="2">
<tbody>

<tr>
<td style="vertical-align: top;">
Edit</td>
<td style="vertical-align: top; text-align: center;">Full name
</td>
<td style="vertical-align: top; text-align: center;">Username
</td>
<td style="vertical-align: top; text-align: center;">Password
</td>
<td style="vertical-align: top; text-align: center;">Type
</td>
<td style="vertical-align: top; text-align: center;">Status
</td>
</tr>
<tr>
	<% for (int j = 0; j < 7; j++) {
			if (j == 0) { %>
			<td style="vertical-align: top;">
			<form method="post" action="CMCEdit.jsp" name="Edit">
    			<input name="Edit" value="Edit" type="submit">
    			<input name="Username" value="???" type="hidden">
			</form>
			</td> <% } %>
			<% if (j == 1) { %>
			<td style="vertical-align: top;"> <%= user.getFirstName() %> <%= user.getLastName() %>
			</td>
			<% } %>
			<% if (j == 2) { %>
			<td style="vertical-align: top;"> <%= user.getUsername() %>
			</td>
			<% } %>
			<% if (j == 3) { %>
			<td style="vertical-align: top;"> <%= user.getPassword() %>
			</td>
			<% } %>
			<% if (j == 4) { %>
			<td style="vertical-align: top;"> <%= user.getUserType() %>
			</td>
			<% } %>
			<% if (j == 5) { %>
			<td style="vertical-align: top;"> <%= user.getLoginStatus() %>
			</td>
			<% } %>
			<% } %>
			<% } %>
	 </tr>
</tbody>
</table>
<br><br>
<A HREF="CMCMenu.jsp">Back To Menu</A>
</body>
</html>