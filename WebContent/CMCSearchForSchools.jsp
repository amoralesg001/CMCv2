<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="CMC.User.*" import="CMC.Search.*" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<% String username = (String)session.getAttribute("loggedInUsername");
	String none = request.getParameter("none");
	if (username == null) {
		response.sendRedirect("CMCindex.jsp");
		}
	UserController uc = (UserController)session.getAttribute("UserController");
	%>
	
	
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SearchForSchoolPage</title>
</head>
<body>
<form method="post" action="searchSchool_action.jsp" name="Search"><br>
<table style="text-align: left; width: 100%;" border="1" cellpadding="2">
<tbody>
<tr>
<td style="vertical-align: top;">by SCHOOL NAME<br>
</td>
<td style="vertical-align: top;"> contains<input name="SchoolName;"> </td>
</tr>
<tr>
<td style="vertical-align: top;">by LOCATION<br>
</td>
<td style="vertical-align: top;">contains<input name="location"> </td>
</tr>
<tr>
<td style="vertical-align: top;">by CONTROL<br>
</td>
<td style="vertical-align: top;">contains<input name="control"> (SUBURBAN, URBAN, SMALL-CITY or -1 for UNKNOWN)</td>
</tr>
<td style="vertical-align: top;">by NUMBER OF STUDENTS<br>
</td>
<td style="vertical-align: top;">between<input name="numStudents1"> and <input name="numStudents2"></td>
</tr>
<td style="vertical-align: top;">by % FEMALE<br>
</td>
<td style="vertical-align: top;">between<input name="perFemale1"> and <input name="perFemale2"> </td>
</tr>
<td style="vertical-align: top;"><input value="search"
name="search" type="submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</body>

</html>