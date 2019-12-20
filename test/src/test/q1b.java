package test;

import java.sql.*;
public class q1b {

	public static void main(String[] args) {
		
		Statement st,st2;
		ResultSet rs,rs2;
		Connection con;
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/";
		String dbname="Department";
		String username="root";
		String password="";
		try{
			Class.forName(driver);
			con=DriverManager.getConnection(url+dbname,username,password);
			String q1="select No_of_Employees from Department where Name='CSE'";
			st=con.createStatement();
			rs=st.executeQuery(q1);
			while(rs.next())
			{
				int no=rs.getInt("No_of_Employees");
				System.out.println("No of employees = "+no);
				
			}
			st2=con.createStatement();
			String q2="select Name,Dept_id from Department where Year_Established =2010";
			rs2=st2.executeQuery(q2);
			while(rs2.next())
			{
				String name=rs2.getString("Name");
				int did=rs2.getInt("Dept_id");
				System.out.println("Name : "+name+" Department id: "+did);
				
			}
			st.close();
			st2.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}