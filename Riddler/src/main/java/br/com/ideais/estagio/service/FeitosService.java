package br.com.ideais.estagio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ideais.estagio.dao.FeitosDao;
import br.com.ideais.estagio.model.Feitos;

@Service
public class FeitosService implements AbstractService<Feitos>{

	@Autowired
	private FeitosDao ftDao;

	
	public void persist(Feitos feitos) {
		ftDao.persist(feitos);
	}

	public boolean saveOrUpdate(Feitos feitos) {
		return ftDao.saveOrUpdate(feitos);
	}

	public List<Feitos> list() {
		return ftDao.list();
	}


	public boolean delete(Feitos feitos) {
		return ftDao.delete(feitos);
	}

	public Feitos findbyId(Long id) {
		return ftDao.findById(id);
	}

}
