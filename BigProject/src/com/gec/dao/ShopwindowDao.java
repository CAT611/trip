package com.gec.dao;

import java.util.List;

import com.gec.entiy.Shopwindow;

public interface ShopwindowDao {
     //��ȡ����ͼƬ��ַ
	 public List<Shopwindow> getShop(int a);
	 public List<String> getShops();
}
