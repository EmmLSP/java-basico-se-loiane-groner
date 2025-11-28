package com.loiane.javabasico.aula11;

public class CuriosidadesInt {

	public static void main(String[] args) {
		
		int var1 = 2147483647; // valor maximo de int
		int var2 = 100;
		
		// o que vai acontecer?
		
		System.out.println(var1 + var2);
		
		// os numeros no Java funcionam igual uma roleta
		// do momento que pega o limite e soma alguma coisa
		// vai voltar para os numeros negativos
		// para qualquer tipo int no Java: byte, short, int, long
		// -2147483549

	}

}
