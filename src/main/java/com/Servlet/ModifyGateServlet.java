package com.Servlet;

import com.jdbc.jdbcTest;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "ModifyGateServlet",value = "/ModifyGateServlet")
public class ModifyGateServlet extends HttpServlet {
    public void doPost (HttpServletRequest request, HttpServletResponse response)throws IOException {
        jdbcTest modify = new jdbcTest();
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String buildTime = request.getParameter("buildTime");
        String master = request.getParameter("master");
        String longitude = request.getParameter("longitude");
        String latitude= request.getParameter("latitude");
        String introduction= request.getParameter("introduction");
        modify.modifySluice(id,name,buildTime,master,longitude,latitude,introduction);
        response.sendRedirect("main.jsp");
    }
}
