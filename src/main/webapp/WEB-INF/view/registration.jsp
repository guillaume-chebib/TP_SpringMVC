<%--
  Created by IntelliJ IDEA.
  User: guillaume.chebib
  Date: 12/10/2021
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Signing up a user</title>
</head>
<body>
<h2>Signing up a user</h2>
<form:form modelAttribute="registration">
    <div>
        <form:label path="name"><spring:message code="name"/></form:label>
        <form:input path="name" />
    </div>
    <div>
        <form:label path="email"><spring:message code="email"/></form:label>
        <form:input path="email"/>
    </div>
    <input type="submit" value="Submit" />
    <form:errors path="*" cssClass ="errorblock" element="div"/>
</form:form>

</body>
</html>
