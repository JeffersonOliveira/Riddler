package br.com.ideais.estagio.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.Preparable;

public interface UsuarioAction extends Action,Preparable{

	public String execute() throws Exception;

	public void prepare() throws Exception;

	public String save();

	public String update();

	public String delete();

	public String create();

}
