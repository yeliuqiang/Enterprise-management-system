<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="updatework" method="post">
	<table border="1" align="center">
		<tr align="center">
			<td colspan="2">
				<h3>添加工单</h3>
			</td>
		</tr>
		<tr>
			<td>执行人(*)</td>
			<td>
				<s:textfield name="w.executor"></s:textfield>
			</td>
		</tr>
		<tr>
			<td>任务描述(*)</td>
			<td>
				<s:textarea name="w.description"></s:textarea>
			</td>
		</tr>
		<tr>
			<td>级别</td>
			<td>
				<s:select name="w.orderLeve" list="#{'1':'1','2':'2','3':'3'}"></s:select>
			</td>
		</tr>
		<tr>
			<td>项目</td>
			<td>
				<s:select name="w.project.id" list="plist" 
					listKey="id" listValue="projectName"></s:select>
			</td>
		</tr>
		<tr align="center">
				<td colspan="2">
					<s:hidden name="w.id"/>
					<s:submit value="提交"/>
					<s:reset value="重置"/>
				</td>
			</tr>
	</table>
	</form>
</body>
</html>