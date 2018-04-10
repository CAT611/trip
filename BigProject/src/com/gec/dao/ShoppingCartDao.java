package com.gec.dao;

import java.util.List;

import com.gec.entiy.ShoppingCart;

public interface ShoppingCartDao {
	public void insertCart( String cname, int cprice, String cintro);
	public void deleteCart();
	public List<ShoppingCart> selectAll(int pageNow);
	public int selectCount();
}
