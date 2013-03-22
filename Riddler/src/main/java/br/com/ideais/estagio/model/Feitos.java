package br.com.ideais.estagio.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Feitos implements Serializable {

	private static final long serialVersionUID = 1886649227266676743L;

	@Id
	@SequenceGenerator(name = "sequenceFeitos", sequenceName = "sequenceFeitos")
	@GeneratedValue(generator = "sequenceFeitos", strategy = GenerationType.AUTO)
	private Long id;
	
	private String observacao;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_funcionario")
	private Funcionario funcionario;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "id_etapa")
	private Etapa etapa;

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}



	public void setId(Long id) {
		this.id = id;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Etapa getEtapa() {
		return etapa;
	}

	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}

	public Long getId() {
		return id;
	}
	
}
