<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="CMC.User.*"%>
    <% String username = (String)session.getAttribute("loggedInUsername");
       String school = request.getParameter("school");
       if (username != null) {
       UserUI.removeUniversity(username, school);
       response.sendRedirect("CMCSearchSchoolResults.jsp?status=" + "1");
   	}
       
       else {
    	   System.out.println("Failure: user not logged in");
       }
    %>