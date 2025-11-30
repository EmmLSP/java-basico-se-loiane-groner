package com.loiane.javabasico.aula15.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero:");
		int numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println(numero + " é PAR");
		} else {
			System.out.println(numero + " é ÍMPAR");
		}
	}

}
