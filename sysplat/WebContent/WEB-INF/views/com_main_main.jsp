<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es">
<head>
<title>SisPlat-G</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<spring:url value="/recursos" var="urlrecursos"></spring:url>
<link href="${urlrecursos}/css/template.css" rel="stylesheet">
</head>
<body class="app sidebar-mini rtl">
	<!-- Navbar-->
	<jsp:include page="template/header.jsp"></jsp:include>
	<main class="app-content">
	<div class="app-title">
		<div>
			<h1>
				<i class="fa fa-dashboard"></i> Compras
			</h1>
		</div>
		<ul class="app-breadcrumb breadcrumb">
			<li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
			<li class="breadcrumb-item"><a href="#">Blank Page</a></li>
		</ul>
	</div>
	<div class="row">
		<div class="col-md-12 row">
			<div class="tile col-md-6">
				<div class="tile-body">Crear lista para las compras</div>
			</div>
		</div>

	</div>

	<div class="">
		<div class="content-wrapper">
			<div class="content-header row"></div>
			<div class="content-body">
				<!-- stats -->
				<div class="row">
					<div class="col-xl-3 col-lg-6 col-lg-12">
						<div class="card">
							<div class="card-body">
								<div class="card-block">
									<div class="media">
										<i class="fa fa-clipboard"
											style="font-size: 48px; color: orange;"></i>
										<div class="col-xl-1"></div>
										<div class="media-body text-xs-left">
											<h3 class="pink">10</h3>
											<span><a style="color: black"
												href="/SISPLAT-G/Crear-Orden-Compra">Crear Orden de
													Compra </a></span>
										</div>
										<div class="media-right media-middle">
											<i class="icon-bag2 pink font-large-2 float-xs-right"></i>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="col-xl-3 col-lg-6 col-xs-12">
						<div class="card">
							<div class="card-body">
								<div class="card-block">
									<div class="media">
										<i class="fa fa-file" style="font-size: 48px; color: orange;"></i>
										<div class="col-xl-1"></div>
										<div class="media-body text-xs-left">
											<h3 class="deep-orange">10</h3>
											<span><a style="color: black"
												href="/SISPLAT-G/Registrar-Orden-de-Compra">Registrar
													Orden de Compra </a></span>
										</div>
										<div class="media-right media-middle">
											<i
												class="icon-diagram deep-orange font-large-2 float-xs-right"></i>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-xl-1 col-lg-2 col-xs-4" style="width: 20px"></div>
				<div class="row">
					<div class="col-xl-1 col-lg-2 col-xs-4"></div> 
					<div class="col-xl-3 col-lg-6 col-xs-12">
						<div class="card">
							<div class="card-body">
								<div class="card-block">
									<div class="media">
										<i class="fa fa-file" style="font-size: 48px; color: orange;"></i>
										<div class="col-xl-1"></div>
										<div class="media-body text-xs-left">
											<h3 class="deep-orange">10</h3>
											<span><a style="color: black"
												href="/SISPLAT-G/Registrar-Orden-de-Compra">Ingresar
													Productos Comprados </a></span>
										</div>
										<div class="media-right media-middle">
											<i
												class="icon-diagram deep-orange font-large-2 float-xs-right"></i>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--/ stats -->


			</div>
		</div>
	</div>
	</main>
	<!-- Essential javascripts for application to work-->
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="${urlrecursos}/js/main.js"></script>
	<!-- The javascript plugin to display page loading on top-->
	<script src="${urlrecursos}/js/plugins/pace.min.js"></script>
	<!-- Page specific javascripts-->
	<!-- Google analytics script-->
	<script type="text/javascript">
		if (document.location.hostname == 'pratikborsadiya.in') {
			(function(i, s, o, g, r, a, m) {
				i['GoogleAnalyticsObject'] = r;
				i[r] = i[r] || function() {
					(i[r].q = i[r].q || []).push(arguments)
				}, i[r].l = 1 * new Date();
				a = s.createElement(o), m = s.getElementsByTagName(o)[0];
				a.async = 1;
				a.src = g;
				m.parentNode.insertBefore(a, m)
			})(window, document, 'script',
					'//www.google-analytics.com/analytics.js', 'ga');
			ga('create', 'UA-72504830-1', 'auto');
			ga('send', 'pageview');
		}
	</script>
</body>
</html>