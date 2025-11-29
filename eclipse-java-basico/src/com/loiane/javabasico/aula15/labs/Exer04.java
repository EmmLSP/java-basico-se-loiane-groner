package com.loiane.javabasico.aula15.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra:");
		String letra = scan.next();
		
		System.out.println(letra + " - quantidade de caracteres: " + letra.length());
		
		// Teste em Java
		// usa bibliotecas como junit, mockito
		// time de qualidade -> QA
		// Testes, TDD, caixa preta, teste de integracao
		
		if (letra.length() > 1) {
			System.out.println("Não é uma letra válida!");
		} else {
			if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("á") ||
				letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("é") ||
				letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("í") ||
				letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("ó") ||
				letra.equalsIgnoreCase("u") || letra.equalsIgnoreCase("ú")) {
					System.out.println(letra + " é uma vogal");
			} else {
				System.out.println(letra + " é uma consoante");
			}
		}
		
		// metodo length() -> verificar quantos caracteres tem em uma String
		if (letra.length() > 1) {
			System.out.println("Não é uma letra válida!");
		} else {
			switch (letra) {
			case "a":
			case "A":
			case "á":
			case "Á":
			case "e":
			case "E":
			case "é":
			case "É":
			case "i":
			case "I":
			case "í":
			case "Í":
			case "o":
			case "O":
			case "ó":
			case "Ó":
			case "u":
			case "U": 
			case "ú":
			case "Ú": System.out.println(letra + " é uma vogal"); break;
			default: System.out.println(letra + " é uma consoante");
			}
		}
	}

}
