<%@page import="java.util.*"%>
<%@page import="java.util.TimeZone"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.security.SecureRandom"%>
<%@page import="pw2.*" %>
<% List<Mascota> miMascota=(List<Mascota>)(request.getAttribute("miMascota"));%>
<% List<Historia> VerHistorias = (List<Historia>)(request.getAttribute("VerHistorias"));%>
<%
	SecureRandom secureRand = SecureRandom.getInstance("SHA1PRNG");
	int numHistoria = secureRand.nextInt(10000);
	Random rd = new Random();
	int kg = rd.nextInt(100);
	int gg = rd.nextInt(100);
	int m = rd.nextInt(2);
	int cm = rd.nextInt(100);
	String peso = Integer.toString(kg) + "." + Integer.toString(gg) + "Kg";
	String talla = Integer.toString(m) + "." + Integer.toString(cm) + "m";
%>
<!DOCTYPE >
<html lang="en">
<head>
  	<title>MENU</title>
  	<meta charset="utf-8">
    <meta name="description" content="Your description">
    <meta name="keywords" content="Your keywords">
    <meta name="author" content="Your name">
    <link rel="stylesheet" href="css/style.css">
    <script src="js/jquery-1.7.1.min.js"></script>
    <script src="js/superfish.js"></script>
    <script src="js/jquery.easing.1.3.js"></script>
    <script src="js/tms-0.4.1.js"></script>
    <script src="js/slider.js"></script>
    <script type="text/javascript">
		$(function(){
			function equalHeight(group) {
				var tallest = 0;
				group.each(function() {
					var thisHeight = $(this).height();
					if(thisHeight > tallest) {
						tallest = thisHeight;
					}
				});
				group.height(tallest);
			}	
			equalHeight($(".box-1 .inner"));
		})
	</script>
</head>
<body id="page1">
<!-- Header -->
	<header>
	<div class="inner">
        <div class="fright">
        <h2><span>VET K'anitos</span></h2>
            <div class="header-meta">
            
                <div class="col-elem">
                	<span class="phone"> <a href="/CerrarServlet">CERRAR SESION</a></span>
                    <br>TIENE UN PROBLEMA CON TU MASCOTA?<br>
                    LLAMAR A EMRGENCIAS: 
                    <span class="phone">
                        94674040-054111111
                    </span>
                    
                </div>
               
            </div> 
         <div class="header-meta">
			<nav>
				<ul class="sf-menu">
					<li><a >ADMINISTRADOR</a>
						<ul>
							<li><a href="/RegistrarAdmin?action=show">VER
									ADMINISTRADORES</a></li>
							<li><a href="/RegistrarAdmin?action=admi">CREAR
									ADMINISTRADOR</a></li>
						</ul></li>
					<li>
					<li><a >CLIENTE</a>
						<ul>
							<li><a href="/RegistrarCliente?action=show">VER CLIENTE</a></li>
							<li><a href="/RegistrarCliente?action=red">AGREGAR
									CLIENTE</a></li>
						</ul></li>
					<li><a>MASCOTA</a>
						<ul>
							<li><a href="/RegistrarMascota?action=show">VER MASCOTA</a></li>
							<li><a href="/RegistrarMascota?action=red">AGREGAR
									MASCOTA</a></li>
							<li><a href="/RegistrarMascota?action=buscar">BUSCAR
									MASCOTA</a></li>
						</ul></li>
					<li><a>MEDICO</a>
						<ul>
							<li><a href="/RegistrarMedico?action=show">VER MEDICO</a></li>
							<li><a href="/RegistrarMedico?action=red">AGREGAR MEDICO</a>
							<li><a href="/RegistrarMedico?action=borrar">BORRAR
									MEDICO</a></li>
						</ul></li>
					<li><a>HISTORIA</a>
						<ul>
							<li><a href="/RegistrarHistoria?action=show">VER
									HISTORIAS</a></li>
							<li><a href="/RegistrarHistoria?action=red">AGREGAR
									HISTORIAS</a>
							<li><a href="/RegistrarHistoria?action=buscar">BUSCAR
									HISTORIAS</a></li>
						</ul></li>
					<li><a>RECETA</a>
						<ul>
							<li><a href="/RegistrarReceta?action=show">VER RECETAS</a></li>
							<li><a href="/RegistrarReceta?action=red">AGREGAR
									RECETAS</a></li>
						</ul></li>
					<li><a>COMENTARIO</a>
						<ul>
							<li><a href="/RegistrarComentario?action=red">COMENTARIO</a></li>
						</ul>
					</li>
					
				</ul>
			</nav>
			</div>
		 </div > 	
        <div class="clear"></div>
    </div>
	</header>
