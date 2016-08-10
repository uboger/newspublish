package com.boy.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.boy.dao.tools.Page;
import com.boy.models.News;

public class NewsDao {
	/**
	 * ��ҳ��ѯ
	 * @param topid
	 * @return
	 */
	public Page getPage(int topid,int no) {
		List<News> results = null;
		//�õ�����������ŵ��ܼ�¼
		int recors = getRecordcount(topid);
		//��ʼ��page���� 
		Page page  =new Page(recors,no);
		//��ҳ��ѯ�����浽page������
		String hql = "from News n where n.category.topid="+topid+" order by createtime desc";
		Session session = IDaoImpl.getInstance().getSession();
		Query q = session.createQuery(hql);
		q.setFirstResult((page.getNo()-1)*page.getSize());//�Ӷ���ҳ��ʼ��ѯ
		q.setMaxResults(page.getSize());//һҳҪ��ʾ������
		results = q.list();
		session.close();
		page.setResults(results);
		return page;
	}
	/**
	 * ��ȡ��¼������
	 * @param topid
	 * @return
	 */
	private int getRecordcount(int topid) {
		String hql = "select count(n.nid) from News n where n.category.topid="+topid;
		Long record = IDaoImpl.getInstance().oneByHql(hql);
		return record.intValue();
	}
	public News findNewsById(Integer nid) {
		String hql = "from News where nid="+nid;
		return IDaoImpl.getInstance().oneByHql(hql);
	}
	public void save(News news) {
		IDaoImpl.getInstance().save(news);
	}
	public void update(News news) {
		IDaoImpl.getInstance().update(news);
	}
	public void delete(News news) {
		IDaoImpl.getInstance().delete(news);
	}
	public List<News> newsListByCategoryId(int i) {
		String hql = "from News n where n.category.cid="+i;
		return IDaoImpl.getInstance().listByHql(hql);
	}
	
}
