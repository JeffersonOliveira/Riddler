package br.com.ideais.estagio.service;

import java.util.List;

import br.com.ideais.estagio.model.Funcionario;

public interface FuncionarioService {

	public abstract boolean delete(Funcionario funcionario);

	public abstract Funcionario findbyId(Long id);

	public abstract List<Funcionario> list();

	public abstract void saveOrUpdate(Funcionario funcionario);

	public abstract void persist(Funcionario funcionario);

}