package pw2;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import pw2.Historia;
import pw2.PMF;

public class HistoriaDatos {

	
	public static void insertar(String numero,String dni_cliente,String fecha,String nombreMascota,String fechaNac,String especie, String raza,String sexo, 
	 		String persona,String relacion,String medico,String especialidad,
		 		/*String consulta, String tiempodeConvivencia,String convive,String dieta,String expuesto,String tratamiento,
		 		String reaccionAdversa,*/
	 			String sintomasGenerales,String herencia,
		 		String piel, String descripsionTegumentario, String anormalias,String decripsionAnormalias,
		 		String tos, String tosproductiva,String estornudos, String descargaNasal,String disnea,
		 		String descripsionRespiratorio,String descripsionCardiovascular,String descripsionDigestivo,
		 		String descripsionUrinario, String descripsionNervioso, String descripsionOcular,
		 		String descripsionAuditivo, String descripsionComportamiento,String descripsionTrofico,
		 		String otrosSintomas,String comentario,String Diagnostico,String pronostico, String tratamientoGeneral){
		
		
		
		final PersistenceManager pm = PMF.get().getPersistenceManager();

		 final Historia historia = new Historia(numero,dni_cliente,fecha, nombreMascota, fechaNac, especie, raza, sexo, 
			 		persona,relacion,medico, especialidad,
			 		/*consulta,tiempodeConvivencia,convive,dieta,expuesto,tratamiento,
			 		reaccionAdversa,*/
			 		sintomasGenerales,herencia,
			 		piel, descripsionTegumentario,anormalias,decripsionAnormalias,
			 		tos,tosproductiva,estornudos,descargaNasal,disnea,
			 		descripsionRespiratorio,descripsionCardiovascular,descripsionDigestivo,
			 		descripsionUrinario,descripsionNervioso, descripsionOcular,
			 		descripsionAuditivo,descripsionComportamiento, descripsionTrofico,
			 		otrosSintomas,comentario, Diagnostico,pronostico, tratamientoGeneral);
		
		 pm.makePersistent(historia);
		}
		
		@SuppressWarnings("unchecked")
		public static List<Historia> VerHistorias(){
		 final PersistenceManager pm = PMF.get().getPersistenceManager();
		 final Query query = pm.newQuery(Historia.class);
		 return (List<Historia>) query.execute();
		
	}
		
}
