package br.com.ideais.estagio.model;

public class Alarme {

	private Long codigo;
	private Funcionario funcionario;
	private Beneficio beneficio;
	
	public Alarme() {
		
	}
	
	public Alarme(Long codigo, Funcionario funcionario, Beneficio beneficio) {
		this.codigo = codigo;
		this.funcionario = funcionario;
		this.beneficio = beneficio;
	}


	public Long getCodigo() {
		return codigo;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public Beneficio getBeneficio() {
		return beneficio;
	}
	
	
	
}
