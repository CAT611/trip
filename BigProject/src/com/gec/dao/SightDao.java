package com.gec.dao;

import java.util.List;

import com.gec.entiy.Sight;

public interface SightDao {
	//���β�Ʒ���࣬�����Σ������Σ������Σ��Լ��Σ�ͨ������ID��ѯǰ����
	public List<Sight> top6(int tid);
	//�����η��࣬һ���Σ������Σ������Σ���ͨ������ID��ѯǰ�˸�
	public List<Sight> top8(int tid);
	//���ݾ������Ʋ�ѯ�������ϸ��Ϣ
	public Sight selectInfo(String sname);
}
