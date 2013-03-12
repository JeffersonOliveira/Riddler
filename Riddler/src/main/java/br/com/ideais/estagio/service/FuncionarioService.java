package br.com.ideais.estagio.service;
import br.com.ideais.estagio.dao.AbstractDao;
import br.com.ideais.estagio.dao.FuncionarioDao;
import br.com.ideais.estagio.model.Funcionario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService implements AbstractService<Funcionario> {

	@Autowired
	private AbstractDao<Funcionario> fDao;
	
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

	public void setfDao(FuncionarioDao fDao) {
		this.fDao = fDao;
	}
		
}

