package pw2;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class DatosReceta {

	public static void insertar(String numeroReceta,String dni_dueño, String nombreMedico, String fecha , String nombreMascota, String medicamento,
			 String tratamiento,String Vacunas,String dosis,String fechavacuna){
	
	 final PersistenceManager pm = PMF.get().getPersistenceManager();

	 final Receta receta = new Receta(numeroReceta,dni_dueño,nombreMedico,fecha ,nombreMascota,medicamento,
			 tratamiento,Vacunas,dosis,fechavacuna);
	
	 pm.makePersistent(receta);
	}
	
	@SuppressWarnings("unchecked")
	public static List<Receta> VerReceta(){
	 final PersistenceManager pm = PMF.get().getPersistenceManager();
	 final Query query = pm.newQuery(Receta.class);
	 return (List<Receta>) query.execute();
	}
	
}
