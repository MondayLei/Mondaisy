/**
 * 
 */
package org.sjtu.monday.user.service;

import java.util.List;

import org.sjtu.monday.user.model.User;

/**
 * Project Name: Mondaisy
 * Class Name:UserManager.java
 * Created on: Sep 17, 2014, 3:16:14 PM
 * @author: Monday
 * @version 1.0
 * @since JDK_1.7
 */
/**
 * @author Monday
 *
 *         Sep 17, 2014
 */
public interface UserManager {

	/**
	 * 
	 * @param user
	 * @return
	 */
	public boolean login(User user);

	/**
	 * 
	 * @return
	 */
	public List<User> getUserList();
}
