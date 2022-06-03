<%@ page import="javax.print.MultiDocPrintService" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022/5/19
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>简单水闸信息管理系统</title>
</head>
<script>
    function deleteGate(){
            return confirm("确定要删除吗");
    }
</script>
<script src="jquery-3.2.1.min.js" type="text/javascript" charset="UTF-8"></script>
<script type="text/javascript">
    window.onload = function (){
        $.ajax({
            type:"post",
            url:"/GetGatesServlet",
            async:true,
            dataType:"json",
            success:function (dataArray) {
                const jsonObj = typeof (dataArray) == "string" ? JSON.parse(dataArray) : dataArray;
                approach(jsonObj);
            }
        });
        function approach(dataArray){
            $.each(dataArray,function (main,item) {
                var tr;
                tr += "<td>" + item.name+ "</td>";
                tr += "<td>" + item.id+ "</td>";
                tr += "<td>" + item.buildTime+ "</td>";
                tr += "<td>" + item.master+ "</td>";
                tr += "<td><a href='modifyGate.jsp?id="+ item.id+"'>修改</a></td>";
                tr += "<td><a onclick='deleteGate()' href='DeleteServlet?id="+ item.id+"'>删除</a></td>";
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

<%String user = request.getParameter("name");%>

<div id="main_page" style="width:1080px;margin: 0 auto">
<img alt="" src="img/main.jpeg" height="400px" width="600px" >
<br>
    <label>欢迎回来，用户<%=user%>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</label><form method="post" action="LogoutServlet"><button id="main_logout" >退出登录</button></form>
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
        <a href = "modifyGate.jsp?id=1">修改水闸</a>
    </div>
    <form method="post" action="DeleteGateServlet?id=1">
    <button onclick='deleteGate()' >删除</button>
    </form>
</div>
</body>
</html>
