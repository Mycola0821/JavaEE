<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022/5/19
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  %>
<html>
<head>
    <title>修改水闸信息</title>
</head>
<body>
<script>

</script>
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
    .modifyGateInput{
        width: 200px;
        height: 40px;
        margin-top: 1%;
    }
</style>
<%
    String id = request.getParameter("id");
%>

<div id="main_div">
    <label id="main_title">修改水闸信息</label>
    <form method="post" action="ModifyGateServlet" id="main_form">
        <span style="font-size: 25px"  hidden="hidden" >&emsp;&emsp;编号：<%=id%></span>
        <br>
        <label style="font-size: 25px">&emsp;水闸名：<input type="text" name="name" class="modifyGateInput" required autofocus></label>
        <br>
        <label style="font-size: 25px">建成时间：<input type="text" name="buildTime" class="modifyGateInput" ></label>
        <br>
        <label style="font-size: 25px">&emsp;负责人：<input type="text" name="master" class="modifyGateInput"></label>
        <br>
        <label style="font-size: 25px">&emsp;&emsp;经度：<input type="text" name="longitude" class="modifyGateInput"></label>
        <br>
        <label style="font-size: 25px">&emsp;&emsp;纬度：<input type="text" name="latitude" class="modifyGateInput"></label>
        <br>
        <label style="font-size: 25px">&emsp;&emsp;简介：<textarea name="introduction" class="modifyGateInput" style="height: 80px"></textarea></label>
        <br>
        <a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</a>
        <button type="submit" id="btn_login" >修改</button>
        <a href="${pageContext.request.contextPath}/main.jsp">取消</a>
    </form>
</div>
</body>
</html>
