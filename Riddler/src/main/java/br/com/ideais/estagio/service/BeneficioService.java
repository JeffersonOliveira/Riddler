package br.com.ideais.estagio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ideais.estagio.dao.BeneficioDao;
import br.com.ideais.estagio.dao.EtapaDao;
import br.com.ideais.estagio.model.Beneficio;
import br.com.ideais.estagio.model.Etapa;

@Service
public class BeneficioService implements AbstractService<Beneficio> {

	@Autowired
	private BeneficioDao bDao;
	@Autowired
	private EtapaDao eDao;

	public void persist(Beneficio beneficio) {
		bDao.persist(beneficio);
	}

	public boolean saveOrUpdate(Beneficio beneficio) {
		return bDao.saveOrUpdate(beneficio);
	}

	public List<Beneficio> list() {
		return bDao.list();
	}

	public boolean delete(Beneficio beneficio) {
		return bDao.delete(beneficio);
	}

	public Beneficio findbyId(Long id) {
		return bDao.findById(id);
	}

}
