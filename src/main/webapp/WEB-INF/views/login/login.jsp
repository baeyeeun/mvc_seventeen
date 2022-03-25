<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>

<!doctype html>
<html lang="kor">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="../../../bootstrap/bootstrap-5.1.3-dist/css/bootstrap.min.css" rel="stylesheet">

    <title>ë¡ê·¸ì¸ íì´ì§</title>
  </head>
 <style type="text/css">

.logo{
    
     font-family: 'Y_Spotlight';
     
     padding: 50px 0px 0px 0px;
     text-align: center;
     font-size: 60px;

    }
    .login{
    
     font-family: 'EliceDigitalBaeum-Bd';
     padding: 10px 0px 10px 0px;
     text-align: center;
     font-size: 18px;
    }
    
	.bodybody{
    
    font-family: 'Cafe24SsurroundAir';
    font-size: 14px;
    
    }
    
    .joingo{
    
    font-family: 'Cafe24SsurroundAir';
    font-size: 12px;   
    
    text-align: center;
    
    padding: 10px 0px 10px 0px;
    
    }
    
    @font-face {
    font-family: 'Y_Spotlight';
    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts-20-12@1.0/Y_Spotlight.woff') format('woff');
    font-weight: normal;
    font-style: normal;
	}
	
    @font-face {
    font-family: 'EliceDigitalBaeum-Bd';
    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_elice@1.0/EliceDigitalBaeum-Bd.woff2') format('woff2');
    font-weight: normal;
    font-style: normal;
	} 

    @font-face {
    font-family: 'Cafe24SsurroundAir';
    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2105_2@1.0/Cafe24SsurroundAir.woff') format('woff');
    font-weight: normal;
    font-style: normal;
    }
     
 </style> 
  <body class="bodybody">

	<div class="container">
	
	 <h1 class="logo"><font color="#bebebe">YES</font><font color="#0064FF">24</font></h1>
	 <h3 class="login">ë¡ê·¸ì¸ íì´ì§</h3>
		
		<div class="input-group col-sm-6 mb-3">
		 <input type="text" class="form-control" id="name" placeholder="ìì´ë">
		</div>

		<div class="input-group col-sm-6 mb-3">
		 <input type="text" class="form-control" id="name" placeholder="ë¹ë°ë²í¸">
		</div>
		
		<div class="col-sm-6 mt-3 mt-sm-0">
		 <input class="form-check-input" type="checkbox" value="" id="remember">
		 <label class="form-check-label" for="agree1"> ìë ë¡ê·¸ì¸
		</div>	
		
		<h6 class="joingo">ìì´ëê° ìì¼ìë¤ë©´? <a href="#"><b>íìê°ì</b></a></h6>
	
		<div class="d-grid gap-2">
		 <button class="btn btn-dark" type="button">ë¡ê·¸ì¸</button>
		 <button class="btn btn-warning" type="button">ì¹´ì¹´ì¤í¡ ë¡ê·¸ì¸</button>
		 <button class="btn btn-danger" type="button">êµ¬ê¸ ë¡ê·¸ì¸</button>
		 <button class="btn btn-success" type="button">ë¤ì´ë² ë¡ê·¸ì¸</button>
		</div>
	
	</div>



    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="../../../bootstrap/bootstrap-5.1.3-dist/js/bootstrap.bundle.min.js"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    -->

  </body>
</html>

