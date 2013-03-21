package br.com.ideais.estagio.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

public abstract class AbstractDao<T> {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void persist(T t) {
		hibernateTemplate.persist(t);
	}

	public List<T> list() {
		return hibernateTemplate.loadAll(getPersistentClass());
	}

	public boolean delete(T t) {
		try{
			hibernateTemplate.delete(t);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	public boolean saveOrUpdate(T t) {
		try{
			hibernateTemplate.saveOrUpdate(t);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	public boolean update(T t) {
		try{
			hibernateTemplate.update(t);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	public T findById(Long id) {
		return hibernateTemplate.get(getPersistentClass(), id);
	}
	
	@SuppressWarnings("unchecked")
	public Class<T> getPersistentClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
}
