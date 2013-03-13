package br.com.ideais.estagio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ideais.estagio.dao.EtapaDao;
import br.com.ideais.estagio.model.Etapa;

@Service
public class EtapaService implements AbstractService<Etapa>{
	
	@Autowired
	private EtapaDao etapaDao;
	
	public void persist(Etapa etapa){
		etapaDao.persist(etapa);
	}
	
	public void saveOrUpdate(Etapa etapa){
		etapaDao.saveOrUpdate(etapa);
	}

	public List<Etapa> list() {
		return etapaDao.list();
	}
	

	public Etapa findbyId(Long id) {
		return etapaDao.findById(id);
	}
	
	public boolean delete(Etapa etapa){
		return etapaDao.delete(etapa);
	}

}
