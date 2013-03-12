package br.com.ideais.estagio.service;

import br.com.ideais.estagio.model.Usuario;

public interface UsuarioService {

	public void persist(Usuario feitos);

	public void saveOrUpdate(Usuario usuario);

	public Usuario findbyId(Long id);

	public boolean delete(Usuario usuario);

	public boolean validateUsuario(Usuario usuario);

}
