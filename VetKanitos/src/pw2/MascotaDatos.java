package pw2;
import java.util.List;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class MascotaDatos {
	private final static int FETCH_MAX_RESULTS = 50;
	static PersistenceManager pm = PMF.get().getPersistenceManager();
	public static void insertar(String nombre,String dni_cliente,String especie, String raza,  String sexo, String direccion, String fechaNacimiento,String color,String descripcion  ){
	
	 final PersistenceManager pm = PMF.get().getPersistenceManager();

	 final Mascota mascota = new Mascota(nombre, dni_cliente,especie, raza, sexo,direccion,fechaNacimiento,color,descripcion);
	 pm.makePersistent(mascota);
	 
	}
	@SuppressWarnings("unchecked")
	public static List<Mascota> verMascota(){
	 final PersistenceManager pm = PMF.get().getPersistenceManager();
	 final Query query = pm.newQuery(Mascota.class);
	 return (List<Mascota>) query.execute();
	}
	
	
	
	//Cuantos datos mostrara en la consulta
	/*private final static int FETCH_MAX_RESULTS = 50;
	/*static PersistenceManager pm = PMF.get().getPersistenceManager();
	//Metodo para insertar un dato
	public static void insertar(String nombre,String dniMascota, String especie, String raza,  String sexo, String direccion, String fechaNacimiento,String color,String descripcion  ){
	 //LLamamos a la clase que tendra la persistencia

	 //Creamos nuestra variable del tipo Persona
		final Mascota miMascota = new Mascota(nombre,dniMascota, especie, raza, sexo,direccion,fechaNacimiento,color,descripcion);
	 //Y hacemos el dato que sea persistente
	 pm.makePersistent(miMascota);
	}*/
		


	//Consulta para los 
	@SuppressWarnings("unchecked")
	public static List<Cliente> tutorialesPorId(long id){
	 final PersistenceManager pm = PMF.get().getPersistenceManager();
	 String query = " select from " +
	 Cliente.class.getName() +
	 " where id == '" +
	 id + "'";
	 List<Cliente> ids = (List<Cliente>)pm.newQuery(query).execute();
	 return(ids);
	}


	//Para consulta todos los alumnos
	@SuppressWarnings("unchecked")
	public static List<Mascota> todosLosMascota(){
	 final PersistenceManager pm = PMF.get().getPersistenceManager();
	 final Query query = pm.newQuery(Mascota.class);
	query.setRange(0, FETCH_MAX_RESULTS);
	 return (List<Mascota>) query.execute();
	}
	//Consulta Apellido Materno
	@SuppressWarnings("unchecked")
	public static List<Cliente> porApellidoMaterno(String apellidoMaterno){
	 final PersistenceManager pm = PMF.get().getPersistenceManager();
	 String query = " select from " +
	 Cliente.class.getName() +
	 " where apellidoMaterno == '" +
	 apellidoMaterno + "'";
	 List<Cliente> apellidoM= (List<Cliente>)pm.newQuery(query).execute();
	 return(apellidoM);
	}

	//Consulta Apellido Paterno
	@SuppressWarnings("unchecked")
	public static List<Cliente> porApellidoPaterno(String apellidoPaterno){
	 final PersistenceManager pm = PMF.get().getPersistenceManager();
	 String query = " select from " +
			 Cliente.class.getName() +
	 " where apellidoPaterno == '" +
	 apellidoPaterno + "'";
	 List<Cliente> apellidoP= (List<Cliente>)pm.newQuery(query).execute();
	 return(apellidoP);
	}

	//Consultar los usuarios registrados
	@SuppressWarnings("unchecked")
	public static List<Cliente> porUsuario(String usuario){
	 final PersistenceManager pm = PMF.get().getPersistenceManager();
	 String query = " select from " +
			 Cliente.class.getName() +
	 " where usuario == '" +
	 usuario + "'";
	 List<Cliente> usuarios = (List<Cliente>)pm.newQuery(query).execute();
	 return(usuarios);
	}
	public static void EliminarTodo(Cliente persona) {
		pm.deletePersistent(persona);
	}
}