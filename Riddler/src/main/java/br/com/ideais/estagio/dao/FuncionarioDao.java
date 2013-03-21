package br.com.ideais.estagio.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ideais.estagio.model.Funcionario;

@Service
@Transactional
public class FuncionarioDao extends AbstractDao<Funcionario> {
	
	@Autowired
	HibernateTemplate hibernateTemplate;


	public boolean saveOrUpdate(Funcionario funcionario) {
		try{
			for (Funcionario funcionarioSalvo : list()) {
				if(funcionario.getNome().equals(funcionarioSalvo.getNome())){
					return false;	
				}
			}
				hibernateTemplate.saveOrUpdate(funcionario);
				return true;
		}catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	public List<Funcionario> findFuncionariosLike(String value){
		DetachedCriteria criteria = DetachedCriteria.forClass(Funcionario.class);
		criteria.add(Restrictions.like("nome", value));
		return hibernateTemplate.findByCriteria(criteria);
	}
	
	
}
