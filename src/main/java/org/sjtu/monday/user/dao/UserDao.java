/**
 * 
 */
package org.sjtu.monday.user.dao;

import java.util.List;

import org.sjtu.monday.user.model.User;

/**
 * Project Name: Mondaisy
 * Class Name:UserDao.java
 * Created on: Sep 16, 2014, 8:23:58 PM
 * @author: Monday
 * @version 1.0
 * @since JDK_1.7
 */
/**
 * @author Monday
 *
 *         Sep 16, 2014
 */
public interface UserDao {

	/**
	 * 
	 * @param user
	 */
	void addUser(User user);

	/**
	 * 
	 * @param user
	 * @return
	 */
	boolean login(User user);

	/**
	 * 
	 * @return
	 */
	public List<User> getUserList();

}
