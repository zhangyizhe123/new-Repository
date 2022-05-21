package com.project.xuanshang;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servelt extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response )throws ServletException, IOException {
       String message= request.getParameter("message");
        response.getWriter().print(message);
    }
}
