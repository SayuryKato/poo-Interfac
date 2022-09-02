package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private Integer numero;
	private Date data; 
	private Double valorTotal;
	
	List<Parcelas> parcelasContrato = new ArrayList<>();


	public Contrato(Integer numero, Date data, Double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Parcelas> getParcelasContrato() {
		return parcelasContrato;
	}
	
	public void addParcelas(Parcelas n_parcelas) {
		parcelasContrato.add(n_parcelas);
		
	}
	
	public void removeParcelas(Parcelas n_parcelas) {
		parcelasContrato.remove(n_parcelas);
	}
	
	
	
	
}