package servicos;

public class ServicoPaypal implements ServicoOnline{
	
	private Double jurosSimples = 0.01;
	private Double taxaPagamento = 0.02;

	@Override
	public Double taxaDepagamentos(Double qtd_parcelas) {
		return  taxaPagamento * qtd_parcelas ;
	}

	@Override
	public Double juros(Double qtd_parcelas, Integer meses) {
		return jurosSimples * qtd_parcelas * meses;
	}

}
