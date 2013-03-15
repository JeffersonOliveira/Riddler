package br.com.ideais.estagio.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;

import br.com.ideais.estagio.model.Beneficio;
import br.com.ideais.estagio.service.BeneficioService;

public class BeneficioAction implements CRUDAction{

	@Autowired
	private BeneficioService beneficioService;
	private Beneficio beneficio;
	private List<Beneficio> beneficios;
	
	public String execute() throws Exception {
		return SUCCESS;
	}

	public void prepare() throws Exception {
		if(getBeneficioFromRequest()!=null){
			beneficio = beneficioService.findbyId(getBeneficioFromRequest());
		}
		
	}
	
	private Long getBeneficioFromRequest() {
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext()
				   .get(ServletActionContext.HTTP_REQUEST);
		
		if(request.getParameter("id")!=null)
			return Long.parseLong(request.getParameter("id"));

		return null;
	}
	
	
	// REDIRECIONA A MESSAGEM DE ERRO PARA A TELA
	 
	private void erroAoCriarBeneficio() {
		HttpServletRequest request = (HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		request.setAttribute("erro", "Beneficio Existente");
	}
	
	//
	
	public BeneficioService getBeneficioService() {
		return beneficioService;
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

	public void setBeneficios(List<Beneficio> beneficios) {
		this.beneficios = beneficios;
	}

	public String save() {
		if(beneficioService.saveOrUpdate(getBeneficio())){
			return SUCCESS;
		}
		else{
			erroAoCriarBeneficio();
			return ERROR;
		}
	}

	public String update() {		
		return SUCCESS;
	}

	public String delete() {
		if(beneficioService.delete(getBeneficio()))
			return SUCCESS;
		return ERROR;
	}

	public String create() {		
		return SUCCESS;
	}

	public String list() {
		beneficios = beneficioService.list();
		return SUCCESS;
	}

}
