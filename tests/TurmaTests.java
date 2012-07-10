import java.util.Calendar;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.com.innvent.queMinina.treinamento.Aluno;
import br.com.innvent.queMinina.treinamento.Periodo;
import br.com.innvent.queMinina.treinamento.Treinamento;
import br.com.innvent.queMinina.treinamento.Turma;

public class TurmaTests {
	
	private Calendar dataInicio = Calendar.getInstance();
	private Calendar dataFim = Calendar.getInstance();
	private Periodo periodo;
	private Treinamento cursoDeJava = new Treinamento();
	
	@Before
	public void setUp(){

		dataInicio.set(Calendar.DAY_OF_MONTH, 1);
		dataInicio.set(Calendar.MONTH, 1);
		dataInicio.set(Calendar.YEAR, 2012);
		
		dataFim.set(Calendar.DAY_OF_MONTH, 10);
		dataFim.set(Calendar.MONTH, 1);
		dataFim.set(Calendar.YEAR, 2012);
		
		cursoDeJava.setNome("Curso Java");
		periodo = new Periodo(dataInicio, dataFim);
	}
	
	@Test
	public void deveSerPossivelCriarUmaTurma(){
		Turma turma = new Turma(cursoDeJava, periodo);
		Assert.assertNotNull(turma);
	}
	
	@Test
	public void naoDeveSerPossivelSobreporTurmas(){	
		Periodo novoPeriodo = new Periodo(dataInicio, dataFim);
		Assert.assertTrue(periodo.estahSobreposto(novoPeriodo));
	}
	
	@Test
	public void deveSerPossivelDefinirUmaQuantidadeMaximaDeAlunos(){
		Turma turma = new Turma(cursoDeJava, periodo);
		turma.definirQuantidadeMaximaDeAlunos(10);
		Assert.assertEquals(10, turma.getQuantidadeMaximaDeAlunos());
	}
	
	@Test
	public void deveSerPossivelMatricularUmAlunoNaTurma(){
		Aluno jose = new Aluno("Jose", "123123123-12");
		Turma turma = new Turma(cursoDeJava, periodo);
		turma.matricular(jose);
		Assert.assertEquals(1, turma.quantidadeDeMatriculas());
	}
	
	@Test(expected = IllegalStateException.class)
	public void naoDeveSerPossivelMatricularUmAlunoCasoAQuantidadeMaximaSejaUltrapassada(){
		Aluno jose = new Aluno("Jose", "123123123-12");
		Aluno paulim = new Aluno("Paulim", "123123123-12");
		Aluno maria = new Aluno("Maria", "123123123-12");
		
		Turma turma = new Turma(cursoDeJava, periodo);
		turma.definirQuantidadeMaximaDeAlunos(2);
		turma.matricular(jose);
		turma.matricular(paulim);
		turma.matricular(maria);
	}
	
	@Test
	public void naoDeveChecarQuantidadeMáximaSeEstaNaoForDefinida(){
		Aluno jose = new Aluno("Jose", "123123123-12");
		Aluno paulim = new Aluno("Paulim", "123123123-12");
		Aluno maria = new Aluno("Maria", "123123123-12");
		
		Turma turma = new Turma(cursoDeJava, periodo);
		turma.matricular(jose);
		turma.matricular(paulim);
		turma.matricular(maria);
	}
}
