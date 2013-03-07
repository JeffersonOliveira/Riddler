package br.com.ideais.estagio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "sequence", sequenceName = "sequence")
	@GeneratedValue(generator = "sequence", strategy = GenerationType.AUTO)
	private Long id;
	private String usuario;
	private String senha;

	public Usuario() {
	}

	public Usuario(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
