package com.niit.shop.dao;

import com.niit.shop.model.User;

public interface Userdao {
	
	public boolean insert(User user);
	public boolean update(User user);
	public User getUser(int id);
	public User login(String username,String password);
	
	

}
