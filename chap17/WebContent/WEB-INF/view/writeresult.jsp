<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head><title>게시글 작성</title></head>
<body>
게시글을 등록했습니다.
<br/>
<a href="<c:url value='/list.do'/>">목록보기</a>
<a href="<c:url value='/read.do?articleId=${postedArticle.id}'/>">게시글 읽기</a>
</body>
</html>