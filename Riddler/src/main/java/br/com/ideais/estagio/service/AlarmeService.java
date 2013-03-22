package br.com.ideais.estagio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ideais.estagio.dao.AlarmeDao;
import br.com.ideais.estagio.dao.BeneficioDao;
import br.com.ideais.estagio.dao.EtapaDao;
import br.com.ideais.estagio.dao.FuncionarioDao;
import br.com.ideais.estagio.model.Alarme;

@Service
public class AlarmeService implements AbstractService<Alarme>{
	
	@Autowired
	private BeneficioDao bDao;
	
	@Autowired
	private FuncionarioDao fDao;

	@Autowired
	private AlarmeDao aDao;
	
	public Alarme findbyId(Long id) {		
		return aDao.findById(id);
	}

	public List<Alarme> list() {		
		return aDao.list();
	}

	public boolean saveOrUpdate(Alarme alarme) {		
		return aDao.saveOrUpdate(alarme);
	}

	public void persist(Alarme alarme) {
		aDao.persist(alarme);
		
	}

	public boolean delete(Long id) {
		return aDao.delete(id);
	}
	
	
}
