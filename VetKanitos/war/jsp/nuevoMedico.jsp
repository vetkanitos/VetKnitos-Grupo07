<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="pw2.*" %>
<%@page import="java.util.*"%>
<%@page import="java.util.TimeZone"%>
<%@page import="java.text.SimpleDateFormat"%>

<!DOCTYPE html >
<html >
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
    <!-- body -->
    <div class="slider-container">
        <div class="mp-slider">
        <br>
        <h2><center>REGISTRO PARA CREAR UN NUEVO MEDICO</center></h2>
        
        <form action="/RegistrarMedico" method="post">
			<table>
				<tr>
					<td>Nombre(s) *:</td>
					<td><input type="text" name="nombre" required pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)" title="Ingrese solo letras"></td>

					<td>Apellido Paterno *:</td>
					<td><input type="text" name="apellidop" required pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)" title="Ingrese solo letras"></td>
				</tr>

				<tr>
					<td>Apellido Materno *:</td>
					<td><input type="text" name="apellidom" required pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)" title="Ingrese solo letras"></td>

					<td>Fecha de Nacimiento *:</td>
					<td><input type="number"  name="dia" min="1" max="31"placeholder="dd" required title="Ingrese solo numeros">
					 <input  type="number" name="mes" min="1" max="12" placeholder="mm" required title="Ingrese solo numeros"> 
					 <input type="number" name="anio" min="1900" max="2015" placeholder="aaaa" required title="Ingrese solo numeros"></td>
				</tr>

				<tr>
					<td>Estado Civil *:</td>
					<td><input required type="radio" name="estado" value="Soltero">Soltero
						<input type="radio" name="estado" value="Casado">Casado <input
						type="radio" name="estado" value="Viudo" >Viudo <input
						type="radio" name="estado" value="Divorciado" >Divorciado</td>
				</tr>

				<tr>
				<td>Sexo *:</td>
					<td><input required type="radio" name="sexo" value="Masculino" >Masculino <input
						type="radio" name="sexo" value="Femenino">Femenino</td>
					<td>DNI *:</td>
					<td><input type="text" name="dni" maxlength="8" required pattern="[0-9]{8}" title="Ingrese solo numeros"></td>
					
				</tr>

				<tr>
					<td>Especialidad *:</td>
					<td><input type="text" name="especialidad" pattern="([a-zA-Záéíóú]*+[\s]*[a-zA-Záéíóú]*)"></td>
					<td>CMVP *:</td>
					<td><input type="text" name="cmvp" maxlength = "5" required pattern="[0-9]{5}" title="Ingrese solo numeros"></td>
				</tr>

				<tr>
					<td>Direccion:</td>
					<td><input type="text" name="direccion" pattern="([a-zA-Záéíóú]*+[\s]*[a-zA-Záéíóú]*)"></td>
					<td>Manzana / Numero:</td>
					<td><input type="text" name="numero" pattern="([a-zA-Záéíóú]+[\s]*+[\-]*+[\s]*[a-zA-Záéíóú]*+[0-9]*)"></td>
				</tr>

				<tr>
					<td>Distrito:</td>
					<td><input type="text" name="distrito" pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)"></td>
					<td>Provincia:</td>
					<td><input type="text" name="provincia" pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)"></td>
				</tr>
				
				<tr>
					<td>Departamento:</td>
					<td><input type="text" name="departamento" pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)"></td>
					<td>Lugar de Origen:</td>
					<td><input type="text" name="lugar"></td>
				</tr>

				<tr>
					<td>Email *:</td>
					<td><input type="email" name="email"
						placeholder="ejemplo@ejemplo.com" required pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" title="Ingrese un email correcto"></td>
					<td>Telefono de casa o celular: *</td>
					<td><input required type="tel" name="telefono" pattern="[0-9]{6}|[0-9]{9}"></td>
				</tr>
				

			</table>
			<br> <input type="hidden" name="action" value="create" /> <input
				type="reset" value="Limpiar Registro"> <input type="submit"
				value="Guardar Registro"> <br>

		</form>
		<i>( *): Campos obligatorios</i>
        
        </div>
    </div>

</body>
</html>