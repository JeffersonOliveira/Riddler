package br.com.ideais.estagio.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Beneficio implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
		@Id
		@SequenceGenerator( name = "sequence", sequenceName = "sequence" )
		@GeneratedValue(generator = "sequence", strategy=GenerationType.AUTO)
		private Long id;
		
		private String nome;
		
		private List<Etapa> etapas;

		public Beneficio() {
			
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
		
}
