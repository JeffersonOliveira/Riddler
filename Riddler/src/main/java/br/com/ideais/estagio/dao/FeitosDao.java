package br.com.ideais.estagio.dao;


import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ideais.estagio.model.Feitos;

@Service
@Transactional
public class FeitosDao extends AbstractDao<Feitos>{
	
	private List<Feitos> feitosPendentes;
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public List<Feitos> buscarFuncionario(Long id) {
		
		for (Feitos feitos : list()) {

			if (feitos.getId().equals(id)) {
				feitosPendentes.add(feitos);

			}
		}
		System.out.println("==========LISTAAA==================.>" + feitosPendentes);
		return hibernateTemplate.loadAll(getPersistentClass());
	}
	
	@SuppressWarnings("unchecked")
	public Collection<Feitos> listarTarefasPendentes() {
		return hibernateTemplate.executeFind( new HibernateCallback<Collection<Feitos>>() {
			public Collection<Feitos> doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery(
					"from Feitos feitos " +
					"where feitos.etapa.nome != 'Concluida' " +
					"order by feitos.funcionario.nome, feitos.etapa.beneficio.nome, feitos.etapa.nome"
				);
				return query.list();
			}
		});
	}

}
	
