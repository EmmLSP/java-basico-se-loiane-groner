package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao " + i);
			vetorA[i] = scan.nextInt();
			soma += vetorA[i];
		}
		
		System.out.print("numeros: ");
		for (int num : vetorA) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.print("soma: ");
		for (int i = 0; i < vetorA.length; i++) {
			if (i < vetorA.length - 1) {
				System.out.print(vetorA[i] + " + ");
			} else {
				System.out.println(vetorA[i] + " = " + soma);
			}
		}
		
		System.out.println("Soma de todos os numeros do vetorA: " + soma);
	}

}
