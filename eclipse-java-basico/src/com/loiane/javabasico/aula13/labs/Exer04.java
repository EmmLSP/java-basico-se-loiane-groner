package com.loiane.javabasico.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.print("Entre com a segunda nota: ");
		double nota2 = scan.nextDouble();
		System.out.print("Entre com a terceira nota: ");
		double nota3 = scan.nextDouble();
		System.out.print("Entre com a quarta nota: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A media de notas é: " + media);
	}

}
