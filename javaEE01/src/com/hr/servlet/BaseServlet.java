package com.hr.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
/**
 * @author Han ShouRong
 * @date 2022/6/25 上午 7:15
 */
/*
    在springMVC 中，我们会写UserController
    localhost:8080/javaee01/user?url=login
 */
public class BaseServlet extends HttpServlet {
    //这个就是我们以前doGet、doPost的原型
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String url = req.getParameter("url");//login
        //this.getClass() 会拿到一个Class对象
        try {
            //getDeclaredMethod(方法名,该方法是否有参数，如果有，就把参数类型.class放进来)
            //method = this.getClass().getDeclaredMethod("eat",String.class);
            //this是真正的实例对象UserServlet
            Method method = this.getClass().getDeclaredMethod(url, HttpServletRequest.class, HttpServletResponse.class);
            /*
            method说，我已经被Class对象在底层生成出来了，我要被调用。
            谁想调我一下，
            第一个参数就是想调该方法的那个对象：UserServlet
            调用的时候，把该传的参，传进去。
             */

            method.invoke(this,req,resp);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
