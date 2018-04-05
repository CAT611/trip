package com.gec.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gec.dao.BaseDao;
import com.gec.dao.UsersDao;

public class UsersDaoImpl extends BaseDao implements UsersDao {
	ResultSet res=null;
	PreparedStatement stmt=null;
	String sql="";
	@Override
	public boolean login(String uname, String upwd) {
		Connection conn = null;
		boolean flag=false;
		sql = "select  * from big where uname=? and upwd=?";
		conn=super.getConnection();
		try {
			stmt=conn.prepareStatement(sql);
			res=stmt.executeQuery();
			if(res.next()){
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeAll(conn, res, stmt);
		}
		return flag;
	}

}
