package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int somaMenor15 = 0;
		int numIgual15 = 0;
		int somaMaior15 = 0;
		int maior15 = 0;
		double media = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao " + i);
			vetorA[i] = scan.nextInt();
			if (vetorA[i] < 15) {
				somaMenor15 += vetorA[i];
			} else if (vetorA[i] == 15) {
				numIgual15++;
			} else { // vetorA[i] > 15
 				somaMaior15 += vetorA[i];
				maior15++;
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Menor que 15 = ");
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] < 15) {
				System.out.print(vetorA[i] + " ");
			}
		}
		System.out.println();
		
		System.out.print("Maior que 15 = ");
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] > 15) {
				System.out.print(vetorA[i] + " ");
			}
		}
		System.out.println();
		
		if (maior15 > 0) {
			media = somaMaior15 / maior15;
		}
		
		System.out.println("Quantidade de numeros igual a 15: " + numIgual15);
		System.out.println("Soma dos numeros menor que 15: " + somaMenor15);
		System.out.println("Soma dos numeros maior que 15: " + somaMaior15);
		System.out.println("Media dos numeros maior que 15: " + media);
	}

}
