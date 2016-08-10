package com.boy.dao.impl;

import java.util.List;

import com.boy.models.Hotnews;

public class HotnewsDao {

	public List<Hotnews> hotListByTopid(int i) {
		return IDaoImpl.getInstance().listByHql("from Hotnews h where sign="+i);
	}

}
