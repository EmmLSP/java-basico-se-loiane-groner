package com.loiane.javabasico.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Preco do Pao: R$ 0.18");
		
		System.out.println("Panificadora Pao de Ontem - Tabela de preços");
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$" + String.format("%5.2f", 0.18 * i));
		}
	}

}
