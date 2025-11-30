package com.loiane.javabasico.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor de a:");
		double a = scan.nextDouble();
		
		if (a == 0) {
			System.out.println("A = 0, nao e equacao do 2 grau");
		} else {
			
			System.out.println("Entre com o valor de b:");
			double b = scan.nextDouble();
			
			System.out.println("Entre com o valor de c:");
			double c = scan.nextDouble();
			
			double delta = (Math.pow(b, 2)) - (4 * a * c);
			System.out.println("Delta: " + delta);
			
			if (delta < 0) {
				System.out.println("Delta < 0, nao possui raizes reais");
			} else {
				double x1 = (- b + Math.sqrt(delta)) / (2 * a);
				double x2 = (- b - Math.sqrt(delta)) / (2 * a);
				
				System.out.println("Raiz 1: " + x1);
				System.out.println("Raiz 2: " + x2);
				
				if (delta == 0) {
					System.out.println("Delta == 0, possui apenas uma raiz real");
				} else {
					System.out.println("Delta > 0, possui duas raizes reais");
				}
			}
		}
	}

}
