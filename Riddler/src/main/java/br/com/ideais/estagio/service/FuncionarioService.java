package br.com.ideais.estagio.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ideais.estagio.dao.FeitosDao;
import br.com.ideais.estagio.dao.FuncionarioDao;
import br.com.ideais.estagio.model.Etapa;
import br.com.ideais.estagio.model.Feitos;
import br.com.ideais.estagio.model.Funcionario;

@Service
public class FuncionarioService implements AbstractService<Funcionario> {

	@Autowired
	private FuncionarioDao fDao;
	@Autowired
	private FeitosDao feitosDao;
	@Autowired
	private EtapaService etapaService;
	@Autowired
	private FeitosService feitosService;

	public void persist(Funcionario funcionario) {
		fDao.persist(funcionario);
	}

	public boolean saveOrUpdate(Funcionario funcionario) {
		return fDao.saveOrUpdate(funcionario);
	}

	public boolean saveOrUpdate(Funcionario funcionario,
			Collection<Etapa> etapasSelecionadas) {
		for (Etapa etapa : etapasSelecionadas) {
			System.out.println(etapa.getId());
		}
		List<Feitos> feitos = new LinkedList<Feitos>();
		boolean result = fDao.saveOrUpdate(funcionario);
		System.out.println("--------------------> " + result);
		for (Etapa etapa : etapasSelecionadas) {
			Feitos f = new Feitos();
			f.setEtapa(etapa);
			f.setFuncionario(funcionario);
			boolean teste = feitosDao.saveOrUpdate(f);
			System.out.println("--------------------> " + teste);
			feitos.add(f);
		}
		funcionario.setFeitos(feitos);

		return fDao.saveOrUpdate(funcionario);
	}

	public List<Funcionario> list() {
		return fDao.list();
	}

	public Funcionario findbyId(Long id) {
		return fDao.findById(id);
	}

	public boolean delete(Long id) {
		return fDao.delete(id);
	}

	public void setfDao(FuncionarioDao fDao) {
		this.fDao = fDao;
	}

	public HashMap<String, List<Feitos>> editarTarefas(Long id) {
		Funcionario funcionario = findbyId(id);
		HashMap<String, List<Feitos>> mapa = new HashMap<String, List<Feitos>>();
		for (Feitos feitos : funcionario.getFeitos()) {
			String nomeBeneficio = feitos.getEtapa().getBeneficio().getNome();
			if (!mapa.containsKey(nomeBeneficio)) {
				mapa.put(nomeBeneficio, new ArrayList());
			}
			mapa.get(nomeBeneficio).add(feitos);
		}

		return mapa;
	}

	public List<Funcionario> findFuncionariosLike(String nome) {
		return fDao.findFuncionariosLike(nome);
	}

	public HashMap<String, Collection<Feitos>> listarTarefasPendentes() {

		HashMap<String, Collection<Feitos>> mapaPendente = new HashMap<String, Collection<Feitos>>();

		for (Feitos feitos : feitosDao.listarTarefasPendentes()) {
			String funcionario = feitos.getFuncionario().getNome();

			if (!mapaPendente.containsKey(funcionario)) {

				mapaPendente.put(funcionario, new LinkedList<Feitos>());
			}
			mapaPendente.get(funcionario).add(feitos);

		}
		return mapaPendente;
	}


}
