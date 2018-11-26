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
				<i class="fa fa-file" style="font-size: 38px; color: orange;"></i> Registrar Compras
			</h1>
		</div>
	</div>
	<div>
		<div style="width: 300px; position: relative; left: 70%;">
			<li class="app-search"><input style="width: 300px;"
				class="app-search__input" type="search" placeholder="Search">
				<button class="app-search__button">
					<i class="fa fa-search"></i>
				</button></li>
		</div>
		<div class="table-responsive"
			style="background-color: white; margin-top: 5%;">
			<table class="table table-hover" id="registrar">
				<thead>
					<tr>
						<th>#</th>
						<th>Nombre</th>
						<th>Fecha</th>
						<th colspan="2">Acción</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>Lista 1</td>
						<td>5/11/2018</td>
						<td><a href="#" class="fa fa-eye"></a></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	<br />
	<div class="row">
		<div class="row col-md-12">
			<div class="row col-md-8"></div>
			<div class="col-md-4">
				<button type="button" class="btn btn-lg btn-primary" id="siguiente">Salir</button>
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