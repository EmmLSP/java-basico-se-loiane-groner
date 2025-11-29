package com.loiane.javabasico.aula15.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo numero:");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com o terceiro numero:");
		int num3 = scan.nextInt();
		
		System.out.println(String.format("[%d, %d, %d]", num1, num2, num3));
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("num1 é maior: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("num2 é maior: " + num2);
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.println("num3 é maior: " + num3);
		}
		
		if (num1 <= num2 && num1 <= num3) {
			System.out.println("num1 é menor: " + num1);
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println("num2 é menor: " + num2);
		} else if (num3 <= num1 && num3 <= num2) {
			System.out.println("num3 é menor: " + num3);
		}
		
		System.out.println();
		
		System.out.println(String.format("[%d, %d, %d]", num1, num2, num3));
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("num1 é maior: " + num1);
			if (num2 >= num3) {
				System.out.println("num3 é menor: " + num3);
			} else {
				System.out.println("num2 é menor: " + num2);
			}
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("num2 é maior: " + num2);
			if (num1 >= num3) {
				System.out.println("num3 é menor: " + num3);
			} else {
				System.out.println("num1 é menor: " + num1);
			}
		} else {
			System.out.println("num3 é maior: " + num3);
			if (num1 >= num2) {
				System.out.println("num2 é menor: " + num2);
			} else {
				System.out.println("num1 é menor: " + num1);
			}
		}
	}

}
