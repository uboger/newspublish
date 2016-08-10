package com.boy.xjz.test;

import org.junit.Test;

import com.boy.dao.impl.ManagerDao;
import com.boy.models.Manager;

public class MangerDaoTest {
	@Test
	public void loginTest(){
		ManagerDao dao = new ManagerDao();
		Manager m = dao.login("Admin", "123");
	}
}
