package br.com.ideais.estagio.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import br.com.ideais.estagio.model.Feitos;
import br.com.ideais.estagio.service.FeitosService;

import com.opensymphony.xwork2.ActionContext;

public class FeitosAction implements CRUDAction {

	private FeitosService feitosService;
	private Feitos feitos;
	private List<Feitos> list_feitos;

	public String execute() throws Exception {
		return SUCCESS;
<<<<<<< HEAD
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
=======
>>>>>>> 15305c13b7c7a3c9086b446aec7ff0bef85b0d7a
	}

	public void prepare() throws Exception {
		if(getFeitosFromRequest()!=null){
			feitos = feitosService.findById(getFeitosFromRequest());
		}
	}

<<<<<<< HEAD

		public String list() {
			beneficios = beneficioService.list();
			return SUCCESS;
		}
		
		
		
	public String save() {
		feitosService.saveOrUpdate(getFeitos());
		return SUCCESS;
=======
	private Long getFeitosFromRequest() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		if (request.getParameter("id") != null)
			return Long.parseLong(request.getParameter("id"));
		return null;
>>>>>>> 15305c13b7c7a3c9086b446aec7ff0bef85b0d7a
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

<<<<<<< HEAD
	public String update() {
=======
	public void setFeitos(Feitos feitos) {
		this.feitos = feitos;
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
>>>>>>> 15305c13b7c7a3c9086b446aec7ff0bef85b0d7a
		return SUCCESS;
	}

	public String delete() {
<<<<<<< HEAD
		if(feitosService.delete(getFeitos));
=======
		if(feitosService.delete(getFeitos()))
>>>>>>> 15305c13b7c7a3c9086b446aec7ff0bef85b0d7a
			return SUCCESS;
		return ERROR;
	}

<<<<<<< HEAD
	public String create() {
=======
	public String create() {		
>>>>>>> 15305c13b7c7a3c9086b446aec7ff0bef85b0d7a
		return SUCCESS;
	}

	public String list() {
<<<<<<< HEAD
		feitos = feitosService.list();
=======
		list_feitos = feitosService.list();
>>>>>>> 15305c13b7c7a3c9086b446aec7ff0bef85b0d7a
		return SUCCESS;
	}
}
