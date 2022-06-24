package com.hr.dao.impl;

import com.hr.dao.MenuDao;
import com.hr.entity.Menu;
import com.hr.entity.MenuType;
import com.hr.util.BaseDao;

import java.util.List;

/**
 * @author Han ShouRong
 * @date 2022/6/25 上午 7:15
 */
public class MenuDaoImpl implements MenuDao {
    BaseDao baseDao = new BaseDao();

    @Override
    public List<Menu> menuList() {
        String sql = "select *,menu_name as menuName,url_image as urlImage,menu_status as menuStatus,menu_type_id as menuTypeId  FROM menu group by id";
        return baseDao.list(sql, Menu.class);
    }

    @Override
    public List<MenuType> getMenuType() {
        String sql = "select *,id as TId,menu_type_name as menuTypeName " +
                " from menu_type";
        List<MenuType> list = baseDao.list(sql, MenuType.class);
        return list;
    }

    @Override
    public int MenuAdd(Menu menu) {
        String sql = "INSERT into menu (id,menu_name,url_image,price,menu_status,menu_type_id) VALUES(?,?,?,?,?,?)";
        int out = baseDao.update(sql, menu.getId(), menu.getMenuName(), menu.getUrlImage(), menu.getPrice(), menu.getMenuStatus(), menu.getMenuTypeId());
        return out;
    }

    @Override
    public int menuDel(String id) {
        String sql = "DELETE FROM menu WHERE id = ?";
        int out = baseDao.update(sql, id);
        return out;
    }

    @Override
    public Menu toMenuUpdate(String id) {
        String sql = "select *,m.id as id,menu_name as menuName,url_image as urlImage,m.menu_status as menuStatus,menu_type_id as menuTypeId ," +
                "menu_type_name as menuTypeName ,mt.id as TId " +
                "FROM menu m left join menu_type mt " +
                "on m.menu_type_id = mt.id  where m.id = ?";
        Menu menu = baseDao.getOne(sql, Menu.class, id);
        return menu;
    }

    @Override
    public int MenuUpdate(Menu menu) {
        String sql = "update menu set menu_name = ?,url_image = ?,price  =?,menu_status =?,menu_type_id = ? where id = ? ";
        System.out.println("hh" + menu);
        int out = baseDao.update(sql, menu.getMenuName(), menu.getUrlImage(), menu.getPrice(), menu.getMenuStatus(), menu.getMenuTypeId(), menu.getId());
        return out;
    }

    @Override
    public long getCount() {
        String sql = "select count(*) from menu ";
        return baseDao.getOneValue(sql);
    }

    @Override
    public List<Menu> menuListPage(Integer currentPage, int i) {
        String sql = "  select *,m.id as id,menu_name as menuName,menu_type_id as menuTypeId,price as price,url_image as urlImage,m.menu_status , menu_type_name as menuTypeName " +
                " from menu m left join menu_type mt " +
                " on m.menu_type_id = mt.id order by m.id  limit ?,?";
        List<Menu> list = baseDao.list(sql, Menu.class, currentPage, i);
        return list;
    }

    @Override
    public long getCountCon(String menuName, String menuTypeId) {
        String sql2 = " ";
        System.out.println("daoCount" + menuTypeId + "aa");
        if (menuTypeId.equals("0")) {
            sql2 = "?";
            menuTypeId = "";
        } else {
            sql2 = " and menu_type_id = ? ";
        }
        String sql = "select count(*) from menu WHERE menu_name like ? " + sql2;

        return baseDao.getOneValue(sql, "%" + menuName + "%", menuTypeId);
    }

    @Override
    public List<Menu> menuListPageCon(String menuName, Integer currentPage, int i, String menuTypeId) {
        String sql2 = "";
        List<Menu> list = null;
        System.out.println("dao 层 Menu Type Id " + menuTypeId);
        if (menuTypeId.equals("0")) {
            sql2 = "?";
            menuTypeId = "";
        } else {
            sql2 = " AND menu_type_id = ? ";
        }
        String sql = "   select *,m.id as id,menu_name as menuName,menu_type_id as menuTypeId,price as price,url_image as urlImage,m.menu_status , menu_type_name as menuTypeName  " +
                "  from menu m left join menu_type mt  " +
                "  on m.menu_type_id = mt.id " +
                "  WHERE menu_name like  ? " + sql2 +
                "  order by m.id  limit ? , ?  ";
        System.out.println("select 的 SQL2 " + sql2);
        list = baseDao.list(sql, Menu.class, "%" + menuName + "%", menuTypeId, currentPage, i);
        System.out.println(list);
        return list;
    }


}
