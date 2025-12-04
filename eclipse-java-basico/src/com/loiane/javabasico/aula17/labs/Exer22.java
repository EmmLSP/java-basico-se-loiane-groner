package com.loiane.javabasico.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		double soma = 0;
		double precoCD;
		double mediaCD;
		String valoresCD = "";
		
		System.out.println("Entre com  numero de cds:");
		int cds = scan.nextInt();
		
		for (int i = 0; i < cds; i++) {
			System.out.println("Informe o valor do cd: " + (i + 1));
			precoCD = scan.nextDouble();
			soma += precoCD;
			valoresCD += String.format("CD %d - R$%6.2f\n", (i + 1), precoCD);
		}

		mediaCD = soma / cds;
			
		System.out.println("Valores dos CDs [" + cds + "]:");
		System.out.println("--------------------");
		System.out.print(valoresCD);
		System.out.println("--------------------");
		System.out.println("Média gasta com cada CD : R$" + String.format("%6.2f", mediaCD));
		System.out.println("Valor total investido   : R$" + String.format("%6.2f", soma));
	}

}
