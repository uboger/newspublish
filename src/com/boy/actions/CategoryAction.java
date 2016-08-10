package com.boy.actions;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.boy.dao.impl.CategoryDao;
import com.boy.models.Category;
import com.opensymphony.xwork2.ActionSupport;

public class CategoryAction extends ActionSupport {
	private Category category;
	private CategoryDao cd = new CategoryDao();
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String execute() throws Exception {
		List<Category> catlist = cd.findCategoryByTopId(category.getTopid());
		ServletActionContext.getRequest().setAttribute("catlist", catlist);
		return SUCCESS;
	}
	public String categoryInsert(){
		return "insert";
	}
	public String categorySave(){
		cd.insertInTo(category);
		return "redirect";
	}
	public String categoryInput(){
		this.category=cd.findCategoryByCid(category.getCid());
		return "updateInput";
	}
	
	public String categoryUpdate(){
		cd.updateCategory(category);
		return "update";
	}
	public String categoryDelete(){
		cd.deleteCategoryByCid(category.getCid());
		return "delete";
	}
}
