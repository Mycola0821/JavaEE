<%@ page import="javax.print.MultiDocPrintService" %><%--
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
<%
    request.setCharacterEncoding("UTF-8");
    String user = request.getParameter("name");
    String pass = request.getParameter("pwd");
    if (("臭高羽".equals(user)) && ("123456".equals(pass))){
    }
    else {
        response.sendRedirect("login.jsp");
    }
%>
<div id="main_page" style="width:1080px;margin: 0 auto">
<img alt="" src="img/main.jpeg" height="400px" width="600px" >
<br>
    <label>欢迎回来，用户<% out.print(user);%></label>
    <div id="main_list">

    </div>
</div>
</body>
</html>
