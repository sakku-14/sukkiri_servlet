<%@ page import="model.SiteEV" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
SiteEV sev = (SiteEV) application.getAttribute("sev");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Minato Page</title>
</head>
<body>
<h1>湊くんのページへようこそ</h1>
<a href="/Minato/MinatoIndex?action=like">よいね</a>: <%= sev.getLike() %> 
<a href="/Minato/MinatoIndex?action=dislike">よくないね</a>: <%= sev.getDisLike() %>
<h2>湊くんとは！？</h2>
。。。
</body>
</html>