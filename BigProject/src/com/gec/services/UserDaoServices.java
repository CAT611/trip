package com.gec.services;

import java.util.List;

import com.gec.entiy.User;

public interface UserDaoServices {
	
	public boolean add(User u);
	public boolean delete(int sno);
	public boolean update(User u);
	public List<User> select();
}
