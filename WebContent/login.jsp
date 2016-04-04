<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<div align="center">
		<h1>ログイン</h1>
		<hr>
		<s:form action="login">
			<s:textfield name="username" value="" size="24" label="ID" />
			<s:password name="password" value="" size="24" label="PASSWORD" />
			<s:submit value="ログイン" />
		</s:form>
	</div>
</body>
</html>