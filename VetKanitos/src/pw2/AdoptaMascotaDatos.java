package pw2;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import pw2.PMF;
//import pw2.Persona;
import pw2.AdoptaMascota;

public class AdoptaMascotaDatos {
	public static void insertar(String nombre, String rutaImagen, String raza, String sexo,
			String informacion){
	
	 final PersistenceManager pm = PMF.get().getPersistenceManager();

	 final AdoptaMascota adopta = new AdoptaMascota( nombre, rutaImagen,raza,sexo,informacion);
	
	 pm.makePersistent(adopta);
	}
		
		@SuppressWarnings("unchecked")
		public static List<AdoptaMascota> verAdopta(){
		 final PersistenceManager pm = PMF.get().getPersistenceManager();
		 final Query query = pm.newQuery(AdoptaMascota.class);
		 return (List<AdoptaMascota>) query.execute();
		}

}
