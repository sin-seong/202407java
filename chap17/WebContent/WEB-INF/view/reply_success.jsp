<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>답변글 작성</title></head>
<body>
답변글을 등록했습니다.
<br/>
<a href="list.do?p=${param.p}">목록보기</a>
<a href="read.do?articleId=${postedArticle.id}&p=${param.p}">게시글 읽기</a>
</body>
</html>
