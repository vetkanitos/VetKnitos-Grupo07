package pw2;

import java.io.IOException;
import java.util.List;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@SuppressWarnings("serial")
public class RegistrarReceta extends HttpServlet {
	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {
			if (request.getParameter("action").equals("create")) {
				String numeroReceta=request.getParameter("numeroReceta");
					String nombreClien= request.getParameter("nombreCliente");
					String apellidop=request.getParameter("apellidop");
				String nombreCliente=nombreClien+" "+apellidop;
				String nombreMedico= request.getParameter("nombreMedico");
				String fecha = request.getParameter("fecha");
				String nombreMascota= request.getParameter("nombreMascota");
				String medicamento= request.getParameter("medicamento");
				
						 String tratamiento= request.getParameter("tratamiento");
						 String Vacunas= request.getParameter("Vacunas");
						 String dosis= request.getParameter("dosis");
						 String fechavacuna= request.getParameter("fechaVacuna");
				
				
				DatosReceta.insertar(numeroReceta,nombreCliente,nombreMedico,fecha ,nombreMascota,medicamento,
						 tratamiento,Vacunas,dosis,fechavacuna);
				
				RequestDispatcher rd = getServletContext()
						.getRequestDispatcher("/Confirma.jsp");
				rd.forward(request, response);
				

			} else if (request.getParameter("action").equals("show")) {
				List<Receta> receta = DatosReceta.VerReceta();
				request.setAttribute("VerReceta", receta);
				RequestDispatcher rd = getServletContext()
						.getRequestDispatcher("/jsp/VerReceta.jsp");
				rd.forward(request, response);
				
			}
			else if(request.getParameter("action").equals("red")){
				
				 	UserService us = UserServiceFactory.getUserService();
					User user = us.getCurrentUser();
					List<Medico> medico=MedicoDatos.verMedico();
					//List<Administrador> admi = AdministradorDatos.verAdministrador();
					for (int i = 0; i < medico.size(); i++) {
					if(user.getEmail().equalsIgnoreCase( medico.get(i).getEmail())){
					RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/NuevaReceta.jsp");
					rd.forward(request, response);
					}else if(i==medico.size()-1){
						 
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
