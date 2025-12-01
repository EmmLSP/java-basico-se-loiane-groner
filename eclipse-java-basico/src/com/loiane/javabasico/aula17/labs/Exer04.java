package com.loiane.javabasico.aula17.labs;

public class Exer04 {

	public static void main(String[] args) {
		
		int paisA = 80000;
		int paisB = 200000;
		int i, j, cont = 0;
		
		for (i = paisA, j = paisB; i < j; i += (i / 100) * 3, j += (j / 100) * 1.5) {
			System.out.println("pais A = "  + i + "; pais B = " + j);
			cont++;
		}
	
		System.out.println("Populacao A: " + i);
		System.out.println("Populacao B: " + j);
		System.out.println("Quantidade de anos: " + cont + " anos.");
		
		int popA = 80000;
		int popB = 200000;
		cont = 0;
		
		while (popA < popB) {
			popA += (popA / 100) * 3;
			popB += (popB / 100) * 1.5;
			cont++;
		}
		
		System.out.println("Populacao A: " + popA);
		System.out.println("Populacao B: " + popB);
		System.out.print("Quantidade de anos: " + cont + " anos.");
	}

}
