package pw2;

import java.io.IOException;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.annotations.Persistent;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RegistrarAdopMasc extends HttpServlet{
	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
	if (request.getParameter("action").equals("create")) {
		
	
	String nombre = request.getParameter("nombre");
	String rutaImagen = "images/"+ request.getParameter("rutaImagen");
	String raza= request.getParameter("raza");
	String sexo=request.getParameter("sexo");
	String informacion=request.getParameter("informacion");
	AdoptaMascotaDatos.insertar(nombre,rutaImagen,raza,sexo,informacion);;
	
	//PersistenceManager pm = PMF.get().getPersistenceManager();
	RequestDispatcher rd = getServletContext()
			.getRequestDispatcher("/Confirma.jsp");
	rd.forward(request, response);
	}else if (request.getParameter("action").equals("show")) {

		List<AdoptaMascota> adopta = AdoptaMascotaDatos.verAdopta();
		request.setAttribute("verAdopta", adopta);
		
		//redireccion de un servlet a un jsp
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/verMascotasAdop.jsp");
		rd.forward(request, response);
	} 
	
	try{
		
	}catch(Exception e){
		System.out.println(e);
		response.getWriter().println("Ocurri� un error, <a href='index.html'>Vuelva a intentarlo</a>");
	}finally{
	}}
	
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
