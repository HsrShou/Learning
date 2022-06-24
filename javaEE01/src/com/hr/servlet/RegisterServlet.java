package com.hr.servlet;

import com.hr.service.UserInfoService;
import com.hr.service.impl.UserInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
注册 的后台
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	//前端如果发get请求，就进doGet方法
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);//如果发的是get请求，这里转给doPost处理
	}

	//前端如果发post请求，就进doPost方法
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("注册....");

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

}
//思考：
//   怎么能类似springMVC，这种结构，即一个UserServlet中，可以写login方法、register方法。
//   会利用 .class