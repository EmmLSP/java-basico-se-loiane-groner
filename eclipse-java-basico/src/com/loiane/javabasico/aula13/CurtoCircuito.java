package com.loiane.javabasico.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		// debug -> ver diferenca entre & e &&

		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & 
				verdadeiro; // nao curto circuito
		boolean resultado2 = falso && 
				verdadeiro; // curto circuito
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		// Ordem de precedencia
		// ( )  -> parenteses
		// * /  -> multiplicacao, divisao
		// + -  -> adicao, subtracao
		int resultado = 1 + 1 - 1 + 1 * 1 / 1;
		System.out.println(resultado);
	}

}