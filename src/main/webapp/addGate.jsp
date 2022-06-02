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
    <title>新建水闸</title>
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
    #btn_login{
        margin-top: 1%;
        height: 60px;
        width: 100px;
    }
    .addGateInput{
        width: 200px;
        height: 40px;
        margin-top: 1%;
    }
</style>
<div id="main_div">
    <label id="main_title">增加水闸</label>
    <form method="post" action="/AddGateServlet" id="main_form">
        <label style="font-size: 25px">&emsp;&emsp;编号：<input type="text" name="id" class="addGateInput"  required autofocus></label>
        <br>
        <label style="font-size: 25px">&emsp;水闸名：<input type="text" name="name" class="addGateInput" ></label>
        <br>
        <label style="font-size: 25px">建成时间：<input type="text" name="buildTime" class="addGateInput" ></label>
        <br>
        <label style="font-size: 25px">&emsp;负责人：<input type="text" name="master" class="addGateInput"></label>
        <br>
        <label style="font-size: 25px">&emsp;&emsp;经度：<input type="text" name="longitude" class="addGateInput"></label>
        <br>
        <label style="font-size: 25px">&emsp;&emsp;纬度：<input type="text" name="latitude" class="addGateInput"></label>
        <br>
        <label style="font-size: 25px">&emsp;&emsp;简介：<input type="text" name="introduction" class="addGateInput" style="height: 100px"></label>
        <br>
        <a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</a>
        <button type="submit" id="btn_login" >增加</button>
        <a href="${pageContext.request.contextPath}/main.jsp">返回主界面</a>
    </form>
</div>
</body>
</html>
