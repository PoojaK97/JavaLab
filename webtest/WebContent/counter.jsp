<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>counter</title>
</head>
<body>
<%@ page import = "java.io.*,java.util.*" %>
<%
Integer count=(Integer)application.getAttribute("hitCounter");
if(count==null||count==0)
{
	out.println("Welcome ");
	count=1;
}
else
{
	out.println("Welcome BACCCCKKK ");
	++count;
	out.println("TOTAL :  "+count);
}
application.setAttribute("hitCounter",count);
out.println("TOTAL VISITS:  "+count);
%>
</body>
</html>