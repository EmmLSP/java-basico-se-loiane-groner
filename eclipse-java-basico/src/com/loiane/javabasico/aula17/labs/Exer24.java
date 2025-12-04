package com.loiane.javabasico.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Preco do Pao: R$ 0.18");
		
		System.out.println("Panificadora Pao de Ontem - Tabela de preços");

		/*
		 * Java com numeros inteiros nao possui 
		 * precisao matematica
		 * 1 - R$0.18
		 * 2 - R$0.36
		 * 3 - R$0.54
		 * 4 - R$0.72
		 * 5 - R$0.8999999999999999
		 * 6 - R$1.08
		 */
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$" + (0.18 * i));
		}
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$" + String.format("%5.2f", 0.18 * i));
		}
	}

}
