<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>session check</title>
</head>
<body>
<%
HttpSession s=request.getSession(false);
if(s!=null)
{
	
	String st=(String)s.getAttribute("username");
	out.print("Welocome to sessioncheck :"+ st);
}
else
	out.println("no session objecct created ");
%>
</body>
</html>