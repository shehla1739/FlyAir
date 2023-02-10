package com.ksk.service;


import com.ksk.dao.UserDao;
import com.ksk.dao.UserDaoImpl;
import com.ksk.entities.User;

public class UserServiceImpl implements UserService{
	UserDao userDao=new UserDaoImpl();
	
	public void insert(User user) {
		userDao.insert(user);
		
	}

	public User get(String username, String password) {
		return userDao.get(username, password);
	}

	public void updatePassword(String username, String password, String newPassword) {
		User user = userDao.get(username, password);
		user.setPassword(newPassword);
		userDao.update(user);	
		
	}

}
