package com.ksk.service;

import com.ksk.entities.User;

public interface UserService {
	void insert(User user);
	User get(String username, String password);
	void updatePassword(String username,String password,String newPassword);
}
