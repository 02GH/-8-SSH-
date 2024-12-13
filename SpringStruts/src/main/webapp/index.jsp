<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
请填入要新增的用户信息2
<form method="post" action="test/Login">
<%--  姓名：  <input type="text" name="Student.name"><br>--%>
<%--  性别：  <input type="text" name="Student.sex"><br>--%>
<%--  年龄：  <input type="text" name="Student.age"><br>--%>
<%--  成绩：  <input type="text" name="Student.score"><br>  --%>
  姓名：  <input type="text" name="name"><br>
  性别：  <input type="text" name="sex"><br>
  年龄：  <input type="text" name="age"><br>
  成绩：  <input type="text" name="score"><br>
  <input type="submit" value="提交">
</form>
</body>
</html>