package hibernate;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		RegisterBean new_user = (RegisterBean)session.getAttribute("urd");
		String fullName = new_user.getFullName();
		String userName = new_user.getUserName();
		String password = new_user.getPassword();
		System.out.println(fullName+""+userName+""+password);
		System.out.println("outside try inside servlet");
		try {
			userDAO ud= new userDAO();
			ud.addUser(fullName,userName,password);
			response.sendRedirect("Success.jsp");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
