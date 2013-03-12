package br.com.ideais.estagio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ideais.estagio.dao.UsuarioDao;
import br.com.ideais.estagio.model.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioDao uDao;

	
	public void persist(Usuario feitos) {
		uDao.persist(feitos);
	}

	public void saveOrUpdate(Usuario usuario) {
		uDao.saveOrUpdate(usuario);
	}

	public List<Usuario> list() {
		return uDao.list();
	}

	public Usuario findbyId(Long id) {
		return uDao.findById(id);
	}

	public boolean delete(Usuario usuario) {
		return uDao.delete(usuario);
	}

	public boolean validateUsuario(Usuario usuario) {
		System.out.println(usuario.getUsuario());
		return uDao.findByUsuarioAndSenha(usuario);
	}
}
