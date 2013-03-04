package br.com.ideais.estagio.dao;

import java.util.List;

public interface AbstractDao<T> {
	
	public void persist(T t);
	
	public List<T> list();
	
	public T findById(Long id);
	
	public boolean delete(T t);

	public boolean saveOrUpdate(T user);
}
