<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<h2><center>REGISTRO DE MASCOTA A ADOPTAR </center></h2>
		
<form action="/RegistrarAdopMasc" method="post"  autocomplete="off">
		 
		  	   <!--  <div class="  register-top-grid">-->
		  	   
					<h3>REGISTRO DE MASCOTA A ADOPTAR</h3>
					<div class="mation">
						<span>NOMBRE MASCOTA :<label>*</label></span>
						<input type="text" name="nombre1" id="nombre1" placeholder="Nombre"> 
						
						<span>RUTA IMAGEN : <label>*</label></span>
						 <input type="text" name="rutaImagen" id="rutaImagen" placeholder="imagen.jpg"> 
						
						<span>RAZA:<label>*</label></span>
						 <input type="text" name="cat" id="cat" placeholder="categoria"> 
						
						<span>SEXO</span>
						<input required type="radio" name="sexo" value="macho" >Macho <input
						type="radio" name="sexo" value="hembra">Hembra
						
						<span>INFORMACION MASCOTA :<label>*</label></span>
						<input type="text" name="info" id="info" placeholder="informacion"> 
						 					
						<BR></BR>
							<br> <input type="hidden" name="action" value="create" /> 
				<input type="reset" value="Limpiar Registro">
				<input type="submit" value="Guardar Registro"> <br>	
					   </form>
</div>

</div>
</body>
</html>