<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<html>
<body>
<%
    Date date = new Date();
%>
<h2>ハロー！ワールド！ <%=date.toString()%></h2>
<a href="./form.jsp">FORM</a>
</body>
</html>
