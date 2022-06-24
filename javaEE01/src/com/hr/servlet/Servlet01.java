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

@WebServlet("/aa")
public class Servlet01 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("haha");
//		resp.getWriter().write("haha");
//		resp.sendRedirect(req.getContextPath()+"/html/haha.jsp");
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("nn");
		req.setAttribute("userInfo",userInfo);//这句话，就是把数据装到req中，并转发到下一站

		List<UserInfo> list = new ArrayList<>();
		list.add(userInfo);
		req.setAttribute("list",list);//注意，不加这句话，是不会传到前端的。

		req.getRequestDispatcher("/html/haha.jsp").forward(req,resp);
	}
}
