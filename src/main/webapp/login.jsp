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
<form method="get" action="login.jsp">
<label>用户名</label>
<input type="text" name="user" id="user" placeholder="请输入用户名" required autofocus>
<br>
<label>密码</label>
<input type="password" name="psd" id="psd" placeholder="请输入密码">
<br>
<button type="submit" id="btn_login" >登录</button>
    <jsp:setProperty name="username" property="session" value="user"/>
    <jsp:setProperty name="password" property="session" value="psd"/>
    <a href="main.jsp">test</a>
</form>
</body>
</html>
