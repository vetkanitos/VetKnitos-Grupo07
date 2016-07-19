package pw2;

import javax.jdo.annotations.*;

@PersistenceCapable (identityType=IdentityType.APPLICATION)
public class Comentario {
	
	 @PrimaryKey
	 @Persistent(valueStrategy=IdGeneratorStrategy.SEQUENCE)
	 private Long id; 
	 @Persistent 
	 private String comentario;
	 @Persistent 
	 private String calificacion;

	 
	 public Comentario(String comentario, String calificacion){
		 
		 this.comentario=comentario;
		 this.calificacion=calificacion;
		 
	 }


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getComentario() {
		return comentario;
	}


	public void setComentario(String comentario) {
		this.comentario = comentario;
	}


	public String getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}
	
}