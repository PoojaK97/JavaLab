<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*" %>

<%
String bookno=request.getParameter("bookno");
String title=request.getParameter("title");
String author=request.getParameter("author");
String publication=request.getParameter("publication");
String price=request.getParameter("price");
String driver="com.mysql.jdbc.Driver";
String url="jdbc:mysql://localhost:3306/";
String dbname="book";
String username="root";
String password="";
String query="insert into book values(?,?,?,?,?)";
try{
Class.forName(driver);
Connection con=DriverManager.getConnection(url+dbname,username,password);
PreparedStatement pst=con.prepareStatement(query);
pst.setString(1, bookno);
pst.setString(2, title);
pst.setString(3, author);
pst.setString(4, publication);
pst.setString(5, price);
boolean rs=pst.execute();
out.println("INSERTED SUCCESSFULLY ");
request.getRequestDispatcher("book1.jsp").forward(request,response);
}
catch(Exception e)
{
	out.println(e);
}
%>

</body>
</html>