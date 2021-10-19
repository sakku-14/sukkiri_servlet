<%@ page import="model.Health" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Health h = (Health) request.getAttribute("health");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Health Check App</title>
</head>
<body>
<h1>スッキリ健康診断の結果</h1>
身長:<%= h.getHeight() %><br>
体重:<%= h.getWeight() %><br>
BMI:<%= h.getBmi() %><br>
体型:<%= h.getBodyStyle() %><br>

<a href="/health/HealthCheck">戻る</a>

</body>
</html>