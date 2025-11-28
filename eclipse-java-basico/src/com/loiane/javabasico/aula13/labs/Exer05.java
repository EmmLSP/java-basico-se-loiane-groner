package com.loiane.javabasico.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com a quantidade de metros: ");
		double metros = scan.nextDouble();
		
		// 1m = 100 cm
		double cm = metros * 100;

		System.out.println(metros + " m é igual a " + cm + " cm");
		System.out.println(String.format("%.2f m é igual a %.0f cm", metros, cm));
	}

}
