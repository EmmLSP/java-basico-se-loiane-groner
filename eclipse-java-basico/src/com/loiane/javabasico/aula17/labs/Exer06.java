/**
 * comentario para gerar documentacao projeto Java
 * faz parte do Java doc
 */

package com.loiane.javabasico.aula17.labs;

public class Exer06 {

	public static void main(String[] args) {
		
		System.out.println("Numeros de 1 a 20 - vertical:");
		
		// comentario do loop for
		// declarando uma variavel i dentro do escopo do loop for
		// inicializando variavel com 1
		// usando uma expressao com operador relacional que retorna um boolean true or false
		// e por fim, usando icrementado i++, i += 1 ou i = i + 1
		
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
		}
		
		System.out.println("Numeros de 1 a 20 - horizontal:");
		
		for (int i = 1; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
