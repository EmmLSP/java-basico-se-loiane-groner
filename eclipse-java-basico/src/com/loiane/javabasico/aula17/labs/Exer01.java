package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		double nota;
		boolean notaValida = false;
		
		do {
			System.out.println("Entre com uma nota:");
			nota = scan.nextDouble();
			if (nota >= 0 && nota <= 10) {
				System.out.println("Voce digitou: " + nota);
				notaValida = true;
			} else {
				System.out.println("Nota invalida, digite novamente.");
			} 
		} while (!notaValida);
		
		notaValida = false;
		nota = 0;
		
		while (!notaValida) {
			System.out.println("Entre com uma nota:");
			nota = scan.nextDouble();
			if (nota >= 0 && nota <= 10) {
				System.out.println("Voce digitou: " + nota);
				notaValida = true;
			} else {
				System.out.println("Nota invalida, digite novamente.");
			}
		}
	}

}
