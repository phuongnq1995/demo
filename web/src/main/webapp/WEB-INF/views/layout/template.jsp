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
	<link type="text/css" href="${pageContext.request.contextPath}/resources/common/css/bootstrap.min.css" rel="stylesheet" />
	<link type="text/css" href="${pageContext.request.contextPath}/resources/common/css/theme.css" rel="stylesheet" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/common/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/common/js/bootstrap.min.js"></script>
</head>
<body>
	<tiles:insertAttribute name="header" />
	<div class="demo-breadcrumb">
		<ul class="breadcrumb">
			<li>
				<a href="${pageContext.request.contextPath}/">Home</a>
			</li>
			<tiles:insertAttribute name="breadcrumb" ignore="true"></tiles:insertAttribute>
		</ul>
	</div>
	<div class="demo-link-header">
		<tiles:insertAttribute name="header-link" ignore="true"/>
	</div>
	<div class="container-fluid">
		<tiles:insertAttribute name="body" />
	</div>
	<tiles:insertAttribute name="footer" />

</body>
</html>