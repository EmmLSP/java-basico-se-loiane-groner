package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean invalido = false;
		int numInicial, numFinal;
		
		System.out.println("Entre com um numero para gerar a tabuada: ");
		int num = scan.nextInt();
		
		do {
			System.out.println("Entre com o inicio da tabuada: ");
			numInicial = scan.nextInt();
			
			System.out.println("Entre com o final da tabuada: ");
			numFinal = scan.nextInt();
			
			if (numFinal < numInicial) {
				System.out.println("O final nao deve ser menor que inicio.");
			} else {
				invalido = true;
			}
			
		} while(!invalido);
		
		System.out.println("Comecar por: " + numInicial);
		System.out.println("Terminar em: " + numFinal + "\n");
		System.out.print("Vou montar a tabuada de " +  num + " comecando em ");
		System.out.println(numInicial + " e terminando em " + numFinal + ":");
		
		for (int i = numInicial; i <= numFinal; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
	}

}
