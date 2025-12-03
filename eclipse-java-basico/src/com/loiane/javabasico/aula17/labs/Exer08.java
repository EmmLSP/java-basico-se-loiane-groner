package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String numeros = "";
		int num;
		double soma = 0, media;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Entre com o " + (i + 1) + " numero:");
			num = scan.nextInt();
			soma += num; // variavel acumuladora
			numeros += num + " ";
		}
		media = soma / 5;
		
		System.out.println(numeros);
		System.out.println("A soma dos numeros é: " + soma);
		System.out.println("A media dos numeros é: " + media);
	}

}
