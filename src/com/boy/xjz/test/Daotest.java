package com.boy.xjz.test;

import org.junit.Test;

import com.boy.dao.impl.IDaoImpl;
import com.boy.dao.impl.NewsDao;
import com.boy.models.Category;

public class Daotest {
	@Test
	public void insertCategory(){
		Category cat = new Category();
		cat.setTopid(1);
		cat.setCname("”È¿÷◊ —∂");
		IDaoImpl.getInstance().save(cat);
	}
	@Test 
	public void findCategoryByCid(){
		Category category = IDaoImpl.getInstance().oneByHql("from Category c where c.cid=2");
	}
	@Test
	public void newCount(){
		NewsDao nd = new NewsDao();
		
	}
}
