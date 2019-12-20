import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet1() {
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
		String dbname="plice_station";
		String username="root";
		String password="";
		Statement s1;
		ResultSet rs1;
		Connection con;
		String ap=request.getParameter("val");
		int n=Integer.parseInt(request.getParameter("n"));
		
		try{
			
			Class.forName(driver);
			con=DriverManager.getConnection(url+dbname,username,password);
			String query1="select area,phno from plice_station";
			s1=con.createStatement();
			rs1=s1.executeQuery(query1);
			
			switch(n)
			{
			case 1:
				int c=0;
				while(rs1.next())
				{
					if(rs1.getString("area").equals(ap))
					{
						out.println();
						out.println(rs1.getString(1));
						out.println(rs1.getString(2));
						c=1;
					}
				}
				if(c==0)
					out.println("NOT FOUND ");
				
				break;
				
			case 2:
				int c1=0;
				while(rs1.next())
				{
					if(rs1.getString("phno").equals(ap))
					{
						out.println();
						out.println(rs1.getString(1));
						out.println(rs1.getString(2));
						c1=1;
					}
				}
				if(c1==0)
					out.println("NOT FOUND");
				
				break;
				
				
			}	
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