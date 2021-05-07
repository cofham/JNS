<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC"-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Index Page</title>
</head>
<center>
	<h2>입력 화면</h2>
	<form action="<c:url value="/formtest.do"/>" method="get">
		<div>텍스트를 입력해주세요:</div>
		<div>
			<input type="text" name="user_text">
		</div>
		<div>
			<input type="submit" value="전송">
		</div>
	</form>
</center>