<%@page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>ȸ������</title>
</head>
<body>
	<center>
		<h1>ȸ������</h1>
		<hr>
		<form action="createUser.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">���̵�</td>
					<td align="left"><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">��й�ȣ</td>
					<td align="left"><input type="password" name="password"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">�̸�</td>
					<td align="left"><input type="text" name="name"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">���</td>
					<td align="left"><select name="role">
						<option value="Admin">Admin</option>
						<option value="User">User</option>					
					</select></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="�����ϱ� " /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="index.jsp">���� ȭ������</a>
	</center>
</body>
</html>