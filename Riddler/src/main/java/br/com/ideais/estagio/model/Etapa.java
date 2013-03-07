package br.com.ideais.estagio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Etapa implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @SequenceGenerator( name = "sequence", sequenceName = "sequence" )
    @GeneratedValue(generator = "sequence", strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	private Integer ordem;
	private Integer vencimento;
	private Long idBeneficio;
	
	private Etapa(){
		
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
		return vencimento;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}
	
	
	public void setVencimento(Integer vencimento) {
		this.vencimento = vencimento;
	}

	public Long getIdBeneficio() {
		return idBeneficio;
	}

	
	public void setIdBeneficio(Beneficio beneficio) {
		this.idBeneficio = beneficio.getId();
	}

	

}
