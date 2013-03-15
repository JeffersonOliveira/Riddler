package br.com.ideais.estagio.action;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ideais.estagio.service.RelatorioService;

public class RelatorioAction {

	@Autowired
	private RelatorioService relatorioService;
	
	
	public void createPdf(){
		try {
			relatorioService.createPdf();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public RelatorioService getRelatorioService() {
		return relatorioService;
	}

	public void setRelatorioService(RelatorioService relatorioService) {
		this.relatorioService = relatorioService;
	}
	
	
	
	
	
}
