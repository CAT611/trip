package com.gec.services.impl;

import java.util.List;

import com.gec.dao.SightDao;
import com.gec.dao.impl.SightDaoImpl;
import com.gec.entiy.Sight;
import com.gec.services.SightProduct;

public class SightProductImpl implements SightProduct {

	@Override
	public List<Sight> Top6Product(int tid) {
		SightDao sd=new SightDaoImpl();
		return sd.top6(tid);
	}

	@Override
	public List<Sight> Top8Product(int tid) {
		SightDao sd=new SightDaoImpl();
		return sd.top8(tid);
	}

}
