package com.loiane.javabasico.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		// Armazenar temperatura diaria 
		// por 1 ano com arrays, vetores
		
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 34;
		double tempDia005 = 33.1;
		
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
		System.out.println("O valor da temperatura do dia 2 é: " + temperaturas[1]);
		System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);
		System.out.println("O valor da temperatura do dia 4 é: " + temperaturas[3]);
		System.out.println("O valor da temperatura do dia 5 é: " + temperaturas[4]);
		
		System.out.println("O tamanho do array: " + temperaturas.length);

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i + 1) + " é: " + temperaturas[i]);
		}
		
		for (double temp : temperaturas) {
			System.out.println(temp);
		}
	}

}
