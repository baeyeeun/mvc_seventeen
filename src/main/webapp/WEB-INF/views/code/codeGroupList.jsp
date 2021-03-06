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
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.88.1">
    <title>코드 그룹 관리</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/headers/">

    

    <!-- Bootstrap core CSS -->
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.4/css/fontawesome.min.css" integrity="sha384-jLKHWM3JRmfMU0A5x5AkjWkw/EYfGUAGagvnfryNV3F9VqM98XiIH7VBGVoxVSc7" crossorigin="anonymous">

  </head>
  <style type="text/css">
  
    .logo{
    
    font-family: 'Y_Spotlight';
    
	}
	
	.codegroup{
	
    font-family: 'EliceDigitalBaeum-Bd';	
	text-align: center;
	
	padding: 30px 0px 30px 0px;

	}
	
	 .menu{
    
    font-family: 'Cafe24SsurroundAir';
    
    font-size: 15px;
    
    }
    
    .bodybody{
    
    font-family: 'Cafe24SsurroundAir';
    font-size: 12px;
    
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

	<!--  -->

  <div class="container">
  
    <header class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
      <a href="/" class="d-flex align-items-center col-md-3 mb-2 mb-md-0 text-dark text-decoration-none">
       <h1 class="logo"><font color="#bebebe">YES</font><font color="#0064FF">24</font></h1>
      </a>

       <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
       <li class="menu"><a href="#" class="nav-link px-2 link-secondary">Home</a></li>
        <li class="menu"><a href="#" class="nav-link px-2 link-dark">코드 그룹 관리</a></li>      
       <li class="menu"><a href="#" class="nav-link px-2 link-dark">회원 관리</a></li>
       <li class="menu"><a href="#" class="nav-link px-2 link-dark">리뷰 관리</a></li>
       <li class="menu"><a href="#" class="nav-link px-2 link-dark">책 정보 관리</a></li>
       </ul>

      <div class="col-md-3 text-end">
        <button type="button" class="btn btn-outline-dark me-2">Login</button>
        <button type="button" class="btn btn-dark">Sign-up</button>
      </div>
    </header>
	
	<h1 class="codegroup">코드 그룹 관리</h1>
	
    <div class="p-4 p-md-5 mb-4 text-dark rounded bg-light">
	 
    <div class="col-3 md-6 px-0"> 
     <select class="form-select" aria-label="Default select example">
     <option selected>삭제 여부</option>
     <option value="1">N</option>
     <option value="2">Y</option>
    </select>
    </div>
        
    <div class="col-3 md-6 px-0"> 
     <select class="form-select" aria-label="Default select example">
     <option selected>검색 조건</option>
     <option value="1">영문</option>
     <option value="2">한글</option>
     </select>
      </div>
      
      <div class="col-3 md-6 px-0">        
       <input type="text" class="form-control" id="reseachbar" placeholder="검색어를 입력하세요.">
       <button type="button" class="btn btn-warning">검색</button>
       <button type="button" class="btn btn-danger">초기화</button>     
      </div> 
        
  	</div>
  
	<div class="row">
	 <div class="col">
	 
	   <table class="table">

	   <thead class="table-dark">
	    <tr>
	     <td scope="col"><input class="form-check-input" type="checkbox" value="" id="check"></td>
	     <td scope="col">번호</td>
	     <td scope="col">코드 그룹 이름</td>
	     <td scope="col">삭제 여부</td>  
	    </tr>
	   </thead>

	   <tbody>

	 <c:choose>
	<c:when test="${fn:length(list) eq 0}">
		<tr>
			<td class="text-center" colspan="9">There is no data!</td>
		</tr>	
	</c:when>
	<c:otherwise>
		<c:forEach items="${list}" var="item" varStatus="status">	
		
	    <tr>
	     <th scope="col"><input class="form-check-input" type="checkbox" value="" id="check"></th>
	     <td scope="col"><c:out value="${item.ifcgSeq}"/></td>
	     <td scope="col"><c:out value="${item.ifcgName}"/></td>
	     <td scope="col"><c:out value="${item.ifcgDelNy}"/></td>
	    </tr>	      
 
 		</c:forEach>
	</c:otherwise>
</c:choose>	 

	    </tbody>
	   </table>

	 </div>
	</div>

	  <div class="d-grid gap-2 d-md-flex justify-content-md-end">
	   <button class="btn btn-dark" type="button">등록</button>
	   <button class="btn btn-dark" type="button">삭제</button>
	 </div>

  </ul>
</nav>

	</div>

</div>
</div>

	
  </body>
</html>