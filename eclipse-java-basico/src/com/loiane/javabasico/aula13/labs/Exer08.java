package com.loiane.javabasico.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor/hora:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com a quantidade de horas trabalhadas no mes:");
		int horas = scan.nextInt();
		
		double salario = valorHora * horas;
		
		System.out.println("O salario total no final do mes sera de US$" + String.format("%,.2f", salario));
	}

}
