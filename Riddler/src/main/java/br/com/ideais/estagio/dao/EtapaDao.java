package br.com.ideais.estagio.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ideais.estagio.model.Etapa;

@Service
@Transactional
public class EtapaDao extends AbstractDao<Etapa>{	
	

	@Autowired
	HibernateTemplate hibernateTemplate;


	public boolean saveOrUpdate(Etapa etapa) {
		try{
			for (Etapa etapaSalva : list()) {
				if(etapa.getNome().equals(etapaSalva.getNome())){
					return false;	
				}
			}
				hibernateTemplate.saveOrUpdate(etapa);
				return true;
		}catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
}