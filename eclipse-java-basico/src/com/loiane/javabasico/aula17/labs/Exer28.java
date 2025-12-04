package com.loiane.javabasico.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int num = scan.nextInt();
		
		boolean primoBool = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				primoBool = false;
				break;
			}
		}
		
		if (primoBool && num > 1) {
			System.out.println(num + " é primo");
		} else {
			System.out.println(num + " nao é primo");
		}
	}

}
