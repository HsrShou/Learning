package com.hr.dao;

import com.hr.entity.Menu;

import java.util.List;
/**
 * @author Han ShouRong
 * @date 2022/6/25 上午 7:15
 */
public interface Dao01 {
	List<Menu> getMenuList();

	long getMenuCount();
}
