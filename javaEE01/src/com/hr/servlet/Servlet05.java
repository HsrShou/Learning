package com.hr.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 前端发起了一个请求，
 * 浏览器就把请求的内容http协议格式打了个包，发给tomcat
 * tomcat有个功能，可以把你http协议的内容整理成为一个对象
 * 我们一直在用的参数req，就是前端发过来的请求数据内容
 * 
 */
@WebServlet("/zf")
public class Servlet05 extends HttpServlet {
	//前端如果发get请求，就进doGet方法
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);//如果发的是get请求，这里转给doPost处理
	}

	//前端如果发post请求，就进doPost方法
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("------aa");
		System.out.println(req.getAttribute("sth"));
	}

}
