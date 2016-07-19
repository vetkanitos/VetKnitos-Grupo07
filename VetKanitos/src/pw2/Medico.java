package pw2;

import java.util.Date;
import java.util.TimeZone;

import javax.jdo.annotations.*;


@PersistenceCapable (identityType=IdentityType.APPLICATION)
public class Medico {
	
	 @PrimaryKey
	 @Persistent(valueStrategy=IdGeneratorStrategy.SEQUENCE)
	 private Long id; 
	 @Persistent 
	 private String nombre;
	 @Persistent 
	 private String apellidop;
	 @Persistent 
	 private String apellidom;
	 @Persistent
	 private String fechanac;
	 @Persistent
	 private String estado;
	 @Persistent
	 private String dni;
	 @Persistent
	 private String sexo;
	 @Persistent
	 private String especialidad;
	 @Persistent
	 private String cmvp;
	 @Persistent
	 private String direccion;
	 @Persistent
	 private String lugar;
	 @Persistent
	 private String email;
	 @Persistent
	 private String telefono;
	 @Persistent
	 private Date fecha;
	 
	 public Medico(String nombre, String apellidop, String apellidom,
				String fechanac, String estado, String dni, String sexo, String especialidad, String cmvp,
				String direccion, String lugar, String email, String telefono){
		 
		 this.nombre = nombre;
		 this.apellidop =apellidop;
		 this.apellidom =apellidom;
		 this.fechanac =fechanac;	
		 this.estado =estado;		
		 this.dni=dni;		
		 this.sexo=sexo;	
		 this.especialidad=especialidad;		
		 this.cmvp=cmvp;		
		 this.direccion=direccion;
		 this.lugar=lugar;
		 this.email=email;
		 this.telefono =telefono;

	  TimeZone.setDefault(TimeZone.getTimeZone("America/Lima"));
	  this.fecha = new Date();
	 }
	
	 public String getNombre() {
	  return nombre;
	 }
	 
	 public String getApellidop() {
		  return apellidop;
		 }
	 public String getApellidom() {
		  return apellidom;
		 }
	 
	 public String getFechanac() {
		  return fechanac;
		 }
	 
	 public String getEstado() {
		  return estado;
		 }
	 
	 public String getEspecialidad() {
		  return especialidad;
		 }
	 
	 public String getSexo() {
		  return sexo;
		 }
	 
	 public String getCMVP() {
		  return cmvp;
		 }
	 
	 public String getdni() {
		  return dni;
		 }
	 
	 public String getDireccion() {
		  return direccion;
		 }
	 public String getLugar() {
		  return lugar;
		 }
	 public String getTelefono() {
		  return telefono;
		 }
	 public String getEmail() {
		  return email;
		 }
	 public Date getFecha() {
		  return fecha;
		 }
	 public Long getId() {
	  return id;
	 }
	 public void setId(Long id) {
	  this.id = id;
	 }
	
}
