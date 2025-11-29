package com.loiane.javabasico.aula15.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("---------------------");
		System.out.println("M - matutino");
		System.out.println("V - vespertino");
		System.out.println("N - noturno");
		System.out.println("---------------------");
		System.out.println("Digite o turno que voce estuda:");
		String turno = scan.next();
		
		if (turno.equalsIgnoreCase("m")) {
			System.out.println("Boa Dia!");
		} else if (turno.equalsIgnoreCase("v")) {
			System.out.println("Boa Tarde!");
		} else if (turno.equalsIgnoreCase("n")) {
			System.out.println("Boa Noite!");
		} else {
			System.out.println("Valor inválido!");
		}

		switch (turno) {
		case "m":
		case "M": 
			System.out.println("Bom Dia!"); 
			break;
		case "v":
		case "V": 
			System.out.println("Boa Tarde!");
			break;
		case "n":
		case "N": 
			System.out.println("Boa Noite!");
			break;
		default: System.out.println("Valor inválido!");
		}
	}

}
