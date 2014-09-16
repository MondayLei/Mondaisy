<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Register Page</title>
</head>
<body>

	<s:form action="register">
		<s:textfield name="user.username" label="UserName"></s:textfield>
		<s:password name="user.password" label="Password"></s:password>
		<s:password name="user.confirm" label="Confirm"></s:password>
		<s:submit value="Join Now"></s:submit>
	</s:form>

</body>
</html>
