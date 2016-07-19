<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="pw2.*"%>
<%@page import="java.util.*"%>
<%
List<Mascota> miMascota=(List<Mascota>)(request.getAttribute("miMascota"));
List<Cliente> midn=(List<Cliente>)(request.getAttribute("midn"));
%>
<!DOCTYPE HTML>
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
				<h2><span>VET K'anitos</span></h2>
				<div class="header-meta">

					<div class="col-elem">
						<span class="phone"> <a href="/CerrarServlet">CERRAR
								SESION</a></span> <br>TIENE UN PROBLEMA CON TU MASCOTA?<br>
						LLAMAR A EMRGENCIAS: <span class="phone">
							94674040-054111111 </span>

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
			</div>
		</div>
		<div class="clear"></div>
	</header>
	<!--cliente  -->
	<div class="slider-container">
		<div class="mp-slider">
			<br>
			<h2>
				<center>LISTA DE MASCOTAS POR CLIENTE</center>
			</h2>
	<div class="gabriela">



					<!-- aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa -->
					<section>
<h2>DATOS DEL CLIENTE </h2>
             						<%
 for (int idx = 0; idx < midn.size(); idx++) {
	 Cliente t = (Cliente)midn.get(idx);
%>
<div class="box-yellow" ><p>NOMBRE Y APELLIDOS: <%=t.getNombre() %> <%=" " %> <%=t.getApellidop() %> </p>
<p>DIRECCION : <%=t.getDireccion() %></p> 
<p>TELEFONO : <%=t.getTelefono() %></p> 
</div>

<%} %>
<br>
<p> CANTIDAD MASCOTAS :  </p>

						<%
 for (int idx = 0; idx < miMascota.size(); idx++) {
	 Mascota t = (Mascota)miMascota.get(idx);
	 int i=0;
%>
<div class="divspoiler">
<a href="javascript:void(0);" 
onclick="if (this.parentNode.nextSibling.childNodes[0].style.display != '') {this.parentNode.nextSibling.childNodes[0].style.display = ''; } else { 
this.parentNode.nextSibling.childNodes[0].style.display = 'none';}" ><%=t.getNombre() %> &#9660;&#9650;</a>
</div><div><div class="spoiler" style="display: none;">	

	<div id="row">
	<div class="box-blue"><p>NOMBRE :</p><pre><%=t.getNombre()%></pre>  </div>
	<div class="box-green"><p> ESPECIE :<%=t.getEspecie() %></p></div>
	<div class="box-yellow"><p>RAZA : <%=t.getRaza() %></p></div>
	<div class="box-grey"><p>OBSERVACION : <%=t.getSexo() %> </p></div>
	
					<div id="izq">
						
					</div>

				</div>					
	</div></div>	
<%}%>
					</section>



				</div>

		</div>
	</div>

</body>
</html>