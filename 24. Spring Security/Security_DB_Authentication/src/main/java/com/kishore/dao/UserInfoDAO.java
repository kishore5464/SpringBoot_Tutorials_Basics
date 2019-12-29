package com.kishore.dao;

import com.kishore.entities.UserInfo;

public interface UserInfoDAO {

	public abstract UserInfo getActiveUser(String userName);
}