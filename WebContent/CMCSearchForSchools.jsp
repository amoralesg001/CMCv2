<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="CMC.User.*" import="CMC.Search.*" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<% String username = (String)session.getAttribute("loggedInUsername");
	String status= request.getParameter("stat");
	if (username == null) {
		response.sendRedirect("CMCindex.jsp");
		}
	UserController uc = (UserController)session.getAttribute("UserController");

	%>
	<%
	if (status !=null){
		if(status.equals("0")){%>
	University Not Valid		
	<% } }%>
	
 
	
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
<td style="vertical-align: top;"> contains<input name="schoolName"> </td>
</tr>
<td style="vertical-align: top;">by STATE<br>
</td>
<td style="vertical-align: top;"> contains<input name="state"> </td>
</tr>
<tr>
<td style="vertical-align: top;">by LOCATION<br>
</td>
<td style="vertical-align: top;">contains<input name="location"> (SUBURBAN, URBAN, SMALL-CITY, or -1 for UNKNOWN)</td>
</tr>
<tr>
<td style="vertical-align: top;">by CONTROL<br>
</td>
<td style="vertical-align: top;">contains<input name="control"> (PRIVATE, STATE, CITY or -1 for UNKNOWN)</td>
</tr>
<td style="vertical-align: top;">by NUMBER OF STUDENTS<br>
</td>
<td style="vertical-align: top;">between<input name="numStudents1"> and <input name="numStudents2"></td>
</tr>
<td style="vertical-align: top;">by % FEMALE<br>
</td>
<td style="vertical-align: top;">between<input name="perFemale1"> and <input name="perFemale2"> </td>
</tr>


<td style="vertical-align: top;">by SAT VERBAL<br>
</td>
<td style="vertical-align: top;">between<input name="satVerbal1"> and <input name="satVerbal2"> </td>
</tr>
<td style="vertical-align: top;">by SAT MATH<br>
</td>
<td style="vertical-align: top;">between<input name="satMath1"> and <input name="satMath2"> </td>
</tr>
<td style="vertical-align: top;">by EXPENSES<br>
</td>
<td style="vertical-align: top;">between<input name="expenses1"> and <input name="expenses2"> </td>
</tr>
<td style="vertical-align: top;">by % FINANCIAL AID<br>
</td>
<td style="vertical-align: top;">between<input name="perFinAid1"> and <input name="perFinAid2"> </td>
</tr>
<td style="vertical-align: top;">by NUMBER OF APPLICANTS <br>
</td>
<td style="vertical-align: top;">between<input name="numApplicants1"> and <input name="numApplicants2"> </td>
</tr>
<td style="vertical-align: top;">by % ADMITTED<br>
</td>
<td style="vertical-align: top;">between<input name="perAdmitted1"> and <input name="perAdmitted2"> </td>
</tr>
<td style="vertical-align: top;">by % ENROLLED<br>
</td>
<td style="vertical-align: top;">between<input name="perEnrolled1"> and <input name="perEnrolled2"> </td>
</tr>
<td style="vertical-align: top;">by ACADEMICS SCALE (1-5)<br>
</td>
<td style="vertical-align: top;">between<input name="acaScale1"> and <input name="acaScale2"> </td>
</tr>
<td style="vertical-align: top;">by SOCIAL SCALE (1-5)<br>
</td>
<td style="vertical-align: top;">between<input name="socScale1"> and <input name="socScale2"> </td>
</tr>
<td style="vertical-align: top;">by QUALITY OF LIFE SCALE (1-5)<br>
</td>
<td style="vertical-align: top;">between<input name="quaScale1"> and <input name="quaScale2"> </td>
</tr>
<td style="vertical-align: top;">by EMPHASES<br>
</td>
<td style="vertical-align: top;">contains either<br><input name="emphases1"><br><input name="emphases2">
					<br><input name="emphases3"><br><input name="emphases4"><br><input name="emphases5"> </td>
</tr>
</tbody>
</table>
<input type="submit" value="Search For Schools">
<input type="reset" value="Reset Form">
</form>

</body>

</html>