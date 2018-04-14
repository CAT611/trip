package com.gec.services;

import java.util.List;

import com.gec.entiy.ShoppingCart;

public interface Cart {
	public void insert(String cname, int cprice, String cintro);
	public void delete();
	public void delete(int cid);
	public List<ShoppingCart> selectAll(int pageNow);
	public List<ShoppingCart> selectAll();
	public int selectCount();
	public int selectPrice(int cid);
}
