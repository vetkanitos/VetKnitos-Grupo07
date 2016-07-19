package pw2;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@SuppressWarnings("serial")
public class CerrarServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		UserService us = UserServiceFactory.getUserService();
		HttpSession sesion= req.getSession();
		User user = us.getCurrentUser();
	 	
			if(user == null){
	            RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
	   		 	rd.forward(req, resp);
				/*private final static int FETCH_MAX_RESULTS = 40;
				static PersistenceManager pm = PMF.get().getPersistenceManager();
				//Metodo para insertar un dato
				public static void insertar(String nombre,String rutaImagen,String raza,String sexo,String informacion){
				 //LLamamos a la clase que tendra la persistencia
				 //Creamos nuestra variable del tipo Persona
				 final AdoptaMascota produc= new AdoptaMascota(nombre,rutaImagen,raza,sexo,informacion);
				 //Y hacemos el dato que sea persistente
				 pm.makePersistent(produc);
				}
				
				@SuppressWarnings("unchecked")
				public static List<AdoptaMascota> todosAdoptaMascotas(){
				final PersistenceManager pm = PMF.get().getPersistenceManager();
				final Query query = pm.newQuery(AdoptaMascota.class);
				query.setRange(0, FETCH_MAX_RESULTS);
				return (List<AdoptaMascota>) query.execute();
				}

				public static void EliminarTodo(AdoptaMascota adoptaMascota) {
					pm.deletePersistent(adoptaMascota);
				}*/
	        }
	        else{
		
	        	sesion.invalidate();
	        	resp.sendRedirect(us.createLogoutURL(req.getRequestURI()));
	        	
	        }
	}
}
