package com.boy.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.boy.dao.IDao;
import com.boy.dao.tools.HibernateUtils;
import com.boy.exception.DaoException;

public class IDaoImpl extends HibernateUtils implements IDao{

	@Override
	public <T> void save(T obj) {
		Session session = null;
		Transaction transaction = null;
		try{
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			session.save(obj);
			
			transaction.commit();
		}catch(Exception e){
			
		}finally{
			session.close();
		}
	}

	@Override
	public <T> void delete(T obj) {
		Session session = null;
		Transaction transaction = null;
		try{
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			session.delete(obj);
			
			transaction.commit();
		}catch(Exception e){
			
		}finally{
			session.close();
		}
	}

	@Override
	public <T> void update(T obj) {
		Session session = null;
		Transaction transaction = null;
		try{
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			session.update(obj);
			
			transaction.commit();
		}catch(Exception e){
			
		}finally{
			session.close();
		}
	}

	@Override
	public <T> List<T> listByHql(String hql) {
		Session session = null;
		List<T> results=null;
		try{
			session = sessionFactory.openSession();
			results = session.createQuery(hql).list();
		}catch(Exception e){
			throw new DaoException();
		}finally{
			session.close();
		}
		return results;
	}

	@Override
	public <T> T oneByHql(String hql) {
		Session session = null;
		T result =null ;
		try{
			session = sessionFactory.openSession();
			result = (T) session.createQuery(hql).uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
			throw new DaoException();
		}finally{
			session.close();
		}
		return result;
	}

	@Override
	public <T> List<T> listBySessionGet(Class<T> clazz) {
		Session session = null;
		List<T> results = null;
		try{
			session = sessionFactory.openSession();
			String hql = "from"+clazz.getName();
			results = listByHql(hql);
		}catch(Exception e){
			throw new DaoException();
		}finally{
			session.close();
		}
		return results;
	}

	@Override
	public <T> T oneBySessionGet(Class<T> clazz, Serializable id) {
		Session session = null;
		T result = null;
		try{
			session = sessionFactory.openSession();
			result = (T) session.get(clazz, id);
		}catch(Exception e){
			throw new DaoException();
		}finally{
			session.close();
		}
		return result;
	}

	public static IDaoImpl getInstance() {
		return new IDaoImpl();
	}
	@Override
	public void deleteByHql(String hql) {
		Session session = null;
		Transaction transaction = null;
		try{
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			Query q = session.createQuery(hql);
			q.executeUpdate();
			
			transaction.commit();
		}catch(Exception e){
			
		}finally{
			session.close();
		}
	}

	public Session getSession() {
		return sessionFactory.openSession();
	}

}
