package br.com.ideais.estagio.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ideais.estagio.model.Etapa;

@Service
@Transactional
public class EtapaDao implements AbstractDao<Etapa>{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public EtapaDao(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public void persist(Etapa etapa) {
		hibernateTemplate.persist(etapa);
	}

	public List<Etapa> list() {
		return hibernateTemplate.loadAll(Etapa.class);
	}

	public boolean delete(Etapa etapa) {
		try{
			hibernateTemplate.delete(etapa);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	public boolean saveOrUpdate(Etapa etapa) {
		try{
			hibernateTemplate.saveOrUpdate(etapa);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	public Etapa findById(Long id) {
		return hibernateTemplate.get(Etapa.class, id);
	}

	
}