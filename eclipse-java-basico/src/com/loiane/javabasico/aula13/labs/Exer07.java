package com.loiane.javabasico.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do lado do quadrado:");
		double lado = scan.nextDouble();
		
		// area = lado * lado
		double area = Math.pow(lado, 2);
		
		System.out.println("A area do quadrado é: " + String.format("%.1f", area));
		System.out.println("O dobro da area do quadrado é: " + String.format("%.1f", (area * 2)));
	}

}
