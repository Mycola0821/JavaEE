<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022/5/19
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>简单水闸信息管理系统</title>
</head>

<body>
<style>
    #main_div{
        width: auto;
        height: auto;
        margin-top: 5%;
        Text-align:center;
        font-family: "Adobe 宋体 Std L", serif;
    }
    #main_title{
        font-size: 30px;
    }
    #main_form{
        margin-top: 2%;
    }
    #main_user{
        width: 200px;
        height: 40px;
        margin-top: 1%;
    }
    #main_pwd{
        width: 200px;
        height: 40px;
        margin-top: 1%;
    }
    #btn_login{
        margin-top: 1%;
        height: 60px;
        width: 100px;
    }
</style>
<div id="main_div">
    <label id="main_title">简单水闸信息管理系统</label>
    <%// 暂用main.jsp直接跳转测试，后续改为LoginServlet//%>
    <form method="post" action="LoginServlet" id="main_form">
        <label style="font-size: 25px">用户名：<input type="text" name="name" id="main_user" placeholder="请输入用户名" required autofocus></label>
        <br>
        <label style="font-size: 25px">密&emsp;码：<input type="password" name="pwd" id="main_pwd" placeholder="请输入密码"></label>
        <br>
        <button type="submit" id="btn_login" >登录</button>
    </form>
</div>
</body>
</html>
