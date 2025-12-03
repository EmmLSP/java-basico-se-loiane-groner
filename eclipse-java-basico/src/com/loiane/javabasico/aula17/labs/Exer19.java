package com.loiane.javabasico.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		double nota, soma = 0, media;
		String notas = "";
		
		System.out.println("Entre com o numero de notas:");
		int numNotas = scan.nextInt();
		
		for (int i = 0; i < numNotas; i++) {
			System.out.println("Entre com a " + (i + 1) + " nota:");
			nota = scan.nextDouble();
			soma += nota;
			notas += nota + " ";
		}
		
		media = soma / numNotas;
		
		System.out.println(notas);
		System.out.println("Soma: " + String.format("%.1f", soma));
		System.out.println("Media: " + String.format("%.1f", media));
	}

}
