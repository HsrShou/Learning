package com.hr.service;

import com.hr.entity.UserInfo;
/**
 * @author Han ShouRong
 * @date 2022/6/25 上午 7:15
 */
public interface UserInfoService {
	public UserInfo check(String userName, String password);

	int addUserInfo(String userName, String password);
}
