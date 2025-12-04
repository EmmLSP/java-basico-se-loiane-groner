package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero:");
		int qtdPrimos = scan.nextInt();
		
		boolean primo;
		
		System.out.println("Entre 1 e " + qtdPrimos + " os numeros primos sao:");
		
		for (int i = 1; i <= qtdPrimos; i++) {
			
			primo = true;
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
				}
 			}
			if (primo && i > 1) {
				System.out.print(i + " ");
			}
		}
	}

}
