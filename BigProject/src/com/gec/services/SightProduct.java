package com.gec.services;

import java.util.List;

import com.gec.entiy.Sight;

public interface SightProduct {
	//���β�Ʒ������������
	public List<Sight> Top6Product(int tid);
	//���β�Ʒ������
	public List<Sight> Top8Product(int tid);
	//���β�Ʒ��ϸ��Ϣ
	public Sight sightInfo(String sname);
}
