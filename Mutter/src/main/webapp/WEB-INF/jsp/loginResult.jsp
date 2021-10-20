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
<title>どこつぶ</title>
</head>
<body>
<h1>どこつぶログイン</h1>
<% if(user != null) { %>
	ログインに成功しました<br>
	ようこそ<%= user.getName() %>さん<br>
	<a href="/Mutter/Main">つぶやきの投稿・閲覧へ</a>
<% } else { %>
	ログインに失敗しました<br>
	<a href="/Mutter">トップへ</a>
<% } %>
</body>
</html>