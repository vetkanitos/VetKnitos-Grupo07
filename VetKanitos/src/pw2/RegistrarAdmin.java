package pw2;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@SuppressWarnings("serial")
public class RegistrarAdmin extends HttpServlet {

	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("action").equals("adm")) {
			
			String adm = request.getParameter("emailA");
			AdministradorDatos.insertar(adm);
			
			RequestDispatcher rd = getServletContext()
					.getRequestDispatcher("/menu.jsp");
			rd.forward(request, response);
			
		}
		else if(request.getParameter("action").equals("admi")){
			UserService us = UserServiceFactory.getUserService();
			User user = us.getCurrentUser();
			List<Administrador> admi = AdministradorDatos.verAdministrador();
			for (int i = 0; i < admi.size(); i++) {
			if(user.getEmail().equalsIgnoreCase( admi.get(i).getAdm())){
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/NuevoAdministrador.jsp");
			rd.forward(request, response);
			 }else if(i==admi.size()-1){
				 
					RequestDispatcher rd = getServletContext().getRequestDispatcher("/Denegado.jsp");
					rd.forward(request, response);
			 }
			}
		}
		else if (request.getParameter("action").equals("show")) {
			UserService us = UserServiceFactory.getUserService();
			User user = us.getCurrentUser();
			List<Administrador> admi = AdministradorDatos.verAdministrador();
			for (int i = 0; i < admi.size(); i++) {
			if(user.getEmail().equalsIgnoreCase( admi.get(i).getAdm())){
			request.setAttribute("verAdministrador", admi);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/VerAdministrador.jsp");
			rd.forward(request, response);
			 }else if(i==admi.size()-1){
				 
					RequestDispatcher rd = getServletContext().getRequestDispatcher("/Denegado.jsp");
					rd.forward(request, response);
			 }
			}
	}
		
	}
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
}