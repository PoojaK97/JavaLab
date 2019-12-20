<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>eligible</title>
</head>
<body>
<%
String name=request.getParameter("name");
int age=Integer.parseInt(request.getParameter("age"));
double marks=Double.parseDouble(request.getParameter("marks"));
if(age>18)
{
	out.println("ELIGIBLE TO SEE ");
	RequestDispatcher rd=request.getRequestDispatcher("counter.jsp");
rd.include(request,response);
	
}
else
{
	out.println("NOT ELIGIBLE ");
}
%>

</body>
</html>