package br.com.ideais.estagio.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Funcionario implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @SequenceGenerator( name = "sequence", sequenceName = "sequence" )
    @GeneratedValue( generator = "sequence", strategy = GenerationType.AUTO )
	private Long id;
	private String nome;
	private Date dataDeAdmissao;
	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(Date dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
	
	
	
}
