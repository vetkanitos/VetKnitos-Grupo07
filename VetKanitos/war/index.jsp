<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="pw2.*"%>
<%@page import="java.util.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%List<Comentario> comentario = ComentarioDatos.verComentario(); %>
<%List<Cliente> cliente = ClienteDatos.VerCliente(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Home</title>
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
            <div class="header-meta">
           		<h2><span>VET K'anitos</span></h2>
                <div class="col-elem">
                	<span class="phone"> <a href="/GmailServlet">INICIAR SESION</a></span>
                    <br>TIENE UN PROBLEMA CON TU MASCOTA?<br>
                    LLAMAR A EMRGENCIAS: 
                    <span class="phone">
                        94674040-054111111
                    </span>
                    
                </div>
               
            </div> 
            <nav>
                <ul class="sf-menu">
                    <li class="current"><a href="/index.jsp">INICIO</a></li>
                    <li><a href="/Nosotros.jsp">NOSOTROS</a></li>
                    <li><a href="/verAdoptaMacotas.jsp">ADOPTA MASCOTA</a></li>
                </ul>
            </nav>
        </div>
        <div class="clear"></div>
    </div>
	<div class="slider-container">
		<div class="mp-slider">
			<ul class="items">
				<li><img src="images/slide-1.jpg" alt=""></li>
				<li><img src="images/slide-2.jpg" alt=""></li>
				<li><img src="images/slide-3.jpg" alt=""></li>
			</ul>
		</div>
	</div>
	<div class="clear"></div>
	</header>
	<!-- Content -->
<div class="hr-border"></div>
<%
					for (int i = 0; i < comentario.size(); i++) {
						Comentario comentarios = (Comentario) comentario.get(i);
				%>
        <div class="a1">
        <h1>Comentarios</h1>
        <div>
        <div class="grid_6 alpha">
                	<blockquote class="quote-1">
                    	<div class="quote-1-inner">
                    		<span class="str-1"><%=comentarios.getComentario()%></span><br>
                    		<h3>Puntuacion</h3>
                    		<h4><%=comentarios.getCalificacion()%></h4>
                        </div>
                    </blockquote>
                    <div class="author alignright indents-1">
                    	<em>
                        	<!--%=comentarios.getComentario()%> -->
                        </em>
                        (cliente)
                    </div>
                </div>
               
        </div>
         
        </div>
<%} %>
	<!-- Footer -->
	<footer>
	<ul class="social-list">
		<li><a href="#"><img src="images/social-link-1.jpg" alt=""></a></li>
		<li><a href="#"><img src="images/social-link-2.jpg" alt=""></a></li>
		<li><a href="#"><img src="images/social-link-3.jpg" alt=""></a></li>
		<li><a href="#"><img src="images/social-link-4.jpg" alt=""></a></li>
	</ul>
	</footer>
</body>
</html>