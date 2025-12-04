package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int fatorial = 1;
		
		System.out.println("Entre com um numero para calcular o fatorial:");
		int num = scan.nextInt();
		
		String output = num + "! = ";
		
		System.out.println("Fatorial de: " + num);
		
		for (int i = num; i > 0; i--) {
			fatorial *= i;
			if (i > 1) {
				output += i + " . ";
			} else {
				output += i + " = " + fatorial + "\n";
			}
		}
		
		System.out.println(output);
	}

}
