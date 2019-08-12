<%@ page import="org.springframework.validation.BeanPropertyBindingResult" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>validate</title>
</head>
<body>
<%-- 接口参数校验错误信息默认存放处，使用spring表单方式更简单 --%>
<%= ((BeanPropertyBindingResult) request.getAttribute("org.springframework.validation.BindingResult.student"))
        .getFieldError("id").getField()%>
<%= ((BeanPropertyBindingResult) request.getAttribute("org.springframework.validation.BindingResult.student"))
        .getFieldError("id").getDefaultMessage()%>
<form:form modelAttribute="student">
    <form:errors path="id"/>
</form:form>

</body>
</html>
