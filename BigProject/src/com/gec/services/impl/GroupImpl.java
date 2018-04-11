package com.gec.services.impl;

import com.gec.dao.GrouponDao;
import com.gec.dao.SightDao;
import com.gec.dao.impl.GrouponDaoImpl;
import com.gec.dao.impl.SightDaoImpl;
import com.gec.entiy.Groupon;
import com.gec.entiy.Sight;
import com.gec.services.Group;

public class GroupImpl implements Group {

	@Override
	public Groupon selectDetails(String gname) {
		GrouponDao go=new GrouponDaoImpl();
		return go.SelectByName(gname);
	}
}