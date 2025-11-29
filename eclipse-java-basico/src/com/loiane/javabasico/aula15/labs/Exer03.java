package com.loiane.javabasico.aula15.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com uma letra [F-M]:");
		String letra = scan.next();
		
		// String e uma classe
		// Quando de compara uma String, nao usa operador ==
		// Porque para String a comparacao e de um objeto
		// que usa metodos da classe String
		
		// metodo de comparacao de String que nao considera o case
		if (letra.equals("M") || letra.equals("m")) {
			System.out.println("M - Masculino");
		} else if (letra.equals("F") || letra.equals("f")) {
			System.out.println("F - Feminino");
		} else {
			System.out.println("Sexo inválido!");
		}
		
		// metodo de comparacao de String que considera o case
		if (letra.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino");
		} else if (letra.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino");
		} else {
			System.out.println("Sexo inválido!");
		}
	}

}
