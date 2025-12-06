package com.loiane.javabasico.aula19.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		int idadeMaior35 = 0;
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Entre com a idade da pessoa " + (i + 1));
			idades[i] = scan.nextInt();
			if (idades[i] > 35) {
				idadeMaior35++;
			}
		}
		
		System.out.print("Vetor idades: ");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		System.out.println();
		
		System.out.print("idades > 35: ");
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] > 35) {
				System.out.print(idades[i] + " ");
			}
		}
		System.out.println();
		
		System.out.println("Quantidade de pessoas com idade > 35: " + idadeMaior35);
	}

}
