package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		boolean validaIdade;
		
		for (int i = 0; i < idades.length; i++) {
			validaIdade = false;
			do {
				System.out.println("Entre com a idade da pessoa " + (i + 1));
				idades[i] = scan.nextInt();
				if (idades[i] >= 0 && idades[i] <= 100) {
					validaIdade = true;
				} else {
					System.out.println("Idade precisa ser entre 0 e 100");
				}
			} while(!validaIdade);
		}
		
		// aqui as posicoes do vetor idades[i] ja estao preenchidas
		int menorIdade = idades[0];
		int indexMenor = 0;
		int maiorIdade = idades[0];
		int indexMaior = 0;
		
		for (int i = 1; i < idades.length; i++) {
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				indexMaior = i;
			} else if (idades[i] < menorIdade) {
				menorIdade = idades[i];
				indexMenor = i;
			}
		}
		
		System.out.print("Vetor de idades: ");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		System.out.println();
		
		// 23 26 12 34 67 54 37 32 28 19 

		System.out.println("Menor idade: " + menorIdade);
		System.out.println("Index menor idade: " + indexMenor);
		System.out.println("Maior idade: " + maiorIdade);
		System.out.println("Index maior idade: " + indexMaior);
	}

}
