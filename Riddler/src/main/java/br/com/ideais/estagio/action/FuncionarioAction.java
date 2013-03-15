package br.com.ideais.estagio.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.ideais.estagio.model.Funcionario;
import br.com.ideais.estagio.service.FuncionarioService;

import com.opensymphony.xwork2.ActionContext;

public class FuncionarioAction implements CRUDAction{

	@Autowired
	private FuncionarioService funcionarioService;
	
	private Funcionario funcionario = new Funcionario();
	
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
		System.out.println(funcionario.getNome() + " " + funcionario.getDataDeAdmissao());
		if (funcionario.getNome().equals("")){
			erroCampoVazio();
			return ERROR;
		}
		else if(funcionarioService.saveOrUpdate( funcionario )) {
			return SUCCESS;
		}
		else{
			erroAoCriarFuncionario();
			return ERROR;
		}
	}



	public String update() {
		return SUCCESS;
	}

	public String delete() {
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
	private void erroAoCriarFuncionario() {
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		request.setAttribute("erro", "Funcionario Existente");
	}
	
	//
	public Funcionario getFuncionario() {
		return funcionario;
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
