package com.hr.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * tomcat的要求：
 * 	1、必须继承HttpServlet
 * 	2、重写父类的doGet、doPost方法  alt+insert
 * 		doGet、doPost，就是我们之前的main方法
 * 	3、在类上面加一个请求路径
 * 	4、访问：
 * 		在浏览器中访问，
 * 			localhost:8080可以找到tomcat
 * 		/javaEE01 可以找到tomcat下的我们的项目
 * 		/haha  项目内具体的请求路径
 */
@WebServlet("/haha")
public class Servlet02 extends HttpServlet {
	//前端如果发get请求，就进doGet方法
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);//如果发的是get请求，这里转给doPost处理
	}

	//前端如果发post请求，就进doPost方法
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("haha");
	}


	//销毁的时候会触发
	@Override
	public void destroy() {
		System.out.println("检查项目还有哪些需要关闭的资源，关一下");
	}


	/*
	tomcat是一种服务，它可以帮我们做很多事情，
	有一种情况，我们把自己交给它。
	数据（轻拿轻放）
	 */
	@Override
	public void init() throws ServletException {
		//把东西交给tomcat前，叮嘱的内容
		System.out.println("慢点儿");//首次访问这个servlet可以使用。单实例、多线程
	}
}
