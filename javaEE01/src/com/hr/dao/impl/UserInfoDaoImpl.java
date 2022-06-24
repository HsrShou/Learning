package com.hr.dao.impl;

import com.hr.dao.UserInfoDao;
import com.hr.entity.UserInfo;
import com.hr.util.BaseDao;

/**
 * @author cxiaoy
 * @version 2019.2
 * @date 2022/6/21 10:16
 */
public class UserInfoDaoImpl implements UserInfoDao {

	BaseDao baseDao = new BaseDao();

	public UserInfo check(String userName,String password){
		System.out.println(userName+","+password);
//		String sql = "select * from user_info where user_name = ? and password=?";
		String sql = "select *,user_name as userName from user_info where user_name=? and password=? ";
		UserInfo userInfo = baseDao.getOne(sql, UserInfo.class,userName,password);
		System.out.println("-----"+userInfo);
		return userInfo;
//		System.out.println(userInfo);
	}

	@Override
	public int addUserInfo(String userName, String password) {
		String sql = "insert into user_info (user_name,password)values(?,?)";
		return baseDao.update(sql,userName,password);
	}

	public static void main(String[] args) {
		new UserInfoDaoImpl().check("admin","123");
	}

}
