package br.com.ideais.estagio.dao;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ideais.estagio.model.Etapa;

@Service
@Transactional
public class EtapaDao extends AbstractDao<Etapa>{	
}