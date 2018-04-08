package com.gec.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gec.dao.BaseDao;
import com.gec.dao.UsersDao;
import com.gec.entiy.Users;

public class UsersDaoImpl extends BaseDao implements UsersDao {
	ResultSet res=null;
	PreparedStatement stmt=null;
	String sql="";
	@Override//��¼��֤
	public boolean login(int  uid, String upwd) {
		Connection conn = null;
		boolean flag=false;
		sql = "select  * from users where uid=? and upwd=?";
		conn=super.getConnection();
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setInt(1, uid);
			stmt.setString(2, upwd);
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
	@Override//ע����֤
	public boolean addUsers(Users user) {
		Connection conn=null;
		boolean flag=false;
		sql="insert users (uname,upwd,ucard,uphone,usex,tid) values (?,?,?,?,?,1)";
		conn=super.getConnection();
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setString(1, user.getUname());
			stmt.setString(2, user.getUpwd());
			stmt.setString(3, user.getUcard());
			stmt.setString(4, user.getUphone());
			stmt.setString(5, user.getUsex());
			int a=stmt.executeUpdate();
			if(a>0){
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
	@Override
	public int nextId() {
		Connection conn=null;
		int uid=0;
		sql="SELECT Auto_increment FROM information_schema . `TABLES` WHERE Table_Schema='big' AND table_name = 'users' limit 1;";
		conn=super.getConnection();
		try {
			stmt=conn.prepareStatement(sql);
			res=stmt.executeQuery();
			if(res.next()){
				uid=res.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeAll(conn, res, stmt);
		}
		return uid;
	}

}
