package pw2;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable (identityType=IdentityType.APPLICATION)
public class Receta {
	
	 @PrimaryKey
	 @Persistent(valueStrategy=IdGeneratorStrategy.SEQUENCE)
	 private Long id_cliente;
	 @Persistent 
	 private String numeroReceta;
	 @Persistent 
	 private String dni_dueño;
	 @Persistent 
	 private String nombreMedico;
	 @Persistent
	 private Date fecha;
	 @Persistent 
	 private String nombreMascota;
	 @Persistent 
	 private String medicamento;
	 
	 @Persistent 
	 private String tratamiento;
	 @Persistent 
	 private String vacunas;
	 ////vacunas
	 /*@Persistent 
	 private String triplecanina;
	 @Persistent 
	 private String parvovirus;
	 @Persistent 
	 private String rabia;
	 @Persistent 
	 private String leptospirosis;
	 @Persistent 
	 private String moquillosarampion;
	 @Persistent 
	 private String galaxie;
	 @Persistent 
	 private String bordetella;
	 @Persistent 
	 private String leucemia;
	 @Persistent 
	 private String felina;
	 @Persistent 
	 private String despararitacion;
	 @Persistent 
	 private String otrasVacunas;*/
	 
	 @Persistent 
	 private String dosis;
	 @Persistent 
	 private Date fechavacuna;
	 
	 public Receta(String numeroReceta,String dni_dueño, String nombreMedico, String fecha , String nombreMascota, String medicamento,
			 String tratamiento, String vacunas,String dosis,String fechavacuna){
		 this.numeroReceta=numeroReceta;
		 this.dni_dueño=dni_dueño;
		 this.nombreMedico=nombreMedico;
		 this.fecha = new Date();
		 this.nombreMascota=nombreMascota;
		 this.medicamento=medicamento;
		 this.tratamiento=tratamiento;
		 this.vacunas=vacunas;
		 this.dosis=dosis;
		 //this.fechavacuna=fechavacuna;
		 this.fechavacuna = new Date();
		 
		 
		 
	 }

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getDni_dueño() {
		return dni_dueño;
	}

	public void setDni_dueño(String dni_dueño) {
		this.dni_dueño = dni_dueño;
	}

	public String getNombreMedico() {
		return nombreMedico;
	}

	public void setNombreMedico(String nombreMedico) {
		this.nombreMedico = nombreMedico;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public String getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	/*public String getTriplecanina() {
		return triplecanina;
	}

	public void setTriplecanina(String triplecanina) {
		this.triplecanina = triplecanina;
	}

	public String getParvovirus() {
		return parvovirus;
	}

	public void setParvovirus(String parvovirus) {
		this.parvovirus = parvovirus;
	}

	public String getRabia() {
		return rabia;
	}

	public void setRabia(String rabia) {
		this.rabia = rabia;
	}

	public String getLeptospirosis() {
		return leptospirosis;
	}

	public void setLeptospirosis(String leptospirosis) {
		this.leptospirosis = leptospirosis;
	}

	public String getMoquillosarampion() {
		return moquillosarampion;
	}

	public void setMoquillosarampion(String moquillosarampion) {
		this.moquillosarampion = moquillosarampion;
	}

	public String getGalaxie() {
		return galaxie;
	}

	public void setGalaxie(String galaxie) {
		this.galaxie = galaxie;
	}

	public String getBordetella() {
		return bordetella;
	}

	public void setBordetella(String bordetella) {
		this.bordetella = bordetella;
	}

	public String getLeucemia() {
		return leucemia;
	}

	public void setLeucemia(String leucemia) {
		this.leucemia = leucemia;
	}

	public String getFelina() {
		return felina;
	}

	public void setFelina(String felina) {
		this.felina = felina;
	}

	public String getDespararitacion() {
		return despararitacion;
	}

	public void setDespararitacion(String despararitacion) {
		this.despararitacion = despararitacion;
	}

	public String getOtrasVacunas() {
		return otrasVacunas;
	}

	public void setOtrasVacunas(String otrasVacunas) {
		this.otrasVacunas = otrasVacunas;
	}*/
	
	public String getVacunas() {
		return vacunas;
	}

	public void setVacunas(String vacunas) {
		this.vacunas = vacunas;
	}
	
	public String getDosis() {
		return dosis;
	}

	public void setDosis(String dosis) {
		this.dosis = dosis;
	}

	public Date getFechavacuna() {
		return fechavacuna;
	}

	public void setFechavacuna(Date fechavacuna) {
		this.fechavacuna = fechavacuna;
	}

	public String getNumeroReceta() {
		return numeroReceta;
	}

	public void setNumeroReceta(String numeroReceta) {
		this.numeroReceta = numeroReceta;
	}
	 
	 
	 
	 

}
