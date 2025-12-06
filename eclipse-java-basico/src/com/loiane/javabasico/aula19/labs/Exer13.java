package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int multiplos5 = 0;
		int soma = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao " + i);
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 5 == 0) {
				soma += vetorA[i];
				multiplos5++;
			}
			
		}
		
		System.out.print("Vetor A = [");
		for (int i = 0; i < vetorA.length; i++) {
			if (i < vetorA.length - 1) {
				System.out.print(vetorA[i] + ", ");
			} else {
				System.out.println(vetorA[i] + "]");
			}
		}
		
		System.out.print("Multiplos de 5: [");
		for (int i = 0, j = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 5 == 0) {
				if (j < multiplos5 - 1) {
					System.out.print(vetorA[i] + ", ");
				} else {
					System.out.println(vetorA[i] + "]");
				}
				j++;
			} 
		}
		
		System.out.println("Quantidade de numeros multiplos de 5: " + multiplos5);
		System.out.println("Soma de numeros multiplos de 5: " + soma);
	}

}
