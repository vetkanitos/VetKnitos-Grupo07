package pw2;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pw2.Busqueda;
import pw2.Historia;
@SuppressWarnings("serial")
public class BuscarMascota extends HttpServlet {
	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {
			if (request.getParameter("action").equals("dni_cliente")) {
				/*String dni_cliente = request.getParameter("dni_cliente");
				 request.setAttribute("dni_cliente", dni_cliente);
			     List<Historia> historias = Busqueda.buscardni(dni_cliente);
			     request.setAttribute("historias", historias);
			     request.setAttribute("dni_cliente", dni_cliente);
			     RequestDispatcher rd = getServletContext().getRequestDispatcher("/MascotasBuscadas.jsp");
			     rd.forward(request, response);*/
			     
			     String dni_cliente = request.getParameter("dni_cliente");
					
					List<Mascota> miMascotas=Busqueda.MascotaDni(dni_cliente);
					List<Cliente> midn=ClienteDatos.ClienteDni(dni_cliente);	
					request.setAttribute("miMascota",miMascotas);
					request.setAttribute("midn",midn);
					RequestDispatcher rd = getServletContext()
							.getRequestDispatcher("/jsp/verHistorialAdm.jsp");
					rd.forward(request, response);	

			} 
			
		} catch (Exception e) {
			 RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/buscarHistoria.jsp");
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
