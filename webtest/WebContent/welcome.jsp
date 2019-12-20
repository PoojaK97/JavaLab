<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>

<%
String st=request.getParameter("username");
String pwd=request.getParameter("password");
if(st.equals("admin")&&pwd.equals("admin123"))
{
	out.println("welcome "+st);
	
	HttpSession s=request.getSession();
    s.setAttribute("username",st);
	request.getRequestDispatcher("sessioncheck.jsp").forward(request,response);
}
else
{
	out.println("Cannot login wrong username or password");
}
%>
</body>
</html>