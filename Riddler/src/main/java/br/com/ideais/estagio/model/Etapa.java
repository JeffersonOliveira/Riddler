package br.com.ideais.estagio.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Etapa implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "sequence", sequenceName = "sequence")
	@GeneratedValue(generator = "sequence", strategy = GenerationType.AUTO)
	private Long id;

	private String nome;

	private Integer ordem;

	private Integer prazo;

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

	public Integer getVencimento() {
		return prazo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	public void setPrazo(Integer prazo) {
		this.prazo = prazo;
	}

	public Integer getPrazo() {
		return prazo;
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
