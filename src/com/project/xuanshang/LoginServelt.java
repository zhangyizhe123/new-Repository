package com.project.xuanshang;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServelt extends HttpServlet {
    @Override
    protected void service(HttpServletRequest reqest, HttpServletResponse response) throws ServletException, IOException {
        //解决响应中文乱码的问题
        reqest.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        //1.接受客户端传递来的用户名密码的值
        String username=reqest.getParameter("username");//用户名的值
        String password=reqest.getParameter("password");//密码的值
        System.out.println("用户名的值为"+username);
        System.out.println("密码的值为"+password);
        if(username.equals("李杨")&&password.equals("123456")){
            response.sendRedirect("http://localhost:8080/web/jsp/xianyiren/liyang/liyang.jsp");
        }
        else if (username.equals("乐舒阳")&&password.equals("123456")) {
            response.sendRedirect("http://localhost:8080/web/jsp/xianyiren/yueshuyang/yueshuyang.jsp");
        }
        else if (username.equals("李文哲")&&password.equals("123456")) {
            response.sendRedirect("http://localhost:8080/web/jsp/xianyiren/liwenzhe/liwenzhe.jsp");
        }
        else if (username.equals("冯磊")&&password.equals("123456")) {
            response.sendRedirect("http://localhost:8080/web/jsp/xianyiren/fenglei/fenglei.jsp");
        }
        else if (username.equals("李科宇")&&password.equals("123456")) {
            response.sendRedirect("http://localhost:8080/web/jsp/xianyiren/likeyu/likeyu.jsp");
        }
        else if (username.equals("朱炜明")&&password.equals("123456")) {
            response.sendRedirect("http://localhost:8080/web/jsp/xianyiren/zhuweiming/zhuweiming.jsp");
        }
        else if (username.equals("郑智")&&password.equals("123456")) {
            response.sendRedirect("http://localhost:8080/web/jsp/xianyiren/zhengzhi/zhengzhi.jsp");
        }
        else if (username.equals("史更新")&&password.equals("123456")) {
            response.sendRedirect("http://localhost:8080/web/jsp/xianyiren/shigengxin/shigengxin.jsp");
        }
        else{
            response.setContentType("差无此人");
        }

    }
}
