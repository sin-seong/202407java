
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
   
	Cookie[] cookies = request.getCookies();
	String username	= null;
	boolean flag = false;
	

if (cookies != null) {
	for (Cookie cookie : cookies) {
		if (cookie.getName().equals("username")) {
			username = cookie.getValue();
			flag = true;
			break;
		}
	}
}
if(flag) {    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
<style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        header {
            background-color: #333;
            color: #fff;
            padding: 10px 0;
            text-align: center;
        }
        nav {
            background-color: #444;
            color: #fff;
            padding: 10px;
            text-align: center;
        }
        nav a {
            color: #fff;
            margin: 0 10px;
            text-decoration: none;
        }
        .content {
            padding: 20px;
            text-align: center;
        }
        .content img {
            max-width: 100%;
            height: auto;
        }
         table { width:680px; text-align:center; }
        th    { width:100px; background-color:cyan; }
        td    { text-align:left; border:1px solid gray; }
    </style>
</head>
<body>
    <header>
        <h1>Welcome to My JSP Homepage</h1>
    </header>
    <nav>
        <a href="home.jsp">Home</a>
        <a href="#">About</a>
        <%
        if (username != null){
        %>
       <a><%=username %></a>
       <a href="logout.jsp">logout</a> 
        <%
        }else{
        %>
        <a href="login.jsp">login</a>
        <%
        }
        %>
        
    </nav>
</head>
<body>

<table>
    <tr>
        <th>제목</th>
        <td>asd</td>
    </tr>
    <tr>
        <th>작성자</th>
        <td>asd</td>
    </tr>
    <tr>
        <th>작성일시</th>
        <td>asd</td>
    </tr>
    <tr>
        <th>조회수</th>
        <td>asd</td>
    </tr>
    <tr>
        <th>내용</th>
        <td>dla1></td>
    </tr>
    
   
</table>
</body>
</html>
<%
}else{
	out.println("<script type='text/javascript'>");
    out.println("alert('로그인 하세요');");
    out.println("window.location.href = 'login.jsp';");
    out.println("</script>");
}
%>