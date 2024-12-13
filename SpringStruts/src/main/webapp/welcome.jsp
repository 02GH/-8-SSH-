<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: noza
  Date: 2023/12/10
  Time: 23:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
插入已成功

请输入查询id
<form name="loadform" action="test/select">
    <input type="text" name="id">
    <input type="submit" value="提交">
</form>
<table>
    <tr>
        <p>cid cname</p>
    </tr>
    <tr>
        <%
            if(session.getAttribute("count")!=null){
                int count=(int)session.getAttribute("count");
                for(int i=0;i<count;i++){
                    %><p><%=session.getAttribute("cid"+i)%>    <%=session.getAttribute("cname"+i)%></p><%
                }
            }

        %>
    </tr>

</table>
</body>
</html>
