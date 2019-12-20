import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet11")
public class servlet11 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet11() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Scanner input=new Scanner(System.in);
		
		Connection con;
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/";
		String dbname="fac";
		String username="root";
		String password="";
		try{
			Class.forName(driver);
			con=DriverManager.getConnection(url+dbname,username,password);
			String q1="select * from fac";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(q1);
			while(rs.next())
			{
				
			}
			String sub="java";
			int id=1;
			String q2="update fac set subName='"+sub+"' where subID="+id+"";
			Statement st1=con.createStatement();
			int rs1=st1.executeUpdate(q2);
			out.println(rs1);
		
	}
		catch(Exception e)
		{
			out.println(e);
		
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}