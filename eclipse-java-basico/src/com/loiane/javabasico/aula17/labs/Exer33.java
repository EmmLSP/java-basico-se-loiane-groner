package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// s = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m
		
		double soma = 0;
		
		System.out.println("Digite o valor de n:");
		int n = scan.nextInt();
		
		System.out.print("S = ");
		for (int i = 1, j = 1; i <= n; i++, j+=2) {
			System.out.print(i + "/" + j + " + ");
			soma += i / j; 
		}
		System.out.println("... + n/m.");
		
		System.out.println("soma: " + soma);
	}

}
