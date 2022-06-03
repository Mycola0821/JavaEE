package com.Servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.jdbcTest;

import java.io.IOException;

@WebServlet(name = "DeleteGateServlet" ,value="/DeleteGateServlet")
public class DeleteGateServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException {
        String id = request.getParameter("id");
        jdbcTest test = new jdbcTest();
        test.deleteSluice(id);
        response.sendRedirect("main.jsp");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String name = request.getParameter("name");
        String buildTime = request.getParameter("buildTime");
        String master = request.getParameter("master");
        String longitude = request.getParameter("longitude");
        String latitude= request.getParameter("latitude");
        String introduction= request.getParameter("introduction");
        //数据库添加水闸信息
        jdbcTest jdbctest = new jdbcTest();
        jdbctest.addSluice(id,name,buildTime,master,longitude,latitude,introduction);
        response.sendRedirect("main.jsp");
    }
}
