package com.dao;

import com.pojo.User;

public interface UserDao {
	boolean register(User user);
	String login(String uname, String pass);
	boolean changepassword(String uname, String pass);

}
