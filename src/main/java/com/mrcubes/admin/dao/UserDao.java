package com.mrcubes.admin.dao;

import java.util.List;

public interface UserDao {

	public void AddUser();
	public String getUsersById(int userId);
	public List listUsers(); 
	public void updateUser(); 
	
	
}
