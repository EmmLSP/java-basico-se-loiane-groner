package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;
import java.util.Random;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Random random = new Random();
		
		int[] vetorA = new int[10];
		int[] vetorPar = new int[vetorA.length];
		int pares = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao " + i);
			vetorA[i] = scan.nextInt();
			//vetorA[i] = random.nextInt(100) + 1; // gera numeros de 1 ate 100
			if (vetorA[i] % 2 == 0) {
				//pares += 1;
				pares++;
			}
		}
		
		for (int i = 0, j = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				vetorPar[j] = vetorA[i];
				j++;
			}
		}
		
		System.out.print("Vetor A -> ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("PARES -> ");
		for (int i = 0; i < pares; i++) {
			System.out.print(vetorPar[i] + " ");
		}
		System.out.println();
		
		System.out.println("Quantidade de numeros pares: " + pares);
	}

}
