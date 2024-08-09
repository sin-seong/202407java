<%@page import="board.BoardDAO2"%>
<%@page import="board.BoardDTO"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
BoardDAO2 dao = new BoardDAO2();
List<BoardDTO> list = dao.listBoard();
request.setAttribute("list", list);
%>
<jsp:forward page="list_view.jsp"/>