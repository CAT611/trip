package com.gec.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gec.dao.BaseDao;
import com.gec.dao.UserDao;
import com.gec.entiy.User;

public class UserDaoImpl extends BaseDao implements UserDao{
	
	ResultSet res=null;
	PreparedStatement stmt=null;
	String sql="";
	@Override
	public boolean add(User u) {
		Connection conn=null;
		boolean flag=false;
		sql="insert stu (name,password) values (?,?)";
		conn=super.getConnection();
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setString(1, u.getName());
			stmt.setString(2,u.getPassword());
			int a=stmt.executeUpdate();
			if(a>0){
				flag=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			closeAll(conn, res, stmt);
		}
		return flag;
	}

	@Override
	public boolean delete(int sno) {
		boolean flag=false;
		Connection conn=null;
		sql="delete  from stu where sno=?";
		conn=super.getConnection();
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setInt(1, sno);
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
		// TODO Auto-generated method stub
		return flag;
	}

	@Override
	public boolean update(User u) {
		boolean flag=false;
		Connection conn=null;
		sql="update stu set name=?,password=? where sno=?";
		conn=super.getConnection();
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setString(1, u.getName());
			stmt.setString(2,u.getPassword());
			stmt.setInt(3, u.getSno());
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
	public List<User> select() {
		Connection conn = null;
		sql = "select  * from stu";
		List<User> list =new ArrayList<User>();
		conn=super.getConnection();
		try {
			stmt=conn.prepareStatement(sql);
			res=stmt.executeQuery();
			while(res.next()){
				User u=new User();
				u.setSno(res.getInt(1));
				u.setName(res.getString(2));
				u.setPassword(res.getString(3));
				list.add(u);
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
