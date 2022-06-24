package com.hr.service.impl;

import com.hr.dao.Dao01;
import com.hr.dao.impl.Dao01Impl;
import com.hr.entity.Menu;
import com.hr.service.Service01;

import java.util.List;

/**
 * @author cxiaoy
 * @version 2019.2
 * @date 2022/6/20 16:00
 */
public class Service01Impl implements Service01 {
	Dao01 dao01 = new Dao01Impl();
	@Override
	public List<Menu> getMenuList() {
		//先检查入职体检报告、加入员工表、加入考勤表....
		return dao01.getMenuList();
	}

	@Override
	public long getMenuCount() {
		return dao01.getMenuCount();
	}
}
