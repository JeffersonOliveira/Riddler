package br.com.ideais.estagio.action;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.ideais.estagio.model.Etapa;
import br.com.ideais.estagio.model.Funcionario;
import br.com.ideais.estagio.service.EtapaService;
import br.com.ideais.estagio.service.FuncionarioService;

import com.opensymphony.xwork2.ActionContext;

public class FuncionarioAction implements CRUDAction{

	@Autowired
	private FuncionarioService funcionarioService;
	
	@Autowired
	private EtapaService etapaService;
	
	private Funcionario funcionario = new Funcionario();
	
	private List<Long> etapasSelecionadas = new LinkedList<Long>();
	
	private List<Funcionario> funcionarios;
	
	public String execute() throws Exception {
		return SUCCESS;
	}

	public void prepare() throws Exception {
		if(getFuncionarioFromRequest() != null) {
			funcionario = funcionarioService.findbyId(getFuncionarioFromRequest());
		}
	}


	public String save() {
		try {
			System.out.println(funcionario.getNome() + " " + funcionario.getDataDeAdmissao());
			if (funcionario.getNome().equals("")){
				erroCampoVazio();
				return ERROR;
			}
			
			Collection<Etapa> etapas = new LinkedList<Etapa>();
			for (Long etapaSelecionada : etapasSelecionadas) {
				Etapa etapa = etapaService.findbyId(etapaSelecionada);
				etapas.add(etapa);
			}
			funcionarioService.saveOrUpdate(funcionario, etapas);
			
			return SUCCESS;
		}
		catch(Exception e) {
			return ERROR;
		}
	}



	public String update() {
		return SUCCESS;
	}

	public String delete() {
		System.out.println(funcionario.getNome());
		if(funcionarioService.delete(funcionario)){
			return SUCCESS;
		}
		return ERROR;
	}

	public String create() {
		return SUCCESS;
	}

	public String list() {
		funcionarios = funcionarioService.list();
		return SUCCESS;
	}
	
	private Long getFuncionarioFromRequest() {
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		
		if(request.getParameter("id") != null)
			return Long.parseLong(request.getParameter("id"));
		
		return null;
	}
	
	
	// REDIRECIONA A MESSAGEM DE ERRO PARA A TELA
	 
	private void erroCampoVazio() {
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		request.setAttribute("erro", "Preencha os campos por favor");		
	}
	
	//
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public List<Long> getEtapasSelecionadas() {
		return etapasSelecionadas;
	}
	
	public FuncionarioService getFuncionarioService() {
		return funcionarioService;
	}

	public void setFuncionarioService(FuncionarioService funcionarioService) {
		this.funcionarioService = funcionarioService;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
}
