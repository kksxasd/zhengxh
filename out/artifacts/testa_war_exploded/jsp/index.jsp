<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/1
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <head>
    <title>我的首页</title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/css/zzsc-demo.css">
    <link rel="stylesheet" type="text/css" href="/css/bootsnav.css">
    <link rel="stylesheet" type="text/css" href="/css/index.css">
    <script type="text/javascript" src="/js/jquery.min.js"></script>
  </head>
  <body>
  <div class="demo" style="padding: 2em 0;">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <nav class="navbar navbar-default navbar-mobile bootsnav">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-menu">
                <i class="fa fa-bars"></i>
              </button>
            </div>
            <div class="collapse navbar-collapse" id="navbar-menu">
              <ul class="nav navbar-nav" data-in="fadeInDown" data-out="fadeOutUp">
                <c:forEach var="pMenu" items="${indexParentMenus}">
                  <li data-value="${pMenu.id}" class="menu"><a href="${pMenu.link}">${pMenu.name}</a>
                </c:forEach>
              </ul>
            </div>
          </nav>
        </div>
      </div>
    </div>
  </div>

  </body>

  <script type="text/javascript" src="/js/bootsnav.js"></script>
  <script type="text/javascript" src="/js/bootstrap.min.js"></script>

</html>
