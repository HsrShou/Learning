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
@WebServlet("/req1")
public class Servlet04 extends HttpServlet {
	//前端如果发get请求，就进doGet方法
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);//如果发的是get请求，这里转给doPost处理
	}

	//前端如果发post请求，就进doPost方法
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");//处理post方式请求时的乱码问题的。
		resp.setContentType("text/html;charset=utf-8");//这里写错了，可能会出现"下载"
		System.out.println("req1....");
		System.out.println("前端传来了："+req.getParameter("username"));
		System.out.println("传输方式："+req.getMethod());//get
		System.out.println(req.getContextPath());//   /javaEE01
		System.out.println("资源标识："+req.getRequestURI());//  /javaEE01/req1
		System.out.println("统一资源定位符："+req.getRequestURL());

		//向前端响应
//		resp.getWriter().write("<h1>念念</h1>");//方案一，直接写在页面上，可能会有乱码。-->向前端ajax
		//重新定向 到一个新的html页面,偷偷的先是resp响应完成后(一次请求已结束)，回到浏览器，然后由通过浏览器重新发起了一次请求
		/*
		一次请求，会生成一个req、resp对象
		再次发请求，会生成一对新的req、resp对象
		 */
		//resp.sendRedirect(req.getContextPath()+"/resp.html");//方案二
		/*发起一个完成购物的请求，会自动返回到商品的首页,重新定向
		发起一个完成购物的请求，想在页面直接显示ok,这个就不用*/


		//转发  localhost:8080/javaEE01
		req.setAttribute("sth","红肠");//继续往req中装东西。
		//req.getRequestDispatcher("/zf").forward(req,resp);//转发过去，可以收到红肠

		//重定向 localhost:8080  /javaEE01  /zf
		resp.sendRedirect(req.getContextPath()+"/zf");//重新定向，收不到红肠

		// 我想委托刘美岑（红肠）->任校民 这个路线是同一个req
		//我想委托刘美岑（红肠）

	}

}
