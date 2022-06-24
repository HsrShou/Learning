package com.hr.service;


import com.hr.entity.Menu;
import com.hr.entity.MenuType;
import com.hr.entity.Page;

import java.util.List;

/**
 * @author Han ShouRong
 * @date 2022/6/25 上午 7:15
 */
public interface MenuService {

    List<Menu> menuList();

    List<MenuType> getMenuType();

    int menuAdd(Menu menu);

    int menusDel(String id);

    Menu toMenuUpdate(String id);

    int menuUpdate(Menu menu);

    Page<Menu> menuListPage(Integer currentPage);

    Page<Menu> menuListPageCondition(Integer currentPage, String menuName, String menuTypeId);
}
