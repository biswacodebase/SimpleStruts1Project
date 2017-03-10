package com.simplecodeexamples.struts.service;

import com.simplecodeexamples.struts.dao.UserDaoImpl;
import com.simplecodeexamples.struts.dto.UserObject;

public class UserServiceImpl {
	
	private UserDaoImpl userDaoImpl;
	
	public UserServiceImpl() {
		userDaoImpl=new UserDaoImpl();
	}

	public void createUser(UserObject userObject) {
		try {
			userDaoImpl.insertUser(userObject);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public UserObject getUser(UserObject userObject) {
		try {
			
			return userDaoImpl.selectUser(userObject);
			  
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
