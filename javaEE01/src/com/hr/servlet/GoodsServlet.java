package com.hr.servlet;

import com.hr.entity.Goods;
import com.hr.entity.GoodsType;
import com.hr.service.GoodsService;
import com.hr.service.impl.GoodsServiceImpl;
import com.hr.util.CommonUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@WebServlet("/goods")
public class GoodsServlet extends BaseServlet{
    GoodsService goodsService = new GoodsServiceImpl();
    public void goodsList(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("goodsList");
        List<Goods> list = goodsService.goodsList();
        for (Goods goods:list){
            System.out.println(goods);
        }
        req.setAttribute("list",list);
        //带着数据转发到前端jsp页面
        String type = req.getParameter("type");
        if(type!=null){
            req.getRequestDispatcher("/html/shopping.jsp").forward(req,resp);
        }
        req.getRequestDispatcher("/html/goodsManager/goods.jsp").forward(req,resp);
    }

    public void toGoodsAdd(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("toGoodsAdd.....");
        List<GoodsType> list = goodsService.getGoodsType();
        System.out.println(list);
        req.setAttribute("gtList",list);
        req.getRequestDispatcher("/html/goodsManager/goodsDetail.jsp").forward(req,resp);
    }
    public void goodsAdd(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("goodsAdd.....");
        System.out.println(req.getParameter("goodsName"));
        System.out.println(req.getParameter("gtId"));
        Goods goods = CommonUtils.transfer(req,new Goods());
        System.out.println(goods);
        int out = goodsService.goodsAdd(goods);
        System.out.println(out);
        //现在页面是白色的我们要让页面显示商品列表 转发 重定向（先返回浏览器，然后浏览器再发起一次请求)
        resp.sendRedirect(req.getContextPath()+"/goods?url=goodsList");
    }
    public void goodsDel(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("goodsDel.....");
        String id = req.getParameter("goodsId");
        System.out.println("前端传入了"+req.getParameter("goodsId"));
        int out = goodsService.goodsDel(id);
        System.out.println(out);
        resp.sendRedirect(req.getContextPath()+"/goods?url=goodsList");
    }
    public void toGoodsUpdate(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("tGoodsUpdate.....");
        //现在页面是白色的我们要让页面显示商品列表 转发 重定向（先返回浏览器，然后浏览器再发起一次请求)
        String id = req.getParameter("goodsId");
        System.out.println("要修改的商品ID"+req.getParameter("goodsId"));
        Goods goods = goodsService.toGoodsUpdate(id);
        System.out.println(goods);
        req.setAttribute("goods",goods);
        List<GoodsType> list = goodsService.getGoodsType();
        System.out.println(list);
        req.setAttribute("gtList",list);
        req.getRequestDispatcher("/html/goodsManager/goodsDetail.jsp").forward(req,resp);
    }
    public void goodsUpdate(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("goodsUpdate.....");
        Goods goods = CommonUtils.transfer(req,new Goods());
        System.out.println("前端传来了"+goods);
        int out =  goodsService.goodsUpdate(goods);
        System.out.println(out);
        resp.sendRedirect(req.getContextPath()+"/goods?url=goodsList");
    }
}



