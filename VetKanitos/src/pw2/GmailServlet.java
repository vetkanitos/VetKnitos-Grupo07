package pw2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
@SuppressWarnings("serial")
public class GmailServlet  extends HttpServlet {
	 public void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws IOException, ServletException {
		 
		 UserService us = UserServiceFactory.getUserService();
		 User user = us.getCurrentUser();
	 	
		 if(user == null){
			 resp.sendRedirect(us.createLoginURL(req.getRequestURI()));
			 
		 }
		 else{
			 HttpSession sesion= req.getSession(true);
			 sesion.getId();
			// sesion.setAttribute("usuario", "admi");
			 RequestDispatcher rd = req.getRequestDispatcher("/menu.jsp");
			 rd.forward(req, resp);
		 }
	 }
}
