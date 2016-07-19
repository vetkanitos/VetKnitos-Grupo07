package pw2;
import java.util.Date;
import javax.jdo.annotations.*;

@PersistenceCapable (identityType=IdentityType.APPLICATION)
public class Historia {
	 @PrimaryKey
	 @Persistent(valueStrategy=IdGeneratorStrategy.SEQUENCE)
	 private Long id;
	 
	 @Persistent 
	 private String numero;

	 @Persistent 
	 private String dni_cliente;
	 @Persistent 
	 private Date fecha;
	 @Persistent 
	 private String nombreMascota;
	 @Persistent 
	 private Date fechaNac;
	 @Persistent
	 private String especie;
	 @Persistent
	 private String raza;
	 @Persistent
	 private String sexo;
	 
	 @Persistent
	 private String persona;
	 @Persistent
	 private String relacion;	 
	 @Persistent
	 private String medico;
	 @Persistent
	 private String especialidad;
	
	 /*@Persistent
	 private String consulta;
	 @Persistent
	 private String tiempodeConvivencia;
	 @Persistent
	 private String convive;
	 @Persistent
	 private String dieta;
	 @Persistent
	 private String expuesto;
	 @Persistent
	 private String tratamiento;
	 @Persistent
	 private String reaccionAdversa;*/
	 
	 ///Exploracion regional 
	 @Persistent
	 private String sintomasGenerales;
	 @Persistent
	 private String herencia;
	 
	 //Sistema tegumentario
	 @Persistent
	 private String piel;
	 @Persistent
	 private String descripsionTegumentario;
	 
	 //sistema Muscular
	 @Persistent
	 private String anormalias;
	 @Persistent
	 private String decripsionAnormalias;
	 
	 //sistema repiratorio
	 @Persistent
	 private String tos;
	 @Persistent
	 private String tosproductiva;
	 @Persistent
	 private String estornudos;
	 @Persistent
	 private String descargaNasal;
	 @Persistent
	 private String disnea;
	 @Persistent
	 private String descripsionRespiratorio;
	 //sistema cardiovascular
	 @Persistent
	 private String descripsionCardiovascular;
	 //Sistema Digestivo
	 @Persistent
	 private String descripsionDigestivo;
	 //Sistema urinario
	 @Persistent
	 private String descripsionUrinario;
	 // sistema Nervicio
	 @Persistent
	 private String descripsionNervioso;
	 //ojos 
	 @Persistent
	 private String descripsionOcular;
	 //oidos
	 @Persistent
	 private String descripsionAuditivo;
	 //comportamiento
	 @Persistent
	 private String descripsionComportamiento;
	 //Trofico
	 @Persistent
	 private String descripsionTrofico;
	 @Persistent
	 private String otrosSintomas;
	 @Persistent
	 private String comentario;
	 @Persistent
	 private String diagnostico;
	 @Persistent
	 private String pronostico;
	 @Persistent
	 private String tratamientoGeneral;

	 public Historia(String numero,String dni_cliente,String fecha,String nombreMascota,String fechaNac,String especie, String raza,String sexo, 
			 		String persona,String relacion,String medico,String especialidad,
 			 		/*String consulta, String tiempodeConvivencia,String convive,String dieta,String expuesto,String tratamiento,
 			 		String reaccionAdversa,*/
 			 		String sintomasGenerales,String herencia,
 			 		String piel, String descripsionTegumentario, String anormalias,String descripsionAnormalias,
 			 		String tos, String tosproductiva,String estornudos, String descargaNasal,String disnea,
 			 		String descripsionRespiratorio,String descripsionCardiovascular,String descripsionDigestivo,
 			 		String descripsionUrinario, String descripsionNervioso, String descripsionOcular,
 			 		String descripsionAuditivo, String descripsionComportamiento,String descripsionTrofico,
 			 		String otrosSintomas,String comentario,String diagnostico,String pronostico, String tratamientoGeneral){
		 
		 this.numero=numero;
		 this.dni_cliente=dni_cliente;
		 this.fecha = new Date();
		 this.nombreMascota=nombreMascota;
		 this.fechaNac=new Date();
		 this.especie=especie;
		 this.raza=raza;
		 this.sexo=sexo; 
	 	this.persona=persona;
	 	this.relacion=relacion;
	 	this.medico=medico;
	 	this.especialidad=especialidad;
	 		/*consulta,tiempodeConvivencia,convive,dieta,expuesto,tratamiento,
	 		reaccionAdversa,*/
	 		this.sintomasGenerales=sintomasGenerales;
	 		this.herencia=herencia;
	 		this.piel=piel;
	 		this.descripsionTegumentario=descripsionTegumentario;
	 		this.anormalias=anormalias;
	 		this.decripsionAnormalias=descripsionAnormalias;
	 		
	 		this.tos=tos;
	 		this.tosproductiva=tosproductiva;
	 		this.estornudos=estornudos;
	 		this.descargaNasal=descargaNasal;
	 		this.disnea=disnea;
	 		this.descripsionRespiratorio=descripsionRespiratorio;
	 		this.descripsionCardiovascular=descripsionCardiovascular;
	 		this.descripsionDigestivo=descripsionDigestivo;
	 		
	 		this.descripsionUrinario=descripsionUrinario;
	 		this.descripsionNervioso=descripsionNervioso;
	 		this.descripsionOcular=descripsionOcular;
	 		this.descripsionAuditivo=descripsionAuditivo;
	 		this.descripsionComportamiento=descripsionComportamiento;
	 		this.descripsionTrofico=descripsionTrofico;
	 		this.otrosSintomas=otrosSintomas;
	 		this.comentario=comentario;
	 		this.diagnostico=diagnostico;
	 		this.pronostico=pronostico;
	 		 this.tratamientoGeneral=tratamientoGeneral;
		 
		 
	 }

