package com.gec.entiy;

public class Users {

	private int uid;
	private String uname;
	private String upwd;
	private int tid;
	private int oid;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int uid, String uname, String upwd, int tid, int oid) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.tid = tid;
		this.oid = oid;
	}
	
}
