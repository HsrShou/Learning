package com.hr.service.impl;

import com.hr.dao.MenuDao;
import com.hr.dao.impl.MenuDaoImpl;
import com.hr.entity.Menu;
import com.hr.entity.MenuType;
import com.hr.entity.Page;
import com.hr.service.MenuService;

import java.util.List;

/**
 * @author Han ShouRong
 * @date 2022/6/25 上午 7:15
 */
public class MenuServiceImpl implements MenuService {
    MenuDao menuDao = new MenuDaoImpl();

    @Override
    public List<Menu> menuList() {
        return menuDao.menuList();
    }

    @Override
    public List<MenuType> getMenuType() {
        return menuDao.getMenuType();
    }

    @Override
    public int menuAdd(Menu menu) {
        return menuDao.MenuAdd(menu);
    }

    @Override
    public int menusDel(String id) {
        return menuDao.menuDel(id);
    }

    @Override
    public Menu toMenuUpdate(String id) {
        return menuDao.toMenuUpdate(id);
    }

    @Override
    public int menuUpdate(Menu menu) {
        return menuDao.MenuUpdate(menu);
    }

    @Override
    public Page<Menu> menuListPage(Integer currentPage) {
        Page<Menu> page = new Page();
//        private Integer currentPage;//当前第几页
//        private Integer pageTotal;//一共多少页
//        private List<T> data;//当前页中的数据
//        private Long count;//总共多少条记录
//        private Integer pageSize = 10;//每页多少条
        page.setCurrentPage(currentPage);//组装当前页
//        组装count 总共多少条记录
        long count = menuDao.getCount();
        page.setCount(count);
        //组装pageTotal总页数：先去数据库查询总共多少数据 再用公式求pageTotal
//        page.getpageTotal = (32%10==0)?(32/10):((32/10)+1)
        int temp = (int) (page.getCount() / page.getPageSize());
        Integer pageTotal = page.getCount() % page.getPageSize() == 0 ? (temp) : (temp + 1);
        page.setPageTotal(pageTotal);
//      组装data数据->去数据库查数据select*from表limit?,?
//      分析了一下，sg1不用改
//      如果是第一页：limit0,1 第二页 limit 10,10
        List<Menu> list = menuDao.menuListPage((currentPage - 1) * 10, page.getPageSize());
        page.setData(list);
        return page;
    }

    @Override
    public Page<Menu> menuListPageCondition(Integer currentPage, String menuName, String menuTypeId) {
        Page<Menu> page = new Page();
        page.setCurrentPage(currentPage);//组装当前页
//        组装count 总共多少条记录
        long count = menuDao.getCountCon(menuName, menuTypeId);
        page.setCount(count);
        int temp = (int) (page.getCount() / page.getPageSize());
        Integer pageTotal = page.getCount() % page.getPageSize() == 0 ? (temp) : (temp + 1);
        page.setPageTotal(pageTotal);
        List<Menu> list = menuDao.menuListPageCon(menuName, (currentPage - 1) * 10, page.getPageSize(), menuTypeId);
        System.out.println(list);
        page.setData(list);
        return page;
    }
}
