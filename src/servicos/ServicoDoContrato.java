package servicos;

import java.util.Calendar;

import entidades.Contrato;
import entidades.Parcelas;

public class ServicoDoContrato {
	
	private ServicoOnline servicoOnline;
	Calendar cal = Calendar.getInstance();
	
	public ServicoDoContrato(ServicoOnline servicoOnline) {
		this.servicoOnline = servicoOnline;
	}

	public void processamento(Contrato contrato, Integer meses) {
		double parcelamento = contrato.getValorTotal() / meses;
		
		for(int i=1; i<=meses; i++) {
			cal.setTime(contrato.getData());
			double somaJurosSimples = parcelamento + servicoOnline.juros(parcelamento, i);
			double somaTaxa = somaJurosSimples + servicoOnline.taxaDepagamentos(somaJurosSimples);
			cal.add(Calendar.MONTH, i);
			contrato.addParcelas(new Parcelas(cal.getTime(),somaTaxa));
		}
		
		
	}

}
