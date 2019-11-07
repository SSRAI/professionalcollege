<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.lti.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>College Details</title>
</head>
<body>

<%
	ArrayList<College> list=(ArrayList)session.getAttribute("collegeList");

if(list.isEmpty())
{
	
%>
No records found
<% 
}
else
{
%>
<table border="1px">
	<tr>
		<th>College ID</th>
		<th>College Name</th>
		<th>Course Type</th>
		<th>City</th>
		<th>Fees</th>
		<th>Pin-Code</th>
		
	</tr>
	
<%
	for(College c:list)
	{
%>
<tr>
		<td><%= c.getCid() %></td>
		<td><%= c.getCname() %></td>
		<td><%= c.getCoursetype() %></td>
		<td><%= c.getCity() %></td>
		<td><%= c.getFees() %></td>
		<td><%= c.getPincode() %></td>
		
		
</tr>

<% 
	}
%>
	
</table>
<%
}
%>

</body>
</html>