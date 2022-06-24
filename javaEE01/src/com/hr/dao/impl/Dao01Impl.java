package com.hr.dao.impl;

import com.hr.dao.Dao01;
import com.hr.entity.Menu;
import com.hr.util.BaseDao;
import com.hr.util.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author cxiaoy
 * @version 2019.2
 * @date 2022/6/20 16:01
 */
public class Dao01Impl implements Dao01 {
	@Override
	public List<Menu> getMenuList() {
		//连接数据库 alt+enter
//		Connection conn = DruidUtils.getConn();
//		QueryRunner runner = new QueryRunner();
//		String sql = "select *,menu_name as menuName from menu";
//		try {
//			return runner.query(conn,sql,new BeanListHandler<Menu>(Menu.class));
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		DruidUtils.closeConn(conn);
//		return null;
		String sql = "select *,menu_name as menuName from menu where id in(?,?,?)";
		BaseDao baseDao = new BaseDao();
		return baseDao.list(sql,Menu.class,1,2,3);
	}


	@Override
	public long getMenuCount() {
		Connection conn = DruidUtils.getConn();
		QueryRunner runner = new QueryRunner();
		String sql = "select count(*) from menu";
		try {
			return runner.query(conn,sql,new ScalarHandler<Long>());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DruidUtils.closeConn(conn);
		return 0;
	}


}
