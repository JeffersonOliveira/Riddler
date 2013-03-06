package br.com.ideais.estagio.service;

import java.util.List;

import br.com.ideais.estagio.model.Beneficio;

public class BeneficioService {


	private BeneficioDao bDao;
	
	
	public BeneficioService(BeneficioDao bDao) {

		this.bDao = bDao;
	}
	
	
	public void persist (Beneficio beneficio){
	
		bDao.persist(beneficio);
		
	}
	
	
	public void saveOrUpdate (Beneficio beneficio){
		
		bDao.saveOrUpdate(beneficio);
	}
	
	
	public List<Beneficio> list(){
		
		return bDao.list();
	}
	
	
	public Beneficio findById(Long Id){
		
		return bDao.findById();
	}
	
	
	public boolean delete(Beneficio beneficio){
		
		return bDao.delete(beneficio);
	}
	
	
}
