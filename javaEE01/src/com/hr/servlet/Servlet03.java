package com.hr.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * http协议：
 * 	何广瑞 负责把咱们同学的一些信息传给我。
 * 	会发给我一个字符串：
 * 		我俩定好的传输格式要求(协议)："1001,何广瑞,xxxx;1001,何广瑞,xxxx"
 *		"何广瑞,1001,xxxx;1001,何广瑞,xxxx"
 *
 * http这种通用的协议：
 *  * 	优点是全世界通用，缺点是繁琐的数据多
 *  * 公司内部会有自己定义的协议：
 *  * 		内部使用，精准，小。
 *  *
 * 	如你是传个json、文件，还是post上传方式，等，都在http包有体现出来。
 *
 *
 */
@WebServlet("/hoho")
public class Servlet03 extends HttpServlet {
	//前端如果发get请求，就进doGet方法
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);//如果发的是get请求，这里转给doPost处理
	}

	//前端如果发post请求，就进doPost方法
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("hoho....");
		System.out.println("前端传来了："+req.getParameter("username"));

	}

}
