<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<head>
<title>Test Validator</title>
</head>
<body>
<s:form action="/s2/validate" method="post">
<s:textfield name="admin.username" key="username"/>
<s:submit key="submit"/>
</s:form>
</body>
