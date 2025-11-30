package com.loiane.javabasico.aula15.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o ano:");
		int ano = scan.nextInt();
		
		/*
		ANO 1700 - nao é bissexto
		ANO 1800 - nao é bissexto
		ANO 1900 - nao é bissexto
		ANO 2000 = e bissexto
		ANO 2016 = e bissexto
		ANO 2024 - e bissexto
		ANO 2025 - nao e bissexto
		--------------------------
		(ano mod 4 == 0 and ano mod 100 <> 0) or (ano mod 400 == 0)
		*/

		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println(ano + " é BISSEXTO");
		} else {
			System.out.println(ano + " não é BISSEXTO");
		}
	}

}
