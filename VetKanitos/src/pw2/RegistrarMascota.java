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
public class RegistrarMascota extends HttpServlet {

	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try{
			if (request.getParameter("action").equals("create")) {

				String nombre = request.getParameter("nombre");
				String dni_cliente=request.getParameter("dni_cliente");
				String 			
				/* }else if(i==med.size()-1){
				 
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/Denegado.jsp");
				rd.forward(request, response);
		 }
	}*/especie = request.getParameter("especie");
				String raza = request.getParameter("raza");				 
				String sexo = request.getParameter("sexo");
				String direccion = request.getParameter("direccion");
				String distrito = request.getParameter("distrito");
				String provincia = request.getParameter("provincia");
				String departamento = request.getParameter("departamento");
				String direccionp = direccion + " - "
						+ distrito + " / " + provincia + " / "
						+ departamento;
				String fechaNacimiento = request.getParameter("fechaNacimiento");
				String color = request.getParameter("color");
				String descripcion = request.getParameter("descripcion");
			 			
				
				MascotaDatos.insertar(nombre,dni_cliente,especie, raza, sexo,direccionp,fechaNacimiento,color,descripcion);
				//Redireccion de un servlet a un jsp
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/Confirma.jsp");
				rd.forward(request, response);

			} 
			else if (request.getParameter("action").equals("show")) {
				

				List<Mascota> mascota = MascotaDatos.verMascota();
				request.setAttribute("verMascota", mascota);
				
				//redireccion de un servlet a un jsp
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/VerMascota.jsp");
				rd.forward(request, response);
				
			} else if (request.getParameter("action").equals("borrar")) {

					RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/BorrarMascota.jsp");
					rd.forward(request, response);

			} else if (request.getParameter("action").equals("red")) {
				UserService us = UserServiceFactory.getUserService();
				User user = us.getCurrentUser();
				List<Administrador> admi = AdministradorDatos.verAdministrador();
				for (int i = 0; i < admi.size(); i++) {
				if(user.getEmail().equalsIgnoreCase( admi.get(i).getAdm())){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/NuevaMascota.jsp");
				rd.forward(request, response);
				 }else if(i==admi.size()-1){
					 
						RequestDispatcher rd = getServletContext().getRequestDispatcher("/Denegado.jsp");
						rd.forward(request, response);
				 }
				}
		}else if (request.getParameter("action").equals("buscar")) {

			RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/Busqueda.jsp");
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