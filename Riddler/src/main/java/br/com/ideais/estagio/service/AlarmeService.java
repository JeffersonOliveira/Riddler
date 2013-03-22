package br.com.ideais.estagio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ideais.estagio.dao.BeneficioDao;
import br.com.ideais.estagio.dao.EtapaDao;
import br.com.ideais.estagio.model.Alarme;

@Service
public class AlarmeService implements AbstractService<Alarme>{
	
	@Autowired
	private BeneficioDao bDao;
	@Autowired
	private EtapaDao eDao;

	public boolean delete(Alarme t) {
		// TODO Auto-generated method stub
		return false;
	}

	public Alarme findbyId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Alarme> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean saveOrUpdate(Alarme t) {
		// TODO Auto-generated method stub
		return false;
	}

	public void persist(Alarme t) {
		// TODO Auto-generated method stub
		
	}
	
	
}
