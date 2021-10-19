<%@ page import="model.User" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
User user = (User) session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
下記のユーザーを登録します<br>
<br>
ログインID: <%= user.getId() %><br>
名前: <%= user.getName() %><br>
<br>
<a href="/registration/RegisterUser">戻る</a>
<a href="/registration/RegisterUser?action=done">登録</a>
</body>
</html>