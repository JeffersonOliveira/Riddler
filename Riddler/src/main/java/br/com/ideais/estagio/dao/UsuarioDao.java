package br.com.ideais.estagio.dao;

import java.util.List;

import br.com.ideais.estagio.model.Usuario;

public interface UsuarioDao {
		
	public void persist(Usuario usuario);

	public List<Usuario> list();

	public boolean delete(Usuario usuario);

	public boolean saveOrUpdate(Usuario usuario);

	public Usuario findById(Long id);

	public boolean findByUsuarioAndSenha(Usuario usuario);

}
