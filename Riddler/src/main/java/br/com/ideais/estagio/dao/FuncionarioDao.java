package br.com.ideais.estagio.dao;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ideais.estagio.model.Funcionario;

@Service
@Transactional
public class FuncionarioDao extends AbstractDao<Funcionario> {
}
