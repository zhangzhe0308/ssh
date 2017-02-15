<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<head><title>Access Object using OGNL</title></head>
<body>
User.username: <s:property value="user.username"/><br>
Parameters.msg: <s:property value="#parameters.msg"/><br>
Parameters.msg: <s:property value="#parameters['msg']"/><br>
<% request.setAttribute("msg", "Request message");%>
Request.msg: <s:property value="#request.msg"/><br>
Session.msg: <s:property value="#session.msg"/><br>
Application.msg: <s:property value="#application.msg"/><br>
Attr.msg: <s:property value="#attr.msg"/>
</body>