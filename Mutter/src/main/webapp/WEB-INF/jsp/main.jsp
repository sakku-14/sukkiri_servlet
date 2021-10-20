<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.User" %>
<%@page import="model.Mutter" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
User user = (User) session.getAttribute("user");
List<Mutter> mutterList = (List<Mutter>) application.getAttribute("mutterList");
String errorMsg = (String) request.getAttribute("errorMsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>どこつぶ</title>
</head>
<body>
<h1>どこつぶメイン</h1>
<%= user.getName() %>さん、ログイン中 <a href="/Mutter/Logout">ログアウト</a><br>
<a href="/Mutter/Main">更新</a>
<form action="/Mutter/Main" method="post">
<input type="text" name="murmur"><input type="submit" value="つぶやく"><br>
<% if (errorMsg != null) { %>
<p style="color:red;'"><%= errorMsg.toString() %></p>
<% } %>
<!-- ここに呟き一覧 -->
<% for(Mutter mutter : mutterList) { %>
	<%= mutter.getName() %>:<%= mutter.getMurmur() %><br>
<% } %>

</form>
</body>
</html>