<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022/5/19
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>简单水闸信息管理系统</title>
</head>
<body>
<label>简单水闸信息管理系统</label>
<form method="post" action="main.jsp">
<label>用户名<input type="text" name="name" id="user" placeholder="请输入用户名" required autofocus></label>
<br>
<label>密码<input type="password" name="psd" id="psd" placeholder="请输入密码"></label>
<br>
<button type="submit" id="btn_login" >登录</button>
</form>
</body>
</html>
