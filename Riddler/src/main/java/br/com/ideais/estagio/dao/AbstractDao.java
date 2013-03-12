package br.com.ideais.estagio.dao;

import java.util.List;

/*
 * TODO dica do tio JayFer: Criem uma implementação abstrata desta interface
 * de forma que vocês não precisem injetar dependencias comuns em todos os daos.
 * 
 * Se o framework permitir, não precisam nem ter esta interface, tenham apenas
 * a tal classe abstrata.
 */
public interface AbstractDao<T> {
	
	public void persist(T t);
	
	public List<T> list();
	
	public T findById(Long id);
	
	public boolean delete(T t);

	public boolean saveOrUpdate(T user);
}
