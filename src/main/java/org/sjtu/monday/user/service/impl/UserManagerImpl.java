/**
 * 
 */
package org.sjtu.monday.user.service.impl;

import java.util.List;

import org.sjtu.monday.user.dao.UserDao;
import org.sjtu.monday.user.model.User;
import org.sjtu.monday.user.service.UserManager;

/**
 * Project Name: Mondaisy
 * Class Name:UserManagerImpl.java
 * Created on: Sep 17, 2014, 4:44:29 PM
 * @author: Monday
 * @version 1.0
 * @since JDK_1.7
 */
/**
 * @author Monday
 *
 *         Sep 17, 2014
 */
public class UserManagerImpl implements UserManager {
	private UserDao userDao;

	/**
	 * @return the userDao
	 */
	public UserDao getUserDao() {
		return userDao;
	}

	/**
	 * @param userDao
	 *            the userDao to set
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * 
	 */
	public UserManagerImpl() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sjtu.monday.user.service.UserManager#login(org.sjtu.monday.user.model
	 * .User)
	 */
	@Override
	public boolean login(User user) {
		return userDao.login(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sjtu.monday.user.service.UserManager#getUserList()
	 */
	@Override
	public List<User> getUserList() {
		return userDao.getUserList();
	}

}
