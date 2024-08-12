<%@page import="shop.CartDAO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String id = request.getParameter("id");
CartDAO cartDAO = new CartDAO();
cartDAO.deleteCart(Integer.parseInt(id));


%>    
<jsp:forward page="products.jsp"/>
