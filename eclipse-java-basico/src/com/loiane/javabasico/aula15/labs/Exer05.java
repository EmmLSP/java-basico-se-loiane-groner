package com.loiane.javabasico.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com a segunda nota:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		System.out.print("Media: " + String.format("%.2f", media) + " - ");
		
		if (media == 10) {
			System.out.println("Aprovado com distincao!");
		} else if (media >= 7) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
	}

}
