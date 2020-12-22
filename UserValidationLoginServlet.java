package validationofuserlogin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserValidationLoginServlet")
public class UserValidationLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String myuser = "trevor";
		String mypassword = "trevorpass";
		if (username.equalsIgnoreCase(myuser) && password.equals(mypassword)){
			response.sendRedirect("validationofuserdashboard.html");
		} else {
			response.getWriter().println("Login Failed! Go back to try again");
			
			
		}
		
	}

}
