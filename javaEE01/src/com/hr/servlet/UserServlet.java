package com.hr.servlet;

import com.hr.entity.UserInfo;
import com.hr.service.UserInfoService;
import com.hr.service.impl.UserInfoServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;

@WebServlet("/user")
public class UserServlet extends BaseServlet{
    public void login(HttpServletRequest req, HttpServletResponse resp) throws Exception {
//        http://localhost:8080/javaEE01/user?url=login&userName=admin&password=123  前端过来的url
        System.out.println("login...haha");

        UserInfoService userInfoService = new UserInfoServiceImpl();

        String userName = req.getParameter("userName");//参数是前端的name属性中的数据
        String password = req.getParameter("password");
        System.out.println(userName+","+password);

        //连接数据库进行校验。
        UserInfo userInfo = userInfoService.check(userName, password);
        System.out.println(userInfo);
        if(userInfo==null){
            System.out.println("登录失败");//重新定向到aa.html
            resp.sendRedirect(req.getContextPath()+"/login.jsp");
        }else{
            System.out.println("登录成功");//重新定向到resp.html
            resp.sendRedirect(req.getContextPath()+"/resp.html");
        }
    }
    public void register(HttpServletRequest req, HttpServletResponse resp)throws Exception{
        System.out.println("register...haha");

        UserInfoService userInfoService = new UserInfoServiceImpl();

        String userName = req.getParameter("userName");//参数是前端的name属性中的数据
        userName = new String(userName.getBytes("iso8859-1"),"utf-8");
        String password = req.getParameter("password");
        System.out.println(userName+","+password);
        //前端跑不了的，用下面的。
//		String userName = "qqq";
//		String password = "123";

        //注册，新增一个用户，需要入userInfo表中添加一条记录
        int a = userInfoService.addUserInfo(userName,password);
        System.out.println(a);
        resp.sendRedirect(req.getContextPath()+"/html/login.jsp");
    }

    public void eat(String food){

    }
}

/*
前端发起请求/user?url=login
    mvc:  /user/login
到达后端，会去找doGet和doPost或service方法
会发现，代码跑父类BaseServlet中去了。
我们的目的是回到login()方法中。
想回到login()方法，是需要dog.eat()方式的。
这时候就用到了反射。
反着调用：
    先拿到Class对象，通过Class对象获取login方法。
 */


