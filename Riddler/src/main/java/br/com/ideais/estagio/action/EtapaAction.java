package br.com.ideais.estagio.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import br.com.ideais.estagio.model.Etapa;
import br.com.ideais.estagio.service.EtapaService;

import com.opensymphony.xwork2.ActionContext;

public class EtapaAction implements CRUDAction {

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
	

	public String save() {
		etapaService.saveOrUpdate(getEtapa());
		return SUCCESS;
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
	

	private Etapa getEtapa() {
		return etapa;
	}
	

	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
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