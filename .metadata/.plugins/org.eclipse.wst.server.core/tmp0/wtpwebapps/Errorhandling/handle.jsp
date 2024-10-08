
<%@ page errorPage = "Error.jsp" %>
<% 
String num1 = request.getParameter("num1");
String num2 = request.getParameter("num2");

int x = Integer.parseInt(num1);
int y = Integer.parseInt(num2);
int z = x/y;
out.println("Divide of two number is:" +z);

%>