<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head> 
  </head>
  <body>
  <s:form action="add.jsp"  method="post">
   <table>
    <tr>
      <td colspan="2">
            <h3>企业工单管理系统</h3>
      </td>
       </tr>
    <tr>
        <td> 选择项目</td>
         <td>
       <s:select name="projectId" list="plist" listKey="id" listValue="projectName">
       </s:select>
       <s:submit value="确定" />
         </td>
    </tr>
   </table>
      </s:form>
  </body>
</html>