package br.com.ideais.estagio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ideais.estagio.dao.BeneficioDao;
import br.com.ideais.estagio.dao.EtapaDao;
import br.com.ideais.estagio.model.Beneficio;

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
		Boolean resp = false;
		if (!bDao.saveOrUpdate(beneficio))
			return resp;
//		for (Etapa etapa : beneficio.getEtapas()) {
//			System.out.println(etapa.getNome());
//			etapa.setBeneficio(beneficio);
//			resp = true;
//			//resp = eDao.saveOrUpdate(etapa);
//			if (!resp)
//				return resp;
//		}
	return true;
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
