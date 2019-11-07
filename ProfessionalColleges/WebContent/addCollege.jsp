<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Enter College Details</h1>
<form method="post" action="http://localhost:9090/ProfessionalColleges/AddCollegeController">

Enter College ID: <input type="number" name="cid" width="100px">
<br><br>

Enter College Name: <input type="text" name="cname" width="100px">
<br><br>

Enter Course Type: <input type="text" name="coursetype" width="100px">
<br><br>

Enter City: <input type="text" name="city" width="100px">
<br><br>

Enter Fees: <input type="number" name="fees" width="100px">
<br><br>

Enter Pincode: <input type="number" name="pincode" width="100px">
<br><br>

<input type="submit" value ="Add College" width="100px">
<br><br>
</form>
</center>





</body>
</html>