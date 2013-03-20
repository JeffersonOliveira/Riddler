package br.com.ideais.estagio.model;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Etapa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "sequenceEtapa", sequenceName = "sequenceEtapa")
	@GeneratedValue(generator = "sequenceEtapa", strategy = GenerationType.AUTO)
	private Long id;

	private String nome;
	private Integer ordem;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_beneficio")
	private Beneficio beneficio;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	public Beneficio getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(Beneficio beneficio) {
		this.beneficio = beneficio;
	}

	public Long getId() {
		return id;
	}
	
}
