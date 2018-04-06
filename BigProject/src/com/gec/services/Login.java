package com.gec.services;

import com.gec.entiy.Users;

public interface Login {
	public boolean login(String uname,String upwd);
	public boolean register(Users user);
}
