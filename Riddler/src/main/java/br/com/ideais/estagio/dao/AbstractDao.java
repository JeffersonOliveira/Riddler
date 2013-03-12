package br.com.ideais.estagio.dao;

import java.util.List;

/*
 * TODO dica do tio JayFer: Criem uma implementa��o abstrata desta interface
 * de forma que voc�s n�o precisem injetar dependencias comuns em todos os daos.
 * 
 * Se o framework permitir, n�o precisam nem ter esta interface, tenham apenas
 * a tal classe abstrata.
 */
public interface AbstractDao<T> {
	
	public void persist(T t);
	
	public List<T> list();
	
	public T findById(Long id);
	
	public boolean delete(T t);

	public boolean saveOrUpdate(T user);
}
