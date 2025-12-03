package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// um numero primo e divisivel por 1 e por ele mesmo
		
		int num;
		
		System.out.println("Digite um numero:");
		num = scan.nextInt();
		
		int primo = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(num + " nao é primo - divisivel por " + i);
				primo++;
			}
		}
		
		if (primo == 2) {
			System.out.println(num + " é primo");
		} else {
			System.out.println(num + " nao é primo");
		}
		
		System.out.println("Digite um numero:");
		num = scan.nextInt();
		
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
