package br.com.ideais.estagio.action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.Preparable;

import br.com.ideais.estagio.model.Usuario;
import br.com.ideais.estagio.service.UsuarioService;

public interface UsuarioAction extends Action,Preparable{

	public String execute() throws Exception;

	public void prepare() throws Exception;

	public String save();

	public String update();

	public String delete();

	public String create();

	public UsuarioService getUsuarioService();

	public void setUsuarioService(UsuarioService usuarioService);

	public Usuario getUsuario();

	public void setUsuario(Usuario usuario);

	public List<Usuario> getUsuarios();

	public void setUsuarios(List<Usuario> usuarios);


}
