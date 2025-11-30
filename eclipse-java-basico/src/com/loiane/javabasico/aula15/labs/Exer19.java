package com.loiane.javabasico.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro numero:");
		double num1 = scan.nextDouble();

		System.out.println("Entre com o segundo numero:");
		double num2 = scan.nextDouble();

		System.out.println("----------------");
		System.out.println("+ adicao");
		System.out.println("- subtracao");
		System.out.println("/ divisao");
		System.out.println("* multipliacao");
		System.out.println("----------------");
		System.out.println("Entre com a operacao: ");
		String oper = scan.next();

		boolean operValida = true; // flag
		if (oper.equals("/") && num2 == 0) {
			System.out.println("Erro: de divisao por zero!");
			operValida = false;
		}
		
		double res = 0;
		switch (oper) {
			case "+":
				res = num1 + num2;
				break;
			case "-":
				res = num1 - num2;
				break;
			case "/":
				res = num1 / num2;
				break;
			case "*":
				res = num1 * num2;
				break;
			default:
				System.out.println("Operacao invalida!");
				operValida = false;
		}

		if (operValida) {
			System.out.println("Resultado: " + num1 + " " + oper + " " + num2 + " = " + String.format("%.1f", res));
			if (res % 2 == 0) {
				System.out.println("Resultado PAR");
			} else {
				System.out.println("Resultado ÍMPAR");
			}
			
			if (res >= 0) {
				System.out.println("Resultado POSITIVO");
			} else {
				System.out.println("Resultado NEGATIVO");
			}
		}
	}

}
