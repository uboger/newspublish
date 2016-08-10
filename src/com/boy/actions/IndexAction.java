package com.boy.actions;

import java.util.List;

import com.boy.dao.impl.CategoryDao;
import com.boy.dao.impl.HotnewsDao;
import com.boy.dao.impl.NewsDao;
import com.boy.dao.tools.Page;
import com.boy.models.Hotnews;
import com.boy.models.News;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport{
	private NewsDao nd = new NewsDao();
	private CategoryDao cd = new CategoryDao();
	private HotnewsDao hd = new HotnewsDao();
	private List<News> news1;	
	private List<News> news2;	
	private List<News> news3;	
	private List<News> news4;	
	private List<News> news5;	
	private List<News> news6;
	private List<Hotnews> news7;
	private List<Hotnews> news8;
	private List<News> cnews;
	private int cid;
	private int topid;
	private News news;
	private Hotnews hnews;
	private Page page;
	private List<News> all;
	//===================================
	@Override
	public String execute() throws Exception {
		news1=nd.newsListByCategoryId(1);
		news2=nd.newsListByCategoryId(2);
		news3=nd.newsListByCategoryId(3);
		news4=nd.newsListByCategoryId(4);
		news5=nd.newsListByCategoryId(5);
		news6=nd.newsListByCategoryId(6);
		news7=hd.hotListByTopid(1);
		news7=hd.hotListByTopid(2);
		
		return "index";
	}
	
	//===================================
	public List<News> getNews1() {
		return news1;
	}
	
	public void setNews1(List<News> news1) {
		this.news1 = news1;
	}
	public List<News> getNews2() {
		return news2;
	}
	public void setNews2(List<News> news2) {
		this.news2 = news2;
	}
	public List<News> getNews3() {
		return news3;
	}
	public void setNews3(List<News> news3) {
		this.news3 = news3;
	}
	public List<News> getNews4() {
		return news4;
	}
	public void setNews4(List<News> news4) {
		this.news4 = news4;
	}
	public List<News> getNews5() {
		return news5;
	}
	public void setNews5(List<News> news5) {
		this.news5 = news5;
	}
	public List<News> getNews6() {
		return news6;
	}
	public void setNews6(List<News> news6) {
		this.news6 = news6;
	}
	public List<Hotnews> getNews7() {
		return news7;
	}
	public void setNews7(List<Hotnews> news7) {
		this.news7 = news7;
	}
	public List<Hotnews> getNews8() {
		return news8;
	}
	public void setNews8(List<Hotnews> news8) {
		this.news8 = news8;
	}
	public List<News> getCnews() {
		return cnews;
	}
	public void setCnews(List<News> cnews) {
		this.cnews = cnews;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getTopid() {
		return topid;
	}
	public void setTopid(int topid) {
		this.topid = topid;
	}
	public News getNews() {
		return news;
	}
	public void setNews(News news) {
		this.news = news;
	}
	public Hotnews getHnews() {
		return hnews;
	}
	public void setHnews(Hotnews hnews) {
		this.hnews = hnews;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public List<News> getAll() {
		return all;
	}
	public void setAll(List<News> all) {
		this.all = all;
	}
	
}
