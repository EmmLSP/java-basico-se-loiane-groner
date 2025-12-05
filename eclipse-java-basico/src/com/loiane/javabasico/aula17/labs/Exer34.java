package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de n:");
		int n = scan.nextInt();
		
		double soma = 1;
		
		if (n > 1) {
			System.out.print("1 + ");
		}
		
		for (int i = 2; i <= n; i++) {
			if (i < n) {
				System.out.print(1 + "/" + i + " + ");
			} else {
				System.out.println(1 + "/" + i);
			}
			soma += 1 / i;
		}
		
		System.out.println("Soma: " + soma);

	}

}
