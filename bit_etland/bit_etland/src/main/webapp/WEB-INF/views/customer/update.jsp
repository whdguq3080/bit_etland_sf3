<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" 
	href="${css}/customer/list.css" />
<div class="grid-item" id="nav">
</div>
<div class="grid-item" id= "side_bar">
<div class= "myphoto">
<div class= "myphotoin"><img src="${img}/default_image.png" ></div>
</div>
</div>
 <form id="form" >
<div class="grid-item" id="content">
검색한 사람의 정보 <br />
아이디: <input type="text" name="customerID" value="${cust.customerID}" readonly /> <br /> 
이 름 :<input type="text" name="customerName" value="${cust.customerName}" readonly /> <br />
생년월일 :<input type="text" name="ssn" value="${cust.ssn}" readonly /> <br />
성별 : 남 <br /> 
전화번호 : <input type="text" name="phone" value="${cust.phone}"  /> <br />
주소 : 	<input type="text" name="city" value="${cust.city}" /> <br />
상세주소 : <input type="text" name="postalCode" value="${cust.postalCode}" /> <br />
우편번호 : <input type="text" name="address"  value="${cust.address}"  /> <br />
임시 비밀번호 :<input type="text" name="password" value="임시 비밀번호" />
		
</div>
</form>
<div class="btn-group" role="group">
    <span id="confirm_btn" class="label label-warning">수정 </span>
     <span id="cancel_btn" class="label label-success">취소 </span>
</div>
</html>
<script>
$('#confirm_btn').attr('style','cursor:pointer').click(function(){
	$('#form')
	.attr('action','${ctx}/customer/update')
	.attr('method','post')
	.submit();
});
$('#cancel_btn').click(function(){
		alert('취소 버튼 클릭');
});
</script>