package com.boy.dao.impl;

import java.util.List;

import com.boy.models.Category;

public class CategoryDao {

	public List<Category> findCategoryByTopId(Integer topid) {
		String hql = "from Category c where c.topid="+topid;
		return IDaoImpl.getInstance().listByHql(hql);
	}

	public void insertInTo(Category category) {
		IDaoImpl.getInstance().save(category);
	}

	public Category findCategoryByCid(Integer cid) {
		String hql = "from Category c where c.cid="+cid;
		return IDaoImpl.getInstance().oneByHql(hql);
	}

	public void updateCategory(Category category) {
		IDaoImpl.getInstance().update(category);
	}

	public void deleteCategoryByCid(Integer cid) {
		String hql ="delete from Category c where c.cid="+cid;
		IDaoImpl.getInstance().deleteByHql(hql);
	}

	public String selectName(int topid) {
		
		return IDaoImpl.getInstance().oneByHql("select c.cname from Category c where c.cid="+topid);
	}

}
