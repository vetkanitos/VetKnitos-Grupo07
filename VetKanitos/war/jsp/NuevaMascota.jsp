<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
			<h2><center>REGISTRO PARA CREAR UNA NUEVA MASCOTA/center></h2>
		<form action="/RegistrarMascota" method="post">
			<table>
				<tr>
					<td>Nombre Mascota(s) *:</td>
					<td><input type="text" name="nombre" required pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)" title="Ingrese solo letras"></td>
					<td>DNI CLIENTE*:</td>
					<td><input type="text" name="dni_cliente" maxlength="8" required pattern="[0-9]{8}" title="Ingrese solo numeros"></td>
			
				<tr>
					<td>Especie*:</td>
					 <td> <select name="especie" size="1">
	   <option value="perro">perro</option>
	   <option value="gato">gato</option>
	   <option value="ave">Ave</option>
	   <option value="caballo">Caballo</option>
	   <option value="pez">pez</option>
	   <option value="otro">otros</option>
  </select> </td>
					<td>Raza *:</td>
					<td><input type="text" name="raza" required pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)" title="Ingrese solo letras"></td>
					
				</tr>
				<tr>
				<td>Sexo *:</td>
					<td><input required type="radio" name="sexo" value="macho" >Macho <input
						type="radio" name="sexo" value="hembra">Hembra</td>
				</tr>
				<tr>
					<td>Distrito:</td>
					<td><input type="text" name="distrito" pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)"></td>
					<td>Provincia:</td>
					<td><input type="text" name="provincia" pattern="([a-zA-Záéíóú]+[\s]*[a-zA-Záéíóú]*)"></td>
				</tr>
				 <tr>
					<td>Fecha de Nacimiento:</td>
					<td><input type="text" name="fechaNacimiento" pattern="([a-zA-Záéíóú]*+[\s]*[a-zA-Záéíóú]*)"></td>
					<td>Edad:</td>
					<td><input type="text" name="edad" pattern="([a-zA-Záéíóú]*+[\s]*[a-zA-Záéíóú]*)"></td>
					
					
				</tr>
				 <tr>
					<td>Color:</td>
					<td><input type="text" name="color" pattern="([a-zA-Záéíóú]*+[\s]*[a-zA-Záéíóú]*)"></td>
					<td>Descripcion:</td>
					<td><input type="text" name="descripcion" pattern="([a-zA-Záéíóú]*+[\s]*[a-zA-Záéíóú]*)"></td>
					
					
				</tr>
				
			 
		</table>
			<br> <input type="hidden" name="action" value="create" />
			     <input	type="reset" value="Limpiar Registro"> 
			     <input type="submit"value="Guardar Registro"> <br>
		</form>
		<i>( *): Campos obligatorios</i>
		
	</div>
</div>
</body>
</html>