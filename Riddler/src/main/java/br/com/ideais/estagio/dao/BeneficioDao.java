package br.com.ideais.estagio.dao;

import java.util.List;

import br.com.ideais.estagio.model.Beneficio;


public class BeneficioDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public BeneficioDao(HibernateTemplate hibernateTemplate) {
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
	