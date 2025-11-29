package com.loiane.javabasico.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o preco do produto1:");
		double preco1 = scan.nextDouble();
		
		System.out.println("Entre com o preco do produto2:");
		double preco2 = scan.nextDouble();
		
		System.out.println("Entre com o preco do produto3:");
		double preco3 = scan.nextDouble();
		
		String valorFormatado = "";
		
		if (preco1 <= preco2 && preco1 <= preco3) {
			valorFormatado = String.format("%.2f", preco1);
			System.out.println("Compre o produto 1 porque e mais barato: R$" + valorFormatado);
		} else if (preco2 <= preco1 && preco2 <= preco3) {
			valorFormatado = String.format("%.2f", preco2);
			System.out.println("Compre o produto 2 porque e mais barato: R$" + valorFormatado);
		} else if (preco3 <= preco1 && preco3 <= preco2) {
			valorFormatado = String.format("%.2f", preco3);
			System.out.println("Compre o produto 3 porque e mais barato: R$" + valorFormatado);
		}
	}

}
