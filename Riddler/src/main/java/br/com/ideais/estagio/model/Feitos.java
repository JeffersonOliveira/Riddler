package br.com.ideais.estagio.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Feitos implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "sequenceFeitos", sequenceName = "sequenceFeitos")
	@GeneratedValue(generator = "sequenceFeitos", strategy = GenerationType.AUTO)
	private Long id;
	private Boolean feito;
	private String observacao;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "funcionario_id")
	private List<Funcionario> funcionarios;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "etapa_id")
	private List<Etapa> etapas;

	public Long getId() {
		return id;
	}

	public Boolean getFeito() {
		return feito;
	}

	public void setFeito(Boolean feito) {
		this.feito = feito;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Etapa> getEtapas() {
		return etapas;
	}

	public void setEtapas(List<Etapa> etapas) {
		this.etapas = etapas;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
