<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> welcom to my profile </h1>

<%
int a = 10;
int b = 20;
int c = a+b;

HttpSession hs = request.getSession();
String ans = (String) hs.getAttribute("name_key") ;
out.println(ans);
%>

<%= c %>


</body>
</html>