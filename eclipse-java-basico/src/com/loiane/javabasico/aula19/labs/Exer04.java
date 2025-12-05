package com.loiane.javabasico.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao " + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.print("Vetor A = [");
		for (int i = 0; i < vetorA.length; i++) {
			if (i < vetorA.length - 1) {
				System.out.print(vetorA[i] + ", ");
			} else {
				System.out.println(vetorA[i] + "]");
			}
		}
		
		System.out.print("Vetor B = [");
		for (int i = 0; i < vetorB.length; i++) {
			if (i < vetorB.length - 1) {
				System.out.print(String.format("%.2f", vetorB[i]) + ", ");
			} else {
				System.out.println(String.format("%.2f", vetorB[i]) + "]");
			}
		}
		
		// pt-br
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		System.out.print("Vetor B = [");
		for (int i = 0; i < vetorB.length; i++) {
			if (i < vetorB.length - 1) {
				System.out.print(df.format(vetorB[i]) + ", ");
			} else {
				System.out.println(df.format(vetorB[i]) + "]");
			}
		}
	}

}
