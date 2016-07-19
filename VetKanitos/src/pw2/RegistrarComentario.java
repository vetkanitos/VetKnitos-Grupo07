package pw2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import javax.servlet.RequestDispatcher;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@SuppressWarnings("serial")
public class RegistrarComentario extends HttpServlet {

	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {
			if (request.getParameter("action").equals("create")) {

				String comentario = request.getParameter("comentario");
				String calificacion= request.getParameter("calificacion");

				ComentarioDatos.insertar(comentario, calificacion);
				//Redireccion de un servlet a un jsp
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/Confirma.jsp");
				rd.forward(request, response);

			} 
			else if (request.getParameter("action").equals("show")) {

				List<Comentario> comentario = ComentarioDatos.verComentario();
				System.out.println(comentario.get(0).getComentario());
				request.setAttribute("verMedico", comentario);
				System.out.println(comentario.get(0).getComentario());
				
				//redireccion de un servlet a un jsp
				RequestDispatcher rd = getServletContext().getRequestDispatcher("index.jsp");
				rd.forward(request, response);
				
		

			} else if (request.getParameter("action").equals("red")) {

				
					RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/Comentario.jsp");
					rd.forward(request, response);
		
			}
		} catch (Exception e) {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/Error.jsp");
			rd.forward(request, response);
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