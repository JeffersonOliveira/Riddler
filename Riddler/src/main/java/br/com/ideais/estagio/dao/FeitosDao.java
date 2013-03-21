package br.com.ideais.estagio.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ideais.estagio.model.Feitos;

@Service
@Transactional
public class FeitosDao extends AbstractDao<Feitos>{
	
	private List<Feitos> feitosPendentes;
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public List<Feitos> buscarFuncionario(Long id) {
		
		for (Feitos feitos : list()) {

			if (feitos.getId().equals(id)) {
				feitosPendentes.add(feitos);

			}
		}
		System.out.println("==========LISTAAA==================.>" + feitosPendentes);
		return hibernateTemplate.loadAll(getPersistentClass());
		
	}
}
	
