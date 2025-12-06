package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int par = 0, impar;
		int porcPar, porcImpar;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao " + i);
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 2 == 0) {
				par++;
			}
		}

		// vetorA.length   - 100%
		// par             - x
		// ----------------------
		// x * vetorA.length == par * 100
		// x == (par * 100) / vetorA.length
		
		impar = vetorA.length - par;
		
		porcPar = (par * 100) / vetorA.length;
		
		//porcImpar = (impar * 100) / vetorA.length;
		
		porcImpar = 100 - porcPar;

		System.out.print("VetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Par = ");
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				System.out.print(vetorA[i] + " ");
			}
		}
		System.out.println();
		
		System.out.print("Impar = ");
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				System.out.print(vetorA[i] + " ");
			}
		}
		System.out.println();
		
		System.out.println("Percentual de numeros pares: " + porcPar + "%");
		System.out.println("Percentual de numeros impares: " + porcImpar + "%");
	}

}
