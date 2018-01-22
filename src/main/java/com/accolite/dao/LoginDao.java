package com.accolite.dao;

import com.accolite.model.User;

public interface LoginDao {
	void registerUser(User user);
	
	User validateDetails(User user);
}
