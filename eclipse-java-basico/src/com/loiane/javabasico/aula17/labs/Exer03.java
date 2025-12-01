package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false; 
		// boa pratica declarar variaveis fora do loop, com escopo global
		String nome, sexo, estCivil, opcao;
		int idade;
		double salario;

		do {
			System.out.println("Entre com o nome:");
			nome = scan.next();
			if (nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa no minimo de 3 caracteres.");
			}
		} while (!infoValida);
		
		infoValida = false; // resetando a flag
		do {
			System.out.println("Entre com a idade:");
			idade = scan.nextInt();
			if (idade >= 0 && idade  <= 150) {
				infoValida = true;
			} else {
				System.out.println("Idade precisa ser entre 0 e 150.");
			} 
		} while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Entre com o salario:");
			salario = scan.nextDouble();
			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Salario precisa ser maior que 0.");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Entre com sexo [M-F]:");
			sexo = scan.next();
			if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
				infoValida = true;
			} else {
				System.out.println("Sexo precisa ser 'f' ou 'm'.");
			}
		} while (!infoValida);
		
		switch (sexo) {
			case "m":
			case "M":
				sexo = "Masculino";
				break;
			case "f":
			case "F":
				sexo = "Feminino";
		}
		
		infoValida = false;
		do {
			System.out.println("Escolha opcao para estado civil: (1-if else ou 2-switch case):");
			opcao = scan.next();
			if (opcao.equals("1") || opcao.equals("2")) {
				infoValida = true;
			} else {
				System.out.println("Opcao precisa ser 1-if else ou 2-switch case.");
			}
		} while (!infoValida);
		
		infoValida = false;
		if (opcao.equals("1")) {
			do {
				System.out.println("Entre com estado civil [s, c, v ou d]:");
				estCivil = scan.next();
				
				if (estCivil.equalsIgnoreCase("s") ||
					estCivil.equalsIgnoreCase("c") ||
					estCivil.equalsIgnoreCase("v") ||
					estCivil.equalsIgnoreCase("d")) {
					infoValida = true;
				} else {
					System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'.");
				}
				
			} while (!infoValida);
		} else {
			do {
				System.out.println("Entre com estado civil [s, c, v ou d]:");
				estCivil = scan.next();
				switch (estCivil) {
					case "s":
					case "S":
					case "c":
					case "C":
					case "v":
					case "V":
	
					case "d":
					case "D":
						estCivil = "Divorciado(a)";
						infoValida = true;
						break;
					default:
						System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'.");
				}
			} while (!infoValida);
		}
		
		switch (estCivil) {
			case "s":
			case "S": 
				estCivil = "Solteiro(a)"; 
				break;
			case "c":
			case "C": 
				estCivil = "Casado(a)"; 
				break;
			case "v":
			case "V": 
				estCivil = "Viuvo(a)"; 
				break;
			case "d":
			case "D": 
				estCivil = "Divoriciado(a)";
		}

		System.out.println("----------------------------");
		System.out.println("Nome          : " + nome);
		System.out.println("Idade         : " + idade);
		System.out.println("Salario       : R$" + String.format("%8.2f", salario));
		System.out.println("Sexo          : " + sexo);
		System.out.println("Estado Civil  : " + estCivil);
		System.out.println("----------------------------");
	}

}
