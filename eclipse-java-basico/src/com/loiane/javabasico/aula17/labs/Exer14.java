package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int pares = 0; 
		int impares = 0;
		String numeros = "";
		
		for (int i = 0; i < 10; i++) {	
			System.out.println("Entre com o " + (i + 1) + " numero:");
			num = scan.nextInt();
			numeros += num + " ";
			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println("numeros: " + numeros);
		System.out.println("Pares   : " + pares);
		System.out.println("Ímpares : " + impares);

	}

}
