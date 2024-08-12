<%@page import="shop.CartDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
CartDAO dao = new CartDAO();
request.setAttribute("list1",dao.viewCart());
%>    
<jsp:forward page="viewCart.jsp"/>
