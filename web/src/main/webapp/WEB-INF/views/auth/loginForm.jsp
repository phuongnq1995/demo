<tiles:insertDefinition name="layouts">
	<tiles:putAttribute name="body">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<form:form action="${pageContext.request.contextPath}/auth/login" method="post" modelAttribute="authForm">
					<div class="card card-signin my-5 small shadow">
						
							<c:if test="${param.containsKey('error')}">
								<div class="alert alert-danger">
									<strong><c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" /></strong>
								</div>
							</c:if>

							<c:if test="${param.containsKey('systemError')}">
								<div class="alert alert-danger">
									<strong><spring:message code="ERR_ACC_0002" /></strong>
								</div>
							</c:if>

							<div class="form-group">
								<label for="username">User name</label> 
								<input type="text" id="username" name="username" class="form-control" placeholder="Email address" required autofocus />
							</div>

							<div class="form-group">
								<label for="password">Password</label>
								<input type="password" id="password" name="password" class="form-control" placeholder="Password" required />
							</div>

							<button class="btn btn-lg btn-light btn-block text-uppercase" type="submit">Sign in</button>
					</div>
				</form:form>
			</div>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>