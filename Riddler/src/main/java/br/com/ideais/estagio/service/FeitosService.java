package br.com.ideais.estagio.service;

import java.util.List;

import br.com.ideais.estagio.model.Feitos;

public class FeitosService {

	private FeitosDao ftDao;

	public BeneficioService(FeitosDao ftDao) {

		this.ftDao = ftDao;
	}

	public void persist(FeitosDao feitos) {

		ftDao.persist(feitos);

	}

	public void saveOrUpdate(FeitosDao feitos) {

		ftDao.saveOrUpdate(feitos);
	}

	public List<Feitos> list() {

		return ftDao.list();
	}

	public Feitos findById(Long id) {

		return ftDao.findById(id);
	}

	public boolean delete(FeitosDao feitos) {

		return ftDao.delete(feitos);
	}

}
