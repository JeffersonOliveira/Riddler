package br.com.ideais.estagio.model;

import java.io.Serializable;
import java.util.List;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


@Entity
public class Beneficio implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator( name = "sequenceBeneficio", sequenceName = "sequenceBeneficio" )
	@GeneratedValue(generator = "sequenceBeneficio", strategy=GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "id_beneficio")
	private List<Etapa> etapas;

	public Etapa getPrimeiraEtapa() {
		TreeSet<Etapa> etapasOrdenadas = new TreeSet<Etapa>(new EtapaComparator());
		etapasOrdenadas.addAll(etapas);
		return etapasOrdenadas.first();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public List<Etapa> getEtapas() {
		return etapas;
	}

	public void setEtapas(List<Etapa> etapas) {
		this.etapas = etapas;
	}	
	
}