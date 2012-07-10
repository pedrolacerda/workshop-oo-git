package br.com.innvent.queMinina.treinamento;

public class Aluno {
	
	private String nome;
	private String cpf;
	
	public Aluno(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
