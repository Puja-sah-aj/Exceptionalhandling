<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>welcome to my profile</h3>


<%
session.setAttribute("Session_name","Welcome to my profile");
%>

<form action = "Output.jsp" method="get">
<input type = "text" name="name1  placeholder="Enter name"/>
<input type = "submit" value ="click me"/>


//decleration tag

<%!
int a = 10;
String name ="amiti";

int square(){
	return a*a;
}

%>

//scriptlet tag
<%
out.println(name);
out.println("a : + a");
out.println(square());

int b = 20;
if(b>100){
	out.println("b is smaaler than 100");
}
else{
	out.println("b is grater than 100");
}
for(int i =1;i<=5;i++){
	out.println(i);
}


%>
<%= a %>
<%= name %>
<%= square()  %>



</body>
</html>