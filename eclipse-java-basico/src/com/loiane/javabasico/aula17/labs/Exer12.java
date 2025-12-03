package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean valida;
		boolean encerrar = false;
		int num;
		String resp;
		
		while (!encerrar) {
			valida = false;
			do {
				System.out.println("Entre com um numero para gerar a tabuada:");
				num = scan.nextInt();
				
				if (num >= 1 && num <= 10) {
					valida = true;
				} else {
					System.out.println("Numero precisa ser entre 1 e 10");
				}
			} while (!valida);
			
			System.out.println("Tabuada de " + num + ":");
			
			System.out.println("--------------");
			
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " X " + i + " = " + (num*i));
			}
			
			System.out.println("--------------");
			
			valida = false;
			do {
				System.out.println("Quer continuar? (S/N) ");
				resp = scan.next();
				if ((resp.equalsIgnoreCase("S")) || (resp.equalsIgnoreCase("n"))) {
					valida = true;
				} else {
					System.out.println("Entrada invalida, digite 'S' ou 'N'");
				}
			} while (!valida);	
			
			if (resp.equalsIgnoreCase("n")) {
				encerrar = true;
			}
		}
		
		System.out.println("-=-=-=-=-=-=-=");
		System.out.println("<<< Fim do programa >>>");
	}

}
