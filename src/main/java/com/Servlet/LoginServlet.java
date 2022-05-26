package com.Servlet;


import com.Entity.User;

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");

        ServletContext application = getServletConfig().getServletContext();
        ArrayList<User> users = (ArrayList) application.getAttribute("users");

        PrintWriter out = response.getWriter();

        String username = request.getParameter("name");
        String password = request.getParameter("pwd");


        out.println("<html><body>");
        if (null == username || username.length() == 0) {
            out.println("用户名不能为空");
        }
        else if (null == password || password.length() == 0) {
            out.println("密码不能为空");
        }
        else if (username.length() > 0 && password.length() > 0) {
            int flag = 0;
            for(User user : users){
                if(username.equals(user.getUsername()) && password.equals(user.getPassword())){
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
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
