package pw2;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@SuppressWarnings("serial")
public class RegistrarHistoria extends HttpServlet{
	
	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {
			if (request.getParameter("action").equals("create")) {
				
				String numero = request.getParameter("numero");
				String dni_cliente=request.getParameter("dni_cliente");
				String fecha=request.getParameter("fecha");
				String nombreMascota=request.getParameter("nombreMascota");
				String fechaNac=request.getParameter("fechaNac");
				String especie=request.getParameter("especie");
				String raza=request.getParameter("raza");
				String sexo=request.getParameter("sexo"); 
		 		String persona=request.getParameter("persona");
		 		String relacion=request.getParameter("relacion");
		 		String medico=request.getParameter("medico");
		 		String especialidad=request.getParameter("especialidad");
			 		String sintomasGenerales=request.getParameter("sintomasGenerales");
			 		String herencia=request.getParameter("herencia");
			 		String piel=request.getParameter("piel");
			 		String descripsionTegumentario=request.getParameter("descripsionTegumentaria"); 
			 		String anormalias=request.getParameter("anormalias");
			 		String decripsionAnormalias=request.getParameter("descripsionAnormalias");
			 		String tos=request.getParameter("tos");
			 		String tosproductiva=request.getParameter("tosproductiva");
			 		String estornudos=request.getParameter("estornudos");
			 		String descargaNasal=request.getParameter("descargaNasal");
			 		String disnea=request.getParameter("disnea");
			 		String descripsionRespiratorio=request.getParameter("descripsionRespiratorio");
			 		String descripsionCardiovascular=request.getParameter("descripsionCardiovascular");
			 		String descripsionDigestivo=request.getParameter("descripsionDigestivo");
			 		String descripsionUrinario=request.getParameter("descripsionUrinario");
			 		String descripsionNervioso=request.getParameter("descripsionNervioso");
			 		String descripsionOcular=request.getParameter("descripsionOcular");
			 		String descripsionAuditivo=request.getParameter("descripsionAuditvo");
			 		String descripsionComportamiento=request.getParameter("descripsionComportamiento");
			 		String descripsionTrofico=request.getParameter("descripsionTrofico");
			 		String otrosSintomas=request.getParameter("OtrosSintomas");
			 	
				
				String comentario = request.getParameter("comentario");
				String Diagnostico = request.getParameter("Diagnostico");
				String pronostico = request.getParameter("pronostico");
				String tratamientoGeneral = request.getParameter("tratamientoGeneral");
		
				
				HistoriaDatos.insertar(numero,dni_cliente,fecha, nombreMascota, fechaNac, especie, raza, sexo, 
				 		persona,relacion,medico, especialidad,
				 		sintomasGenerales,herencia,
				 		piel, descripsionTegumentario,anormalias,decripsionAnormalias,
				 		tos,tosproductiva,estornudos,descargaNasal,disnea,
				 		descripsionRespiratorio,descripsionCardiovascular,descripsionDigestivo,
				 		descripsionUrinario,descripsionNervioso, descripsionOcular,
				 		descripsionAuditivo,descripsionComportamiento, descripsionTrofico,
				 		otrosSintomas,comentario,Diagnostico,pronostico,tratamientoGeneral);
				
				RequestDispatcher rd = getServletContext()
						.getRequestDispatcher("/Confirma.jsp");
				rd.forward(request, response);
				

			} else if (request.getParameter("action").equals("show")) {
				
				List<Historia> historia = HistoriaDatos.VerHistorias();
				request.setAttribute("VerHistorias", historia);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/VerHistorias.jsp");
				rd.forward(request, response);
				
			}
			else if(request.getParameter("action").equals("red")){
				
				 UserService us = UserServiceFactory.getUserService();
					User user = us.getCurrentUser();
					List<Medico> medico=MedicoDatos.verMedico();
					//List<Administrador> admi = AdministradorDatos.verAdministrador();
					for (int i = 0; i < medico.size(); i++) {
					/*if(user.getEmail().equals(admi.get(i).getAdm())){*/
					if(user.getEmail().equalsIgnoreCase( medico.get(i).getEmail())){
					RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/NuevaHistoria.jsp");
					rd.forward(request, response);
					}else if(i==medico.size()-1){
						 
							RequestDispatcher rd = getServletContext().getRequestDispatcher("/Denegado.jsp");
							rd.forward(request, response);
					 }
					}
			}else if(request.getParameter("action").equals("buscar")){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/BusquedaHistorias.jsp");
				rd.forward(request, response);
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
