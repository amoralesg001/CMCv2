<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="CMC.User.*" import="CMC.Search.*" import="java.util.*"%>
<html>
<head>

<title>Edit User Form</title>
</head>
<body>
<br>
<%  UserController uc = (UserController)session.getAttribute("UserController");
	String userToEdit = (String)session.getAttribute("loggedInUsername");
	String password = (String)session.getAttribute("loggedInPassword");
	Account user = uc.getUserInfo(userToEdit, password);
	String editStatus = request.getParameter("editStatus");
	if (editStatus != null) {
		if (editStatus.equals("1")) { %>
			***Error: parameters cannot be left blank***
	<%	}
		else { %>
			***Error Occurred While Editing User***
	<%  }
	}
	%>
<br>
Edit User form:<br>
<br>

<%
	out.println("Logged in as : " + (String)session.getAttribute("loggedInUsername")); %>
<br>
<%  out.println("Edit user : " + userToEdit);
%>
<form method="post" action="CMCEdit_action.jsp" name="editUser"><br>
<table style="text-align: left; width: 266px; height: 228px;"
border="1" >
<tbody>
<tr>
<td style="vertical-align: top;">First Name<br>
</td>
<td style="vertical-align: top;"><input name="FirstName" value="<%= user.getFirstName() %>"><br>
</td>
</tr>
<tr>
<tr>
<td style="vertical-align: top;">Last Name<br>
</td>
<td style="vertical-align: top;"><input name="LastName" value="<%= user.getLastName() %>"><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">Username<br>
</td>
<td style="vertical-align: top;"><input name="Username" value="<%= user.getUsername() %>" readonly> </td>
</tr>
<tr>
<td style="vertical-align: top;">Password<br>
</td>
<td style="vertical-align: top;"><input name="Password" value="<%= user.getPassword() %>"> </td>
</tr>
<tr>
<td style="vertical-align: top;">Type<br>
</td>
<td style="vertical-align: top;"><input name="Type" value="<%= user.getUserType() %>" readonly> </td>
</tr>
<tr>
<td style="vertical-align: top;">Status<br>
</td>
<td style="vertical-align: top;"><input name="Status" value="<%= user.getLoginStatus() %>" readonly> </td>
</tr>

<tr>
<td style="vertical-align: top;"><input value="Edit"
name="Edit" type="submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td style="vertical-align: top;"><input value="Reset"
name="Reset" type="reset"></td>
</tr>
</tbody>
</table>
<br>
</form>
<br>
<A HREF="CMCManageMyProfile.jsp">Cancel</A>
</body>
</html>

