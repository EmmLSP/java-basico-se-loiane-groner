package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a base:");
		int base = scan.nextInt();
		
		System.out.println("Entre com a potencia:");
		int expoente = scan.nextInt();
		
		/**
		 * base = 2
		 * expoente = 3
		 * 
		 *  res = 1
		 * i = i = 0; i < expoente;
		 * res *= base;
		 * 1 *= 2;
		 * 2 *= 2;
		 * 4 *= 2;
		 * res = 2 * 2 * 2 = 8 (0, 1, 2 < 3)
		 */
		
		// 2^2 = 2 * 2
		// 2^3 = 2 * 2 * 2
		
		int resultado = base;
		for (int i = 1; i < expoente; i++) {
			resultado *= base;
		}
		
		System.out.println("Resultado1: " + base + "^" + expoente + " = " + resultado);
		
		resultado = 1;
		for (int i = 0; i < expoente; i++) {
			resultado *= base;
		}
		
		System.out.println("Resultado2: " + base + "^" + expoente + " = " + resultado);
	}

}
