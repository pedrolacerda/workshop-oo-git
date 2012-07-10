package br.com.innvent.queMinina.treinamento;

import java.util.Calendar;

public class Periodo {
	
	private Calendar dataInicio;
	private Calendar dataFim;
	
	public Periodo(Calendar dataInicio, Calendar dataFim){
		
		if(dataInicio.before(dataFim)){
			
			this.dataInicio = dataInicio;
			this.dataFim = dataFim;
			
		}else{
			throw new IllegalStateException("Data de Início maior que a Data de Fim");
		}
	}
	
	public boolean estahSobreposto(Periodo periodo) {
		return !(this.dataInicio.after(periodo.dataFim) || this.dataFim.before(periodo.dataInicio) 
				&& periodo.dataInicio.after(this.dataFim) || periodo.dataFim.before(this.dataInicio));
	}
}
