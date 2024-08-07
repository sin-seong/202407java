<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");
    int count = Integer.parseInt(request.getParameter("count"));
	   
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%


for(int i = 0; i < count; i++){
	out.println(name+"<br>");
}

%>


</body>
</html>