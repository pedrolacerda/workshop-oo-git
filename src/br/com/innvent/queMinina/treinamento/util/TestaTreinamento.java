package br.com.innvent.queMinina.treinamento.util;

import br.com.innvent.queMinina.treinamento.Treinamento;

public class TestaTreinamento {
	public static void main(String[] args) {
		Treinamento treinamento = new Treinamento();
		treinamento.setNome("Workshop de 00");
		treinamento.setCargaHoraria(8);
		
		treinamento.disponibilizarParaVenda();
		treinamento.indisponibilizarParaVenda();
		
		treinamento.adicionarPreRequisito("Conhecimentos de Java");
	}
}