	public String getDni_cliente() {
		return dni_cliente;
	}

	public void setDni_cliente(String dni_cliente) {
		this.dni_cliente = dni_cliente;
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

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
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

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public String getRelacion() {
		return relacion;
	}

	public void setRelacion(String relacion) {
		this.relacion = relacion;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	/*public String getConsulta() {
		return consulta;
	}

	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}

	public String getTiempodeConvivencia() {
		return tiempodeConvivencia;
	}

	public void setTiempodeConvivencia(String tiempodeConvivencia) {
		this.tiempodeConvivencia = tiempodeConvivencia;
	}

	public String getConvive() {
		return convive;
	}

	public void setConvive(String convive) {
		this.convive = convive;
	}

	public String getDieta() {
		return dieta;
	}

	public void setDieta(String dieta) {
		this.dieta = dieta;
	}

	public String getExpuesto() {
		return expuesto;
	}

	public void setExpuesto(String expuesto) {
		this.expuesto = expuesto;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public String getReaccionAdversa() {
		return reaccionAdversa;
	}

	public void setReaccionAdversa(String reaccionAdversa) {
		this.reaccionAdversa = reaccionAdversa;
	}*/

	public String getSintomasGenerales() {
		return sintomasGenerales;
	}

	public void setSintomasGenerales(String sintomasGenerales) {
		this.sintomasGenerales = sintomasGenerales;
	}

	public String getHerencia() {
		return herencia;
	}

	public void setHerencia(String herencia) {
		this.herencia = herencia;
	}

	public String getPiel() {
		return piel;
	}

	public void setPiel(String piel) {
		this.piel = piel;
	}

	public String getDescripsionTegumentario() {
		return descripsionTegumentario;
	}

	public void setDescripsionTegumentario(String descripsionTegumentario) {
		this.descripsionTegumentario = descripsionTegumentario;
	}

	public String getAnormalias() {
		return anormalias;
	}

	public void setAnormalias(String anormalias) {
		this.anormalias = anormalias;
	}

	public String getDecripsionAnormalias() {
		return decripsionAnormalias;
	}

	public void setDecripsionAnormalias(String decripsionAnormalias) {
		this.decripsionAnormalias = decripsionAnormalias;
	}

	public String getTos() {
		return tos;
	}

	public void setTos(String tos) {
		this.tos = tos;
	}

	public String getTosproductiva() {
		return tosproductiva;
	}

	public void setTosproductiva(String tosproductiva) {
		this.tosproductiva = tosproductiva;
	}

	public String getEstornudos() {
		return estornudos;
	}

	public void setEstornudos(String estornudos) {
		this.estornudos = estornudos;
	}

	public String getDescargaNasal() {
		return descargaNasal;
	}

	public void setDescargaNasal(String descargaNasal) {
		this.descargaNasal = descargaNasal;
	}

	public String getDisnea() {
		return disnea;
	}

	public void setDisnea(String disnea) {
		this.disnea = disnea;
	}

	public String getDescripsionRespiratorio() {
		return descripsionRespiratorio;
	}

	public void setDescripsionRespiratorio(String descripsionRespiratorio) {
		this.descripsionRespiratorio = descripsionRespiratorio;
	}

	public String getDescripsionCardiovascular() {
		return descripsionCardiovascular;
	} 

	public void setDescripsionCardiovascular(String descripsionCardiovascular) {
		this.descripsionCardiovascular = descripsionCardiovascular;
	}

	public String getDescripsionDigestivo() {
		return descripsionDigestivo;
	}

	public void setDescripsionDisgestivo(String descripsionDigestivo) {
		this.descripsionDigestivo = descripsionDigestivo;
	}

	public String getDescripsionUrinario() {
		return descripsionUrinario;
	}

	public void setDescripsionUrinario(String descripsionUrinario) {
		this.descripsionUrinario = descripsionUrinario;
	}

	public String getDescripsionNervioso() {
		return descripsionNervioso;
	}

	public void setDescripsionNervioso(String descripsionNervioso) {
		this.descripsionNervioso = descripsionNervioso;
	}

	public String getDescripsionOcular() {
		return descripsionOcular;
	}

	public void setDescripsionOcular(String descripsionOcular) {
		this.descripsionOcular = descripsionOcular;
	}

	public String getDescripsionAuditivo() {
		return descripsionAuditivo;
	}

	public void setDescripsionAuditivo(String descripsionAuditivo) {
		this.descripsionAuditivo = descripsionAuditivo;
	}

	public String getDescripsionComportamiento() {
		return descripsionComportamiento;
	}

	public void setDescripsionComportamiento(String descripsionComportamiento) {
		this.descripsionComportamiento = descripsionComportamiento;
	}

	public String getDescripsionTrofico() {
		return descripsionTrofico;
	}

	public void setDescripsionTrofico(String descripsionTrofico) {
		this.descripsionTrofico = descripsionTrofico;
	}

	public String getOtrosSintomas() {
		return otrosSintomas;
	}

	public void setOtrosSintomas(String otrosSintomas) {
		this.otrosSintomas = otrosSintomas;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getPronostico() {
		return pronostico;
	}

	public void setPronostico(String pronostico) {
		this.pronostico = pronostico;
	}

	public String getTratamientoGeneral() {
		return tratamientoGeneral;
	}

	public void setTratamientoGeneral(String tratamientoGeneral) {
		this.tratamientoGeneral = tratamientoGeneral;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
