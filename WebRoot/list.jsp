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
       <table border="1" align="center">
         <tr align="center">
             <td colspan="7">
       <h1 align="center">企业工单列表</h1>
       	</td>
		</tr>
         <tr class="title" >
                <td>工单编号</td>
                <td>项目名称</td>
                <td>执行人</td>
                <td>任务描述</td>
                <td>级别</td>
                <td>创建时间</td>
                <td>操作</td>
          
         </tr>
     <s:iterator var="w" value="list" status="status">
       <tr>
         <td> <s:property value="#w.id"/> </td>
         <td> <s:property value="#w.project.projectName"/> </td>
         <td> <s:property value="#w.executor"/> </td>
         <td><s:property value="#w.description"/></td>
         <td> <s:property value="#w.orderLeve"/></td>
         <td><s:date name="#w.createDate" format="yyyy-MM--dd"/></td>
         <td>
         <a href="editwork?id=<s:property value="#w.id"/>">修改</a>
         <a href="delwork?id=<s:property value="#w.id"/>"onclick="return confirm('确定要删除吗？')">删除</a>
         </td>
       </tr>     
     </s:iterator>
      <tr>
         <td align="center" colspan="7">
             <s:actionmessage/>
         </td>
      </tr>
       </table>
</body>
</html>