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
<script src="jquery-3.2.1.min.js" type="text/javascript" charset="UTF-8"></script>
<script type="text/javascript">
    window.onload = function (){
        $.ajax({
            type:"post",
            url:"http://localhost:8080/Project_war_exploded/com/Servlet/GetGatesServlet",
            async:true,
            dataType:"json",
            success:function (dataArray) {
                const jsonObj = typeof (dataArray) == "string" ? JSON.parse(dataArray) : dataArray;
                approach(jsonObj);
            }
        });
        function approach(dataArray){
            $.each(dataArray,function (index,item) {
                let tr;
                tr += "<td>" + item.name+ "</td>";
                tr += "<td>" + item.id+ "</td>";
                tr += "<td>" + item.+ "</td>";
                tr += "<td>" + item.+ "</td>";
                tr += "<td><a href='modifyGate.jsp?id="+ item.id+"'>修改</a></td>";
                tr += "<td><a href='DeleteServlet?id="+ item.id+"'>删除</a></td>";
                $("#arraylist").append("<tr>"+tr+"</tr>");
            })
        }
    }
</script>
<style>
    table{
        background: aqua;
    }
</style>
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
<%//暂时用于实现登录功能//%>

<div id="main_page" style="width:1080px;margin: 0 auto">
<img alt="" src="img/main.jpeg" height="400px" width="600px" >
<br>
    <label>欢迎回来，用户<%=user%>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
    </label><a id="main_logout" href="LogoutServlet">退出登录</a>
    <div id="main_list">
        <table id="arraylist" >
            <tr>
                <th >水闸名</th>
                <th>ID</th>
                <th >建成时间</th>
                <th >负责人</th>
                <th> 操作</th>
            </tr>
        </table>
        <a href = "addGate.jsp">新建水闸</a>
    </div>
</div>
</body>
</html>
