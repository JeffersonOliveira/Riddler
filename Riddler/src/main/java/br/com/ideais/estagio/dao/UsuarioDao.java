package br.com.ideais.estagio.dao;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ideais.estagio.model.Usuario;

@Service
@Transactional
public class UsuarioDao extends AbstractDao<Usuario> {		
	public boolean findByUsuarioAndSenha(Usuario usuario) {
		try{
			
			for (Usuario usuarioSalvo : list()) {
				if(usuarioSalvo.getSenha().equals(usuario.getSenha()) && 
						usuarioSalvo.getUsuario().equals(usuario.getUsuario())){
					return true;
				}
			}
		}catch (Exception e) {
			System.out.println("nao encontrou o usuario: " + e);
		}
		return false;
	}	
}