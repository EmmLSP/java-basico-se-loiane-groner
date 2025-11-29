package com.loiane.javabasico.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um dia da semana [1-7]:");
		int diaSemana = scan.nextInt();
		
		// o if else sempre sera o resultado de uma expressao relacional
		// e logica, tendo como retorno um true or false, um booleano
		
		// dia da semana com if else
		if (diaSemana == 1) {
			System.out.println("Domingo");
		} else if (diaSemana == 2) {
			System.out.println("Segunda-feira");
		} else if (diaSemana == 3) {
			System.out.println("Terca-feira");
		} else if (diaSemana == 4) {
			System.out.println("Quarta-feira");
		} else if (diaSemana == 5) {
			System.out.println("Quinta-feira");
		} else if (diaSemana == 6) {
			System.out.println("Sexta-feira");
		} else if (diaSemana == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Não é um dia da semana válido!");
		}
		
		// dia da semana com switch case
		switch (diaSemana) {
		case 1: 
			System.out.println("Domingo");
			break;
		case 2: 
			System.out.println("Segunda-feira");
			break;
		case 3: 
			System.out.println("Terca-feira");
			break;
		case 4: 
			System.out.println("Quarta-feira");
			break;
		case 5: 
			System.out.println("Quinta-feira");
			break;
		case 6: 
			System.out.println("Sexta-feira");
		case 7: 
			System.out.println("Sábado");
			break;
		default: 
			System.out.println("Não é um dia da semana válido!");
		}
		
		// dia da semana com numeros de 1 a 7
		switch (diaSemana) {
		case 2: 
		case 3: 
		case 4:
		case 5: 
		case 6: System.out.println("Dia útil!"); break;
		case 1:
		case 7: System.out.println("Fim de semana!"); break;
		default: 
			System.out.println("Não é um dia da semana válido!");
		}
		
		System.out.println("Digite o dia da semana como uma string:");
		String diaSemanaString = scan.next();
		
		// dia da semana com strings
		switch (diaSemanaString) {
		case "segunda-feira": 
		case "Segunda-feira":
		case "segunda": 
		case "terca-feira": 
		case "Terca-feira":
		case "terca": 
		case "quarta-feira": 
		case "Quarta-feira":
		case "quarta": 
		case "quinta-feira": 
		case "Quinta-feira":
		case "quinta": 
		case "sexta-feira": 
		case "Sexta-feira":
		case "sexta": System.out.println("Dia útil!"); break;
		case "domingo": 
		case "Domingo":
		case "sabado": 
		case "Sabado": System.out.println("Fim de semana!"); break;
		default: 
			System.out.println("Não é um dia da semana válido!");
		}
	}

}
