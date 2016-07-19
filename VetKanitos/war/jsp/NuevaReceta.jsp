<%@page import="java.util.*"%>
<%@page import="java.util.TimeZone"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.security.SecureRandom"%>
<%
	SecureRandom secureRand = SecureRandom.getInstance("SHA1PRNG");
	int numReceta= secureRand.nextInt(10000);
	Random rd = new Random();
	int kg = rd.nextInt(100);
	int gg = rd.nextInt(100);
	int m = rd.nextInt(2);
	int cm = rd.nextInt(100);
	String peso = Integer.toString(kg) + "." + Integer.toString(gg) + "Kg";
	String talla = Integer.toString(m) + "." + Integer.toString(cm) + "m";
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
			<h2><center>REGISTRO PARA CREAR UNA NUEVA RECETA</center></h2>

<form action="/RegistrarReceta" method="post">
<table>
				<tr><td>H.C.Numero:</td>
						<td><input readonly type="text" name="numero" maxlength="5"
							value="<%=numReceta%>"></td>
				</tr>
				<tr>
					<td>DNI *:</td>
					<td><input type="text" name="dni_dueño" maxlength="8" required pattern="[0-9]{8}" title="Ingrese solo numeros"></td>
			</tr>
				<tr>
					<td>Nombre Dueño *:</td>
					<td><input type="text" name="nombreCliente"value="<% %>" required pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)" title="Ingrese solo letras"></td>
				</tr>
				<tr>
					<td>Nombre Medico*:</td>
					<td><input type="text" name="nombreMedico" value="<% %>" required pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)" title="Ingrese solo letras"></td>
				</tr>
				<tr>
					<td>Fecha:</td>
					 <td><input type="text" id="datepicker" name="apellidop"></td>
			
				</tr>
				<tr>
					<td>Nombre Mascota*:</td>
					<td><input type="text" name="nombreMascota"value="<% %>" required pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)" title="Ingrese solo letras"></td>
				</tr>
				<tr>
					<td>Medicamento*:</td>
					<td><input type="text" name="medicamento" required pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)" title="Ingrese solo letras"></td>
				</tr>
				<tr>
					<td>Tratamiento:</td>
						<td><textarea rows="5" cols="20" name="dosis"></textarea></td>
				</tr>
				<tr>		
					<td>Vacunas:
				<select name="Vacunas" size="1">
						<option value="triplecanina">Triplecanina</option>
						<option value="parvovirus">Parvovirus</option>
						<option value="rabia">Rabia</option>
						<option value="leptospirosis">Leptospirosis</option>
						<option value="sarampion">Sarampion</option>
						<option value="galaxie">Galaxie</option>
						<option value="bordetella">Bordetella</option>
						<option value="leucemia">Leuccemia</option>
						<option value="felina">Felina</option>
						<option value="desparatizacion">Desparatizacion</option>
						<option value="otros">otros</option>
				</select> </td>
			</tr>


				<tr>
				<td>Tratamiento de la vacuna :</td>
						<td><textarea rows="7" cols="20" name="dosis"></textarea></td>
				</tr>
				<tr>
				<td>Fecha:</td>
					<td><input type="Date" name="fechaVacunas" pattern="([a-zA-Záéíóú]*+[\s]*[a-zA-Záéíóú]*)"></td>
				</tr>

			</table>
				<br> <input type="hidden" name="action" value="create" /> 
				<input type="reset" value="Limpiar Registro">
				<input type="submit" value="Guardar Registro"> <br>

</form>
</div>
</div>
</body>
</html>