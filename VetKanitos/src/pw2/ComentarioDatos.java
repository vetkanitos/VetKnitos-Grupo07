package pw2;

import java.util.List;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class ComentarioDatos {

	public static void insertar(String nombre, String apellidop){
	
	 final PersistenceManager pm = PMF.get().getPersistenceManager();
	
	 final Comentario comentario= new Comentario(nombre, apellidop);
	 pm.makePersistent(comentario);
	 
	}	
	
	@SuppressWarnings("unchecked")
	public static List<Comentario> verComentario(){
	 final PersistenceManager pm = PMF.get().getPersistenceManager();
	 final Query query = pm.newQuery(Comentario.class);
	 return (List<Comentario>) query.execute();
	}
}