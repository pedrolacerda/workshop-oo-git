import java.util.Calendar;

import junit.framework.Assert;
import br.com.innvent.queMinina.treinamento.Aluno;
import br.com.innvent.queMinina.treinamento.Matricula;
import br.com.innvent.queMinina.treinamento.Treinamento;
import br.com.innvent.queMinina.treinamento.Turma;
import br.com.innvent.queMinina.treinamento.Periodo;


public class MatriculaTests {
	
	public void deveSerPossivelCriarUmaMatriculaDadoUmAlunoETurma(){
		
		Periodo periodo = new Periodo(Calendar.getInstance(), Calendar.getInstance());
		Treinamento cursoDeJava = new Treinamento();
		cursoDeJava.setNome("Curso de Java");
		Aluno jose = new Aluno("jose", "01928312");
		Turma turma = new Turma(cursoDeJava, periodo);
		Matricula matricula = new Matricula(jose, turma, 1000);
		Assert.assertNotNull(matricula);
	}

}
