package com.gec.dao;

import com.gec.entiy.Users;

public interface UsersDao {
	public boolean login(int uid,String upwd);
	public Users selectInfo(int uid);
	public boolean addUsers(Users user);
	//��ȡ��һ������ID
	public int nextId();
}
