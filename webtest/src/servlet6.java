import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet6")
public class servlet6 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public servlet6() {
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
		
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/";
		String dbname="emp";
		String username="root";
		String password="";
		Connection con;
		PreparedStatement pst;
		Statement st1;
		ResultSet rs1;
		boolean rs;
		String empid=request.getParameter("empid");
		String empname=request.getParameter("empname");
		String address=request.getParameter("address");
		String dob=request.getParameter("dob");
		
		try{
			Class.forName(driver);
			con=DriverManager.getConnection(url+dbname,username,password);
		
			
			String qry1="insert into emp values(?,?,?,?)";
			
			pst=con.prepareStatement(qry1);
			pst.setString(1, empid);
			pst.setString(2, empname);
			pst.setString(3, address);
			pst.setString(4, dob);
			rs=pst.execute();
			
			out.print("Inserted successfully");
			
			String query2="select * from emp";
			st1=con.createStatement();
			rs1=st1.executeQuery(query2);
			out.println("<table><tr><th>EMPID</th><th>EMPNAME</th><th>ADDRESS</th><th>DOB</th></tr>");
			while(rs1.next())
			{
				String empid1=rs1.getString(1);
				String empname1=rs1.getString(2);
				String address1=rs1.getString(3);
				String dob1=rs1.getString(4);
				out.println("<tr><td>"+empid1+"</td><td>"+empname1+"</td><td>"+address1+"</td><td>"+dob1+"</td></tr>");
				
			}
			out.println("</table>");
			
		}
		catch(Exception e)
		{
			out.print(e);
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