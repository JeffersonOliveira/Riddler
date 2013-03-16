package br.com.ideais.estagio.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.ideais.estagio.model.Etapa;
import br.com.ideais.estagio.service.EtapaService;

import com.opensymphony.xwork2.ActionContext;

public class EtapaAction implements CRUDAction {

	@Autowired
	private EtapaService etapaService;
	private Etapa etapa;
	private List<Etapa> etapas;
	

	public String execute() throws Exception {

		return SUCCESS;
	}
	

	public void prepare() throws Exception {
		if (getEtapaFromRequest() != null)
			etapa = etapaService.findbyId(getEtapaFromRequest());

	}
	
	private void erroCampoVazio() {
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		request.setAttribute("erro", "Preencha os campos por favor");		
	}

	public String save() {
		if (etapa.getNome().equals("")){
			erroCampoVazio();
			return ERROR;
		}
		if(etapaService.saveOrUpdate( etapa )){
			return SUCCESS;
		}
		else{
			erroAoCriarEtapa();
			return ERROR;
		}
	}


	public String update() {
		return SUCCESS;
	}
	

	public String delete() {
		if (etapaService.delete(etapa)) {
			return SUCCESS;
		}
		return ERROR;
	}
	

	public String create() {
		return SUCCESS;
	}
	

	public String list() {
		etapas = etapaService.list();
		return SUCCESS;
	}
	

	private Long getEtapaFromRequest() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);

		if (request.getParameter("id") != null)
			return Long.parseLong(request.getParameter("id"));

		return null;
	}
	
	
	// REDIRECIONA A MESSAGEM DE ERRO PARA A TELA
	 
	private void erroAoCriarEtapa() {
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		request.setAttribute("erro", "erro");
	}
	
	//
	

	private Etapa getEtapa() {
		return etapa;
	}
	

	public EtapaService getEtapaService() {
		return etapaService;
	}
	

	public void setEtapaService(EtapaService etapaService) {
		this.etapaService = etapaService;
	}
	

	public List<Etapa> getEtapas() {
		return etapas;
	}
	

	public void setEtapas(List<Etapa> etapas) {
		this.etapas = etapas;
	}

}
