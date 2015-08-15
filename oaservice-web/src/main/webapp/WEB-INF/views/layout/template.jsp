<!DOCTYPE html>
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>    <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>    <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js">
<!--<![endif]-->
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="スマートサービス株式会社管理システム">
<meta name="renderer" content="webkit">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<meta name="contextPath" content="${pageContext.request.contextPath}" />

<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resources/app/css/img/favicon.png">
<link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/resources/app/css/img/app-icon72x72@2x.png">

<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/app/css/amazeui.min.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/app/css/admin.css">

<!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
<!--[if lt IE 9]>
  <script src="${pageContext.request.contextPath}/resources/app/js/html5shiv.js"></script>
  <script src="${pageContext.request.contextPath}/resources/app/js/respond.min.js"></script>
<![endif]-->

<script type="text/javascript"></script>
<c:set var="titleKey">
  <tiles:insertAttribute name="title" ignore="true" />
</c:set>
<title><spring:message code="${titleKey}" text="oaservice" /></title>
</head>
<body>
  <div class="container">
    <tiles:insertAttribute name="header" />
    <tiles:insertAttribute name="body" />
    <tiles:insertAttribute name="footer" />
  </div>
  <script src="${pageContext.request.contextPath}/resources/app/js/jquery.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/app/js/common.js"></script>
  <script src="${pageContext.request.contextPath}/resources/app/js/amazeui.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/app/js/app.js"></script>
</body>
</html>