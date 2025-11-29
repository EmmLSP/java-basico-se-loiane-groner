package com.loiane.javabasico.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o salario: R$ ");
		double salario = scan.nextDouble();
		
		int percentual = 0;
		if (salario <= 280) {
			percentual = 20;
		} else if (salario <= 700) {
			percentual = 15;
		} else if (salario <= 1500) {
			percentual = 10;
		} else {
			percentual = 5;
		}
		double aumento = (salario * percentual) / 100;
		double novoSalario = salario + aumento;
		
		System.out.println("-------------------------------------------");
		System.out.println(String.format(" Salario antes do reajuste  : R$%8.2f", salario));
		System.out.println(String.format(" Percentual de aumento      : (%d%%) ", percentual));
		System.out.println(String.format(" Valor de aumento           : R$%8.2f ", aumento));
		System.out.println(String.format(" Novo salario com aumento   : R$%8.2f ", novoSalario));
		System.out.println("-------------------------------------------");
	}

}
