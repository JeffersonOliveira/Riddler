package br.com.ideais.estagio.action;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import br.com.ideais.estagio.model.Feitos;
import br.com.ideais.estagio.service.FeitosService;


public class FeitosAction implements CRUDAction{

	
	private FeitosService feitosService;
	private Feitos feitos;
	private List<Feitos> feitos;

	
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

	public void setFeitos(Feitos feitos) {
		this.feitos = feitos;
	}

	public List<Feitos> getFeitos() {
		return feitos;
	}

	public void setFeitos(List<Feitos> feitos) {
		this.feitos = feitos;
	}

	public void prepare() throws Exception {
		if(getFeitosFromRequest()!=null){
			feitos = feitosService.findById(getFeitosFromRequest());
	}


		public String list() {
			beneficios = beneficioService.list();
			return SUCCESS;
		}
		
		
		
	public String save() {
		feitosService.saveOrUpdate(getFeitos());
		return SUCCESS;
	}

	public String update() {
		return SUCCESS;
	}

	public String delete() {
		if(feitosService.delete(getFeitos));
			return SUCCESS;
		return ERROR;
	}

	public String create() {
		return SUCCESS;
	}

	public String list() {
		feitos = feitosService.list();
		return SUCCESS;
	}
	

}
