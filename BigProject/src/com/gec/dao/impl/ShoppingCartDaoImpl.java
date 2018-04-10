package com.gec.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gec.dao.BaseDao;
import com.gec.dao.ShoppingCartDao;
import com.gec.entiy.ShoppingCart;

public class ShoppingCartDaoImpl extends BaseDao implements ShoppingCartDao {
	ResultSet res=null;
	Connection conn=null;
	PreparedStatement stmt=null;
	String sql="";
	@Override
	public void insertCart(String cname, int cprice, String cintro) {
		sql="insert into shoppingcart (cname,cprice,cintro) values(?,?,?)";
		conn=super.getConnection();
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setString(1, cname);
			stmt.setInt(2, cprice);
			stmt.setString(3, cintro);
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeAll(conn, res, stmt);
		}
	}

	@Override
	public void deleteCart() {
		sql="delete * from shoppingcart";
		conn=super.getConnection();
		try {
			stmt=conn.prepareStatement(sql);
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeAll(conn, res, stmt);
		}
	}

	@Override
	public List<ShoppingCart> selectAll(int pageNow) {
		// TODO Auto-generated method stub
		List<ShoppingCart> list = new ArrayList<ShoppingCart>();
		sql="select * from ShoppingCart order by cid limit (?-1)*3,3*?";
		conn=super.getConnection();
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setInt(1, pageNow);
			stmt.setInt(2, pageNow);
			res=stmt.executeQuery();
			while(res.next()){
				ShoppingCart shop = new ShoppingCart();
				shop.setCid(res.getInt(1));
				shop.setCintro(res.getString(4));
				shop.setCname(res.getString(2));
				shop.setCprice(res.getInt(3));
				list.add(shop);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeAll(conn, res, stmt);
		}
		return list;
	}

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		int count=0;
		sql="select count(*) from ShoppingCart";
		conn=super.getConnection();
		try {
			stmt=conn.prepareStatement(sql);
			res=stmt.executeQuery();
			while(res.next()){
				count=res.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeAll(conn, res, stmt);
		}
		return count;
	}

}
