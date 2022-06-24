package com.hr.dao;

import com.hr.entity.Menu;
import com.hr.entity.MenuType;

import java.util.List;

/**
 * @author Han ShouRong
 * @date 2022/6/25 上午 7:15
 */
public interface MenuDao {
    List<Menu> menuList();

    List<MenuType> getMenuType();

    int MenuAdd(Menu menu);

    int menuDel(String id);

    Menu toMenuUpdate(String id);

    int MenuUpdate(Menu menu);


    long getCount();

    List<Menu> menuListPage(Integer currentPage, int i);

    long getCountCon(String menuName, String menuTypeId);

    List<Menu> menuListPageCon(String menuName, Integer currentPage, int i, String menuTypeId);
}
