package com.hr.service;

import com.hr.entity.Menu;

import java.util.List;
/**
 * @author Han ShouRong
 * @date 2022/6/25 上午 7:15
 */
public interface Service01 {

	List<Menu> getMenuList();

	long getMenuCount();
}
