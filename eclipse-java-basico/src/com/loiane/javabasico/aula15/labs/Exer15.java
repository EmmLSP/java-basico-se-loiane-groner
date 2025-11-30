package com.loiane.javabasico.aula15.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com lado direito:");
		int ladoD = scan.nextInt();
		
		System.out.println("Entre com lado esquerdo:");
		int ladoE = scan.nextInt();
		
		System.out.println("Entre com lado inferior:");
		int ladoI = scan.nextInt();
		
		// ladoD < (ladoE + ladoI) 
		
		System.out.println(ladoD + ", " + ladoE + ", " + ladoI);
		
		if (ladoD < (ladoE + ladoI) && ladoE < (ladoD + ladoI) && ladoI < (ladoD + ladoE)) {
			System.out.print("Forma um triangulo ");
			
			if (ladoD == ladoE && ladoD == ladoI && ladoE == ladoI) {
				System.out.println("EQUILATERO");
			} else if (ladoD == ladoE || ladoD == ladoI || ladoE == ladoI) {
				System.out.println("ISOSCELES");
			} else if (ladoD != ladoE && ladoD != ladoI && ladoE != ladoI) {
				System.out.println("ESCALENO");
			}

		} else {
			System.out.println("Não forma um triangulo");
		}
	}

}
