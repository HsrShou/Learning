package com.hr.service;

import com.hr.entity.UserInfo;

public interface UserInfoService {
	public UserInfo check(String userName, String password);

	int addUserInfo(String userName, String password);
}
