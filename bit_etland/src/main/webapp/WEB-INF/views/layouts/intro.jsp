<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!--

	@작성자: 이종협   01099473080@naver.com
	@날짜: 2019. 3. 12. 오전 9:53:30
	@파일 이름: intro.jsp
	@기능: 인트로 템플릿 페이지. 로그인, 회원가입 화면
	-->
<!-- <!DOCTYPE HTML>
<html lang="en">
<head>
<meta charset="UTF-8">
	<title>Maxim - Modern One Page Bootstrap Template</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="">
	<link href="css/bootstrap-responsive.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
	<link href="color/default.css" rel="stylesheet">
	<link rel="shortcut icon" href="img/favicon.ico">
	=======================================================
    Theme Name: Maxim
    Theme URL: https://bootstrapmade.com/maxim-free-onepage-bootstrap-theme/
    Author: BootstrapMade.com
    Author URL: https://bootstrapmade.com
	=======================================================
</head> -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
 <link rel="stylesheet" href="${css}/style.css "/> 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> 
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<a href="#" class="scrollup"><i class="icon-angle-up icon-square icon-bgdark icon-2x"></i></a>
	<script src="js/jquery.js"></script>
	<script src="js/jquery.scrollTo.js"></script>
	<script src="js/jquery.nav.js"></script>
	<script src="js/jquery.localScroll.js"></script>
	<script src="js/bootstrap.js"></script>
	<script src="js/jquery.prettyPhoto.js"></script>
	<script src="js/isotope.js"></script>
	<script src="js/jquery.flexslider.js"></script>
	<script src="js/inview.js"></script>
	<script src="js/animate.js"></script>
	<script src="js/custom.js"></script>
	<script src="contactform/contactform.js"></script>

</head>
<body>
	<div id="wrapper" class="grid-container container-fluid">
		<div class="grid-item" id="header">
			<tiles:insertAttribute name="top" />
		</div>
			<tiles:insertAttribute name="nav" />
	
			<tiles:insertAttribute name="content" />
		<div class="grid-item" id="footer">
			<tiles:insertAttribute name="bottom" />
		</div>
	</div>	
</body>
</html>