package com.loiane.javabasico.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius:");
		double celsius = scan.nextDouble();
		
		// F = (C * 9/5) + 32
		double farenheit = (celsius * 9/5) + 32;
		
		System.out.printf("A temperatura %.2f°C é igual %.2f°F", celsius, farenheit);
	}

}
