package com.loiane.javabasico.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Farenheit:");
		double farenheit = scan.nextDouble();
		
		// C = (5 * (F - 32) / 9)
		double celsius = 5 * (farenheit - 32) / 9;
		
		System.out.printf("A temperatura %.2f°F convertido em celsius é igual %.2f°C", farenheit, celsius);
	}

}
