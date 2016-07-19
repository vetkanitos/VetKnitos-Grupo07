<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  	<title>About</title>
  	<meta charset="utf-8">
    <meta name="description" content="Your description">
    <meta name="keywords" content="Your keywords">
    <meta name="author" content="Your name">
    <link rel="stylesheet" href="css/style.css">
    <script src="js/jquery-1.7.1.min.js"></script>
    <script src="js/superfish.js"></script>
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
<body>
<!-- Header -->
<header>
    <div class="inner">
        <div class="fright">
  		<h2><span>VET K'anitos</span></h2>
         <div>
                <h1 class="logo"><a href="home.html">Pet clinic</a></h1>
                </div>
                <div class="col-elem">
                	<span class="phone"> <a href="GmailServlet">INICIAR SESION</a></span>
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
                    <li><a href="/Comentario.jsp">CONTACTO</a></li>
                    <li><a href="verAdoptaMacotas.jsp">ADOPTA MASCOTA</a></li>
                </ul>
            </nav>
        </div>
        <div class="clear"></div>
    </div>
</header>
<!-- Content -->
<section id="content"><div class="ic"></div>
    <div class="container_24">
        <div class="indent-bot-2 boxes-bg">
            <article class="grid_6">
                <div class="box-1">
                    <div class="inner">
                        <h3>QUIENES SOMOS</h3>
                        <p>
                            Somos profesionales en salud animal queriendo establecer estándares de calidad 
                            en el mantenimiento de las mascotas, brindándoles cariño y seguridad en nuestros
                            procesos. Queremos crear conciencia en el cuidado, amor y respeto hacia las 
                            mascotas pues nos ayudan a alegrar nuestra vida diaria
                        </p>
                        </div>
                    </div>
                </div>
            </article>
            <article class="grid_6">
                <div class="box-1">
                    <div class="inner">
                        <h3>VISION</h3>
  
                        <p>
                            Somos una Clinica veterinaria de mascotas, reconocida en Peru - en la ciudad de Arequipa,
                             que brinda una experiencia integral a sus clientes traducida en salud, entretenimiento y bienestar,
                              a través de productos y servicios de alta calidad; contando con el mejor talento humano en cada una de las áreas.
                        </p>
                    </div>
                </div>
            </article>
            <article class="grid_6">
                <div class="box-1">
                    <div class="inner">
                        <h3>MISION</h3>
                        <p>
                            En 2019 Vet K'ANITOS será reconocida como la una clinica de mascotas líder en Peru; 
                            obteniendo reputación por:

						√ Su presencia en varias ciudades del ciudades.
						√ Servicio integral al cliente con un valor diferencial.
						√ La más alta tecnología en laboratorios y clínicas.
						√ Un equipo de trabajo con alto desempeño, pasión y compromiso.
						√ Ser un lugar aspiracional para trabajar por su posicionamiento y su ambiente laboral.
                        </p>
                    </div>
                </div>
            </article>
            <article class="grid_6">
                <div class="box-1">
                    <div class="inner">
                         <h3>VALORES </h3>
                        <p>
                            SERVICIO: el cliente es lo mas importante y reconozco su valor.
							RESPETO: conmigo, con mis compañeros, con clientes, proveedores y con PetCol.
							HONESTIDAD, soy sincero, transparente y ético en todas mis actuaciones.
							COMPROMISO, trabajo cada día entregando la milla extra.
							SOLIDARIDAD, soy comprensivo frente a las necesidades de los demás.
							PASIÓN, trabajo motivado y disfruto lo que hago.
                        </p>
                    </div>
                </div>
            </article>
            <div class="clear"></div>
        </div>
        <div class="hr-border"></div>
        <div class="a1">
        	<h2>Testimonials:</h2>
            <div>
            	<div class="grid_6 alpha">
                	<blockquote class="quote-1">
                    	<div class="quote-1-inner">
                    		<span class="str-1">Sed sed felis arcu, vel vehicula augue. Maecenas faucibus sagittis cursus. Fusce tincidunt, tellus eget tristique cursus orci mi iaculis sem sit.</span>
                        </div>
                    </blockquote>
                    <div class="author alignright indents-1">
                    	<em>
                        	Richard Cox
                        </em>
                        (manager)
                    </div>
                </div>
                <div class="grid_6">
                	<blockquote class="quote-1">
                    	<div class="quote-1-inner">
                    		<strong>Sed sed felis arcu, vel vehicula augue.</strong><br>
							Maecenas faucibus sagittis cursus. Fusce tincidunt, tellus eget tristique cursus orci mi iaculis sem sit amet dictum velit velit eu.
                        </div>
                    </blockquote>
                    <div class="author alignright indents-1">
                    	<em>
                        	April Jeckson
                        </em>
                        (housewife)
                    </div>
                </div>
                <div class="grid_6">
                	<blockquote class="quote-1">
                    	<div class="quote-1-inner">
                    		<strong>Maecenas faucibus sagittis cursus.</strong><br>
							Fusce tincidunt, tellus eget tristique cursus orci mi iaculis sem sit. amet.dictum velit velit eu magna. Nunc viverra nisi sed orci tin.
                        </div>
                    </blockquote>
                    <div class="author alignright indents-1">
                    	<em>
                        	Alan Pool
                        </em>
                        (lawyer)
                    </div>
                </div>
                <div class="grid_6 omega">
                	<blockquote class="quote-1">
                    	<div class="quote-1-inner">
                    		<strong>Fusce tincidunt, tellus eget tristique cursus orci mi</strong><br>
                            iaculis sem sit. amet.dictum velit velit eu magna. Nunc viverra nisi sed orci tincidunt at hendrerit orci luctus. Andisse tincidunt, ipsu.
                        </div>
                    </blockquote>
                    <div class="author alignright indents-1">
                    	<em>
                        	Serg Brin
                        </em>
                        (manager)
                    </div>
                </div>
        		<div class="clear"></div>
            </div>
        </div>
    </div>
</section>
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