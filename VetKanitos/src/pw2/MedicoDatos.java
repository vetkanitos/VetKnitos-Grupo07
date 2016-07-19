package pw2;

import java.util.List;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class MedicoDatos {

	public static void insertar(String nombre, String apellidop, String apellidom,
			String fechanac, String estado, String dni, String sexo, String especialidad, String cmvp,
			String direccion, String lugar, String email, String telefono){
	
	 final PersistenceManager pm = PMF.get().getPersistenceManager();
	
	 final Medico medico = new Medico(nombre, apellidop, apellidom,
				fechanac, estado, dni, sexo, especialidad, cmvp,
				direccion, lugar, email, telefono);

	 pm.makePersistent(medico);
	}
	
	@SuppressWarnings("unchecked")
	public static List<Medico> verMedico(){
	 final PersistenceManager pm = PMF.get().getPersistenceManager();
	 final Query query = pm.newQuery(Medico.class);
	 return (List<Medico>) query.execute();
	}
}