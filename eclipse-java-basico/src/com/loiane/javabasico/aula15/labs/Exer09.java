package com.loiane.javabasico.aula15.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo numero:");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com o terceiro numero:");
		int num3 = scan.nextInt();
		
		// ordem decrescente -> do maior para o menor
		
		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
			// num1 e menor
			// num3 e maior
			// num1 < num2 < num3
			System.out.println(String.format("%d, %d, %d", num3, num2, num1));
		} else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
			// num1 e menor
			// num2 e maior
			// num2 < num1 < num3 < num2
			System.out.println(String.format("%d, %d, %d", num2, num3, num1));
		} else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
			// num2 e menor
			// num3 e maior
			// num2 < num1 < num3
			System.out.println(String.format("%d, %d, %d", num3, num1, num2));
		} else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
			// num2 e menor
			// num1 e maior
			// num2 < num3 < num1
			System.out.println(String.format("%d, %d, %d", num1, num3, num2));
		} else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
			// num3 e menor
			// num2 e maior
			// num3 < num1 < num2
			System.out.println(String.format("%d, %d, %d", num2, num1, num3));
		} else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
			// num3 e menor
			// num1 e maior
			// num3 < num2 < num1
			System.out.println(String.format("%d, %d, %d", num1, num2, num3));
		}

		if (num1 >= num2 && num1 >= num3) {
			if (num2 <= num3) {
				System.out.println(String.format("%d, %d, %d", num1, num3, num2));
			} else {
				System.out.println(String.format("%d, %d, %d", num1, num2, num3));
			}
		} else if (num2 >= num1 && num2 >= num3) {
			if (num1 <= num3) {
				System.out.println(String.format("%d, %d, %d", num2, num3, num1));
			} else {
				System.out.println(String.format("%d, %d, %d", num2, num1, num3));
			}
		} else if (num3 >= num1 && num3 >= num2) {
			if (num1 <= num2) {
				System.out.println(String.format("%d, %d, %d", num3, num2, num1));
			} else {
				System.out.println(String.format("%d, %d, %d", num3, num1, num2));
			}
		}
	}

}
