package com.study.action;

import com.study.dao.LoginDAO;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	public String username;
	public String password;
	private String result;

	public String execute() {
		result = ERROR;
		LoginDAO dao = new LoginDAO();

		if (dao.isExist(username, password)) {
			result = SUCCESS;
		}
		return result;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
