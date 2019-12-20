<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movie Price</title>
</head>
<body>
<%
String s=request.getParameter("user");
int age=Integer.parseInt(request.getParameter("age"));
out.println("Name :"+s);
out.println("Age :"+age);
if(age<10)
	out.println("Price : Rs 5.00");
else if(age>62)
	out.println("Price : Rs 7.00");
else
	out.println("Price : Rs 9.50");
	
%>

</body>
</html>