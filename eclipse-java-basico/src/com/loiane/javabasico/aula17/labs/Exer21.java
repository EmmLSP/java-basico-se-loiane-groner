package com.loiane.javabasico.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		boolean validaAluno;
		int alunos, anos;
		double meses, soma = 0, media;
		String mesesInt = "";
		String alunosTurma = "";
		
		System.out.println("Entre com o numero de turmas:");
		int turmas = scan.nextInt();	
		
		for (int i = 0; i < turmas; i++) {
			System.out.println("Turma: " + (i + 1));
			
			validaAluno = false;
			do {
				System.out.println("Entre com o numero de alunos:");
				alunos = scan.nextInt();
				if (alunos >= 0 && alunos <= 40) {
					validaAluno = true;
				} else {
					System.out.println("Numero de alunos invalido, digite novamente.");
				}
			} while (!validaAluno);
			
			soma += alunos;
			alunosTurma += "Turma " + (i + 1) + ": " + alunos + "\n"; 
		}
		
		media = soma / turmas;
		anos = (int) media;
		meses = ((media - ((int) media)) * 12);
		mesesInt =  String.format("%.0f", meses);
		
		System.out.println("Alunos por Turma:");
		System.out.println("-----------------");
		System.out.print(alunosTurma);
		System.out.println("-----------------");
		System.out.println("Media de alunos por turma: " + String.format("%.2f", media));
		System.out.println(anos + " anos e " + mesesInt + " meses.");
	}

}
