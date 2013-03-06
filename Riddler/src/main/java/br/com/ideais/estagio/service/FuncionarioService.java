package br.com.ideais.estagio.service;
import br.com.ideais.estagio.dao.FuncionarioDao;
import br.com.ideais.estagio.model.Funcionario;

import java.util.List;

public class FuncionarioService {

	private FuncionarioDao fDao;
	
	public void persist(Funcionario funcionario){
		fDao.persist(funcionario);
	}
	
	public void saveOrUpdate(Funcionario funcionario){
		fDao.saveOrUpdate(funcionario);
	}

	public List<Funcionario> list() {
		return fDao.list();
	}
	

	public Funcionario findbyId(Long id) {
		return fDao.findById(id);
	}
	
	public boolean delete(Funcionario funcionario){
		return fDao.delete(funcionario);
	}

		
}
