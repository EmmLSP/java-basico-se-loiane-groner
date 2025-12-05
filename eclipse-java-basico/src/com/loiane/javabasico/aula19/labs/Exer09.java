package com.loiane.javabasico.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		double[] vetorB = new double[vetorA.length];
		double[] vetorC = new double[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor do vetor A da posicao " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Entre com o valor do vetor B da posicao " + i);
			vetorB[i] = scan.nextInt();
			vetorC[i] = vetorA[i] / vetorB[i];
		}
		
		System.out.print("Vetor A = [");
		for (int i = 0; i < vetorA.length; i++) {
			if (i < vetorA.length - 1) {
				System.out.print(vetorA[i] +  ", ");
			} else {
				System.out.println(vetorA[i] +  "]");
			}
		}
		
		System.out.print("Vetor B = [");
		for (int i = 0; i < vetorB.length; i++) {
			if (i < vetorB.length - 1) {
				System.out.print(vetorB[i] +  ", ");
			} else {
				System.out.println(vetorB[i] +  "]");
			}
		}
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		System.out.print("Vetor C = [");
		for (int i = 0; i < vetorC.length; i++) {
			if (i < vetorC.length - 1) {
				System.out.print(df.format(vetorC[i]) +  ", ");
			} else {
				System.out.println(df.format(vetorC[i]) +  "]");
			}
		}
	}

}
