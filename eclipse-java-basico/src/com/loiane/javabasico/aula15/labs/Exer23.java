package com.loiane.javabasico.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-------------------");
		System.out.println(" F- File Duplo");
		System.out.println(" A- Alcatra");
		System.out.println(" P- Picanha");
		System.out.println("-------------------");
		System.out.println("Entre com o tipo da carne:");
		String tipo = scan.next();
		
		System.out.println("Entre com a quantidade (Kg):");
		double qtdCarne = scan.nextDouble();
		
		boolean valida = true;
		double precoKg = 0;
		String tipoCarne = "";
		
		if (tipo.equalsIgnoreCase("F")) {
			if (qtdCarne <= 5) {
				precoKg = 4.9; 
			} else {
				precoKg = 5.8; 
			}
			tipoCarne = "File Duplo";
		} else if (tipo.equalsIgnoreCase("A")) {
			if (qtdCarne <= 5) {
				precoKg = 5.9; 
			} else {
				precoKg = 6.8; 
			}
			tipoCarne = "Alcatra";
		} else if (tipo.equalsIgnoreCase("P")) {
			if (qtdCarne <= 5) {
				precoKg = 6.9; 
			} else {
				precoKg = 7.8; 
			}
			tipoCarne = "Picanha";
		} else {
			System.out.println("Tipo de carne invalido!");
			valida = false;
		}
		
		double precoParcial = qtdCarne * precoKg;
		
		double desconto = 0;
		double precoTotal = precoParcial;
		String tipoPgmento = "";
		String msg = "";
		
		if (valida) {
			System.out.println("Deseja pagar no cartao? (S / N):");
			tipoPgmento = scan.next();

			if (tipoPgmento.equalsIgnoreCase("s")) {
				tipoPgmento = "cartao";
				desconto = (precoParcial / 100) * 5;
				precoTotal = precoParcial - desconto;
				msg = " Pagamento com cartao     : 5% desc";
			} else if (tipoPgmento.equalsIgnoreCase("n")) {
				tipoPgmento = "Dinheiro";
				msg = " Pagamento com dinheiro   : 0% desc";
			} else {
				System.out.println("Tipo de pagamento invalido!");
				valida = false;
			}
		}
		
		if (valida) {
			System.out.println("--------- INFORMACOES COMPRA ---------");
			System.out.println(" Tipo de carne            : " + tipoCarne);
			System.out.println(" Quantidade de carne      : " + String.format("%2.1f", qtdCarne) + " kg");
			System.out.println(" Tipo de pagamento        : " + tipoPgmento);
			System.out.println(msg);
			System.out.println(" Desconto de              : R$" + String.format("%5.2f", desconto));
			System.out.println(" Total sem desconto       : R$" + String.format("%5.2f", precoParcial));
			System.out.println(" Valor a pagar            : R$" + String.format("%5.2f", precoTotal));
			System.out.println("-------------------------------------");
		}
	}

}
