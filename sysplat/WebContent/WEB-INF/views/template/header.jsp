<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<header class="app-header" style="background-color: #6E6E6E;">
	<a class="app-header__logo" style="background-color: #6E6E6E;" href="#">Plateria
		Guadalupe</a>
	<!-- Sidebar toggle button-->
	<a class="app-sidebar__toggle" href="#" data-toggle="sidebar"
		aria-label="Hide Sidebar"></a>
	<!-- Navbar Right Menu-->
	<ul class="app-nav">
		<li class="app-search"><input class="app-search__input"
			type="search" placeholder="Search">
			<button class="app-search__button">
				<i class="fa fa-search"></i>
			</button></li>
		<!--Notification Menu-->
		<li class="dropdown"><a class="app-nav__item" href="#"
			data-toggle="dropdown" aria-label="Show notifications"><i
				class="fa fa-bell-o fa-lg"></i></a>
			<ul class="app-notification dropdown-menu dropdown-menu-right">
				<li class="app-notification__title">You have 4 new
					notifications.</li>
				<div class="app-notification__content">
					<li><a class="app-notification__item" href="javascript:;"><span
							class="app-notification__icon"><span
								class="fa-stack fa-lg"><i
									class="fa fa-circle fa-stack-2x text-primary"></i><i
									class="fa fa-envelope fa-stack-1x fa-inverse"></i></span></span>
							<div>
								<p class="app-notification__message">Lisa sent you a mail</p>
								<p class="app-notification__meta">2 min ago</p>
							</div></a></li>
					<li><a class="app-notification__item" href="javascript:;"><span
							class="app-notification__icon"><span
								class="fa-stack fa-lg"><i
									class="fa fa-circle fa-stack-2x text-danger"></i><i
									class="fa fa-hdd-o fa-stack-1x fa-inverse"></i></span></span>
							<div>
								<p class="app-notification__message">Mail server not working</p>
								<p class="app-notification__meta">5 min ago</p>
							</div></a></li>
					<li><a class="app-notification__item" href="javascript:;"><span
							class="app-notification__icon"><span
								class="fa-stack fa-lg"><i
									class="fa fa-circle fa-stack-2x text-success"></i><i
									class="fa fa-money fa-stack-1x fa-inverse"></i></span></span>
							<div>
								<p class="app-notification__message">Transaction complete</p>
								<p class="app-notification__meta">2 days ago</p>
							</div></a></li>
					<div class="app-notification__content">
						<li><a class="app-notification__item" href="javascript:;"><span
								class="app-notification__icon"><span
									class="fa-stack fa-lg"><i
										class="fa fa-circle fa-stack-2x text-primary"></i><i
										class="fa fa-envelope fa-stack-1x fa-inverse"></i></span></span>
								<div>
									<p class="app-notification__message">Lisa sent you a mail</p>
									<p class="app-notification__meta">2 min ago</p>
								</div></a></li>
						<li><a class="app-notification__item" href="javascript:;"><span
								class="app-notification__icon"><span
									class="fa-stack fa-lg"><i
										class="fa fa-circle fa-stack-2x text-danger"></i><i
										class="fa fa-hdd-o fa-stack-1x fa-inverse"></i></span></span>
								<div>
									<p class="app-notification__message">Mail server not
										working</p>
									<p class="app-notification__meta">5 min ago</p>
								</div></a></li>
						<li><a class="app-notification__item" href="javascript:;"><span
								class="app-notification__icon"><span
									class="fa-stack fa-lg"><i
										class="fa fa-circle fa-stack-2x text-success"></i><i
										class="fa fa-money fa-stack-1x fa-inverse"></i></span></span>
								<div>
									<p class="app-notification__message">Transaction complete</p>
									<p class="app-notification__meta">2 days ago</p>
								</div></a></li>
					</div>
				</div>
				<li class="app-notification__footer"><a href="#">See all
						notifications.</a></li>
			</ul></li>
		<!-- User Menu-->
		<li class="dropdown"><a class="app-nav__item" href="#"
			data-toggle="dropdown" aria-label="Open Profile Menu"><i
				class="fa fa-user fa-lg"></i></a>
			<ul class="dropdown-menu settings-menu dropdown-menu-right">
				<li><a class="dropdown-item" href="page-user.html"><i
						class="fa fa-cog fa-lg"></i> Settings</a></li>
				<li><a class="dropdown-item" href="page-user.html"><i
						class="fa fa-user fa-lg"></i> Profile</a></li>
				<li><a class="dropdown-item" href="/sysplat/"><i
						class="fa fa-sign-out fa-lg"></i> Logout</a></li>
			</ul></li>
	</ul>
</header>
<!-- Sidebar menu-->
<div class="app-sidebar__overlay" data-toggle="sidebar"></div>
<aside class="app-sidebar" style="background-color: #6E6E6E;">
	<div class="app-sidebar__user">
		<img class="app-sidebar__user-avatar"
			src="https://s3.amazonaws.com/uifaces/faces/twitter/jsa/48.jpg"
			alt="User Image">
		<div>
			<p class="app-sidebar__user-name">${user}</p>
			<p class="app-sidebar__user-designation">${tipo}</p>
			Id empleado<input class="form-control" value="${idempleado}" type="text"
					disabled="disabled" id="idEmpleado"> 
			Id sede	<input class="form-control" value="${idsede}" type="text"
					disabled="disabled" id="idSede">
		</div>
	</div>
	<ul class="app-menu">
		<c:forEach items="${lista}" var="user">
			<li><a class="app-menu__item" href="${user.ACS_URL}"><i
					class="app-menu__icon ${user.ACS_ICONO}"></i><span
					class="app-menu__label" > ${user.ACS_NOMBRE}  </span></a>
					<!-- id="${user.ACS_ID}"  <a  href="upd/${user.ACS_ID}"> Hola </a>--></li>
		</c:forEach>
	</ul>
</aside>








