<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시물 등록</title>
</head>
<body>
<h1>
	게시물 등록   
</h1>
<form name="form1" method="post" action="board/register">
	<div>
		제목<input name="title" id="title" size="80" placeholder="제목을 입력해주세요">
	</div>
	<div>
		내용<input name="title" id="title" size="80" placeholder="내용을 입력해주세요">
	</div>
	<div>
		이름
		<input name="writer" id="writer" placeholder="이름을 입력해주세요">
	</div>
	<div style="width:650px"; text-align: center;">
		<button type="button" id="btnSave">확인</button>
		<button type="reset">취소</button>
	</div>


</form>
</body>
</html>
