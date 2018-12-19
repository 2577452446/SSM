<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改</title>
</head>
<body>
	<fm:form action="${rt }/stu/update.action" modelAttribute="stu" method="post">
		姓名<fm:input path="sname"/><br/>
		性别<fm:radiobutton path="gender" value="男"/>男
			<fm:radiobutton path="gender" value="女"/>女<br/>
		生日<fm:input path="birthday"/><br/>
		电话<fm:input path="telephone"/><br/>
		Email<fm:input path="email"/><br/>
		年级<fm:select path="classid.id" items="${list}" itemLabel="cname" itemValue="id" /><br/>
		<fm:hidden path="id"/>
		<input type="submit" value="修改">
		
	</fm:form>
</body>
</html>