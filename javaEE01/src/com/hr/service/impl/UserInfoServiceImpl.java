package com.hr.service.impl;

import com.hr.dao.UserInfoDao;
import com.hr.dao.impl.UserInfoDaoImpl;
import com.hr.entity.UserInfo;
import com.hr.service.UserInfoService;

/**
 * @author cxiaoy
 * @version 2019.2
 * @date 2022/6/21 10:16
 */
public class UserInfoServiceImpl implements UserInfoService {
	UserInfoDao userInfoDao = new UserInfoDaoImpl();

	public UserInfo check(String userName, String password){
		return userInfoDao.check(userName,password);
	}

	@Override
	public int addUserInfo(String userName, String password) {
		int a = userInfoDao.addUserInfo(userName,password);
		return a;
	}
}
