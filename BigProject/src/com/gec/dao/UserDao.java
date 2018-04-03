package com.gec.dao;

import java.util.List;

import com.gec.entiy.User;

public interface UserDao {

	public boolean add(User u);
	public boolean delete(int sno);
	public boolean update(User u);
	public List<User> select();
}
