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
<link rel="apple-touch-icon" sizes="60x60"
	href="${urlrecursos}/images/ico/apple-icon-60.png">
<link rel="apple-touch-icon" sizes="76x76"
	href="${urlrecursos}/images/ico/apple-icon-76.png">
<link rel="apple-touch-icon" sizes="120x120"
	href="${urlrecursos}/images/ico/apple-icon-120.png">
<link rel="apple-touch-icon" sizes="152x152"
	href="${urlrecursos}/images/ico/apple-icon-152.png">
<link rel="shortcut icon" type="image/x-icon"
	href="${urlrecursos}/images/ico/favicon.ico">
<link rel="shortcut icon" type="image/png"
	href="${urlrecursos}/images/ico/favicon-32.png">

<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/css/bootstrap.css">
<!-- font icons-->
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/fonts/icomoon.css">
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/fonts/flag-icon-css/css/flag-icon.min.css">
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/vendors/css/extensions/pace.css">
<!-- END VENDOR CSS-->
<!-- BEGIN ROBUST CSS-->
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/css/bootstrap-extended.css">
<link rel="stylesheet" type="text/css" href="${urlrecursos}/css/app.css">
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/css/colors.css">
<!-- END ROBUST CSS-->
<!-- BEGIN Page Level CSS-->
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/js/core/menu/menu-types/vertical-menu.css">
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/js/core/menu/menu-types/vertical-overlay-menu.css">
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/js/core/colors/palette-gradient.css">
<!-- END Page Level CSS-->
<!-- BEGIN Custom CSS-->
<link rel="stylesheet" type="text/css"
	href="${urlrecursos}/assets/css/style.css">
<!-- END Custom CSS-->
</head>
<body class="app sidebar-mini rtl">
	<!-- Navbar-->
	<jsp:include page="template/header.jsp"></jsp:include>
	<main class="app-content">
	<div class="app-title">
		<div>
			<h1>
				<i class="fa fa-dashboard"></i> Nuevo Pedido
			</h1>
		</div>
		<ul class="app-breadcrumb breadcrumb">
			<li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
			<li class="breadcrumb-item"><a href="#">Blank Page</a></li>
		</ul>
	</div>
		<div class="">
		<div class="content-wrapper">
			<div class="content-header row"></div>
			<div class="content-body">
				<!-- stats -->
				<div class="row">
					<div class="col-xl-3 col-lg-6 col-xs-12">
						<div class="card">
							<div class="card-body">
								<div class="card-block">
									<div class="media">
										<div class="media-body text-xs-left">
											<h3 class="pink">10</h3>
											<span><a style="color: black"
												href="/sysplat/Lista-Pedidos">Pedido </a></span>
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
										<div class="media-body text-xs-left">
											<h3 class="teal">15</h3>
											<span><a style="color: black"
												href="/sysplat/Lista-HC"> Hoja Contrato
											</a></span>
										</div>
										<div class="media-right media-middle">
											<i class="icon-user1 teal font-large-2 float-xs-right"></i>
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
										<div class="media-body text-xs-left">
											<h3 class="deep-orange">29</h3>
											<span><a style="color: black"
												href="/sysplat/Lista-OT"> Orden Trabajo
											</a></span>
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
					<div class="col-xl-3 col-lg-6 col-xs-12">
						<div class="card">
							<div class="card-body">
								<div class="card-block">
									<div class="media">
										<div class="media-body text-xs-left">
											<h3 class="cyan">18</h3>
											<span><a style="color: black"
												href="/sysplat/Lista-Comprobante-Pedido">Venta Pedido </a></span>
										</div>
										<div class="media-right media-middle">
											<i
												class="icon-ios-help-outline cyan font-large-2 float-xs-right"></i>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</main>
	<script src="${urlrecursos}/vendors/js/charts/chart.min.js"></script>

	<!-- Essential javascripts for application to work-->

	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="${urlrecursos}/js/main.js"></script>
	<!-- The javascript plugin to display page loading on top-->
	<script src="${urlrecursos}/js/plugins/pace.min.js"></script>

	<script src="${urlrecursos}/js/core/app-menu.js"></script>
	<script src="${urlrecursos}/js/core/app.js"></script>
	<script src="${urlrecursos}/vendors/js/ui/tether.min.js"></script>
	<script
		src="${urlrecursos}/vendors/js/ui/perfect-scrollbar.jquery.min.js"></script>
	<script src="${urlrecursos}/vendors/js/ui/unison.min.js"></script>
	<script src="${urlrecursos}/vendors/js/ui/blockUI.min.js"></script>
	<script src="${urlrecursos}/vendors/js/ui/jquery.matchHeight-min.js"></script>
	<script src="${urlrecursos}/vendors/js/ui/screenfull.min.js"></script>
	<script src="${urlrecursos}/vendors/js/extensions/pace.min.js"></script>
	<script src="${urlrecursos}/js/dashboard-lite.js"></script>
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