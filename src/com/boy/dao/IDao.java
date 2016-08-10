package com.boy.dao;

import java.io.Serializable;
import java.util.List;

public interface IDao {
	/**
	 * 通用dao接口
	 */
	/**
	 * 保存对象
	 * @param obj
	 */
	<T> void save(T obj);
	/**
	 * 删除对象
	 * @param obj
	 */
	<T> void delete(T obj);
	/**
	 * 更新对象
	 * @param obj
	 */
	<T> void update(T obj);
	/**
	 * 根据hql查询返回list
	 * @return
	 */
	<T> List<T> listByHql(String hql);
	/**
	 * 根据HQL查询返回一个对象
	 * @param hql
	 * @return
	 */
	<T> T oneByHql(String hql);
	/**
	 * 根据持久化类得到所有对象
	 * @param clazz
	 * @return
	 */
	<T> List<T> listBySessionGet(Class<T> clazz);
	/**
	 * 根据持久化类和id得到所一个对象
	 * @param clazz
	 * @param id
	 * @return
	 */
	<T> T oneBySessionGet(Class<T> clazz,Serializable id);
	/**
	 * use hql remove a Object
	 * @param hql
	 */
	void deleteByHql(String hql);
}
