package com.loiane.javabasico.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor/hora:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com as horas trabalhadas no mes:");
		int horas = scan.nextInt();
		
		double salarioBruto = valorHora * horas;
		
		int percenntualIR = 0;
		if (salarioBruto <= 900) {
			percenntualIR = 0;
		} else if (salarioBruto <= 1500) {
			percenntualIR = 5;
		} else if (salarioBruto <= 2500) {
			percenntualIR= 10;
		} else {
			percenntualIR = 20;
		}
		
		double ir = (salarioBruto / 100) * percenntualIR;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = 	ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		// Para converter um double em int em Java usando uma variável, 
		// você faz um casting (conversão explícita).
		// double valorHora -> (int) valorHora
		
		System.out.println("---------------------------------------------");
		System.out.println("Salario Bruto: (" + (int) valorHora + " * " + horas + ")         : R$ " + String.format("%7.2f", salarioBruto));
		System.out.println("(-) IR (" + percenntualIR + "%)                      : R$ " + String.format("%7.2f", ir));
		System.out.println("(-) INSS (10%)                   : R$ " + String.format("%7.2f", inss));
		System.out.println("FGTS (11%)                       : R$ " + String.format("%7.2f", fgts));
		System.out.println("Total de descontos               : R$ " + String.format("%7.2f", totalDescontos));
		System.out.println("Salario liquido                  : R$ " + String.format("%7.2f", salarioLiquido));
		System.out.println("---------------------------------------------");
	}

}
