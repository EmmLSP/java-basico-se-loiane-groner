package com.loiane.javabasico.aula11;

public class SequenciaEscape {

	public static void main(String[] args) {
		
		// "Hello, World!"
		// "Hello, World!"
		// Hello
		// World!
		// 		Hello, World!
		// 1\4
		
		System.out.println("\"Hello, World!\"");
		System.out.println("\'Hello, World!\'");
		System.out.println("Hello\nWorld!");
		System.out.println("\tHello, World!");
		System.out.print("Hello, World!\n\r");
		System.out.println("1\\4");
	}

}