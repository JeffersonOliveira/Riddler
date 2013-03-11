package br.com.ideais.estagio.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ideais.estagio.model.Funcionario;

@Service
@Transactional
public class FuncionarioDao implements AbstractDao<Funcionario> {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void persist(Funcionario funcionario) {
		hibernateTemplate.persist(funcionario);
	}

	public List<Funcionario> list() {
		return hibernateTemplate.loadAll(Funcionario.class);
	}

	public Funcionario findById(Long id) {
		return hibernateTemplate.get(Funcionario.class, id);
	}

	public boolean delete(Funcionario id) {
		try {
			hibernateTemplate.delete(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean saveOrUpdate(Funcionario funcionario) {
		try {
			System.out.println(funcionario.getNome());
			hibernateTemplate.saveOrUpdate(funcionario);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
