package br.com.ideais.estagio.service;
import java.util.List;

import br.com.ideais.estagio.model.Etapa;

public class EtapaService {

	private EtapaDao eDao;
	
	public void persist(Etapa etapa){
		eDao.persist(etapa);
	}
	
	public void saveOrUpdate(Etapa etapa){
		eDao.saveOrUpdate(etapa);
	}

	public List<Etapa> list() {
		return eDao.list();
	}
	

	public Etapa findbyId(Long id) {
		return eDao.findById(id);
	}
	
	public boolean delete(Etapa etapa){
		return eDao.delete(etapa);
	}

}
