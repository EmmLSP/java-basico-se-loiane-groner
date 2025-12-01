package com.loiane.javabasico.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		double popA, popB;
		double taxaA, taxaB;
		int cont = 0;
		
		boolean valida = false;
		 do {
			 System.out.println("Entre com a populacao A:");
			 popA = scan.nextDouble();
			 if (popA > 0) {
				 valida = true;
			 } else {
				 System.out.println("Populacao A precisa ser maior que 0.");
			 }
		 } while (!valida);
		 
		 valida = false;
		 do {
			 System.out.println("Entre com a populacao B:");
			 popB = scan.nextDouble();
			 if (popB > 0 && popB > popA) {
				 valida = true;
			 } else {
				 System.out.println("Populacao B precisa ser maior que 0.");
			 }
		 } while (!valida);
		 
		 valida = false;
		 do {
			 System.out.println("Entre com a taxa de crescimento da populacao A:");
			 taxaA = scan.nextDouble();
			 if (taxaA > 0) {
				 valida = true;
			 } else {
				 System.out.println("Taxa de crescimento precisa ser maior que 0.");
			 }
		 } while (!valida);
		 
		 valida = false;
		 do {
			 System.out.println("Entre com a taxa de crescimento da populacao B:");
			 taxaB = scan.nextDouble();
			 if (taxaB > 0 && taxaB < taxaA) {
				 valida = true;
			 } else {
				 System.out.println("Taxa de crescimento precisa ser maior que 0.");
			 }
		 } while (!valida);
		 
		 while (popA < popB) {
			 popA += (popA / 100) * taxaA;
			 popB += (popB / 100) * taxaB;
			 cont++;
		 }
		
		System.out.println("Populacao A: " + popA);
		System.out.println("Populacao B: " + popB);
		System.out.print("Quantidade de anos: " + cont + " anos.");
	}

}
