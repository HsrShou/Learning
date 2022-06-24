package com.hr.dao;

import com.hr.entity.Menu;

import java.util.List;

public interface Dao01 {
	List<Menu> getMenuList();

	long getMenuCount();
}
