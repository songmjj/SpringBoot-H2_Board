<%@page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>��ȣ ����</title>
</head>
<body>
	<center>
		<h1>��ȣ ����</h1>
		<form action="changePassword.do" method="post">
			
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange">���̵�</td>
					<td><input type="text" value="${user.id}" name="id" readonly="readonly"> </td>
				</tr>
				<tr>
					<td bgcolor="orange">�� ��й�ȣ</td>
					<td><input type="password" name="Password"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit" value="��ȣ ����" /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="getBoardList.do">�� ��� ����</a>
	</center>
</body>
</html>