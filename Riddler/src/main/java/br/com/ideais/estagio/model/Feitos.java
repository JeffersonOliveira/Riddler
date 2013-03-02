package br.com.ideais.estagio.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Feitos implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
    @SequenceGenerator( name = "sequence", sequenceName = "sequence" )
    @GeneratedValue(generator = "sequence", strategy=GenerationType.AUTO)
	private Long id;
	private Long id_funcionario;
	private Long id_etapa;
	private Date data_inicial;
	private Boolean feito;
	
	public Date getData_inicial() {
		return data_inicial;
	}
	
	public void setData_inicial(Date data_inicial) {
		this.data_inicial = data_inicial;
	}
	
	public Long getId() {
		return id;
	}
	
	public Long getId_funcionario() {
		return id_funcionario;
	}
	
	public Long getId_etapa() {
		return id_etapa;
	}

	public Boolean getFeito() {
		return feito;
	}

	public void setFeito(Boolean feito) {
		this.feito = feito;
	}
	
}
