package com.hr.servlet;

import com.hr.entity.UserInfo;
import com.hr.service.UserInfoService;
import com.hr.service.impl.UserInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
登录 的后台

	校验传入的用户名密码是否正确
	也就是看看通过该用户名和密码 能否在数据库中查找到相应的记录
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	//前端如果发get请求，就进doGet方法
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);//如果发的是get请求，这里转给doPost处理
	}

	//前端如果发post请求，就进doPost方法
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("haha");

		UserInfoService userInfoService = new UserInfoServiceImpl();

		String userName = req.getParameter("userName");//参数是前端的name属性中的数据
		String password = req.getParameter("password");
		System.out.println(userName+","+password);

		//连接数据库进行校验。
		UserInfo userInfo = userInfoService.check(userName, password);
		System.out.println(userInfo);
		if(userInfo==null){
			System.out.println("登录失败");//重新定向到aa.html
			resp.sendRedirect(req.getContextPath()+"/html/login.jsp");
		}else{
			System.out.println("登录成功");//重新定向到resp.html
			resp.sendRedirect(req.getContextPath()+"/resp.html");
		}

	}

}
