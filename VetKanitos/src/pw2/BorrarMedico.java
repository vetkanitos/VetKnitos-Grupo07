package pw2;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;


@SuppressWarnings("serial")
public class BorrarMedico extends HttpServlet {

	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	try {
			if (request.getParameter("action").equals("borrar")) {
				
				String dni = request.getParameter("dni");
				PersistenceManager pm = PMF.get().getPersistenceManager();
				 //Escoje toda la clase medico
				final Query q = pm.newQuery(Medico.class);
				//filtra por DNI
				q.setFilter("dni == dniParam");
				//Apuntador
				q.declareParameters("String dniParam");

				
				try{
					@SuppressWarnings("unchecked")
					List<Medico> medicos = (List<Medico>) q.execute(dni);

					for(Medico p: medicos){
						
						pm.deletePersistent(p);
						
					}
					RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/Confirma.jsp");
					rd.forward(request, response);

				}catch(Exception e){
					
				}finally{
					 q.closeAll();
				}
			
			}	
	
	} catch (Exception e) {
		RequestDispatcher rd = getServletContext()
				.getRequestDispatcher("/WEB-INF/Error.jsp");
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
