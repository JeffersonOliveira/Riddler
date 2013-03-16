package br.com.ideais.estagio.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
	
	@ManyToOne
	@JoinColumn(name="beneficio_id")
	private Beneficio beneficio;
	
	@ManyToMany
	private List<Feitos> feitos;

	private Etapa() {

	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Integer getOrdem() {
		return ordem;
	}


	public void setNome(String nome) {
		this.nome = nome;
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

	public List<Feitos> getFeitos() {
		return feitos;
	}

	public void setFeitos(List<Feitos> feitos) {
		this.feitos = feitos;
	}


}
