package br.com.ideais.estagio.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ideais.estagio.model.Feitos;

@Service
@Transactional
public class FeitosDao implements AbstractDao<Feitos>{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void persist(Feitos feitos) {
		hibernateTemplate.persist(feitos);
	}

	public List<Feitos> list() {
		return hibernateTemplate.loadAll(Feitos.class);
	}

	public boolean delete(Feitos feitos) {
		try{
			hibernateTemplate.delete(feitos);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	public boolean saveOrUpdate(Feitos feitos) {
		try{
			hibernateTemplate.saveOrUpdate(feitos);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	public Feitos findById(Long id) {
		return hibernateTemplate.get(Feitos.class, id);
	}

	
}