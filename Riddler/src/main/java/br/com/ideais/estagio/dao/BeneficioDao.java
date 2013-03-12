package br.com.ideais.estagio.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ideais.estagio.model.Beneficio;

@Service
@Transactional
public class BeneficioDao implements AbstractDao<Beneficio>{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void persist(Beneficio beneficio) {
		hibernateTemplate.persist(beneficio);
	}

	public List<Beneficio> list() {
		return hibernateTemplate.loadAll(Beneficio.class);
	}

	public boolean delete(Beneficio beneficio) {
		try{
			hibernateTemplate.delete(beneficio);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	public boolean saveOrUpdate(Beneficio beneficio) {
		try{
			hibernateTemplate.saveOrUpdate(beneficio);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	public Beneficio findById(Long id) {
		return hibernateTemplate.get(Beneficio.class, id);
	}

		
}
	