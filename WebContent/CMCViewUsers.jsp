<%@page language="java" import="CMC.User.*" import="CMC.Search.*" import="java.util.*"%>
<html>
<head>
<title></title>
</head>
<body>
<% String username = (String)session.getAttribute("loggedInUsername");
	if (username == null) {
		response.sendRedirect("CMCindex.jsp");
		}
	String password = (String)session.getAttribute("loggedInPassword");
	UserController uc = (UserController)session.getAttribute("UserController");
	ArrayList<Account> users = uc.getAllUsers();
   int count = users.size();
 Account user = uc.getUserInfo(username, password); 
  if (user.getUsername() != null) { %>
	Hello User <%= user.getUsername() 
	 %>
<table style="text-align: left; width: 100%;" border="1" cellpadding="2"
cellspacing="2">
<tbody>
<tr align="center">

<td colspan="8" rowspan="1" style="vertical-align: top;"><a
href="CMCAdd.jsp">ADD A USER</a>
</td>

</tr>
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
<td style="vertical-align: top;">Delete
</td>
</tr>
<% for (int i = 0; i < count; i++) {%>
	<tr>
	<% for (int j = 0; j < 7; j++) {
			if (j == 0) { %>
			<td style="vertical-align: top;">
			<form method="post" action="Edit.jsp" name="Edit">
    			<input name="Edit" value="Edit" type="submit">
    			<input name="Username" value="???" type="hidden">
			</form>
			</td> <% } %>
			<% if (j == 1) { %>
			<td style="vertical-align: top;"> <%= users.get(i).getFirstName() %> <%= users.get(i).getLastName() %>
			</td>
			<% } %>
			<% if (j == 2) { %>
			<td style="vertical-align: top;"> <%= users.get(i).getUsername() %>
			</td>
			<% } %>
			<% if (j == 3) { %>
			<td style="vertical-align: top;"> <%= users.get(i).getPassword() %>
			</td>
			<% } %>
			<% if (j == 4) { %>
			<td style="vertical-align: top;"> <%= users.get(i).getUserType() %>
			</td>
			<% } %>
			<% if (j == 5) { %>
			<td style="vertical-align: top;"> <%= users.get(i).getLoginStatus() %>
			</td>
			<% } %>
			<% if (j == 6) { %>
			<td style="vertical-align: top;">
<form method="post" action="Delete.jsp" name="Delete">
    <input name="Delete" value="Delete" type="submit">
    <input name="UsernameDelete" value="<%=users.get(i).getUsername()%>" type="hidden">
    <input name="Username" value="username" type="hidden">
</form>
</td>
			<% } %>
	 <% } %>
	 </tr>
<% } %>
<% } %>
</tbody>
</table>
</body>
</html>

