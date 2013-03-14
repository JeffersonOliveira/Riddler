package br.com.ideais.estagio.model;

import java.io.Serializable;
import java.sql.DatabaseMetaData;
import java.util.List;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import org.joda.time.LocalDate;

@Entity
public class Funcionario implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @SequenceGenerator( name = "sequence", sequenceName = "sequence" )
    @GeneratedValue( generator = "sequence", strategy = GenerationType.AUTO )
	private Long id;
	private String nome;
	private String apelido;
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

	public String getApelido() {
		return apelido;
	}
	
	public void setApelido( String apelido ) {
		this.apelido = apelido;
	}
	
}
