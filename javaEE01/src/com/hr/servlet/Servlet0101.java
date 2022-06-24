package com.hr.servlet;

import com.hr.entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author cxiaoy
 * @version 2019.2
 * @date 2022/6/19 17:26
 */
@WebServlet("/asasa")
public class Servlet0101 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");//处理post方式请求时的乱码问题的。
		resp.setContentType("text/html;charset=utf-8");//这里写错了，可能会出现"下载"
		System.out.println("haha");
		System.out.println ("haha");
		resp.getWriter().write("haha");
		//resp.sendRedirect (req.getContextPath ()+"/html/haha.jsp");
		UserInfo userInfo  = new UserInfo();
		userInfo.setUserName ("admin");
		req.setAttribute("userInfo",userInfo);//这句话，就是把数据装到reg中，并转发到下一站
		List<UserInfo> list =  new ArrayList<>();
		list.add(userInfo);
		req.setAttribute("list",list);
		req.getRequestDispatcher("/html/haha.jsp").forward(req,resp);
	}

}
