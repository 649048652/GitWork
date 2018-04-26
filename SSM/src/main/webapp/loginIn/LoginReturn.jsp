<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>重定向页面</h2>
	<p>点击下面按钮重定向</p>
	<f:form method="GET" action="redirect2">
		<input type="submit" value="页面重定向" />
	</f:form>
	<f:form method="post" action="demo3">
		<f:label path="name">学生姓名：</f:label>
		<f:input path="name" /><br/>
		
		<f:label path="money">学生金钱</f:label>
		<f:input path="money"/><br/>
		
		<f:hidden path="id" value="123"/>
		
		<input type="submit" value="提交">
	</f:form>
</body>
</html>