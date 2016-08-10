package com.boy.dao.impl;

import java.util.List;

import com.boy.models.Manager;

public class ManagerDao {

	public List<Manager> managerList() {
		return IDaoImpl.getInstance().listByHql("from Manager order by aid");
	}

	public Manager login(String account, String password) {
		String hql= "from Manager m where m.account='"+account+"' and m.password='"+password+"'";
		return IDaoImpl.getInstance().oneByHql(hql);
	}

	public void update(Manager manager) {
		IDaoImpl.getInstance().update(manager);
	}

	public void save(Manager manager) {
		IDaoImpl.getInstance().save(manager);
	}

	public Manager findManagerById(Integer aid) {
		return IDaoImpl.getInstance().oneByHql("from Manager m where m.aid="+aid);
	}

	public void delete(Manager manager) {
		IDaoImpl.getInstance().delete(manager);
	}

}
