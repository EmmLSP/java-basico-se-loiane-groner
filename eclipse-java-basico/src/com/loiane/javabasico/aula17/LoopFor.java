package com.loiane.javabasico.aula17;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("valor de i: " + i);
		}
				
		// i esta dentro do escopo do loop for
		// e nao pode ser utilizado fora
		// erro -> System.out.println(i);
		
		for (int i = 5; i > 0; i--) {
			System.out.println("valor de i: " + i);
		}
		
		// for com mais de uma variavel de inicializacao
		
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);
		}
		
		// for com partes ausentes
		
		int count = 0;
		for (; count < 10;) {
			System.out.println("valor de count: " + count);
			count += 2;
		}
		
		for (int cont = 0; cont < 10; cont += 2) {
			System.out.println("valor de count: " + cont);
		}
		
		int soma = 0;
		for (int i = 1; i < 5; soma += i++);
		System.out.println("o valor da soma e " + soma);
		
		// for sem chaves { }
		// executa apenas uma linha
		for (int i = 0; i < 5; i++) 
			System.out.println("i tem valor de: " + i);
		
		// Loop melhorado
		// muito uitlizado com arrays
		
		
		
		
		
		
		
		
		
		
	}

}