package pw2;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.jdo.Query;
import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*import tienda.online.PMF;
import tienda.online.Persona;
import tienda.online.Producto;*/
@SuppressWarnings("serial")
public class ActualizarCliente extends HttpServlet{
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String cod= request.getParameter("usuario");
		int b=0;
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
//		Query q = pm.newQuery(Alumno.class,"name='miguel'");
		String query = "select from " +Cliente.class.getName();
		Query q = pm.newQuery(query);
		q.setFilter("nombre == nombreParam");
		q.declareParameters("String nombreParam");
		
		try {
			List<Cliente> cli = (List<Cliente>)q.execute(cod);
			
			for (Cliente b1 : cli) {
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
		
				
				/*UserService us = UserServiceFactory.getUserService();
				User user = us.getCurrentUser();*/
				/*List<Administrador> admi = AdministradorDatos.verAdministrador();
				for (int i = 0; i < admi.size(); i++) {
					if( email.equalsIgnoreCase(admi.get(i).getEmailA())){
						RequestDispatcher rd = getServletContext()
								.getRequestDispatcher("/Error1.jsp");
						rd.forward(request, response);
					}
				}*/
				
				/*List<Cliente> cliente = ClienteDatos.VerCliente();
				for (int i = 0; i < cliente.size(); i++) {
					if(dni.equalsIgnoreCase(cliente.get(i).getDni()) || email.equalsIgnoreCase(cliente.get(i).getEmail())){
						RequestDispatcher rd = getServletContext()
								.getRequestDispatcher("/Error1.jsp");
						rd.forward(request, response);
					}
				}
				
				List<Medico> medico = MedicoDatos.verMedico();
				for (int i = 0; i < medico.size(); i++) {
					if(dni.equalsIgnoreCase(medico.get(i).getdni()) || email.equalsIgnoreCase(medico.get(i).getEmail())){
						RequestDispatcher rd = getServletContext()
								.getRequestDispatcher("/Error1.jsp");
						rd.forward(request, response);
					}
				}*/
				
				b1.setNombre("nombre");
				b1.setApellidop("apellidop");
				b1.setApellidom("apellidom");
		
				b1.setEstado("estado");
		

				b1.setSexo("sexo");
				b1.setOcupacion("ocupacion");
				b1.setDni("dni");
				b1.setDireccion("direccion");

				b1.setDireccion("direccion"+"/"+"numero"+"/"+"distrito"+"/"+"provincia"+"/"+"departamento");
				b1.setTelefono("telefono");
				b1.setEmail("email");
				
				
				
				RequestDispatcher rd = getServletContext()
						.getRequestDispatcher("/Confirma.jsp");
				rd.forward(request, response);
				break;
				

			} 
				
			}
		}catch(Exception e){
		}finally{
			q.closeAll();
		}
	}
}
