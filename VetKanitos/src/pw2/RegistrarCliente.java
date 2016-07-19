package pw2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import java.util.List;

import javax.servlet.RequestDispatcher;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@SuppressWarnings("serial")
public class RegistrarCliente extends HttpServlet {

	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try{
		
			if (request.getParameter("action").equals("create")) {
				
				
				String nombre = request.getParameter("nombre");
				String apellidop = request.getParameter("apellidop");
				String apellidom = request.getParameter("apellidom");
		
				String estado = request.getParameter("estado");
		

				String sexo = request.getParameter("sexo");
				String ocupacion = request.getParameter("ocupacion");
				String dni = request.getParameter("dni");
				String direccion = request.getParameter("direccion");
				String numero = request.getParameter("numero");
				String distrito = request.getParameter("distrito");
				String provincia = request.getParameter("provincia");
				String departamento = request.getParameter("departamento");
				String direccionp = direccion + " - " + numero + " / "
						+ distrito + " / " + provincia + " / "
						+ departamento;
				String lugar = request.getParameter("lugar");
				String telefono = request.getParameter("telefono");
				String email = request.getParameter("email");
				
				ClienteDatos.insertar(nombre, apellidop, apellidom,
						estado, sexo, ocupacion, dni,
						direccionp, lugar, telefono, email);
				
				RequestDispatcher rd = getServletContext()
						.getRequestDispatcher("/jsp/Confirma.jsp");
				rd.forward(request, response);
				

			} else if (request.getParameter("action").equals("show")) {
				
				List<Cliente> cliente = ClienteDatos.VerCliente();
				request.setAttribute("VerCliente", cliente);
				RequestDispatcher rd = getServletContext()
						.getRequestDispatcher("/jsp/VerCliente.jsp");
				rd.forward(request, response);
				
			}
					else if(request.getParameter("action").equals("red")){

				 	UserService us = UserServiceFactory.getUserService();
					User user = us.getCurrentUser();
					List<Administrador> admi = AdministradorDatos.verAdministrador();
					for (int i = 0; i < admi.size(); i++) {
					if(user.getEmail().equalsIgnoreCase( admi.get(i).getAdm())){
					RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/NuevoCliente.jsp");
					rd.forward(request, response);
					}else if(i==admi.size()-1){
						 
							RequestDispatcher rd = getServletContext().getRequestDispatcher("/Denegado.jsp");
							rd.forward(request, response);
					 }
					}
			}
			
		}
			catch (Exception e) {
				RequestDispatcher rd = getServletContext()
						.getRequestDispatcher("/jsp/Error.jsp");
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
