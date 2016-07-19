package pw2;

import javax.jdo.annotations.*;


@PersistenceCapable (identityType=IdentityType.APPLICATION)
public class Mascota {
	
	 @PrimaryKey
	 @Persistent(valueStrategy=IdGeneratorStrategy.SEQUENCE)
	 private Long id; 
	 @Persistent 
	 private String nombre;
	 @Persistent
	 private String dni_cliente;
	 @Persistent 
	 private String especie;
	 @Persistent 
	 private String raza; 
	 @Persistent
	 private String sexo;
	 @Persistent
	 private String direccion;
	 @Persistent
	 private String fechaNacimiento;
	 @Persistent
	 private String color;
	 @Persistent
	 private String descripcion;

	 
 
	 
	 public Mascota(String nombre,String dni_cliente, String especie, String raza,  String sexo, String direccion, String fechaNacimiento,String color,String descripcion  ){
		 
		 this.nombre = nombre;
		 this.dni_cliente=dni_cliente;
		 this.especie =especie;
		 this.raza =raza;
	 	 this.sexo=sexo;		
		 this.direccion=direccion;	
		 this.fechaNacimiento=fechaNacimiento;
		 this.color=color;
		 this.descripcion=descripcion;
	 
	 }




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getEspecie() {
		return especie;
	}




	public void setEspecie(String especie) {
		this.especie = especie;
	}




	public String getRaza() {
		return raza;
	}




	public void setRaza(String raza) {
		this.raza = raza;
	}




	public String getSexo() {
		return sexo;
	}




	public void setSexo(String sexo) {
		this.sexo = sexo;
	}




	public String getDireccion() {
		return direccion;
	}




	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}




	public String getFechaNacimiento() {
		return fechaNacimiento;
	}




	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public String getDescripcion() {
		return descripcion;
	}




	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}




	public String getDni_cliente() {
		return dni_cliente;
	}




	public void setDni_cliente(String dni_cliente) {
		this.dni_cliente = dni_cliente;
	}


}