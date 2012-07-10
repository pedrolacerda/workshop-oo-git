package br.com.innvent.queMinina.treinamento;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private Treinamento treinamento;
	private Periodo periodo;
	private int quantidadeMaximaDeAlunos;
	private List<Matricula> matriculas;
		
	public Turma(Treinamento treinamento, Periodo periodo) {
		this.treinamento = treinamento;
		this.periodo = periodo;
		matriculas = new ArrayList<Matricula>();
	}

	public void definirQuantidadeMaximaDeAlunos(int quantidade) {
		this.quantidadeMaximaDeAlunos = quantidade;
	}

	public int getQuantidadeMaximaDeAlunos() {
		return this.quantidadeMaximaDeAlunos;
	}

	public int quantidadeDeMatriculas() {
		return this.matriculas.size();
	}
	
	public Matricula matricular(Aluno aluno){
		
		if(this.haVagas()){
			return criarMatricula(aluno);
		}else{
			throw new IllegalStateException("Quantidade máxima de alunos alcançada!");
		}
	}

	private Matricula criarMatricula(Aluno aluno) {
		double valor = treinamento.getPreco();

		Matricula matricula = new Matricula(aluno, this, this.treinamento.getPreco());
		this.matriculas.add(matricula);
		return matricula;
	}
	
	private boolean haVagas() {
		return (this.quantidadeDeMatriculas() < this.quantidadeMaximaDeAlunos) || (this.quantidadeMaximaDeAlunos == 0);
	}

	public Periodo getPeriodo(){
		return this.periodo;
	}
	
}
