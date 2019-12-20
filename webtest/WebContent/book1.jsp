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
;
String title=request.getParameter("title");
String driver="com.mysql.jdbc.Driver";
String url="jdbc:mysql://localhost:3306/";
String dbname="book";
String username="root";
String password="";
String query="select * from book where title='"+title+"'";
try{
Class.forName(driver);
Connection con=DriverManager.getConnection(url+dbname,username,password);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(query);
while(rs.next())
{
	out.println("BookID:"+rs.getString(1));
	out.println("Title :"+rs.getString(2));
	out.println("Author :"+rs.getString(3));
	out.println("Publication :"+rs.getString(4));
	out.println("Price :"+rs.getString(5));
	
	
}
}
catch(Exception e)
{
	out.println(e);
}
%>

</body>
</html>