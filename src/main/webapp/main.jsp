<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022/5/19
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>简单水闸信息管理系统</title>
</head>
<body>
<img src="mainimg.img">
<br>
<label>欢迎回来，用户</label>
<jsp:scriptlet>
    out.println("欢迎回来，用户"+request.getParameter("username.session"));
</jsp:scriptlet>
</body>
</html>
