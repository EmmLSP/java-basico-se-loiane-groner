package com.loiane.javabasico.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com a segunda nota:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		String aproveitamento = "";
		if (media >= 9 && media <= 10) {
			aproveitamento = "A";
		} else if (media >= 7.5 && media < 9) {
			aproveitamento = "B";
		} else if (media >= 6 && media < 7.5) {
			aproveitamento = "C";
		} else if (media >= 4 && media < 6) {
			aproveitamento = "D";
		} else if (media >= 0 && media < 4) {
			aproveitamento = "E";
		}
		
		System.out.println("Nota1: " + String.format("%.1f", nota1));
		System.out.println("Nota2: " + String.format("%.1f", nota2));
		System.out.println("Media: " + String.format("%.1f", media));
		System.out.print("Conceito: " + aproveitamento + " - ");
		
		// com Strings usa metodo equals() para fazer comparacao
		switch (aproveitamento) {
		case "A": 
		case "B":
		case "C": 
			System.out.println("APROVADO!"); 
			break;
		default:
			System.out.println("REPROVADO!");
		}
	}

}
