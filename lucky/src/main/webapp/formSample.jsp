<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/lucky/FormSampleServlet" method="post">
<p>名前:</p>
<input type="text" name="name">
<p>性別:</p>
男<input type="radio" name="sex" value="0">
女<input type="radio" name="sex" value="1">
<input type="submit" value="登録">
 
</form>
</body>
</html>