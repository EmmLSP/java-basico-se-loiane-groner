package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Serie de Fibonacci
		// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,...
		
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0; // variavel auxiliar
		
		System.out.println("Entre com n-esimo termo da serie de fibonacci:");
		int termo = scan.nextInt();
		
		if (termo > 2) {
			System.out.print(primeiro + ", " + segundo + ", ");
		} else {
			if (termo == 1) {
				System.out.print("1");
			} else {
				System.out.print("1, 1");
			}
		}
		
		for (int i = 2; i < termo; i++) {
			proximo = primeiro + segundo;
			if (i < termo - 1) {
				System.out.print(proximo + ", ");
			} else {
				System.out.println(proximo);
			}
			primeiro = segundo;
			segundo = proximo;
		}
		
		// resetando as variaveis de cima
		primeiro = 1;
		segundo = 1;
		proximo = 0;
		
		// 1, 1, 2, 3, 5,...
		// primeiro = 1, 0, 1, 1, 2
		// segundo  = 0, 1, 1, 2, 3
		// proximo  = 1, 1, 2, 3, 5
		
		// System.out.println(primeiro);
		// System.out.println(segundo);
		
		// de 1, 1, ..., n-esimo
		for (int i = 1; i <= termo; i++) {
			primeiro = segundo;
			segundo = proximo;
			proximo = primeiro + segundo;
			if (i < termo) {
				System.out.print(proximo + ", ");
			} else {
				System.out.println(proximo);
			}
		}
	}

}
