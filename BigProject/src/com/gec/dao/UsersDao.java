package com.gec.dao;

import com.gec.entiy.Users;

public interface UsersDao {
	public boolean login(int uid,String upwd);
	public boolean addUsers(Users user);
}
