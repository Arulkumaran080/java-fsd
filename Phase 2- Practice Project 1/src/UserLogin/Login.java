package UserLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loginServlet")
public class Login extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String userid,pass;
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		try{
			res.setContentType("text/html");
			userid=req.getParameter("id");
			pass=req.getParameter("password");
			PrintWriter out=res.getWriter();
			if(userid.equals("admin") && pass.equals("admin")){
				out.println("Login Successfully");
				out.println("<a href=\"Welcome.html\">Home</a>");
			}
			else{
				out.println("Invalid User name or Password");
				out.println("<a href=\"login.html\">Go back</a>");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
