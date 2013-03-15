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
public class Feitos implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
    @SequenceGenerator( name = "sequence", sequenceName = "sequence" )
    @GeneratedValue(generator = "sequence", strategy=GenerationType.AUTO)
	private Long id;
	private Date data_inicial;
	private Boolean feito;
	private String observacao;
	
	@ManyToMany
	private List<Funcionario> funcionarios;
	@ManyToMany
	private List<Etapa> etapas;
	
	
	public Date getData_inicial() {
		return data_inicial;
	}
	
	public void setData_inicial(Date data_inicial) {
		this.data_inicial = data_inicial;
	}
	
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
