package org.sjtu.monday.user.controller;

import java.util.List;

import org.sjtu.monday.user.model.User;
import org.sjtu.monday.user.service.UserManager;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

/**
 * Project Name: Mondaisy Class Name: LoginAction.java Created on: Sep 13, 2014,
 * 9:16:14 PM
 * 
 * @author: Monday
 * @version 1.0
 * @since JDK_1.7
 */
public class LoginAction extends ActionSupport implements Preparable {

	private User user;
	private List<User> userList;
	private UserManager userManager;

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the userManager
	 */
	public UserManager getUserManager() {
		return userManager;
	}

	/**
	 * @param userManager
	 *            the userManager to set
	 */
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	/**
	 * @return the userList
	 */
	public List<User> getUserList() {
		return userList;
	}

	/**
	 * @param userList
	 *            the userList to set
	 */
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	// all struts logic here
	public String execute() {
		if (userManager.login(user))
			return "SUCCESS";
		else
			return "FAILD";
	}

	/*
	 * (non-Javadoc) This method will be called before any of Action method is
	 * invoked; So some pre-processing if required.
	 * 
	 * @see com.opensymphony.xwork2.Preparable#prepare()
	 */
	@Override
	public void prepare() throws Exception {
		userList = null;
	}
}
