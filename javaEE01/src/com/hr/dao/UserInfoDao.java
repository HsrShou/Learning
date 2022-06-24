package com.hr.dao;

import com.hr.entity.UserInfo;

public interface UserInfoDao {
	public UserInfo check(String userName, String password);

	int addUserInfo(String userName, String password);
}
