package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("Entre com o primeiro numero:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo numero:");
		int num2 = scan.nextInt();
		
		System.out.println("Contagem do " + num1 + " ate " + num2 + ":");
		
		System.out.print("[");
		for (int i = num1; i <= num2; i++) {
			soma += i;
			if (i < num2) {
				System.out.print(i + ", ");
			} else {
				System.out.println(i + "]");
			}
		}
		
		System.out.println("Soma de todos os numeros: " + soma);
	}

}
