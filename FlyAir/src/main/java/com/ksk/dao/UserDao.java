package com.ksk.dao;

import com.ksk.entities.User;

public interface UserDao {
	public void insert(User user);
	public User get(String username,String password);
	public void update(User user);
}
