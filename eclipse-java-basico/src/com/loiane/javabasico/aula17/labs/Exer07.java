package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int maior = Integer.MIN_VALUE; // menor valor possivel para o Integer
		int menor = Integer.MAX_VALUE; // maior valor possivel para o Integer
		String numeros = "";
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Entre com o " + (i + 1) + " numero:");
			num = scan.nextInt();
			if (i < 5 - 1)
				numeros +=  num + ", ";
			else
				numeros +=  num + "";
			if (num > maior) {
				maior = num;
			}
			if (num < menor) {
				menor = num;
			}
		}
		
		System.out.println(numeros);
		System.out.println("O maior numero digitado foi: " + maior);
		System.out.println("O menor numero digitado foi: " + menor);
	}

}
