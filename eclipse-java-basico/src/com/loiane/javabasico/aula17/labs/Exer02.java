package com.loiane.javabasico.aula17.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValidas = false;
		String user, senha;
		
		do {
			System.out.println("Entre com o nome do usuario:");
			user = scan.next();
			
			System.out.println("Entre com a senha do usuario:");
			senha = scan.next();
			
			// equalsIgnoreCase() metodo de comparacao da classe
			// String, que nao importa o case, ao contrario de equals()
			// que precisa ser igual as duas strings
			// porque o Java e case sentive
			
			if (user.equalsIgnoreCase(senha)) {
				System.out.println("Erro: senha igual a usuario, digite novamente.");
			} else {
				System.out.println("Senha e usuario validos!");
				infoValidas = true;
			}
		} while (!infoValidas);
	}

}
