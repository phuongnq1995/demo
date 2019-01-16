<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<%-- <a href="#"><img class="demo-logo"
				src="${pageContext.request.contextPath}/resources/common/images/logo.png"
				alt="logo"></a> --%>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
				<li class="active"><a href="${pageContext.request.contextPath}">Home</a></li>
				<li><a href="#">About</a></li>
				<li><a href="#">Projects</a></li>
				<li><a href="#">Contact</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<sec:authorize access="isAuthenticated()">
					<li><a onclick="document.forms['logoutForm'].submit()" class="small-dialog popup-with-zoom-anim"
						href="javascript:void()"> <i class="fa fa-sign-out"></i> Logout
					</a>
						<form id="logoutForm" method="POST" action="${pageContext.request.contextPath}/auth/logout">
							<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
						</form></li>
				</sec:authorize>
				<sec:authorize access="isAnonymous()">
					<li><a href="${pageContext.request.contextPath}/auth/login"> <i class="fa fa-sign-in"></i> Login
					</a></li>
				</sec:authorize>
			</ul>
		</div>
	</div>
</nav>