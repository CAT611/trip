package com.gec.dao;

import java.util.List;

import com.gec.entiy.Sight;

public interface SightDao {
	//旅游产品分类，境内游，境外游，海岛游，自驾游，通过类型ID查询前六个
	public List<Sight> top6(int tid);
	//几日游分类，一日游，两日游，多日游，，通过类型ID查询前八个
	public List<Sight> top8(int tid);
	//根据景点名称查询景点的详细信息
	public Sight selectInfo(String sname);
}
