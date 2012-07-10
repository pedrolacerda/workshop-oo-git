package br.com.innvent.queMinina.treinamento;

import java.util.ArrayList;
import java.util.List;

import br.com.innvent.queMinina.instrutores.Instrutor;

public class Treinamento {

	private boolean disponivelParaVenda;
	private String nome;
	private int cargaHoraria;
	private double preco;
	private List<String> preRequisitos;
	private TipoDeTreinamento tipo;
	private Instrutor instrutor;
	
	public Treinamento(){
		this.preRequisitos = new ArrayList<String>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public double getPreco() {
		if(this.tipo == TipoDeTreinamento.CURSO){
			return this.getInstrutor().getValorHora() * this.getCargaHoraria() * 1.1;
		}else if(this.getTipoDeTreinamento() == TipoDeTreinamento.WORKSHOP){
			return 500 * 1.1;
		}else{
			return this.preco;
		}
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public List<String> getPreRequisitos() {
		return new ArrayList<String>(this.preRequisitos);
	}

	public void setPreRequisitos(List<String> preRequisitos) {
		this.preRequisitos = preRequisitos;
	}

	public void disponibilizarParaVenda() {
		this.disponivelParaVenda = true;
	}

	public Object isDisponivelParaVenda() {
		return this.disponivelParaVenda;
	}

	public void indisponibilizarParaVenda() {
		this.disponivelParaVenda = false;
	}

	public void adicionarPreRequisito(String preRequisito) {
		this.preRequisitos.add(preRequisito);
	}
	
	public void definirTipo(TipoDeTreinamento tipo){
		this.tipo = tipo;
	}
	
	public TipoDeTreinamento getTipoDeTreinamento(){
		return this.tipo;
	}

	public Instrutor getInstrutor() {
		return this.instrutor;
	}
	
	public void definirInstrutor(Instrutor instrutor){
		this.instrutor = instrutor;
	}
}
