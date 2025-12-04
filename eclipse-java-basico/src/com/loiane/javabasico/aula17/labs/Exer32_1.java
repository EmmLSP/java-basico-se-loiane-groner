package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer32_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean sair = false;
		boolean continuar;
		boolean codValido;
		int codigo;
		double total, totalPagar = 0;
		String output = "";
		String resp;
		
		while (!sair) {
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
			
			codValido = false;
			do {
				System.out.println("Digite o codigo de item:");
				codigo = scan.nextInt();
				if (codigo >= 100 && codigo <= 105) {
					codValido = true;
				} else {
					System.out.println("Codigo invalido!");
				}
			} while (!codValido);
			
			System.out.println("Digite a quantidade desejada:");
			int qtd = scan.nextInt();
			
			total = 0;
			
			switch (codigo) {
				case 100:
					total = qtd * 1.2;
					output += qtd + "x Cachorro Quente   total R$ " + total + "\n";
					break;
				case 101:
					total = qtd * 1.3;
					output += qtd + "x Bauru Simples     total R$ " + total + "\n";
					break;
				case 102:
					total = qtd * 1.5;
					output += qtd + "x Bauru com ovo     total R$ " + total + "\n";
					break;
				case 103:
					total = qtd * 1.2;
					output += qtd + "x Hamburger         total R$ " + total + "\n";
					break;
				case 104:
					total = qtd * 1.3;
					output += qtd + " Hamburger         total R$ " + total + "\n";
					break;
				case 105:
					total = qtd * 1.0;
					output += qtd + "x Refrigerante      total R$ " + total + "\n";
			}
			
			totalPagar += total; 
			
			System.out.println("Total " + totalPagar + "\n");
			
			continuar = false;
			do {
				System.out.println("Quer continuar? (S/N) ");
				resp = scan.next();
				if (resp.equalsIgnoreCase("s") || resp.equalsIgnoreCase("n")) {
					continuar = true;
				}
			} while (!continuar);
			
			if (resp.equalsIgnoreCase("n")) {
				sair = true;
				output += "----------------------------------\n";
				output += "Total a pagar              R$ " + totalPagar;
			}
		}
		
		System.out.println("----------------------------------");
		System.out.println(output);
		System.out.println("----------------------------------");
	}

}
