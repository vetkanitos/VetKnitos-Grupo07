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
public class RegistrarMedico extends HttpServlet {

	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
		
			if (request.getParameter("action").equals("create")) {

				String nombre = request.getParameter("nombre");
				String apellidop = request.getParameter("apellidop");
				String apellidom = request.getParameter("apellidom");
				String dia = request.getParameter("dia");
				String mes = request.getParameter("mes");
				String anio = request.getParameter("anio");
				String fechanac = dia + "/" + mes + "/" + anio;
				String estado = request.getParameter("estado");
				String dni = request.getParameter("dni");
				String sexo = request.getParameter("sexo");
				String especialidad = request.getParameter("especialidad");
				String cmvp = request.getParameter("cmvp");
				String direccion = request.getParameter("direccion");
				String numero = request.getParameter("numero");
				String distrito = request.getParameter("distrito");
				String provincia = request.getParameter("provincia");
				String departamento = request.getParameter("departamento");
				String direccionm = direccion + " - " + numero + " / "+ distrito + " / " + provincia + " / " + departamento;
				String lugar = request.getParameter("lugar");
				String email = request.getParameter("email");
				String telefono = request.getParameter("telefono");

				
				
				MedicoDatos.insertar(nombre, apellidop, apellidom, fechanac,
						estado, dni, sexo, especialidad, cmvp, direccionm,
						lugar, email, telefono);

				RequestDispatcher rd = getServletContext()
						.getRequestDispatcher("/jsp/Confirma.jsp");
				rd.forward(request, response);

			} else if (request.getParameter("action").equals("show")) {

				List<Medico> medicos = MedicoDatos.verMedico();
				request.setAttribute("verMedico", medicos);
				//System.out.println(medicos.get(0).getNombre());

				RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/verMedico.jsp");
				rd.forward(request, response);
				
			} else if (request.getParameter("action").equals("borrar")) {
				UserService us = UserServiceFactory.getUserService();
				User user = us.getCurrentUser();
				List<Administrador> admi = AdministradorDatos.verAdministrador();
				for (int i = 0; i < admi.size(); i++) {
				if(user.getEmail().equalsIgnoreCase( admi.get(i).getAdm())){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/BorrarMedico.jsp");
				rd.forward(request, response);
				 }else if(i==admi.size()-1){
					 
						RequestDispatcher rd = getServletContext().getRequestDispatcher("/Denegado.jsp");
						rd.forward(request, response);
				 }
				}
		
				


			} else if (request.getParameter("action").equals("red")) {
				UserService us = UserServiceFactory.getUserService();
				User user = us.getCurrentUser();
				List<Administrador> admi = AdministradorDatos.verAdministrador();
				for (int i = 0; i < admi.size(); i++) {
				if(user.getEmail().equalsIgnoreCase( admi.get(i).getAdm())){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/nuevoMedico.jsp");
				rd.forward(request, response);
				 }else if(i==admi.size()-1){
					 
						RequestDispatcher rd = getServletContext().getRequestDispatcher("/Denegado.jsp");
						rd.forward(request, response);
				 }
				}
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
