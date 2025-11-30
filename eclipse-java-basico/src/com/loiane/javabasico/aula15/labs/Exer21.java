package com.loiane.javabasico.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de litros vendido:");
		double litros = scan.nextDouble();
		
		System.out.println("Entre com o tipo de combustivel (A-alcool ou G-gasolina):");
		String tipo = scan.next();
		
		double precoGasolina = 2.5; // constante
		double precoAlcool = 1.9; // constante
		int percentual = 0;
		double total = 0; 
		
		if (tipo.equalsIgnoreCase("A")) {
			if (litros <= 20) {
				percentual = 3;
			} else {
				percentual = 5;
			}
			total = precoAlcool * litros;
		} else if (tipo.equalsIgnoreCase("G")) {
			if (litros <= 20) {
				percentual = 4;
			} else {
				percentual = 6;
			}
			total = precoGasolina * litros;
		}
		
		double precoPagar = total - ((total / 100) * percentual);
		
		System.out.println("Valor a ser pago: R$ " + String.format("%.2f", precoPagar));
	}

}
