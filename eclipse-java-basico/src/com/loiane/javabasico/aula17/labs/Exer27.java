package com.loiane.javabasico.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		boolean continuar = false;
		double temp, soma = 0, media;
		double maiorTemp = Double.MIN_VALUE; // menor valor possivel
		double menorTemp = Double.MAX_VALUE; // maior valor possivel
		String temperaturas = "Temperaturas registradas:\n";

		System.out.println("Entre com a quantidade de temperaturas:");
		int qtdTemp = scan.nextInt();
			
		for (int i = 1; i <= qtdTemp; i++) {
			System.out.println("Entre com a temperatura " + i);
			temp = scan.nextDouble();
			soma += temp;
			if (temp > maiorTemp) {
				maiorTemp = temp;
			}
			if(temp < menorTemp) {
				menorTemp = temp;
			}
			if (i < qtdTemp) {
				temperaturas += temp + ", ";
			} else {
				temperaturas += temp;
			}
		}
		
		media = soma / qtdTemp;
		
		System.out.println(temperaturas);
		System.out.println("Media: " + media);
		System.out.println("Maior temperatura: " + maiorTemp);
		System.out.println("Menor temperatura: " + menorTemp);
	}

}
