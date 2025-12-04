package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer32_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean naoTerminar = true;
		double total = 0;
		int cod, qtd;
		String output = "";
		
		do {
			System.out.println("Digite o codigo e a quantidade. Digite 0 0 para sair:");
			cod = scan.nextInt();
			qtd = scan.nextInt();
			
			if (cod == 0 && qtd == 0) {
				naoTerminar = false;
				output += "Total a pagar = " + total;
			} else {
				System.out.println("----------------------------------");
				System.out.println("Especificacao    codigo    Preco");
				System.out.println("----------------------------------");
				System.out.println("Cachorro Quente  100       R$ 1.20");
				System.out.println("Bauru Simples    101       R$ 1.30");
				System.out.println("Bauru com ovo    102       R$ 1.50");
				System.out.println("Hamburger        103       R$ 1.20");
				System.out.println("Cheeseburguer    104       R$ 1.30");
				System.out.println("Refrigerante     105       R$ 1.00");
				System.out.println("----------------------------------");
				
				if (cod == 100) {
					output += "Cachorro Quente -> 1,20 * " + qtd;
					output += " = " + (1.2 * qtd) + "\n";
					total += 1.2 * qtd;
				} else if (cod == 101) {
					output += "Bauru Simples   -> 1,30 * " + qtd;
					output += " = " + (1.3 * qtd) + "\n";
					total += 1.3 * qtd;
				} else if (cod == 102) {
					output += "Bauru com ovo   -> 1,50 * " + qtd;
					output += " = " + (1.5 * qtd) + "\n";
					total += 1.5 * qtd;
				} else if (cod == 103) {
					output += "Hamburguer      -> 1,20 * " + qtd;
					output += " = " + (1.2 * qtd) + "\n";
					total += 1.2 * qtd;
				} else if (cod == 104) {
					output += "Cheeseburguer   -> 1,30 * " + qtd;
					output += " = " + (1.3 * qtd) + "\n";
					total += 1.3 * qtd;
				} else if (cod == 105) {
					output += "Refrigerante    -> 1,00 * " + qtd;
					output += " = " + (1 * qtd) + "\n";
					total += 1 * qtd;
				}
			}
		
		} while (naoTerminar);
		
		System.out.println(output);
	}

}
