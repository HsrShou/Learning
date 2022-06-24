package com.hr.servlet;

import com.hr.entity.Goods;
import com.hr.entity.GoodsType;
import com.hr.entity.Page;
import com.hr.service.GoodsService;
import com.hr.service.impl.GoodsServiceImpl;
import com.hr.util.CommonUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author Han ShouRong
 * @date 2022/6/25 上午 7:15
 */

@WebServlet("/goods")
public class GoodsServlet extends BaseServlet{
    GoodsService goodsService = new GoodsServiceImpl();

    public void goodsList(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("goodsList");
        List<Goods> list = goodsService.goodsList();
        for (Goods goods : list) {
            System.out.println(goods);
        }
        req.setAttribute("goodsList", list);
        //带着数据转发到前端jsp页面
        String type = req.getParameter("type");
        if (type != null) {
            req.getRequestDispatcher("/html/shopping.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/html/goodsManager/goods.jsp").forward(req, resp);
        }

    }

    public void toGoodsAdd(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("toGoodsAdd.....");
        List<GoodsType> list = goodsService.getGoodsType();
        System.out.println(list);
        req.setAttribute("gtList", list);
        req.getRequestDispatcher("/html/goodsManager/goodsDetail.jsp").forward(req, resp);
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
        System.out.println("要修改的商品ID" + req.getParameter("goodsId"));
        Goods goods = goodsService.toGoodsUpdate(id);
        System.out.println(goods);
        req.setAttribute("goods", goods);
        List<GoodsType> list = goodsService.getGoodsType();
        System.out.println(list);
        req.setAttribute("gtList", list);
        req.getRequestDispatcher("/html/goodsManager/goodsDetail.jsp").forward(req, resp);
    }

    public void goodsUpdate(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("goodsUpdate.....");
        Goods goods = CommonUtils.transfer(req, new Goods());
        System.out.println("前端传来了" + goods);
        int out = goodsService.goodsUpdate(goods);
        System.out.println(out);
        resp.sendRedirect(req.getContextPath() + "/goods?url=goodsList");
    }

    public void goodsListPage(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("goodsListPage.....");
        Integer currentPage = Integer.valueOf(req.getParameter("currentPage"));
        System.out.println("当前要查询的页面 " + currentPage);
        /*
        发现，我们要返回的数据包括：
        当前页：currentPage
        总页数：pageTotal
        当前页中的数据：data List<Goods>
        */
//        List<Goods> list =  goodsService.goodsListPage(currentPage);
//        for (Goods goods:list){
//            System.out.println(goods);
//        }
//        req.setAttribute("goodsList",list);
        /*
    前端页面，由于是分页，
    需要显示10条数据，
    还有下面的分页按钮。而按钮具体有多少个，也需要后台提供
    还要处理当前是第几页，前端后给提供高亮显示
    setAtrribute("新闻标题","饿了")
    setAtrribute("新闻内容"，"真饿了")
    setAtrribute("点击量"，n)
    setAttribute（"新闻"，new News“饿了”，“真饿了”)
    */
//        Page page = new Page();
//        page.setCurrentPage(currentPage);
//        page.setData(list);
//        page.setCount(30L);
//        page.setPageTotal(1);
/*     前端发起请求，想要第8页的数据
          ..goods?url=goodsListPage&currentPage=8
       后端servlet开始处理
        servlet也就是接一下新端的参数，真实处理的事情交给service
        并通知service,我们要给前端返回一个page对象，前端要求多。
       service:
所以，    service需要返回一个page对象给servlet
        */
        Page<Goods> page = goodsService.goodsListPage(currentPage);
        System.out.println("总记录数" + page.getCount());
        System.out.println("总页数" + page.getPageTotal());
        for (Goods goods : page.getData()) {
            System.out.println(goods);
        }
        req.setAttribute("page", page);

        List<GoodsType> list = goodsService.getGoodsType();
        System.out.println(list);
        req.setAttribute("gtList", list);
        req.getRequestDispatcher("/html/shopping.jsp").forward(req, resp);
    }

    public void goodsListPageCondition(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("goodsListPageCondition......");
        String goodsName = req.getParameter("goodsName");
        String gtId = req.getParameter("gtId");
        System.out.println(gtId);
        System.out.println(goodsName);
        //去后台查询数据
        Integer currentPage = Integer.valueOf(req.getParameter("currentPage"));
        System.out.println("当前要查询的页面 " + currentPage);
        Page<Goods> page = goodsService.goodsListPageCondition(currentPage, goodsName, gtId);
        System.out.println("总记录数" + page.getCount());
        System.out.println("总页数" + page.getPageTotal());
        for (Goods goods : page.getData()) {
            System.out.println(goods);
        }
        req.setAttribute("page", page);

        List<GoodsType> list = goodsService.getGoodsType();
        System.out.println(list);
        req.setAttribute("gtList", list);
        req.getRequestDispatcher("/html/shopping.jsp").forward(req, resp);
    }
}



