package pw2;

import java.util.List;

import javax.jdo.PersistenceManager;

import pw2.Historia;
import pw2.PMF;

public class Busqueda {
	public static List<Historia> buscardni(String dni_cliente){
		 final PersistenceManager pm = PMF.get().getPersistenceManager();
		 String query = " select from " +
		 Historia.class.getName() +
		 " where dni_cliente == '" +
		 dni_cliente + "'";
		 @SuppressWarnings("unchecked")
		List<Historia> historias = (List<Historia>)pm.newQuery(query).execute();
		 return(historias);
		}
	
	public static List<Historia> buscarespecialidad(String especialidad){
		 final PersistenceManager pm = PMF.get().getPersistenceManager();
		 String query = " select from " +
		Historia.class.getName() +
		 " where especialidad == '" +
		 especialidad + "'";
		 @SuppressWarnings("unchecked")
		List<Historia> historias = (List<Historia>)pm.newQuery(query).execute();
		 return(historias);
		}
	public static List<Historia> buscarmedico(String medico){
		 final PersistenceManager pm = PMF.get().getPersistenceManager();
		 String query = " select from " +
		 Historia.class.getName() +
		 " where medico == '" +
		 medico + "'";
		 @SuppressWarnings("unchecked")
		List<Historia> historias = (List<Historia>)pm.newQuery(query).execute();
		 return(historias);
		}
	
	//Para consultar los tutoriales por Iddue�o
		@SuppressWarnings("unchecked")
		public static List<Mascota> MascotaDni(String dni_cliente){
		 final PersistenceManager pm = PMF.get().getPersistenceManager();
		 String query = " select from " +
		 Mascota.class.getName() +
		 " where dni_cliente== '" +
		 dni_cliente+ "'";
		 List<Mascota> mimasc= (List<Mascota>)pm.newQuery(query).execute();
		 return(mimasc);
		}
	
}
