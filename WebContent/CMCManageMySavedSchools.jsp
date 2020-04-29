<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="CMC.User.*" import="CMC.Search.*" import="java.util.ArrayList"%>
    <% 
    String username = (String)session.getAttribute("loggedInUsername"); 
	String password = (String)session.getAttribute("loggedInPassword");
	ArrayList<String> items = new ArrayList<String>();
   if (username == null) {
	   response.sendRedirect("CMCindex.jsp");
	   }
   else {
	   items = UserUI.getSavedUniversityList(username);
   }
   %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Saved Schools</title>
</head>
<body>
<A HREF="CMCMenu.jsp">Back to Menu</A>
   <table style="text-align: left; width: 266px; height: 228px;"
		   border="1" cellpadding="2" cellspacing="2">
		   <tbody>
		   <tr align="center">

		   <td colspan="8" rowspan="1" style="vertical-align: top;"><p>School</p>
		   </td>

		   </tr>
		   <%  int i = 0;
		   for (i < items.size()) { %>
		   <tr>
		   <td style="vertical-align: top;">
		   <form method="post" action="CMCRemove_Saved_School_Action.jsp" name="Remove">
    			<input name="Remove" value="Remove" type="submit">
    			<input name="school" value="<%= items.get(i+1) %>" type="hidden">
			</form> 
			</td>
		   <td style="vertical-align: top;"><%= items.get(i+1) %> (added on: <%= items.get(i+2) %>)</td>
		   <td style="vertical-align: top;"> 
		   <form method="post" action="CMCView_School.jsp" name="view">
    			<input name="view" value="view" type="submit">
    			<input name="school" value="<%= items.get(i+1) %>" type="hidden">
			</form>
		   </td>
		   </tr>
			   
		   <% i += 3;
		   } %>
		   </tbody>
		   </table>
</body>
</html>