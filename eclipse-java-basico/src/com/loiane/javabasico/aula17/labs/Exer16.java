package com.loiane.javabasico.aula17.labs;

public class Exer16 {

	public static void main(String[] args) {
		
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;
		int termos = 2;
		
		System.out.print("[" + primeiro + ", ");
		System.out.print(segundo + ", ");
		
		while (proximo <= 500) {	
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			if (proximo <= 500) {
				System.out.print(proximo + ", ");
			} else {
				System.out.println(proximo + "]");
			}
			termos++;
		}
		
		System.out.println("Termos: " + termos);
	}

}
