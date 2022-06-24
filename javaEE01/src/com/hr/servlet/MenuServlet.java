package com.hr.servlet;

import com.hr.entity.Menu;
import com.hr.entity.MenuType;
import com.hr.entity.Page;
import com.hr.service.MenuService;
import com.hr.service.impl.MenuServiceImpl;
import com.hr.util.CommonUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author Han ShouRong
 * @date 2022/6/25 上午 7:15
 */
@WebServlet("/menu")
public class MenuServlet extends BaseServlet {
    MenuService menuService = new MenuServiceImpl();

    public void menuList(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("menuList");
        List<Menu> list = menuService.menuList();
        for (Menu menu : list) {
            System.out.println(menu);
        }
        req.setAttribute("menuList", list);
        //带着数据转发到前端jsp页面
        String type = req.getParameter("type");
        if (type != null) {
            req.getRequestDispatcher("/html/menuManager/shopping.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/html/menuManager/menu.jsp").forward(req, resp);
        }

    }

    public void toMenuAdd(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("toMenuAdd.....");
        List<MenuType> list = menuService.getMenuType();
        System.out.println(list);
        req.setAttribute("mtList", list);
        req.getRequestDispatcher("/html/menuManager/menuDetail.jsp").forward(req, resp);
    }

    public void menuAdd(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("menuAdd.....");
        System.out.println(req.getParameter("menuName"));
        System.out.println(req.getParameter("menuTypeId"));
        Menu menu = CommonUtils.transfer(req, new Menu());
        System.out.println(menu);
        int out = menuService.menuAdd(menu);
        System.out.println(out);
        //现在页面是白色的我们要让页面显示商品列表 转发 重定向（先返回浏览器，然后浏览器再发起一次请求)
        resp.sendRedirect(req.getContextPath() + "/menu?url=menuList");
    }

    public void menuDel(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("menuDel.....");
        String id = req.getParameter("id");
        System.out.println("前端传入了" + req.getParameter("id"));
        int out = menuService.menusDel(id);
        System.out.println(out);
        resp.sendRedirect(req.getContextPath() + "/menu?url=menuList");
    }

    public void toMenuUpdate(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("toMenuUpdate.....");
        //现在页面是白色的我们要让页面显示商品列表 转发 重定向（先返回浏览器，然后浏览器再发起一次请求)
        String id = req.getParameter("id");
        System.out.println("要修改的菜品ID" + req.getParameter("id"));
        Menu menu = menuService.toMenuUpdate(id);
        System.out.println(menu);
        req.setAttribute("menu", menu);
        List<MenuType> list = menuService.getMenuType();
        System.out.println(list);
        req.setAttribute("mtList", list);
        req.getRequestDispatcher("/html/menuManager/menuDetail.jsp").forward(req, resp);
    }

    public void menuUpdate(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("menuUpdate.....");
        Menu menu = CommonUtils.transfer(req, new Menu());
        System.out.println("前端传来了" + menu);
        int out = menuService.menuUpdate(menu);
        System.out.println(out);
        resp.sendRedirect(req.getContextPath() + "/menu?url=menuList");
    }

    public void menuListPage(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("menuListPage.....");
        Integer currentPage = Integer.valueOf(req.getParameter("currentPage"));
        System.out.println("当前要查询的 页面 " + currentPage);
        /*
        发现，我们要返回的数据包括：
        当前页：currentPage
        总页数：pageTotal
        当前页中的数据：data List<Goods>
        */
/*     前端发起请求，想要第8页的数据
          ..goods?url=goodsListPage&currentPage=8
       后端servlet开始处理
        servlet也就是接一下新端的参数，真实处理的事情交给service
        并通知service,我们要给前端返回一个page对象，前端要求多。
       service:
所以，    service需要返回一个page对象给servlet
        */
        Page<Menu> page = menuService.menuListPage(currentPage);
        System.out.println(" 总记录数 " + page.getCount());
        System.out.println(" 总页数 " + page.getPageTotal());
        for (Menu menu : page.getData()) {
            System.out.println(menu);
        }
        req.setAttribute("page", page);

        List<MenuType> list = menuService.getMenuType();
        System.out.println(list);
        req.setAttribute("mtList", list);
        req.getRequestDispatcher("/html/menuManager/menuShopping.jsp").forward(req, resp);
    }

    public void menuListPageCondition(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("menuListPageCondition......");
        String menuName = req.getParameter("menuName");
        String menuTypeId = req.getParameter("menuTypeId");
        System.out.println(menuTypeId);
        System.out.println(menuName);
        //去后台查询数据
        Integer currentPage = Integer.valueOf(req.getParameter("currentPage"));
        System.out.println("当前要查询的页面 " + currentPage);
        Page<Menu> page = menuService.menuListPageCondition(currentPage, menuName, menuTypeId);
        System.out.println("总记录数" + page.getCount());
        System.out.println("总页数" + page.getPageTotal());
        for (Menu menu : page.getData()) {
            System.out.println(menu);
        }
        req.setAttribute("page", page);

        List<MenuType> list = menuService.getMenuType();
        System.out.println(list);
        req.setAttribute("mtList", list);
        req.getRequestDispatcher("/html/menuManager/menuShopping.jsp").forward(req, resp);
    }
}
