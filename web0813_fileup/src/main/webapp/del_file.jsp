<%@page import="web.FileWeb"%>
<%@page import="web.WebhardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.File" %>
    
<% 
	
    int num = Integer.parseInt(request.getParameter("num"));
	WebhardDAO dao = new WebhardDAO();
	FileWeb fileWeb = dao.getWebhardById(num);
	if(fileWeb != null){
		        // 지정된 파일 삭제
            File file = new File(application.getRealPath("/files/") +
                                 fileWeb.getFname());
            if (file != null) {
                file.delete();
            }
            dao.deleteWebhard(num);
            
	}
            
    
    response.sendRedirect("webhard.jsp");
%>