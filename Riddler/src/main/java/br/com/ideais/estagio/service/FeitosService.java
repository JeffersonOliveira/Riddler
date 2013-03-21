package br.com.ideais.estagio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ideais.estagio.dao.EtapaDao;
import br.com.ideais.estagio.dao.FeitosDao;
import br.com.ideais.estagio.dao.FuncionarioDao;
import br.com.ideais.estagio.model.Etapa;
import br.com.ideais.estagio.model.Feitos;

@Service
public class FeitosService implements AbstractService<Feitos> {

	@Autowired
	private FeitosDao ftDao;
	@Autowired
	private EtapaDao eDao;
	@Autowired
	private FuncionarioDao fDao;
	@Autowired
	private EtapaService etapaService;

	public void persist(Feitos feitos) {
		ftDao.persist(feitos);
	}

	public boolean saveOrUpdate(Feitos feitos) {
		return ftDao.saveOrUpdate(feitos);
	}

	public List<Feitos> list() {
		return ftDao.list();
	}

	public boolean delete(Feitos feitos) {
		return ftDao.delete(feitos);
	}

	public Feitos findbyId(Long id) {
		return ftDao.findById(id);
	}

	public List<Feitos> buscarFuncionario(Long id) {
		return ftDao.buscarFuncionario(id);
	}

	public boolean finalizarEtapa(Long id) {

		Feitos feitos = findbyId(id);
		if (feitos.getEtapa().getNome().equals("Concluida")) {
			return false;
		}
		Long idProximaEtapa = feitos.getEtapa().getId() + 1;
		Etapa etapa = etapaService.findbyId(idProximaEtapa);
		feitos.setEtapa(etapa);
		System.out.println(feitos.getId());
		System.out.println("========== " + feitos.getEtapa().getNome() + " "
				+ feitos.getEtapa().getBeneficio().getNome());

		return ftDao.saveOrUpdate(feitos);

	}

	public boolean adicionarObservacao(Long id, Feitos feitoView){

		Feitos feitos = findbyId(id);
		
		feitos.setObservacao(feitoView.getObservacao());
		return ftDao.saveOrUpdate(feitos);

	}
}
