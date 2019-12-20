import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet13")
public class servlet13 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet13() {
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
		
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/";
		String dbname="college";
		String user="root";
		String pass="";
		
		Connection con;
		try{
			
			Class.forName(driver);
			con=DriverManager.getConnection(url+dbname,user,pass);
			String q1="select * from student where cgpa < 9";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(q1);
			while(rs.next())
			{
				out.println(rs.getString(1)+rs.getString(2)+rs.getString(3));
			}
			
			String q2="select studid,name,cgpa from student";
			Statement st1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs1=st1.executeQuery(q2);
			while(rs1.next())
			{
				if(rs1.getString("name").equals("John"))
				{
			rs1.updateDouble("cgpa",9.4);
			rs1.updateRow();
			out.println("UPDATED");
				}
			}
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