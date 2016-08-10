package com.boy.actions;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.boy.dao.impl.CategoryDao;
import com.boy.dao.impl.NewsDao;
import com.boy.dao.tools.Page;
import com.boy.models.Category;
import com.boy.models.News;
import com.opensymphony.xwork2.ActionSupport;

public class NewsAction extends ActionSupport {
	private News news;//���Ŷ���
	private NewsDao nd = new NewsDao();
	private CategoryDao cd = new CategoryDao();
	private String sign="";
	private String categoryName;//�����������
	private int topid;//���ID
	private int cid;//���ID
	private Page page = new Page();
	@Override
	public String execute() throws Exception {
		this.page = nd.getPage(topid,page.getNo());
		categoryName=cd.selectName(topid);
		ServletActionContext.getRequest().getSession().setAttribute("topid", topid);
		ServletActionContext.getRequest().getSession().setAttribute("categoryName", categoryName);
		return "main";
	}
	public String newsInfor(){
		this.news = nd.findNewsById(news.getNid());
		return "infor";
	}
	public String newsInput(){
		HttpSession session = ServletActionContext.getRequest().getSession();
		List<Category> categorys = (List<Category>) session.getAttribute("categorys");
		if(categorys==null){
			categorys = cd.findCategoryByTopId(topid);
			session.setAttribute("categorys", categorys);
		}
		return "input";
	}
	
	public String newsSave(){
		news.setCategory(cd.findCategoryByCid(cid));
		news.setCreatetime(new Date());
		nd.save(news);
		return "save";
	}
	
	public String newsEdit(){
		this.news = nd.findNewsById(news.getNid());
		HttpSession session = ServletActionContext.getRequest().getSession();
		List<Category> categorys = (List<Category>) session.getAttribute("categorys");
		if(categorys==null){
			categorys = cd.findCategoryByTopId(topid);
			session.setAttribute("categorys", categorys);
		}
		return "edit";
	}
	
	public String newsUpdate(){
		
		news.setCategory(cd.findCategoryByCid(cid));
		news.setCreatetime(new Date());
		nd.update(news);
		return "update";
	}
	public String newsDelete(){
		nd.delete(nd.findNewsById(news.getNid()));
		return "delete";
	}
	///==========================================
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public News getNews() {
		return news;
	}
	public void setNews(News news) {
		this.news = news;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public int getTopid() {
		return topid;
	}
	public void setTopid(int topid) {
		this.topid = topid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}

}
