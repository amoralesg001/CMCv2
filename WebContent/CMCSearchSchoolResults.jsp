<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="CMC.User.*" import="CMC.Search.*" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<% ArrayList<String> universitiesFound = (ArrayList)session.getAttribute("UniversitiesFound"); 
   String stat = request.getParameter("status"); 
   if (stat != null) {
	   if (stat.equals("1")) { %>
		   University Saved Successful
	   <%}
   }
   %>
<head>
<A HREF="CMCSearchForSchools.jsp">Back To Search For Schools</A>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Results</title>
</head>
<body>
<table style="text-align: left; width: 100%;" border="1" cellpadding="2"
cellspacing="2">
<tbody>
<tr align="center">
<td colspan="4" style="vertical-align: top; text-align: center;">Schools</td>
</tr>
<% for (int i = 0; i < universitiesFound.size(); i++) {%>
	<tr>
	<% for (int j = 0; j < 3; j++) {
			if (j == 0) { %>
			<td style="vertical-align: top;">
			<form method="post" action="CMCSave_School_action.jsp" name="Save">
    			<input name="Save" value="Save" type="submit">
    			<input name="school" value= "<%= universitiesFound.get(i) %>" type="hidden">
			</form>
			</td> <% } %>
			<% if (j == 1) { %>
			<td style="vertical-align: top;"> <%= universitiesFound.get(i) %>
			</td>
			<% } 
			   if (j == 2) { %>
			<td style="vertical-align: top;">
<form method="post" action="CMCViewUniversity.jsp" name="View">
    <input name="View" value="View" type="submit">
    <input name="University" value="<%= universitiesFound.get(i) %>" type="hidden">
</form>
</td>
			<% } %>
	 <% } %>
	 </tr>
<% } %>
</tbody>
</table>
</body>
</html>