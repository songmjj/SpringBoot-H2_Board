<%@page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Main Page</title>
</head>
<body>
	<center>
		<h1>게시판 프로그램</h1>
		${user.id}
		<a href="login.jsp">로그인</a>
		<a href="createUser.jsp">회원가입</a>
		<a href="getBoardList.do">글 목록 가기</a>
	</center>
</body>
</html>