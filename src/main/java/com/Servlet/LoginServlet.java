package com.Servlet;


import com.Entity.User;
import com.jdbc.service.user.UserService;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        // 获取登录用户名
        String username = request.getParameter("name");
        String password = request.getParameter("pwd");

        //数据库导出用户信息
        UserService service = new UserService();
        User userDB = service.selectUser(username);
        String passwordDB = userDB.getPassword();

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        if (null == username || username.length() == 0) {
            out.println("用户名不能为空");
        }
        else if (null == password || password.length() == 0) {
            out.println("密码不能为空");
        }
        else  {
            if ( password.equals(passwordDB)) {
                request.getSession().setAttribute("name", username);
                response.sendRedirect("main.jsp");
            }
            else {
                out.println("用户名或密码错误");
            }

        }
        out.println("</body></html>");
    }

}
