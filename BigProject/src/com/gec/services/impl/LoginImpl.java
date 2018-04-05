package com.gec.services.impl;

import com.gec.dao.UsersDao;
import com.gec.dao.impl.UsersDaoImpl;
import com.gec.services.Login;

public class LoginImpl implements Login {

	@Override
	public boolean login(String uname, String upwd) {
		// TODO Auto-generated method stub
		UsersDao ud=new UsersDaoImpl();
		return ud.login(uname, upwd);
	}

}
