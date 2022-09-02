package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Parcelas;
import servicos.ServicoDoContrato;
import servicos.ServicoPaypal;

public class Programa {

	public static void main(String[] args) throws ParseException{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite os dados do contrato\n");
		System.out.println("Numero da conta");
		int numero = sc.nextInt();
		System.out.println("Data (DD/MM/YYYY)");
		Date data = sdf.parse(sc.next());
		System.out.println("Valor total:");
		double valorTotal = sc.nextDouble();
		System.out.println("Digite os numero de parcelas");
		int numero_parcelas = sc.nextInt();
		Contrato contrato = new Contrato(numero, data, valorTotal);
		
		ServicoDoContrato servicoDoContrato = new ServicoDoContrato(new ServicoPaypal());
		
		servicoDoContrato.processamento(contrato, numero_parcelas);
		
		System.out.println("PARCELAS: ");
		
		for(Parcelas x: contrato.getParcelasContrato()) {
			System.out.println(x);
			
		}
		
		sc.close();

	}

}
