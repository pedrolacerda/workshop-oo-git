package br.com.innvent.queMinina.instrutores;

public class Instrutor {
	private double valorHora;
	private String nome;
	
	public Instrutor(String nome, double valorHora){
		this.nome = nome;
		this.valorHora = valorHora;
	}
	
	public double getValorHora(){
		return valorHora;
	}
	
	public String getNome(){
		return nome;
	}

}
