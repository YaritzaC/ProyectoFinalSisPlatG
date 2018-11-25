<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es">
<head>
<title>SysCoco</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
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
				<i class="fa fa-dashboard"></i> Cliente
			</h1>
		</div>
	</div>
	<%
		int i = 0;
	%>
	<div class="table-responsive" style="background-color: white;">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>#</th>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>DNI</th>
					<th>Razon social</th>
					<th>Ruc</th>
					<th>Direccion</th>
					<th>Celular</th>
					<th>Estado</th>
					<th colspan="3">Accion</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listaCli}" var="clie">
					<%
						i++;
					%>
					<tr>
						<th scope="row"><%=i%></th>
						<td>clie.CLI_NOMBRE</td>
						<td>clie.CLI_APELLIDO</td>
						<td>clie.CLI_DNI</td>
						<td>clie.CLI_RAZONSOCIAL</td>
						<td>clie.CLI_RUC</td>
						<td>clie.CLI_DIRECCION</td>
						<td>clie.CLI_CELULAR</td>
						<td>clie.CLI_ESTADO</td>
						<td><a style="color: green;" onclick=""><i
								class="fa fa-outdent" aria-hidden="true"></i></a></td>
						<td><a style="color: blue;"><i
								class="fa fa-pencil-square-o" aria-hidden="true"></i></a></td>
						<td><a style="color: red;"><i class="fa fa-trash"
								aria-hidden="true"></i></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
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