package com.hr.util;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author cxiaoy
 * @version 2019.2
 * @date 2022/6/20 17:15
 */
public class BaseDao {
	/*
	实现 不管是哪个表，想查list就可以调用该方法
		泛型List<Menu>
	 */
	public <T> List<T> list(String sql,Class<T> type,Object... params){
		Connection conn = DruidUtils.getConn();
		QueryRunner runner = new QueryRunner();
		try {
			return runner.query(conn,sql,new BeanListHandler<T>(type),params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DruidUtils.closeConn(conn);
		return null;
	}

	/**
	 *
	 * @param sql sql语句
	 * @param type 映射实体类型
	 * @param params	参数
	 * @param <T>
	 * @return 一条记录
	 */
	public <T> T getOne(String sql,Class<T> type,Object... params){
		Connection conn = DruidUtils.getConn();
		QueryRunner runner = new QueryRunner();
		try {
			return runner.query(conn,sql,new BeanHandler<T>(type),params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DruidUtils.closeConn(conn);
		return null;
	}

	/*
	获取一个数值
	 */
	public <T> T getOneValue(String sql,Object... params){
		Connection conn = DruidUtils.getConn();
		QueryRunner runner = new QueryRunner();
		try {
			return runner.query(conn,sql,new ScalarHandler<T>(),params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DruidUtils.closeConn(conn);
		return null;
	}

	/*
	增删改（不返回主键），用这个
	 */
	public int update(String sql,Object... params){
		Connection conn = DruidUtils.getConn();
		QueryRunner runner = new QueryRunner();
		try {
			return runner.update(conn,sql,params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DruidUtils.closeConn(conn);
		return -1;
	}

	/*
	新增、主动返回主键
	 */
	public Long insert(String sql,Object... params){
		Connection conn = DruidUtils.getConn();
		QueryRunner runner = new QueryRunner();
		try {
			return runner.insert(conn,sql,new ScalarHandler<Long>(),params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DruidUtils.closeConn(conn);
		return -1L;
	}



	public void test1(){
//		String sql = "update menu set price=3 where id=?";
//		int count = this.update(sql,1);
//		System.out.println(count);

		String sql = "insert into menu (menu_name) values(?)";
		long id = this.insert(sql,"随便");
		System.out.println(id);
	}
}
