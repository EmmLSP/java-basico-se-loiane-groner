package com.loiane.javabasico.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);

		/*
		 * Java com numeros inteiros nao possui 
		 * precisao matematica
		 * existem classes no Java caso seja 
		 * preciso precisao matematica
		 * ---------------------------
		 * 1 - R$0.18
		 * 2 - R$0.36
		 * 3 - R$0.54
		 * 4 - R$0.72
		 * 5 - R$0.8999999999999999
		 * 6 - R$1.08
		 */
		
		boolean sair = false;
		boolean validaDinheiro;
		String continuarCompra;
		int produtos;
		double preco;
		double total;
		String output;
		double valorPago;
		double troco;
		
		do {
			System.out.println("Deseja informar uma nova compra? S/N");
			continuarCompra = scan.next();
	
			if (continuarCompra.equalsIgnoreCase("s")) {
				
				output = "Lojas Guanabara\n"; // resetando variavel para proxima compra
				
				System.out.println("Digite a quantidade de produtos da compra:");
				produtos = scan.nextInt();
				
				total = 0; // resetar variavel, para uma nova compr
				
				for (int i = 1; i <= produtos; i++) {
					System.out.println("Informe o preco do produto " + i + ":");
					preco = scan.nextDouble();
					total += preco;
					output += "Produto " + i + ": R$ " + preco + "\n";
				}
				
				System.out.println("Total R$ " + total);
				
				output += "Total    : R$ " + total + "\n";

				validaDinheiro = false;
				do {
					System.out.println("Entre com o valor pago:");
					valorPago = scan.nextDouble();
					if (valorPago < total) {
						System.out.println("Compra deu R$ " + total + ", valor precisa ser maior que R$ " + total); 
					} else {
						validaDinheiro = true;
					}
				} while (!validaDinheiro);
				
				output += "Dinheiro : R$ " + valorPago + "\n";
				
				troco = valorPago - total;
				
				output += "Troco    : R$ " + troco;
				
				System.out.println(output); // saida da nota fiscal
				
			} else if (continuarCompra.equalsIgnoreCase("n")) {
				sair = true;
			} else {
				System.out.println("Entrada invalida, digite novamente.");
			}
			
		} while (!sair);
		
		System.out.println("Fim da compra!");
	}

}
