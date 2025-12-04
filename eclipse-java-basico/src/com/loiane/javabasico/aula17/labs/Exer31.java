package com.loiane.javabasico.aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o ano atual:");
		int anoAtual = scan.nextInt();
		
		double salario = 1000;
		double percentual = 1.5;
		int ano = 1997;
		
		System.out.println("ano 1995 - salario R$ " + salario + "0 - percentual 0.0");
		
		salario += (salario/100) * percentual;
		
		System.out.println("ano 1996 - salario R$ " + salario + "0 - percenutal atual: 1.5");
		
		while (ano <= anoAtual) {
			percentual *= 2;
			salario += (salario * (percentual) / 100);
			System.out.print("ano " + ano + " - salario R$ " + String.format("%.2f", salario));
			System.out.println(" - percenutal atual: " + percentual);
			ano++;
		}
		
		salario = 1000;
		percentual = 1.5;
		ano = 1997;
		
		System.out.println("ano 1995 - salario R$ " + salario + "0 - percentual: 0.0");
		
		salario += (salario/100) * percentual;
		
		System.out.println("ano 1996 - salario R$ " + salario + "0 - percenutal: 1.5");
		
		for (int i = 1997; i <= anoAtual; i++) {
			percentual *= 2;
			salario += (salario/100) * percentual;
			System.out.print("ano " + i + " - salario R$ " + salario);
			System.out.println(" - percenutal: " + percentual);
		}
	}

}
