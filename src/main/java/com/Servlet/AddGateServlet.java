package com.Servlet;

import com.Entity.Sluice;
import com.Entity.User;
import com.jdbc.service.sluice.SluiceService;
import com.jdbc.service.user.UserService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import com.jdbc.jdbcTest;

@WebServlet(name = "AddGateServlet",value = "/AddGateServlet")
public class AddGateServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException {
        //调用文本框信息
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String buildTime = request.getParameter("buildTime");
        String master = request.getParameter("master");
        String longitude = request.getParameter("longitude");
        String latitude= request.getParameter("latitude");
        String introduction= request.getParameter("introduction");
        //数据库添加水闸信息
        /*SluiceService service = new SluiceService();
        Sluice adds = new Sluice();
        adds.setId(id);
        adds.setBuildTime(buildTime);
        adds.setMaster(master);
        adds.setLongitude(longitude);
        adds.setName(name);
        adds.setLatitude(latitude);
        adds.setIntroduction(introduction);
        */
        jdbcTest jdbctest = new jdbcTest();
        jdbctest.addSluice(id,name,buildTime,master,longitude,latitude,introduction);
        response.sendRedirect("main.jsp");
    }

}


