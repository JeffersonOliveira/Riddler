package br.com.ideais.estagio.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.Preparable;

public interface CRUDAction extends Action, Preparable {

	public String save();
	
	public String update();
	
	public String delete();
	
	public String create();
	
	public String list();
	
}
