package pw2;

import java.util.List;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class ClienteDatos {

	public static void insertar(String nombre, String apellidop, String apellidom, String estado,
			String sexo, String ocupacion, String dni, String direccion,
			 String lugar, String telefono, String email){
	
	 final PersistenceManager pm = PMF.get().getPersistenceManager();

	 final Cliente cliente = new Cliente(nombre, apellidop, apellidom, estado,
			  sexo, ocupacion, dni, direccion,
			 lugar, telefono, email);
	
	 pm.makePersistent(cliente);
	}
	
	@SuppressWarnings("unchecked")
	public static List<Cliente> VerCliente(){
	 final PersistenceManager pm = PMF.get().getPersistenceManager();
	 final Query query = pm.newQuery(Cliente.class);
	 return (List<Cliente>) query.execute();
	}
	
	@SuppressWarnings("unchecked")
	public static List<Cliente> ClienteDni(String dni){
	 final PersistenceManager pm = PMF.get().getPersistenceManager();
	 String query = " select from " +
	 Cliente.class.getName() +
	 " where dni== '" +
	 dni+ "'";
	 List<Cliente> midni= (List<Cliente>)pm.newQuery(query).execute();
	 return(midni);
	}
}