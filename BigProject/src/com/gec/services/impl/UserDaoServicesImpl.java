package com.gec.services.impl;

import java.util.List;

import com.gec.dao.UserDao;
import com.gec.dao.impl.UserDaoImpl;
import com.gec.entiy.User;
import com.gec.services.UserDaoServices;

public class UserDaoServicesImpl implements UserDaoServices{
	
	UserDao uc=new UserDaoImpl();
	@Override
	public boolean add(User u) {
		// TODO Auto-generated method stub
		return uc.add(u);
	}

	@Override
	public boolean delete(int sno) {
		// TODO Auto-generated method stub
		return uc.delete(sno);
	}

	@Override
	public boolean update(User u) {
		// TODO Auto-generated method stub
		return uc.update(u);
	}

	@Override
	public List<User> select() {
		// TODO Auto-generated method stub
		return uc.select();
	}
	
}
