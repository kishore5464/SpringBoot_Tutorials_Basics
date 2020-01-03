package com.kishore.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kishore.dao.UserInfoDAO;
import com.kishore.entities.UserInfo;

@Repository
@Transactional
public class UserInfoDAOImpl implements UserInfoDAO {

	@Autowired
	private EntityManager entityManager;

	public UserInfo getActiveUser(String userName) {
		UserInfo userInfo = new UserInfo();
		short ENABLED = 1;
		List<?> list = entityManager.createQuery("SELECT u FROM UserInfo u WHERE userName=? and enabled=?")
				.setParameter(1, userName).setParameter(2, ENABLED).getResultList();
		if (!list.isEmpty()) {
			userInfo = (UserInfo) list.get(0);
		}
		return userInfo;
	}
}