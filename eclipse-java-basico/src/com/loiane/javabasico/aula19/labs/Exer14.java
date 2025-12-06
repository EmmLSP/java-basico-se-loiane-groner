package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma = 0;
		int impares = 0;
		double media = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao " + i);
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				impares++;
			}
		}
		
		System.out.print("VetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		if (impares > 0) {
			System.out.print("Impares = ");
		} else {
			System.out.println("Nenhum numero impar foi digitado!");
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				System.out.print(vetorA[i] + " ");
			}
		}
		System.out.println();
		
		if (impares > 0) {
			media = soma / impares;
		}
			
		System.out.println("Quantidade de numeros impares: " + impares);
		System.out.println("Soma de todos os numeros impares: " + soma);
		System.out.println("Media de todos os numeros impares: " + media);
	}

}
