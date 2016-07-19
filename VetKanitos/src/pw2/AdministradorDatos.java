package pw2;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;



public class AdministradorDatos {
	
	public static void insertar(String user){
		 final PersistenceManager pm = PMF.get().getPersistenceManager();
		 final Administrador administrador = new Administrador(user);
		 pm.makePersistent(administrador);
		}
		
		@SuppressWarnings("unchecked")
		public static List<Administrador> verAdministrador(){
		 final PersistenceManager pm = PMF.get().getPersistenceManager();
		 final Query query = pm.newQuery(Administrador.class);
		 return (List<Administrador>) query.execute();
		}
}
