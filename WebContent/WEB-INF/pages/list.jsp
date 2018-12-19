<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学员管理系统</title>

</head>
<body>
	<table border="1px" width="900px">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>生日</td>
			<td>电话</td>
			<td>Email</td>
			<td>班级</td>
		</tr>
		<c:forEach items="${pageResult.data}" var="list" varStatus="i">
			<tr>
				<td><a href="${rt }/stu/beformUpdate.action?id=${list.id }">${i.count}</a></td>
				<td>${list.sname}</td>
				<td>${list.gender}</td>
				<td><fmt:formatDate value="${list.birthday }" pattern="yyyy-MM-dd"/></td>
				<td>${list.telephone}</td>
				<td>${list.email}</td>
				<td>${list.classid.cname}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="${rt}/stu/page/1.action">首页</a>
	<a onclick=pagetop(${pageResult.pageNo})>上一页</a>
	<a onclick=pagenext(${pageResult.pageNo})>下一页</a>
	<a href="${rt}/stu/page/${pageResult.pageCount }.action">末页</a>
	<a >第${pageResult.pageNo }页/共${pageResult.pageCount }页</a>
</body>
<script type="text/javascript">
	function pagetop(pageNo){
		if(pageNo==1){
			alert('已经是第一页了');
		}else{
			var url ="";
			pageNo--;
			url ="${rt}/stu/page/"+pageNo+".action";
			location.href=url;
		}
	}
	
	
	
	function pagenext(pageNo){
		if(pageNo==${pageResult.pageCount}){
			alert('已经是最后一页了');
		}else{
			var url ="";
			pageNo++;
			url ="${rt}/stu/page/"+pageNo+".action";
			location.href=url;
		}
	}
</script>
</html>