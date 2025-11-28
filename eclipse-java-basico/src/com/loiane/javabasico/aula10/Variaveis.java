package com.loiane.javabasico.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		// Tipos primitivos
		// classe sempre comeca com letra maiscula
		// String e uma classe, nao e um tipo primitivo
		// Convensao de nomenclatura de variável Java -> camelCase
		// Java e case sentive, diferencia caracteres de variaveis
		
		// declaracao de variaveis que seguem a convencao Java
		int idade = 20;
		String nome = "Loiane"; // classe
		String nomeDoMeuCachorro = "toto"; // camelCase
		String ano2014 = "2014"; // classe
		
		// aceito, mas nao utilizavel
		int _idade;
		int $idade;
		
		// nao é convencao Java
		String NomeDoMeuCachorro; // classe
		String nome_do_meu_cachorro; // classe
		
		// trocar valor de idade
		idade = 25;
		
		System.out.println("Idade: " + idade);
		System.out.println("Nome: " + nome);
		
		// ma pratica -> e preciso dar significado para as variaveis
		int a = 10;
		String b = "Loiane";
	}

}
