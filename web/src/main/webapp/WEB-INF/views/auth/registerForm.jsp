<tiles:insertDefinition name="layouts">

	<tiles:putAttribute name="breadcrumb">
		<li class="breadcrumb-item">
			<i class="fa fa-folder"></i> Account Management</li>
		<li class="breadcrumb-item active" aria-current="page">
			<i class="fa fa-plus-circle"></i> Create account</li>
	</tiles:putAttribute>

	<tiles:putAttribute name="header-link">
		<li class="nav-item">
			<a class="nav-link" href="${pageContext.request.contextPath}/auth/search">
				<i class="fa fa-search"></i> Search account
			</a>
		</li>
	</tiles:putAttribute>

	<tiles:putAttribute name="additionalHeading">
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
		<form:form method="post" modelAttribute="authForm" action="${pageContext.request.contextPath}/auth/register">
			<form:errors path="*" cssClass="alert ndvn-error" delimiter="<br/>" element="div" cssStyle="" />
			<div class="card">
				<div class="card-header">
					<img class="ndvn-icon" src="${pageContext.request.contextPath}/resources/common/images/detail.png"></img>
					<span class="ndvn-heading-text">Information</span>
				</div>
				<div class="card-body">
					<table class="table table-bordered">
						<colgroup>
							<col width="20%" />
							<col width="30%" />
							<col width="20%" />
							<col width="30%" />
						</colgroup>
						<tr>
							<th>
								<form:label path="fullname">
									Full name&nbsp;
									<label class="ndvn-required-field">(*)</label>
								</form:label>
							</th>
							<td colspan="3"><form:input type="text" cssClass="form-control" path="fullname" autofocus="true" maxlength="200" /></td>
						</tr>
						<tr>
							<th>
								<form:label path="username">
									User name&nbsp;
									<label class="ndvn-required-field">(*)</label>
								</form:label>
							</th>
							<td colspan="3"><form:input type="text" cssClass="form-control" path="username" autofocus="true" maxlength="200" /></td>
						</tr>
						<tr>
							<th>
								<form:label path="password">
									Password
								</form:label>
							</th>
							<td colspan="3"><form:password cssClass="form-control" path="password" autofocus="true" maxlength="200" /></td>
						</tr>
						<tr>
							<th>
								<form:label path="passwordConfirm">
									Password confirm
								</form:label>
							</th>
							<td>
								<form:password cssClass="form-control" path="passwordConfirm" autofocus="true" maxlength="200" />
							</td>
						</tr>
					</table>
				</div>
			</div>
			<div class="ndvn-div-action">
				<button type="submit" class="btn ndvn-button">Create</button>
			</div>
		</form:form>
	</tiles:putAttribute>
</tiles:insertDefinition>