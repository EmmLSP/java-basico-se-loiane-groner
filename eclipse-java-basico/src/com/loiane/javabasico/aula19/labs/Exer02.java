package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// new int[8] -> referencia do tamanho do vetorA
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao " + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * 2;
		}

		System.out.print("VetorA = [");
		for (int i = 0; i < vetorA.length; i++) {
			if (i < vetorA.length - 1) {
				System.out.print(vetorA[i] + ", ");
			} else {
				System.out.println(vetorA[i] + "]");
			}
		}

		System.out.print("VetorB = [");
		for (int i = 0; i < vetorB.length; i++) {
			if (i < vetorB.length - 1) {
				System.out.print(vetorB[i] + ", ");
			} else {
				System.out.println(vetorB[i] + "]");
			}
		}
	}

}
