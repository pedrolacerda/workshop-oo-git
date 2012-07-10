import junit.framework.Assert;
import org.junit.Test;

import br.com.innvent.queMinina.instrutores.Instrutor;
import br.com.innvent.queMinina.treinamento.Curso;
import br.com.innvent.queMinina.treinamento.Treinamento;


public class CursoTests {
	
	@Test
	public void deveRetornar1100QuandoACargaHorariaFor10HorasEAHoraDoInstrutorFor100Reais(){
		Instrutor paulim = new Instrutor("Paulim", 100);
		Treinamento cursoDeJava = new Workshop("Curso de Java");
		Assert.assertEquals(1100.0, cursoDeJava.getPreco());
	}
}
