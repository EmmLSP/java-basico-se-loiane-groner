package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int idade;
		double soma = 0;
		String idadesString = "";
		
		System.out.println("Entre com a quantidade de pessoas:");
		int idades = scan.nextInt();
		
		for (int i = 0; i < idades; i++) {
			System.out.println("Entre com a idade da pessoa " + (i + 1));
			idade = scan.nextInt();
			soma += idade;
			idadesString += idade + " ";
		}
		
		double media = soma / idades;
		double meses = media - ((int) (media));
		double mesesInt = (meses * 12);
	
		System.out.println(idadesString);
		System.out.println("Media: " + media);
		System.out.println("Media da turma: " + (int) media + " anos e " + String.format("%.0f", mesesInt) + " meses.");
		
		if (media >= 0 && media <= 25) {
			System.out.println("Turma Jovem!");
		} else if (media > 25 && media <= 60) {
			System.out.println("Turma Adulta!");
		} else {
			System.out.println("Turma Idosa!");
		}
	}

}
