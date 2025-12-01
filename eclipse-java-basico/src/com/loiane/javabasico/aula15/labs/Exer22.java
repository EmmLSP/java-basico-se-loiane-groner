package com.loiane.javabasico.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade (Kg) de morango:");
		double qtdKgMorango = scan.nextDouble();
	
		System.out.println("Entre com a quantidade (Kg) de maca:");
		double qtdKgMaca = scan.nextDouble();
		
		double precoKgMorango = 0;
		if (qtdKgMorango <= 5) {
			precoKgMorango = 2.5;
		} else {
			precoKgMorango = 2.2; 
		}
		
		double precoKgMaca = 0;
		if (qtdKgMaca <= 5) {
			precoKgMaca = 1.8;
		} else {
			precoKgMaca = 1.5; 
		}
		
		double precoTotalMorango = qtdKgMorango * precoKgMorango;
		double precoTotalMaca =  qtdKgMaca * precoKgMaca;
		double precoParcialFrutas = precoTotalMorango + precoTotalMaca;
		double totalPagar = precoParcialFrutas; // preco total sem desconto de 10%
		
		double desconto = 0;
		String desconto10 = "";
		
		if ((qtdKgMorango + qtdKgMaca) > 8 || (precoParcialFrutas > 25)) {
			desconto = (precoParcialFrutas / 100) * 10;
			desconto10 = "Voce recebeu desconto de 10%";
			totalPagar = precoParcialFrutas - desconto;
		} else {
			desconto10 = "Voce nao recebeu desconto de 10%";
		}
		
		System.out.println("---------------------------------------");
		System.out.println("Preco por Kg morango     : " + precoKgMorango);
		System.out.println("Quantidade Kg morango    : " + qtdKgMorango + " Kg");
		System.out.println("Total morango            : R$ " + precoTotalMorango);
		System.out.println("Preco por Kg maca        : " + precoKgMaca);
		System.out.println("Quantidade Kg maca       : " + qtdKgMaca + " Kg");
		System.out.println("Total maca               : R$ " + precoTotalMaca);
		System.out.println("---------------------------------------");
		System.out.println("Total das frutas         : R$ " + String.format("%.2f", precoParcialFrutas));
		System.out.println("Total desconto           : R$ " + String.format("%.2f", desconto));
		System.out.println("Total a pagar das frutas : R$ " + String.format("%.2f", totalPagar));
		System.out.println("---------------------------------------");
		System.out.println(desconto10);
	}

}
