<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta name="viewport" content="width=device-width" />
<c:set var="titleKey">
	<tiles:insertAttribute name="title" ignore="true" />
</c:set>
<title><spring:message code="${titleKey}" text="demoproject" /></title>
<link href="${pageContext.request.contextPath}/resources/common/css/theme.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/resources/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="${pageContext.request.contextPath}/resources/webjars/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet" />
<script src="${pageContext.request.contextPath}/resources/webjars/jquery/3.1.1/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/common/js/app.js"></script>
</head>
<body>
	<tiles:insertAttribute name="header" />
	<div class="demo-breadcrumb">
		<ul class="breadcrumb">
			<li><a href="${pageContext.request.contextPath}/">Home</a></li>
			<tiles:insertAttribute name="breadcrumb" ignore="true"></tiles:insertAttribute>
		</ul>
	</div>
	<div class="demo-link-header">
		<tiles:insertAttribute name="header-link" ignore="true" />
	</div>
	<div class="container-fluid body">
		<tiles:insertAttribute name="body" />
	</div>
	<tiles:insertAttribute name="footer" />
</body>
</html>
