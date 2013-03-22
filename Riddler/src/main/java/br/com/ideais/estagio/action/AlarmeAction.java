package br.com.ideais.estagio.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ideais.estagio.model.Alarme;
import br.com.ideais.estagio.service.AlarmeService;

public class AlarmeAction implements CRUDAction{

	@Autowired
	private AlarmeService alarmeService;
	private Alarme alarme;
	private List<Alarme> alarmes;
	
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public String save() {
		// TODO Auto-generated method stub
		return null;
	}

	public String update() {
		// TODO Auto-generated method stub
		return null;
	}

	public String delete() {
		// TODO Auto-generated method stub
		return null;
	}

	public String create() {
		// TODO Auto-generated method stub
		return null;
	}

	public String list() {
		// TODO Auto-generated method stub
		return null;
	}
}
