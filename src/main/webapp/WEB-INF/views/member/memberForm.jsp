<!doctype html>
<html lang="kor">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.88.1">
    <title>회원 정보</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/headers/">

    

    <!-- Bootstrap core CSS -->
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">


    <style>
 
    .logo{
    
    font-family: 'Y_Spotlight';
    
    }

    .member{
    
     font-family: 'EliceDigitalBaeum-Bd';
     
     padding: 30px 0px 30px 0px;
     text-align: center;

    }
    
    .menu{
    
    font-family: 'Cafe24SsurroundAir';
    
    font-size:15px;
    }
    
    .bodybody{
    
    font-family: 'Cafe24SsurroundAir';
    font-size: 14px;
    
    }
    
    
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
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

    
    <!-- Custom styles for this template -->
    <link href="headers.css" rel="stylesheet">
  </head>
  <body class="bodybody">
    
    
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
    
      <h1 class="member">회원 정보</h1>
      
		<div="row mt-sm-4">
		
		<div class="col-sm-6 mt-3 mt-sm-0">
		 <label for="id">아이디</label>
		</div>
		<div class="input-group col-sm-6 mb-3">
		 <input type="text" class="form-control" placeholder="아이디는 영문 또는 숫자 조합으로 입력해 주세요." aria-label="id" aria-describedby="button-addon2">
		 <button class="btn btn-outline-dark" type="button" id="button-addon2">중복 확인</button>
     	 </div>
    	 

		<div class="col-sm-6 mt-3 mt-sm-0">
		 <label for="password">비밀번호</label>
		</div>
		<div class="input-group col-sm-6 mb-3">
		 <input type="password" class="form-control" id="password" placeholder="비밀번호는 문자, 숫자 혼용.">
		</div>

		<div class="col-sm-6 mt-3 mt-sm-0">
		 <label for="repassword">비밀번호 재입력</label>
		</div>
		<div class="col-sm-12">
		 <input type="password" class="form-control" id="repassword" placeholder="비밀번호를 다시 입력해 주세요.">
		</div>	

		<div class="col-sm-6 mt-3 mt-sm-0">
		 <label for="name">이름</label>
		</div>
		<div class="input-group col-sm-6 mb-3">
		 <input type="text" class="form-control" id="name" placeholder="">
		</div>
		
		<div class="col-sm-6 mt-3 mt-sm-0">
		 <label for="birth">생일</label>
		</div>
		<div class="input-group col-sm-6 mb-3">
		 <input type="date" class="form-control" id="birth" placeholder="">
		</div>
		
		<div class="col-sm-6 mt-3 mt-sm-0">
		 <label for="gender">성별</label>
		</div>
		<div class="input-group col-sm-6 mb-3">
		  <select class="form-select" aria-label="phone">
		  <option selected>성별 선택</option>
		  <option value="1">남성</option>
		  <option value="2">여성</option>
		  <option value="3">기타</option>
		  </select>	
		</div>
		

		<div class="col-sm-6 mt-3 mt-sm-0">
		 <label for="email">이메일</label>
		</div>
		<div class="input-group col-sm-6 mb-3">
		 <input type="text" class="form-control" id="email" placeholder="example@email.com">
		</div>
		
			
		<div class="col-sm-6 mt-3 mt-sm-0">
		 <label for="id">주소</label>
		</div>
		<div class="input-group col-sm-6 mb-3">
		 <input type="text" class="form-control" placeholder="우편번호" aria-label="zipcode" aria-describedby="button-addon2" readonly>
		 <button class="btn btn-outline-dark" type="button" id="button-addon2">주소 찾기</button>
     	 </div>	
		<div class="input-group col-sm-6 mb-3">
		 <input type="text" class="form-control" id="address" readonly>	 
		</div>
		<div class="input-group col-sm-6 mb-3">
		 <input type="text" class="form-control" id="addressdetail" placeholder="상세 주소 입력">	 
		</div>
		
		<div class="col-sm-6 mt-3 mt-sm-0">
		 <label for="phone">핸드폰 번호</label>
		</div>
		<div class="input-group col-sm-6 mb-3">
		  <select class="form-select" aria-label="phone">
		  <option selected>통신사</option>
		  <option value="1">LGU</option>
		  <option value="2">SKT</option>
		  <option value="3">KT</option>
		  <option value="4">알뜰폰</option>
		  </select>	
		  <input type="text" class="form-control" id="phone" placeholder="'-' 없이 입력">
		</div>
		
		<div class="col-sm-6 mt-3 mt-sm-0">
		 <label for="agree1">이메일 정보 사용 동의</label>
		</div>
		<div class="input-group col-sm-6 mb-3">
		 <input class="form-check-input" type="checkbox" value="" id="agree1">
		 <label class="form-check-label" for="agree1"> 동의합니다.
		</div>			
 
 		<div class="col-sm-6 mt-3 mt-sm-0">
		 <label for="agree2">핸드폰 정보 마케팅 사용 동의</label>
		</div>
		<div class="input-group col-sm-6 mb-3">
		 <input class="form-check-input" type="checkbox" value="" id="agree1">
		 <label class="form-check-label" for="agree1"> 동의합니다.
		</div>	
		    	 		
      
		<div class="d-grid gap-2 d-md-flex justify-content-md-end">
		  <button class="btn btn-dark me-md-2" type="button">확인</button>
		  <button class="btn btn-dark" type="button">취소</button>
		</div>
      
        </div>     
       </div>
       


    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    -->
      
  </body>
</html>
      
      
      