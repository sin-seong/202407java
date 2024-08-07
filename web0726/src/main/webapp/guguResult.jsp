<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
int dan1 = Integer.parseInt(request.getParameter("dan"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%=dan1 %>단</title>
</head>
<body>
<table border="1">
<%
for(int i = 1; i <= 9; i++){
%>
	<tr><td><%=dan1 %>X<%=i %>=<%=i*dan1%></td></tr>	

<%
}

%>
</table>


</body>
</html>