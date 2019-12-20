import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.tomcat.util.http.parser.Cookie;

/**
 * Servlet implementation class GetCookies
 */
@WebServlet("/getcookies")
public class getcookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getcookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		Cookie[] cookies=request.getCookies();
		String name="";
		String value="";
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		if(cookies==null)
		{
			pw.println("<tr><th colspan=2>no cookies<br>");
		}
		else
		{
		for(int i=0;i<cookies.length;i++)
		{
			name=cookies[i].getName();
			value=cookies[i].getValue();
			pw.println("<tr><td>"+name+"</td><td>value "+value+"</td></tr><br>");
		}
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