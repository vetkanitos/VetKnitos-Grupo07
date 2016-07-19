<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="pw2.*"%>
<%@ page import="java.util.*;"%>
   <%
	Cliente p = (Cliente) request.getAttribute("Vercliente");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
        <h1 class="logo">VET K'ANITOS</h1>
         <div>
                <h1 class="logo"><a href="home.html">Pet clinic</a></h1>
                </div>
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
							<li><a href="/RegistrarCliente?action=borrar">BORRAR
									CLIENTE</a></li>
						</ul></li>
					<li><a>MASCOTA</a>
						<ul>
							<li><a href="/RegistrarMascota?action=show">VER MASCOTA</a></li>
							<li><a href="/RegistrarMascota?action=red">AGREGAR
									MASCOTA</a></li>
							<li><a href="/RegistrarMascota?action=borrar">BORRAR
									MASCOTA</a></li>
							<li><a href="/Busqueda.jsp">BUSCAR
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
							<li><a href="/RegistrarReceta?action=buscar">BUSCAR
									RECETAS</a></li>
						</ul></li>
				</ul>
			</nav>
			</div>
		 </div > 	
        <div class="clear"></div>
    </div>
</header>
<div class="slider-container">
        <div class="mp-slider">
        <br>
        <h2><center>REGISTRO PARA CREAR UN NUEVO CLIENTE</center></h2>
        <form action="/RegistrarCliente" method="post">
			<table>
				<tr>
					<td>Nombre(s) *:</td>
					<td><input type="text" name="nombre" required pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)" 
					title="Ingrese solo letras" value="<% out.print(p.getNombre()); %>"></td>

					<td>Apellido Paterno *:</td>
					<td><input type="text" name="apellidop" required pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)"
					 title="Ingrese solo letras" value="<% out.print(p.getApellidop());%>"></td>

				</tr>

				<tr>
					<td>Apellido Materno *:</td>
					<td><input type="text" name="apellidom" required pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)" 
					value="<% out.print(p.getApellidom());%>"title="Ingrese solo letras"></td>
					<td>DNI *:</td>
					<td><input type="text" name="dni" maxlength="8" required pattern="[0-9]{8}" 
					title="Ingrese solo numeros"value="<% out.print(p.getDni());%>"></td>
			
				</tr>

				<tr>
					<td>Estado Civil *:</td>
					<td><input required type="radio" name="estado" value="Soltero" >Soltero
						<input type="radio" name="estado" value="Casado">Casado <input
						type="radio" name="estado" value="Viudo">Viudo <input
						type="radio" name="estado" value="Divorciado">Divorciado</td>
						
				<td>Sexo *:</td>
				<td><input required type="radio" name="sexo" value="Masculino">Masculino <input
						type="radio" name="sexo" value="Femenino">Femenino</td>
					
				</tr>

				<tr>
				<td>Ocupacion:</td>
					<td><input type="text" name="ocupacion" pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)"value="<% out.print(p.getOcupacion());%>"></td>
					<td>Direccion:</td>
					<td><input type="text" name="direccion" pattern="([a-zA-Záéíóú]*+[\s]*[a-zA-Záéíóú]*)" value="<% out.print(p.getDireccion());%>"></td>
					
				</tr>

				<tr>
				<td>Manzana / Numero:</td>
					<td><input type="text" name="numero" pattern="([a-zA-Záéíóú]+[\s]*+[\-]*+[\s]*[a-zA-Záéíóú]*+[0-9]*)"></td>
					<td>Distrito:</td>
					<td><input type="text" name="distrito" pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)"></td>
					
				</tr>

				<tr>
				<td>Provincia:</td>
					<td><input type="text" name="provincia" pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)"></td>
					<td>Departamento:</td>
					<td><input type="text" name="departamento" pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)"></td>
					
				</tr>

				<tr>
				<td>Lugar de Origen:</td>
					<td><input type="text" name="lugar" value="<% out.print(p.getLugar());%>"></td>
					<td>Telefono de casa o celular: *</td>
					<td><input required type="tel" name="telefono" pattern="[0-9]{6}|[0-9]{9}"value="<% out.print(p.getTelefono());%>"></td>
					
				</tr>
				<tr>
				<td>Email *:</td>
					<td><input type="email" name="email" placeholder="ejemplo@ejemplo.com" required pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$"
					 title="Ingrese un email correcto"value="<% out.print(p.getEmail());%>"></td>
					<td>Fecha de creacion:</td>
					<!--<input readonly type="text" name="fecha" value="" /></td>	  -->	
				</tr>

			</table>
				<br> <input type="hidden" name="action" value="create" /> 
				<input type="reset" value="Limpiar Registro">
				<input type="submit" value="Guardar Registro"> <br>

		</form>
		<i>( *): Campos obligatorios</i>
</div>
</div>
</body>
</html>