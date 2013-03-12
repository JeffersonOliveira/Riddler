package br.com.ideais.estagio.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;

import br.com.ideais.estagio.model.Usuario;
import br.com.ideais.estagio.service.UsuarioService;

public class UsuarioActionImpl implements UsuarioAction {

	@Autowired
	private UsuarioService usuarioService;
	private Usuario usuario;
	private List<Usuario> usuarios;

	public String execute() throws Exception {
		if (usuarioService.validateUsuario(usuario)) {
			ActionContext.getContext().getSession().put("usuario", usuario);
			return SUCCESS;
		}
		return ERROR;
	}

	public void prepare() throws Exception {
		if (getUsuarioFromRequest() != null)
			usuario = usuarioService.findbyId(getUsuarioFromRequest());
	}

	public String save() {
		usuarioService.saveOrUpdate(getUsuario());
		return SUCCESS;
	}

	public String update() {
		return SUCCESS;
	}

	public String delete() {
		if (usuarioService.delete(usuario)) {
			return SUCCESS;
		}
		return ERROR;
	}

	public String create() {

		return SUCCESS;
	}


	private Long getUsuarioFromRequest() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);

		if (request.getParameter("id") != null)
			return Long.parseLong(request.getParameter("id"));

		return null;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}


}
