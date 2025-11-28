package com.loiane.javabasico.aula11;

public class VariaveisChar {

	public static void main(String[] args) {
		
		// assignment valores da tabela ascii
		
		// Tipo Primitivo char
		
		char o = 'o';
		char i = 'i';
		
		System.out.println(o + i);
		System.out.println("" + o + i);

		o = 111; // char
		i = 105; // char
		
		char interrogacao = 0x003F; // valor = '?'
		// Unicode: U+003F
		// Hexadecimal: 0x003F
		// ASCII: 63
		// Decimal: 63
		// UTF-8: 0x3F
		
		System.out.println(o + i);
		System.out.println("" + o + i + interrogacao);
	}

}
