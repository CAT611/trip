package com.gec.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gec.dao.BaseDao;
import com.gec.dao.GrouponDao;
import com.gec.entiy.Groupon;

public class GrouponDaoImpl extends BaseDao implements GrouponDao {
	ResultSet res=null;
	Connection conn=null;
	PreparedStatement stmt=null;
	String sql="";
	@Override
	public Groupon SelectByName(String gname) {
		sql="select * from groupon where gname=?";
		conn=super.getConnection();
		Groupon group=new Groupon();
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setString(1, gname);
			res=stmt.executeQuery();
			while(res.next()){
				group.setGid(res.getInt(1));
				group.setGname(res.getString(2));
				group.setOldPrice(res.getInt(3));
				group.setGprice(res.getInt(4));
				group.setGintro(res.getString(5));
				group.setGday(res.getInt(6));
				group.setGphoto(res.getString(7));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeAll(conn, res, stmt);
		}
		return group;
	}

}
