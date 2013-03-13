package br.com.ideais.estagio.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ideais.estagio.dao.EtapaDao;
import br.com.ideais.estagio.model.Etapa;

@Service
public class EtapaService implements AbstractService<Etapa>{
	
	@Autowired
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
