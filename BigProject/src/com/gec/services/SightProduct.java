package com.gec.services;

import java.util.List;

import com.gec.entiy.Sight;

public interface SightProduct {
	//旅游产品分类四种类型
	public List<Sight> Top6Product(int tid);
	//旅游产品几日游
	public List<Sight> Top8Product(int tid);
	//旅游产品详细信息
	public Sight sightInfo(String sname);
}
