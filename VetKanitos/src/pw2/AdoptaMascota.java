package pw2;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

public class AdoptaMascota {

	 @PrimaryKey
	 @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	 private Key key;
	 @Persistent 
	 private String nombre;
	 @Persistent
	 private String rutaImagen;
	 @Persistent 
	 private String raza; 
	 @Persistent
	 private String sexo;
	 @Persistent
	 private String informacion;
	 
	 public AdoptaMascota(String nombre,String rutaImagen,String raza,String sexo,String informacion) {
			super();
			this.nombre = nombre;
			this.rutaImagen=rutaImagen;
			this.raza=raza;
			this.sexo=sexo;
			this.informacion=informacion;
		}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRutaImagen() {
		return rutaImagen;
	}

	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
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

	public String getInformacion() {
		return informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}	
		
}
