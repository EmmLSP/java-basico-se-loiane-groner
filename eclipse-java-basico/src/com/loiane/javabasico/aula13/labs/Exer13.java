package com.loiane.javabasico.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor/hora:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com a quantidade de horas trabalhadas no mes:");
		int horas = scan.nextInt();
		
		double salarioBruto = valorHora * horas;
		double ir = (salarioBruto * 11) / 100;
		double inss = (salarioBruto * 8) / 100;
		double sindicato = (salarioBruto * 5) / 100;
		double descontos = ir + inss + sindicato;
		double salarioLiq = salarioBruto - descontos;
		
		System.out.println("----------------------------------");
		System.out.println("     Dados sobre o salario:       ");
		System.out.println("----------------------------------");
		System.out.println("+ Salário Bruto      : R$ " + String.format("%8.2f", salarioBruto));
		System.out.println("- IR (11%)           : R$ " + String.format("%8.2f", ir));
		System.out.println("- INSS (8%)          : R$ " + String.format("%8.2f", inss));
		System.out.println("- Sindicato (5%)     : R$ " + String.format("%8.2f", sindicato));
		System.out.println("- Total de descontos : R$ " + String.format("%8.2f", descontos));
		System.out.println("+ Salário Liquido    : R$ " + String.format("%8.2f", salarioLiq));
		System.out.println("----------------------------------");
	}

}
