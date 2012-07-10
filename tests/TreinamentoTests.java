
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.com.innvent.queMinina.treinamento.Treinamento;


public class TreinamentoTests {
	
	private Treinamento treinamento;

	@Before
	public void setUp(){
		treinamento = new Treinamento();
	}
	
	@Test
	public void deveSerPossivelDisponibilizarUmTreinamentoParaVenda(){
		//Tell, don't ask
		treinamento.disponibilizarParaVenda();
		Assert.assertEquals(true, treinamento.isDisponivelParaVenda());
	}
	
	@Test
	public void deveSerPossivelIndisponibilizarTreinamentoParaVenda(){
		treinamento.disponibilizarParaVenda();
		treinamento.indisponibilizarParaVenda();
		Assert.assertEquals(false, treinamento.isDisponivelParaVenda());
	}
	
	@Test
	public void deveSerPossivelAdicionarPreRequisitosParaTreinamento(){
		//"Conhecimentos básicos de OO"
		
		
		//Tell, don't ask
		treinamento.adicionarPreRequisito("Conhecimento de OO");
		treinamento.adicionarPreRequisito("Conhecimento de uma linguagem");
		Assert.assertEquals(2, treinamento.getPreRequisitos().size());
	
		/*
		ArrayList<String> preRequisitos = new ArrayList<String>();
		preRequisitos.add("Conhecimentos básicos de OO");
		preRequisitos.add("Conhecimentos básicos de uma linguagem de programação");
		
		treinamento.setPreRequisitos(preRequisitos);
		List<String> preRequisitosesperados = treinamento.getPreRequisitos();
		Assert.assertEquals(2, preRequisitosesperados.size());
		*/
	}
}
