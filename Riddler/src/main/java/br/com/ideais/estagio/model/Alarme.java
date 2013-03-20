package br.com.ideais.estagio.model;

import java.util.Date;

public class Alarme {

	private Long codigo;
	private Date dataAlarme;
	private Funcionario funcionario;
	private Beneficio beneficio;
	
	public Alarme() {
		
	}

	public Alarme(Long codigo, Date dataAlarme, Funcionario funcionario,
			Beneficio beneficio) {
		this.codigo = codigo;
		this.dataAlarme = dataAlarme;
		this.funcionario = funcionario;
		this.beneficio = beneficio;
	}

	
	public Long getCodigo() {
		return codigo;
	}
	
	public Date getDataAlarme() {
		return dataAlarme;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public Beneficio getBeneficio() {
		return beneficio;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public void setDataAlarme(Date dataAlarme) {
		this.dataAlarme = dataAlarme;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public void setBeneficio(Beneficio beneficio) {
		this.beneficio = beneficio;
	}
	
	
	
}
