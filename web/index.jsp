<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/1
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>我的首页</title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/css/zzsc-demo.css">
    <link rel="stylesheet" type="text/css" href="/css/bootsnav.css">
    <style type="text/css">
      nav.navbar.bootsnav{
        border: none;
        margin-bottom: 150px;
      }
      .navbar-nav{
        float: left;
      }
      nav.navbar.bootsnav ul.nav > li > a{
        color: #474747;
        text-transform: uppercase;
        padding: 30px;
      }
      nav.navbar.bootsnav ul.nav > li:hover{
        background: #f4f4f4;
      }
      .nav > li:after{
        content: "";
        width: 0;
        height: 5px;
        background: #34c9dd;
        position: absolute;
        bottom: 0;
        left: 0;
        transition: all 0.5s ease 0s;
      }
      .nav > li:hover:after{
        width: 100%;
      }
      nav.navbar.bootsnav ul.nav > li.dropdown > a.dropdown-toggle:after{
        content: "+";
        font-family: 'FontAwesome';
        font-size: 16px;
        font-weight: 500;
        position: absolute;
        top: 35%;
        right: 10%;
        transition: all 0.4s ease 0s;
      }
      nav.navbar.bootsnav ul.nav > li.dropdown.on > a.dropdown-toggle:after{
        content: "\f105";
        transform: rotate(90deg);
      }
      .dropdown-menu.multi-dropdown{
        position: absolute;
        left: -100% !important;
      }
      nav.navbar.bootsnav li.dropdown ul.dropdown-menu{
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
        border: none;
      }
      @media only screen and (max-width:990px){
        nav.navbar.bootsnav ul.nav > li.dropdown > a.dropdown-toggle:after,
        nav.navbar.bootsnav ul.nav > li.dropdown.on > a.dropdown-toggle:after{ content: " "; }
        .dropdown-menu.multi-dropdown{ left: 0 !important; }
        nav.navbar.bootsnav ul.nav > li:hover{ background: transparent; }
        nav.navbar.bootsnav ul.nav > li > a{ margin: 0; }
      }
    </style>
  </head>
  <body>
  <div>
    <a href="/main/goNext" >goNext</a>
  </div>
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
                <li><a href="#">Home</a></li>
                <li><a href="#">About Us</a></li>
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">Shortcodes</a>
                  <ul class="dropdown-menu">
                    <li><a href="#">Custom Menu</a></li>
                    <li><a href="#">Custom Menu</a></li>
                    <li class="dropdown">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown" >Sub Menu</a>
                      <ul class="dropdown-menu">
                        <li><a href="#">Custom Menu</a></li>
                        <li><a href="#">Custom Menu</a></li>
                        <li class="dropdown">
                          <a href="#" class="dropdown-toggle" data-toggle="dropdown" >Sub Menu</a>
                          <ul class="dropdown-menu multi-dropdown">
                            <li><a href="#">Custom Menu</a></li>
                            <li><a href="#">Custom Menu</a></li>
                            <li><a href="#">Custom Menu</a></li>
                            <li><a href="#">Custom Menu</a></li>
                          </ul>
                        </li>
                        <li><a href="#">Custom Menu</a></li>
                      </ul>
                    </li>
                    <li><a href="#">Custom Menu</a></li>
                    <li><a href="#">Custom Menu</a></li>
                    <li><a href="#">Custom Menu</a></li>
                    <li><a href="#">Custom Menu</a></li>
                  </ul>
                </li>
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">Pages</a>
                  <ul class="dropdown-menu">
                    <li><a href="#">Custom Menu</a></li>
                    <li><a href="#">Custom Menu</a></li>
                    <li class="dropdown">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown">Sub Menu</a>
                      <ul class="dropdown-menu">
                        <li><a href="#">Custom Menu</a></li>
                        <li><a href="#">Custom Menu</a></li>
                        <li class="dropdown">
                          <a href="#" class="dropdown-toggle" data-toggle="dropdown">Sub Menu</a>
                          <ul class="dropdown-menu multi-dropdown">
                            <li><a href="#">Custom Menu</a></li>
                            <li><a href="#">Custom Menu</a></li>
                            <li><a href="#">Custom Menu</a></li>
                            <li><a href="#">Custom Menu</a></li>
                          </ul>
                        </li>
                        <li><a href="#">Custom Menu</a></li>
                      </ul>
                    </li>
                    <li><a href="#">Custom Menu</a></li>
                    <li><a href="#">Custom Menu</a></li>
                    <li><a href="#">Custom Menu</a></li>
                    <li><a href="#">Custom Menu</a></li>
                  </ul>
                </li>
                <li><a href="#">Portfolio</a></li>
                <li><a href="#">Contact Us</a></li>
              </ul>
            </div>
          </nav>
        </div>
      </div>
    </div>
  </div>

  </body>
  <script type="text/javascript" src="/js/jquery.min.js"></script>
  <script type="text/javascript" src="/js/bootsnav.js"></script>
  <script type="text/javascript" src="/js/bootstrap.min.js"></script>

</html>
