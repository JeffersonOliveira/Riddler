package br.com.ideais.estagio.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.ideais.estagio.model.Beneficio;
import br.com.ideais.estagio.model.Etapa;
import br.com.ideais.estagio.service.BeneficioService;

import com.opensymphony.xwork2.ActionContext;

public class BeneficioAction implements CRUDAction {

	@Autowired
	private BeneficioService beneficioService;
	
	private Beneficio beneficio;
	private List<Beneficio> beneficios;
	private List<Etapa> etapas;

	public String execute() throws Exception {
		return SUCCESS;
	}

	public void prepare() throws Exception {
		if (getBeneficioFromRequest() != null) {
			beneficio = beneficioService.findbyId(getBeneficioFromRequest());
		}
	}

	public String create() {
		return SUCCESS;
	}

	public String save() {
		if (beneficio.getNome().equals("")) {
			erroCampoVazio();
			return ERROR;
		}
		if (beneficioService.saveOrUpdate(beneficio)) {
			return SUCCESS;
		} else {
			erroAoCriarBeneficio();
			return ERROR;
		}
	}

	public String update() {
		try {
			beneficio.setEtapas(etapas);
			beneficioService.saveOrUpdate(beneficio);
			return SUCCESS;
		} catch (Exception e) {
			System.out.println(e);
		}
		return ERROR;
	}

	public String delete() {
		if (beneficioService.delete(getBeneficioFromRequest()))
			return SUCCESS;
		return ERROR;
	}

	public String list() {
		beneficios = beneficioService.list();
		return SUCCESS;
	}
	
	public String buscarBeneficio(){
		if(beneficio!=null)
			return SUCCESS;
		return ERROR;
	}

	private Long getBeneficioFromRequest() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);

		if (request.getParameter("id") != null){
			return Long.parseLong(request.getParameter("id"));
		}
		return null;
	}

	public void setBeneficio(Beneficio beneficio) {
		this.beneficio = beneficio;
	}

	public void setBeneficios(List<Beneficio> beneficios) {
		this.beneficios = beneficios;
	}
	
	public void setEtapas(List<Etapa> etapas ) {
		this.etapas = etapas;
	}

	public void setBeneficioService(BeneficioService beneficioService) {
		this.beneficioService = beneficioService;
	}

	public Beneficio getBeneficio() {
		return beneficio;
	}

	public List<Beneficio> getBeneficios() {
		return beneficios;
	}
	
	public List<Etapa> getEtapas() {
		return etapas;
	}

	public BeneficioService getBeneficioService() {
		return beneficioService;
	}

	private void erroAoCriarBeneficio() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		request.setAttribute("erro", "Beneficio Existente");
	}

	private void erroCampoVazio() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		request.setAttribute("erro", "Preencha os campos, por favor");
	}

}
