/**
 * 
 */
package org.sjtu.monday.user.model;

/**
 * Project Name: Mondaisy
 * Class Name:User.java
 * Created on: Sep 15, 2014, 5:22:44 PM
 * @author: Monday
 * @version 1.0
 * @since JDK_1.7
 */
/**
 * @author Monday
 *
 *         Sep 15, 2014
 */
public class User {

	private int userId;
	private String userName;
	private String password;

	/**
	 * 
	 */
	public User() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param userName
	 * @param password
	 */
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
