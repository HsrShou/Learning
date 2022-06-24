package com.hr.servlet;

import com.hr.entity.Menu;
import com.hr.service.Service01;
import com.hr.service.impl.Service01Impl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 *	开发时，常规流程
 *	servlet--->service--->dao
 *	咱家原来开的是小饭馆，招待客人、做饭、端上来。。。一个人就搞定了
 *	咱家后来开大饭店，招待客人(前台)，后后厨。。。多个人搞定
 *	在开发中：
 *		(10086客服)servlet做的内容是接收前端发来的请求，接参数，并调用Service层来处理相关业务
 *		service层：服务层(假设我们在办理入值)
 *			servlet就调用了service01.办理入值(所需信息)
 *			办理入值这个业务比较复杂，需要多步，也需要多次操作数据库
 *		dao层：
 *			service中需要操作数据库的时候，就会来调用我们的dao层。
 *
 */
@WebServlet("/testSql")
public class Servlet06 extends HttpServlet {
	//前端如果发get请求，就进doGet方法
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);//如果发的是get请求，这里转给doPost处理
	}

	//前端如果发post请求，就进doPost方法
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("haha");

		Service01 service01 = new Service01Impl();
		List<Menu> list = service01.getMenuList();
		//list.forEach(System.out::println);
		System.out.println(list);

		long count = service01.getMenuCount();
		System.out.println("共多少道菜::"+count);

	}

}
