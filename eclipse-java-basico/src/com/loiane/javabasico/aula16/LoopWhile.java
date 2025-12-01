package com.loiane.javabasico.aula16;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = 1; // count ou cont
		int max = 10;
		
		System.out.println("\nContando de " + i + " até " + max + ":");
		
		// primeiro avalia a expressao
		// depois executa bloco de codigo
		// enquanto a expressao for verdadeira
		// ele executa a expressao dentro do
		// bloco de codigo
		
		while (i <= max) {
			System.out.println("  Valor de i: " + i);
			i++; // i = i + 1; ou i += 1;
		}
		
		System.out.println(i); // valor de 11
		
		// primeiro executa bloco de codigo
		// depois avalia a expressao
		// se a expressao for falsa ele executa
		// pelo menos 1 vez o bloco de codigo
		
		do {
			i++;
			System.out.println("  Valor de i: " + i);
		} while (i < 15);
		
		System.out.println(i);
	}

}
