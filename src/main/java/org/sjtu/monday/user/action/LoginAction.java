package org.sjtu.monday.user.action;
/**
 * Project Name: Mondaisy
 * Class Name: LoginAction.java
 * Created on: Sep 13, 2014, 9:16:14 PM
 * @author: Monday
 * @version 1.0
 * @since JDK_1.7
 */
public class LoginAction {
	private String username;
	 
	public String getUsername() {
		return username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}
 
	// all struts logic here
	public String execute() {
 
		return "SUCCESS";
 
	}
}