<div class="slider-container">
			<div class="mp-slider">
			<h2><center>HISTORIA REALIZADA </center></h2>
			
	<%for (int i = 0; i < VerHistorias.size(); i++) {
    Historia h = (Historia)VerHistorias.get(i);%>
		

			<fieldset>
				<legend>1) FICHA DE IDENTIFICACION</legend>

				<table>
					<tr>
						<td>H. C. Numero:</td>
						<td><input readonly type="text" name="numero" maxlength="5"
							value="<%h.getNumero();%>">
						<td>Internado (Hospitalizado) *:</td>
						<td><input type="radio" name="internado" value="">Si
							<input type="radio" name="internado" value="no">No</td>
					</tr>

					<tr>
						<td>DNI Cliente *:</td>
						<td><input type="text" name="dni" maxlength="8" required
							pattern="[0-9]{8}" title="Ingrese solo numeros" value="<%=h.getDni_cliente()%>"></td>
						<td>Fecha de ingreso/consulta:</td>
						<td>Date: <input type="text" id="datepicker" name="fecha"></td>

					</tr>

					<tr>
						<td>Nombre Mascota*:</td>
						<td><input type="text" name="nombreMascota"pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)"
							title="Ingrese solo letras" Value="<%=h.getNombreMascota()%>"></td>
						<td>fecha de Nacimiento:</td>
						<td><input readonly type="text" name="fechaNac"value=""></td>
					</tr>

					<tr>
						<td>Talla:</td>
						<td><input readonly type="text" name="talla"value="<%=talla%>"></td>
					</tr>
					<tr>	
						<td>Peso:</td>
						<td><input readonly type="text" name="peso" value="<%=peso%>"></td>
						<td>sexo:</td>
						<td><input readonly type="text" name="sexo" value="<%=h.getSexo()%>"></td>
					</tr>
					<tr>
						<td>Especie: </td>
						<td><input readonly type="text" name="especie" value="<%=h.getEspecie()%>"></td>
						<td>Raza:</td>
						<td><input readonly type="text" name="raza" value="<%=h.getRaza()%>"></td>
					</tr>
					<tr>
						<td>Persona Responsable:</td>
						<td><input type="text" name="persona"pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)"
							title="Ingrese solo letras" value="<%=h.getPersona()%>" ></td>
						<td>Relacion con el paciente:</td>
						<td><input type="text" name="relacion"pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)"
							title="Ingrese solo letras" value="<%=h.getRelacion()%>"></td>
					</tr>
					<tr>
						<td>Medico Responsable *:</td>
						<td><input type="text" name="medico" pattern="([a-zA-Záéíóú.]+[\s]*[a-zA-Záéíóú.]*)"
							title="Ingrese solo letras" value="<%=h.getMedico()%>"></td>
						<td>Especialidad *:</td>
						<td><input type="text" name="especialidad" pattern="([a-zA-Záéíóú.]+[\s]*[a-zA-Záéíóú.]*)"
							title="Ingrese solo letras" value="<%=h.getEspecialidad()%>"></td>
					</tr>
				</table>
			</fieldset>
			<br>
			<!-- ------------------------------------------------------------------- -->
			
			</fieldset>
				<legend>2) EXPLORACION REGIONAL (INSPECCION, PALPACION,
					PERCUSION, AUSCULTACION, COMB.)</legend>
				<table>
					<tr>
						<td>a) Cabeza, cuello, torax, abbdomen, mienbros,genitales, y otros</td>
						<td><textarea rows="5" cols="90" name="sintomasGenerales"></textarea></td>
					</tr>
					<tr>
						<td>b) Herecia de Parientes</td>
						<td><textarea rows="7" cols="30" name="herencia"></textarea></td>
					</tr>

				</table>
			</fieldset>
			<!-- ---------------------------------------------------------------------------------- -->
			<fieldset>
				<legend>3) SISTEMA TEGUMENTARIO </legend>
				<table>
					<tr>
						<td>a)presenta alguna lesion en la piel</td>
						<td><input type="radio" name="piel" value="si">si <input
							type="radio" name="piel" value="no">no</td>
						<td>descripsion de la lesion</td>
						<td><textarea rows="7" cols="30" name="descripsionTegumentario"></textarea></td>

					</tr>

				</table>
				<legend>4) SISTEMA MUSCULAR ESQUELETICO</legend>

				<table>
					<tr>
						<td>a)Presenta anormalias al caminar</td>
						<td><input type="radio" name="anormalias" value="si">si
							<input type="radio" name="anormalias" value="no">no</td>
						<td>descripsion de la lesion</td>
						<td><textarea rows="7" cols="30" name="descripsionAnormalias"></textarea></td>

					</tr>
				</table>
				<legend>5) SISTEMA RESPIRATORIO</legend>

				<table>
					<tr>
						<td>a)tos</td>
						<td><input type="radio" name="tos" value="si">si <input
							type="radio" name="tos" value="no">no</td>
						<td>b)estornudos</td>
						<td><input type="radio" name="estornudos" value="si">si
							<input type="radio" name="estornudos" value="no">no</td>
						<td>c)Descarga Nasal</td>
						<td><input type="radio" name="descargaNasal" value="si">si
							<input type="radio" name="descargaNasal" value="no">no</td>
						<td>b)Disnea</td>
						<td><input type="radio" name="disnea" value="si">si <input
							type="radio" name="disnea" value="no">no</td>

						<td>descripsion del sintoma</td>
						<td><textarea rows="7" cols="30"
								name="descripsionRespiratorio"></textarea></td>
					</tr>
				</table>

				<legend>6) SISTEMA CARDIOVASCULAR</legend>

				<table>
					<tr>
						<td>a)presenta fatiga , cianocis, debelidad o otros</td>
						<td>descripsion del sintoma</td>
						<td><textarea rows="7" cols="30"
								name="descripsionCardiovascular"></textarea></td>
					</tr>
				</table>

				<legend>6) SISTEMA DIGESTIVO</legend>

				<table>
					<tr>
						<td>a)Tipo de Apetito, ingesion de agua, presencia de
							vomitosy otros</td>
						<td>descripsion del sintoma</td>
						<td><textarea rows="7" cols="30" name="descripsionDisgestivo"></textarea></td>
					</tr>
				</table>
				<legend>7) SISTEMA GENIO URINARIO</legend>

				<table>
					<tr>
						<td>a)presencia de hermanuira, noctura, poliuria,
							disuria,oliguria,anuria,AVH o castrado,criptaquidia,apareo,
							gestante y otros</td>
						<td><textarea rows="7" cols="30" name="descripsionUrinario"></textarea></td>
					</tr>
				</table>
				<legend>6) SISTEMA NERVIOSO</legend>

				<table>
					<tr>
						<td>a)presencia del tipo de comportameinto,
							ataxia,disimetria,corea,paresis,convulsiones,tics y otros</td>
						<td><textarea rows="7" cols="30" name="descripsionNervioso"></textarea></td>
					</tr>
				</table>
				<legend>8) SISTEMA OCULAR</legend>

				<table>
					<tr>
						<td>a)presencia del tipo de descarga y caracteristicas,
							espasmo,opacidad en la cornea,cataratas, ceguera u otro</td>
						<td><textarea rows="7" cols="30" name="descripsionOcular"></textarea></td>
					</tr>
				</table>
				<legend>8) SISTEMA AUDITIVO</legend>

				<table>
					<tr>
						<td>a)Presencia de descargay caracteristica, prurito,
							presencia de olor, sordera u otro</td>
						<td><textarea rows="7" cols="30" name="descripsionAuditivo"></textarea></td>
					</tr>
				</table>
				<legend>9)COMPORTAMIENTO</legend>

				<table>
					<tr>
						<td>a)Presencia de agresion y descripsion de la agresion,a
							quien agrede,y en donde , presencia de pilo ereccion, miedos,
							sumision,ansiedad</td>
						<td><textarea rows="7" cols="30"
								name="descripsionComportamiento"></textarea></td>
					</tr>
				</table>
				<legend>10)TROFICO</legend>

				<table>
					<tr>
						<td>a)Presencia de desnitricion, polifagia,apetito selectivo,
							consumo de alimento, coprofagia, polidipcia</td>
						<td><textarea rows="7" cols="30" name="descripsionTrofico"></textarea></td>
					</tr>
				</table>

				<legend>11)OTROS SINTOMAS</legend>

				<table>
					<tr>
						<td><textarea rows="7" cols="30"
								name="OtrosSintomas"></textarea></td>
					</tr>
				</table>

			</fieldset>
			<br>
			<fieldset>
				<legend>3) PADECIMIENTO ACTUAL (1 PRINCIPIO, 2 EVOLUCION, 3
					ESTADO ACTUAL)</legend>
				<table>
					<tr>
						<td><textarea rows="5" cols="115" name="padec"></textarea></td>
					</tr>
				</table>
			</fieldset>
			<br>

			<fieldset>
				<legend>6) DIAGNOSTICOS ANTERIORES</legend>
				<table>
					<tr>
						<td><textarea rows="5" cols="115" name="anteriores"></textarea></td>
					</tr>
				</table>
			</fieldset>
			<br>
			<fieldset>
				<legend>7) TERAPEUTICA EMPLEADA ANTERIORMENTE</legend>
				<table>
					<tr>
						<td><textarea rows="5" cols="115" name="terapia"></textarea></td>
					</tr>
				</table>
			</fieldset>
			<br> <br>
			<fieldset>
				<legend>8) EXPLORACION GENERAL</legend>
				<table>
					<tr>
						<td><textarea rows="5" cols="115" name="exploracion"></textarea></td>
					</tr>
				</table>
			</fieldset>
			<br>
			<fieldset>
				<legend>10) CONCLUSIONES</legend>
				<table>
					<tr>
						<td>Comentario:</td>
						<td><textarea rows="5" cols="100" name="comentario"></textarea></td>
					</tr>

					<tr>
						<td>Diagnostico:</td>
						<td><textarea rows="5" cols="100" name="diagnostico"></textarea></td>
					</tr>

					<tr>
						<td>Pronostico:</td>
						<td><textarea rows="5" cols="100" name="pronostico"></textarea></td>
					</tr>

					<tr>
						<td>Tratamiento:</td>
						<td><textarea rows="5" cols="100" name="tratamiento"></textarea></td>
					</tr>
				</table>
			</fieldset>


	<%} %>
		<p>
		<address>Policlinico Health Life</address>
		<a href="http://jigsaw.w3.org/css-validator/check/referer"> <img
			style="border: 0; width: 88px; height: 31px"
			src="http://jigsaw.w3.org/css-validator/images/vcss" alt="Valid CSS!" />
		</a>

		<p>
			<a href="http://jigsaw.w3.org/css-validator/check/referer"> <img
				style="border: 0; width: 88px; height: 31px"
				src="http://jigsaw.w3.org/css-validator/images/vcss-blue"
				alt="Valid CSS!" />
			</a>
	</div>
</div>
</body>
</html>