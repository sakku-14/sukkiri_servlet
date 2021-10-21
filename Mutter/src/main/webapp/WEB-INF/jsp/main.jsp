

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%
User user = (User) session.getAttribute("user");
List<Mutter> mutterList = (List<Mutter>) application.getAttribute("mutterList");
String errorMsg = (String) request.getAttribute("errorMsg");
%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>どこつぶ</title>
</head>
<body>
<h1>どこつぶメイン</h1>
<c:out value="${user.name}" /> さん、ログイン中 <a href="/Mutter/Logout">ログアウト</a><br>
<%-- <%= user.getName() %>さん、ログイン中 <a href="/Mutter/Logout">ログアウト</a><br> --%>
<a href="/Mutter/Main">更新</a>
<form action="/Mutter/Main" method="post">
<input type="text" name="murmur"><input type="submit" value="つぶやく"><br>
</form>
<c:if test="${not empty errorMsg}" >
	<p>${errorMsg}</p>
</c:if>
<c:forEach var="mutter" items="${mutterList}">
	<p><c:out value="${mutter.name}"></c:out>:
		<c:out value="${mutter.murmur}"></c:out></p>
</c:forEach>
<%-- 
<% if (errorMsg != null) { %>
<p style="color:red;'"><%= errorMsg.toString() %></p>
<% } %>
<% for(Mutter mutter : mutterList) { %>
	<%= mutter.getName() %>:<%= mutter.getMurmur() %><br>
<% } %>
 --%>
</body>
</html>