package br.com.ideais.estagio.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Funcionario implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @SequenceGenerator( name = "sequenceFuncionario", sequenceName = "sequenceFuncionario" )
    @GeneratedValue( generator = "sequenceFuncionario", strategy = GenerationType.AUTO )
	private Long id;
	private String nome;
	private Date dataDeAdmissao;
	
	@ManyToMany
	private List<Feitos> feitos;
	
	
	public Funcionario() {
		
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		System.out.println(nome);
		this.nome = nome;
	}

	public Date getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(Date dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
	
	public List<Feitos> getFeitos() {
		return feitos;
	}

	public void setFeitos(List<Feitos> feitos) {
		this.feitos = feitos;
	}

	
}
