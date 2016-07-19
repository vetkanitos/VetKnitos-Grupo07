package pw2;
import java.util.Date;
import java.util.TimeZone;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
@PersistenceCapable (identityType=IdentityType.APPLICATION)
public class Administrador {

	 @PrimaryKey
	 @Persistent(valueStrategy=IdGeneratorStrategy.SEQUENCE)
	 private Long id;
	 @Persistent 
	 private String adm;
	 private Date fecha;
	 
	 public Administrador(String adm){
		 
		 this.adm = adm;
		

	  TimeZone.setDefault(TimeZone.getTimeZone("America/Lima"));
	  this.fecha = new Date();
	 }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdm() {
		return adm;
	}

	public void setAdm(String adm) {
		this.adm= adm;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDni() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
