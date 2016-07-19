package pw2;
import java.util.Date;
import javax.jdo.annotations.*;

@PersistenceCapable (identityType=IdentityType.APPLICATION)
public class Cliente {
	@PrimaryKey
	 @Persistent(valueStrategy=IdGeneratorStrategy.SEQUENCE)
	 private Long id_cliente;
	 @Persistent 
	 private String nombre;
	 @Persistent 
	 private String apellidop;
	 @Persistent 
	 private String apellidom;
	 @Persistent
	 private String estado;
	 @Persistent
	 private String sexo;
	 @Persistent
	 private String ocupacion;
	 @Persistent
	 private String dni;
	 @Persistent
	 private String direccion;
	 @Persistent
	 private String lugar;
	 @Persistent
	 private String telefono;
	 @Persistent
	 private String email;
	 @Persistent
	 private Date fecha;
	
	 public Cliente(String nombre, String apellidop, String apellidom, String estado, String sexo, String ocupacion, String dni, String direccion,
			 String lugar, String telefono, String email){
	  this.nombre = nombre;
	  this.apellidop = apellidop;
	  this.apellidom = apellidom;
	  this.estado = estado;
	  this.sexo = sexo;
	  this.ocupacion = ocupacion;
	  this.dni = dni;
	  this.direccion = direccion;
	  this.lugar = lugar;
	  this.telefono = telefono;
	  this.email = email;
	  this.fecha = new Date();
	 }

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidop() {
		return apellidop;
	}

	public void setApellidop(String apellidop) {
		this.apellidop = apellidop;
	}

	public String getApellidom() {
		return apellidom;
	}

	public void setApellidom(String apellidom) {
		this.apellidom = apellidom;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}

