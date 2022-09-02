package servicos;

public interface ServicoOnline {
	
	Double taxaDepagamentos(Double qtd_parcelas);
	Double juros(Double qtd_parcelas, Integer meses);

}
