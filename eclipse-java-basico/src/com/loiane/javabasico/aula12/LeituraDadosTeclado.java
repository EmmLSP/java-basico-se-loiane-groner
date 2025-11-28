package com.loiane.javabasico.aula12;

import java.util.Locale;
import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		// new Scanner(System.in) -> instanciar a classe Scanner
		// Scanner scan = ... -> variavel scan do tipo Scanner
		
		// ler uma linha inteira
		/*System.out.print("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		// ler um tipo de dado especifico
		
		System.out.print("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.print("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.print("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);*/

		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação:");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voce digitou os seguintes valores:");
		System.out.println("----------------------------------");
		System.out.println("Primeiro nome..............: " + primeiroNome);
		System.out.println("Idade......................: " + idade);
		System.out.println("Quantidade de filhos.......: " + qtdFilhos);
		System.out.println("Altura.....................: " + altura);
		System.out.println("Tem bichinho de estimacao?.: " + temPet);
		System.out.println("----------------------------------");
	}

}