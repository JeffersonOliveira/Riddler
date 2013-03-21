package br.com.ideais.estagio.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.ideais.estagio.model.Feitos;
import br.com.ideais.estagio.model.Funcionario;
import br.com.ideais.estagio.service.FeitosService;

import com.opensymphony.xwork2.ActionContext;

public class FeitosAction implements CRUDAction {

	@Autowired
	private FeitosService feitosService;
	private Feitos feitos;
	private List<Feitos> list_feitos;
    private List<Feitos> feitosPendentes;
    private Funcionario funcionario;
    
	public String execute() throws Exception {
		return SUCCESS;
	}

	
	public FeitosService getFeitosService() {
		return feitosService;
	}
	
	public void setFeitosService(FeitosService feitosService) {
		this.feitosService = feitosService;
	}

	public Feitos getFeitos() {
		return feitos;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


	public void prepare() throws Exception {
		if(getFeitosFromRequest()!=null){
			feitos = feitosService.findbyId(getFeitosFromRequest());
		}
	}

	private Long getFeitosFromRequest() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		if (request.getParameter("id") != null)
			return Long.parseLong(request.getParameter("id"));
		return null;
	}

	public List<Feitos> getListFeitos() {
		return list_feitos;
	}

	public void setListFeitos(List<Feitos> list_feitos) {
		this.list_feitos = list_feitos;
	}
	
	public String save() {
		
		feitosService.saveOrUpdate(getFeitos());
		return SUCCESS;
	}

	public String update() {		
		return SUCCESS;
	}

	public String delete() {
		if(feitosService.delete(getFeitos()))
			return SUCCESS;
		return ERROR;
	}

	public String create() {		
		return SUCCESS;
	}

	public String list() {
		list_feitos = feitosService.list();
		return SUCCESS;
	}
	
	public String buscarFuncionario(){
		feitosPendentes = feitosService.buscarFuncionario(getFuncionario().getId());
		return SUCCESS;
	}
}