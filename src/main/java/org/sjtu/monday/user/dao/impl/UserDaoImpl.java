/**
 * 
 */
package org.sjtu.monday.user.dao.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.sjtu.monday.user.dao.UserDao;
import org.sjtu.monday.user.model.User;

/**
 * Project Name: Mondaisy
 * Class Name:UserDaoImpl.java
 * Created on: Sep 16, 2014, 8:30:26 PM
 * @author: Monday
 * @version 1.0
 * @since JDK_1.7
 */
/**
 * @author Monday
 *
 *         Sep 16, 2014
 */
public class UserDaoImpl implements UserDao {
	protected final static Logger logger = LogManager
			.getLogger(UserDaoImpl.class.getName());

	// Session factory injected by spring context
	private SessionFactory sessionFactory;

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory
	 *            the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sjtu.monday.user.dao.UserDao#addUser(org.sjtu.monday.user.model.User)
	 */
	@Override
	public void addUser(User user) {
		this.sessionFactory.getCurrentSession().save(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sjtu.monday.user.dao.UserDao#login(org.sjtu.monday.user.model.User)
	 */
	@Override
	public boolean login(User user) {
		List<User> userList = this.getUserList();
		for (User existingUser : userList) {
			logger.info("Existing: "+ user.toString());
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sjtu.monday.user.dao.UserDao#getUserList()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUserList() {
		return this.sessionFactory.getCurrentSession().createQuery("from user")
				.list();
	}

}
