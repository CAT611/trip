package com.gec.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.gec.dao.BaseDao;
import com.gec.dao.SightDao;
import com.gec.entiy.Sight;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SightDaoImpl extends BaseDao implements SightDao {
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet res=null;
	String sql="";
	@Override
	public List<Sight> top6(int tid) {
		List<Sight> list =new ArrayList<Sight>();
		sql="SELECT * from sight where tid=? ORDER BY sid LIMIT 6 ";
		conn=super.getConnection();
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setInt(1,tid);
			res=stmt.executeQuery();
			while(res.next()){
				Sight s=new Sight();
				s.setSname(res.getString("sname"));
				list.add(s);
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
	public List<Sight> top8(int tid) {
		List<Sight> list =new ArrayList<Sight>();
		sql="SELECT * from sight where tid=? ORDER BY sid LIMIT 8 ";
		conn=super.getConnection();
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setInt(1,tid);
			res=stmt.executeQuery();
			while(res.next()){
				Sight s=new Sight();
				s.setSname(res.getString("sname"));
				list.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeAll(conn, res, stmt);
		}
		return list;
	}

}
